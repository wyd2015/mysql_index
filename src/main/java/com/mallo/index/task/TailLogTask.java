package com.mallo.index.task;

import lombok.extern.slf4j.Slf4j;

import javax.websocket.Session;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @Author: 拓尔思信息技术股份有限公司
 * @Since: wcg
 * @Time: 2019-11-26 10:30
 **/
@Slf4j
public class TailLogTask implements Runnable {
    private Session session;
    private BufferedReader reader;
    public TailLogTask(InputStream inputStream, Session session){
        this.session = session;
        this.reader = new BufferedReader(new InputStreamReader(inputStream));
    }
    
    @Override
    public void run() {
        String line;
        try {
            while((line = reader.readLine()) != null){
                session.getBasicRemote().sendText(line + "<br>");
            }
        } catch (IOException e) {
            log.error("日志IO异常：", e);
        }
    }
}
