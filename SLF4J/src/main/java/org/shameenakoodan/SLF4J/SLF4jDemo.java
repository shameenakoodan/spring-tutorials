package org.shameenakoodan.SLF4J;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class SLF4jDemo{

private static Logger logger = LoggerFactory.getLogger(SLF4jDemo.class);
   public static void main(String[] args) {
       logger.debug("Debug log message");
       logger.info("Info log message");
       logger.error("Error log message");
   }
}
