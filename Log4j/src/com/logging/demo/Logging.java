package com.logging.demo;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Logging {
	
	public static void main (String[] args) {        
        Logger logger = LogManager.getLogger(Logging.class.getName());
        logger.warn("welcome Hello");
       
    }

}
