/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.pingan.jdk.deep.lang;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年6月8日
 */
public class IntegerTest {

	@Test
	public void test1() {
		Integer i1 = 1;
		Integer i2 = 1;
		assertTrue(i1 == i2);
	}
	
	@Test
	public void test2() {
		Integer i1 = 127;
		Integer i2 = 127;
		assertTrue(i1 == i2);
	}
	
	@Test
	public void test3() {
		Integer i1 = 128;
		Integer i2 = 128;
		assertTrue(i1 != i2);
	}
	
	@Test
	public void test4() {
		Integer i1 = -128;
		Integer i2 = -128;
		assertTrue(i1 == i2);
	}
	
	@Test
	public void test5() {
		Integer i1 = -129;
		Integer i2 = -129;
		assertTrue(i1 != i2);
	}
	
	@Test
	public void test() {
		Integer i1 = new Integer(1);
		Integer i2 = new Integer(1);
		assertTrue(i1 != i2);
	}
	
	@Test
	public void test01() {
		int i = -127 + 128;
		System.out.println(i);
		int i2 = 127 + 128;
		System.out.println(i2);
	}

}
