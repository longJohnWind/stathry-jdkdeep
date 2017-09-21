/*
 * Copyright © PING AN INSURANCE (GROUP) COMPANY OF CHINA ，LTD. All Rights Reserved
 */
package org.free.jdk.deep.lang.thread;

import java.util.concurrent.locks.Lock;

/**
 * @author dongdaiming911@pingan.com
 * @date 2017年6月15日
 */
public class ThreadX implements Runnable {

	private Lock lock;
	
	public ThreadX() {
	}

	public ThreadX(Lock lock) {
		this.lock = lock;
	}

	@Override
	public void run() {
			try {
				while (true) {
					lock.lock();
					System.out.println(Thread.currentThread().getName() + ":x");
					lock.unlock();
				}
			} finally {
				lock.unlock();
			}
	}

}