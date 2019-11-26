package com.mallo.index.config;

import com.mallo.index.task.TailLogTask;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import javax.websocket.OnClose;
import javax.websocket.OnError;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.io.InputStream;

/**
 * @Author: 拓尔思信息技术股份有限公司
 * @Since: wcg
 * @Time: 2019-11-26 10:22
 **/
@Slf4j
@Component
@ServerEndpoint("/log")
public class LogWebSocketServer {
    
    private Process process;
    private InputStream inputStream;
    
    @OnOpen
    public void onOpen(Session session){
        try {
            process = Runtime.getRuntime().exec("tail -f log/debug.log");
            inputStream = process.getInputStream();
            
            new Thread(new TailLogTask(inputStream, session)).start();
        } catch (IOException e) {
            log.error("执行命令异常：", e);
        }
    }
    
    @OnClose
    public void onClose(){
        try {
            if(inputStream != null){
                inputStream.close();
            }
        } catch (IOException e) {
            log.error("关闭输入流异常：", e);
        }
        if(process != null){
            process.destroy();
        }
    }
    
    @OnError
    public void onError(Throwable t){
        t.printStackTrace();
    }
    
}
