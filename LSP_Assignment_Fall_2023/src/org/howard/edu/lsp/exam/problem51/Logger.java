package org.howard.edu.lsp.exam.problem51;

import java.util.HashMap;
import java.util.Map;

public class Logger {
	private static Logger logger; 

    private String log;

    private Logger() {
        this.log = "";
    }


    public void logMessage(String message) {
        this.log += message + "\n";
    }

    public String displayLog() {
        return("Log:\n" + log);
        
    }
    
    public static Logger loggerInstance () {
    	if (logger == null) { 
    		logger = new Logger();
    	}
    	
    	return logger;

   }

}
