package org.howard.edu.lsp.exam.problem51;

import java.util.HashMap;
import java.util.Map;

public class Logger {
	private static Map<String, Logger> loggerRecords = new HashMap<String, Logger>(); 

    private String log;

    private Logger() {
        this.log = "";
    }
    
    private Logger(String message) {
        this.log = "";
    }

    public void logMessage(String message) {
        this.log += message + "\n";
    }

    public String displayLog() {
        return("Log:\n" + log);
    }
    
    public static Logger getInstance (String logMessage) {
    	if (!loggerRecords.containsKey(logMessage)) {
            loggerRecords.put(logMessage, new Logger(logMessage));
       }
       return loggerRecords.get(logMessage);

   }

}
