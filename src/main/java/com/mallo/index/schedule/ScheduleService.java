package com.mallo.index.schedule;

import com.mallo.index.config.WebSocketServer;
import com.mallo.index.util.DateFunction;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class ScheduleService {

    @Scheduled(cron = "0/1 * * * * *")
    public void scheduled(){
        
        WebSocketServer.massMessage(DateFunction.getStrDateFormat("yyyy-MM-dd HH:mm:ss", new Date()));
    }
    
}
