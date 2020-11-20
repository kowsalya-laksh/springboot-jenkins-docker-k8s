package com.sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringController {
	
    @RequestMapping("/message")
	public String getMessage() {
    	return "Welcome to spring Boot Application!!";

	}

    @RequestMapping("/getmessage")
	public String getMessage1() {
    	return "Welcome to spring Boot-Jenkins-Kubernetes Application!!";

}
}
