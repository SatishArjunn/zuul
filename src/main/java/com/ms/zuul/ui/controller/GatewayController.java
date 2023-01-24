package com.ms.zuul.ui.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ms-zuul")
public class GatewayController {
	
	@Autowired
	Environment env;
	
	@GetMapping
	public String getPort() {
		return "Zuul Service Is Running At Port Number :"  + env.getProperty("local.server.port");
		
	}

}
