package com.mallo.index.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.concurrent.CopyOnWriteArraySet;

@Slf4j
@Component
@ServerEndpoint("/websocket")
public class WebSocketServer {

    private Session session;
    private static int onlineCount = 0;
    private static CopyOnWriteArraySet<WebSocketServer> webSocketServerSet = new CopyOnWriteArraySet<WebSocketServer>();

    
    /**
     * 成功建立websocket连接时的钩子
     * @param paramSession
     * @return:void
     * @Time:2019年4月23日 下午3:54:04
     * @Author wcg
     */
    @OnOpen
    public void onOpen(Session paramSession){
        this.session = paramSession;
        webSocketServerSet.add(this);
        addOnlineCount();
        log.info(" There is a new connection joining ...");
        try {
            sendMessage(paramSession, "连接成功!");
        } catch (IOException e) {
            log.error("Websocket connection Exception: ", e);
        }
    }
    
    
    /**
     * 收到客户端消息后的钩子
     * @param msg
     * @param session
     * @return:void
     * @Time:2019年4月23日 下午3:56:00
     * @Author wcg
     */
    @OnMessage
    public void onMessage(String msg, Session session){
        log.info("Received client`s msg successfully ..." + msg);
    }
    
    
    /**
     * websocket连接关闭时的钩子
     * 
     * @return:void
     * @Time:2019年4月23日 下午3:58:33
     * @Author wcg
     */
    @OnClose
    public void onClose(){
        webSocketServerSet.remove(this);
        log.info(" Connection is closed, current websocket has been removed ...");
    }
    
    
    /**
     * 连接异常时的钩子
     * @param session
     * @param e
     * @return:void
     * @Time:2019年4月23日 下午4:09:24
     * @Author wcg
     */
    @OnError
    public void onError(Session session, Throwable e){
        log.error("Connection abnormality ...", e);
    }
    
    
    /**
     * 发送消息
     * @param paramSession
     * @param msg
     * @return:void
     * @Time:2019年4月23日 下午4:09:08
     * @Author wcg
     */
    private void sendMessage(Session session, String msg) throws IOException{
        try {
            session.getBasicRemote().sendText(msg);
        } catch (IOException e) {
            log.error("send message exception: ", e);
        }
    }
    
    
    /**
     * 群发消息
     * @param msg
     * @throws IOException
     * @return:void
     * @Time:2019年4月23日 下午4:08:58
     * @Author wcg
     */
    public static void massMessage(String msg) {
        for(WebSocketServer webSocketServer : webSocketServerSet){
            try {
                webSocketServer.sendMessage(webSocketServer.session, msg);
            } catch (Exception e) {
                continue;
            }
        }
        log.info("Mass message: " + msg);
    }
    
    public static synchronized int getOnlineCount() {
        return onlineCount;
    }
 
    public static synchronized void addOnlineCount() {
        WebSocketServer.onlineCount++;
    }
 
    public static synchronized void subOnlineCount() {
        WebSocketServer.onlineCount--;
    }
    
}
