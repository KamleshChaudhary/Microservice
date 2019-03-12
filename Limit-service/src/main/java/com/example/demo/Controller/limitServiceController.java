package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Confi;
import com.example.demo.model.LimitService;

@RestController
public class limitServiceController {

	@Autowired
	private Confi confi;
	
	@GetMapping("/limit")
	 public LimitService retrivelimit() {
		return new LimitService(confi.getMaximum(),confi.getMinimum());
	 }
}
