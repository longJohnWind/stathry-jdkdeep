/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package com.pingan.jdk.deep.concurrent;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年6月15日
 */
public class ThreadY implements Runnable {

	private Printer printer;
	
	public ThreadY() {
	}

	public ThreadY(Printer printer) {
		this.printer = printer;
	}

	@Override
	public void run() {
			printer.turnY();
	}

}