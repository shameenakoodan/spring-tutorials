package org.shameenakoodan.ExcerciseOneRest.TestController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("home")
public class MyController {
	@RequestMapping({"/login"}) // either type '/' or index
	public String showlogin()
	{
	return "inboxpage";
	}
	@RequestMapping("/")
	public String simplemethod() {
	//mapped to hostname:port/home/
	return "inboxpage";
	}
	@RequestMapping("/index")
	public String showindex() {
	//mapped to hostname:port/home/index/
	return "inboxpage";
	}
	@RequestMapping(value={"", "/page", "page*","view/*","*/msg"})
	 String indexMultipleMapping(){
	   return "Hello from index multiple mapping.";
	 }
}