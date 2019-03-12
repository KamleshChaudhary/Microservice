package com.example.demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.ExchageValue;

public interface currencyExchangevalues  extends JpaRepository<ExchageValue, Long>{
	
	ExchageValue findByFromAndTo(String form, String To);

}
