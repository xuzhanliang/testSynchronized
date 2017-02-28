package me.xzl.testSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * �����˻�
 * ��concurrent��locks��Lock����
 * @author lenovo
 *
 */
public class Account1  {
	private Lock accountLock=  new ReentrantLock();
	private double balance;//�˻����
	
	/**
	 * ���
	 */
	public void deposit(double money){
		accountLock.lock();
		try {
			double newBalance = balance + money;
			try {
				Thread.sleep(10);//ģ���ҵ����Ҫһ��ʱ�䴦��
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			balance = newBalance;
		} 
		finally{
			accountLock.unlock();
		}
		
	}
	/**
	 * ��ȡ�˻����
	 */
	public double getBalance(){
		return balance;
	}
}
