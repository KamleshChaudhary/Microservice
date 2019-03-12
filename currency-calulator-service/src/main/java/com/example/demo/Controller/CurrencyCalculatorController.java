package com.example.demo.Controller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.demo.Model.Currencycalculator;
import com.example.demo.feignRepo.CurrencyExchangeFeign;

@RestController
public class CurrencyCalculatorController {
	
	@Autowired
	private CurrencyExchangeFeign proxy;
	
	@GetMapping("/currency-exchange/from/{from}/to/{to}/quantity/{quantity}")
	public Currencycalculator  retrivevalue(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity) {
		
		Map<String,String> urivariables=new HashMap<>();
		 
		urivariables.put("from",from);
		urivariables.put("to",to);
		ResponseEntity<Currencycalculator> resttemplet=new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",Currencycalculator.class,urivariables);
		//exchange.setPort(Integer.parseInt(environment.getProperty("local.server.port")));
		    
		 Currencycalculator res= resttemplet.getBody();
		
		return new Currencycalculator(res.getId(),from,to,res.getConversionMultiple(),quantity,quantity.multiply(res.getConversionMultiple()),res.getPort()); 
	}
	@GetMapping("/currency-exchange-feign/from/{from}/to/{to}/quantity/{quantity}")
	public Currencycalculator retrivevaluefeign(@PathVariable String from, @PathVariable String to,@PathVariable BigDecimal quantity) {
		
		 Currencycalculator res=proxy.retrivevalue(from, to);
		
		return new Currencycalculator(res.getId(),from,to,res.getConversionMultiple(),quantity,quantity.multiply(res.getConversionMultiple()),res.getPort()); 
	}


}
