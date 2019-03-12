package com.example.demo.Controller;

import java.math.BigDecimal;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Repo.currencyExchangevalues;
import com.example.demo.model.ExchageValue;

@RestController
public class currencyExchangeController {

	
	@Autowired
	private org.springframework.core.env.Environment environment;
	
	@Autowired
	private currencyExchangevalues currency;
	
	@GetMapping("currency-exchange/from/{from}/to/{to}")
	public ExchageValue  retrivevalue(@PathVariable String from, @PathVariable String to) {
		ExchageValue exchange = currency.findByFromAndTo(from, to);
		exchange.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		
		return exchange;
	}
}
