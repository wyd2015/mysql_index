package com.mallo.index.model.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class LogMessage {
    
    private String body;
    private String level;
    private String cause;
    private String timestamp;
    private String className;
    private String exception;
    private String threadName;
    
}
