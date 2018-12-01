package com.app;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestOperators {

	Operators op = null;
	int val1,val2,exp;
	
	@Before
	public void preSet()
	{
		op = new Operators();
		val1 = val2 = 1;
		exp=  2;
	}
	@Test
	public void test() {

		int res = op.doSum(val1, val2);
		assertEquals("successfully added", exp, res);
	}

	@After
	public void postSet()
	{
		op =null; val1=val2=0;
	}
}
