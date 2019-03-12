package com.example.demo.feignRepo;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.Model.Currencycalculator;



@FeignClient(name="Netflix-Zuul-apiGateway")
@RibbonClient(name="currency-exchange-service")
public interface CurrencyExchangeFeign  {
	
	@GetMapping("/currency-exchange-service/currency-exchange/from/{from}/to/{to}")
	public  Currencycalculator  retrivevalue(@PathVariable ("from")String from, @PathVariable ("to")String to); 

}
