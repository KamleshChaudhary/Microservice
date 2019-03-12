package com.example.demo.Model;

import java.math.BigDecimal;



public class Currencycalculator {

		private long id;
		private String from;
		private String to;
		private BigDecimal ConversionMultiple;
		private BigDecimal quality;
		private BigDecimal currencyCalculator;
		private int port;
		
		
		public Currencycalculator() {
			
		}
		
		
		public Currencycalculator(long id, String from, String to, BigDecimal conversionMultiple,
				BigDecimal quality, BigDecimal currencyCalculator, int port) {
			super();
			this.id = id;
			this.from = from;
			this.to = to;
			ConversionMultiple = conversionMultiple;
			this.quality = quality;
			this.currencyCalculator = currencyCalculator;
			this.port = port;
		}
		
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getFrom() {
			return from;
		}
		public void setFrom(String from) {
			this.from = from;
		}
		public String getTo() {
			return to;
		}
		public void setTo(String to) {
			this.to = to;
		}
		public BigDecimal getConversionMultiple() {
			return ConversionMultiple;
		}
		public void setConversionMultiple(BigDecimal conversionMultiple) {
			ConversionMultiple = conversionMultiple;
		}
		public BigDecimal getQuality() {
			return quality;
		}
		public void setQuality(BigDecimal quality) {
			this.quality = quality;
		}
		public BigDecimal getCurrencyCalculator() {
			return currencyCalculator;
		}
		public void setCurrencyCalculator(BigDecimal currencyCalculator) {
			this.currencyCalculator = currencyCalculator;
		}
		public int getPort() {
			return port;
		}
		public void setPort(int port) {
			this.port = port;
		}
		
		
		

		
}		
		
