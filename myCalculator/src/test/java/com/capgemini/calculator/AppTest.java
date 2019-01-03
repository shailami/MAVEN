package com.capgemini.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	private App app;
	@Before
	public void setUp(){
		app=new App();
	}
    @Test
    public void calculatorTest()
    {
        assertEquals(12,app.addition(10,2),0.0 );
        assertEquals(8,app.subtraction(10,2),0.0 );
        assertEquals(20,app.multiplication(10,2),0.0 );
        assertEquals(5,app.division(10,2),0.0 );
    }
}
