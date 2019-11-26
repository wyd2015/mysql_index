package com.mallo.index.queue;

import com.mallo.index.model.vo.LogMessage;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

@Slf4j
public class LogQueue {

    public static final int QUEUE_MAX_SIZE = 1000;
    private static LogQueue msgQueue = new LogQueue();
    // 阻塞队列
    private BlockingQueue<LogMessage> blockingQueue = new LinkedBlockingQueue<LogMessage>(QUEUE_MAX_SIZE);
    
    private LogQueue(){}
    
    public static LogQueue getInstance(){
        return msgQueue;
    }
    
    
    /**
     * 消息入队
     * @param log
     * @return
     * @return:boolean
     * @Time:2019年4月19日 上午10:11:08
     * @Author wcg
     */
    public boolean push(LogMessage log) {
        return this.blockingQueue.add(log);
    }
    
    
    /**
     * 消息出队
     * @return
     * @return:LogMessage
     * @Time:2019年4月19日 上午10:13:54
     * @Author wcg
     */
    public LogMessage pop() {
        LogMessage msg = null;
        try {
            msg = this.blockingQueue.take();
        } catch (InterruptedException e) {
            log.error("消息出站异常", e);
        }
        return msg;
    }
    
}
