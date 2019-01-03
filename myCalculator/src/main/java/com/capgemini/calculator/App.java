package com.capgemini.calculator;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class App{
	private Logger logger=Logger.getLogger(App.class.getName());
	private double result;
	
	public double addition(int i, int j) {
		BasicConfigurator.configure();
		result=i+j;
		logger.info("ADDITION");
		logger.info(result);
		return result;
	}

	public double subtraction(int i, int j) {
		// TODO Auto-generated method stub
		result=i-j;
		logger.info("Subtraction");
		logger.info(result);
		return result;
	}

	public double multiplication(int i, int j) {
		// TODO Auto-generated method stub
		result=i*j;
		logger.info("Multiplication");
		logger.info(result);
		return result;
	}

	public double division(int i, int j) {
		// TODO Auto-generated method stub
		result= i/j;
		logger.info("Division");
		logger.info(result);
		return result;
	}
	
}
