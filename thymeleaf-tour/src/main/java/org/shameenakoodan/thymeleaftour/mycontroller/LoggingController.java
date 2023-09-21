package org.shameenakoodan.thymeleaftour.mycontroller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class LoggingController {
   Logger logger = LoggerFactory.getLogger(LoggingController.class);
   @RequestMapping("/checklogs")
   public String demoLogs() {
       logger.trace("This is a trace log example");
       logger.info("This is an info log example");
       logger.debug("This is a debug log example");
       logger.error("This is an error log example");
       logger.warn("This is a warn log example");
       return "Howdy! Check out the Logs to see the output...";
   }  
}
