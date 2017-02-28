package me.xzl.testSynchronized;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 银行账户
 * 用concurrent。locks。Lock方法
 * @author lenovo
 *
 */
public class Account1  {
	private Lock accountLock=  new ReentrantLock();
	private double balance;//账户余额
	
	/**
	 * 存款
	 */
	public void deposit(double money){
		accountLock.lock();
		try {
			double newBalance = balance + money;
			try {
				Thread.sleep(10);//模拟此业务需要一段时间处理
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
	 * 获取账户余额
	 */
	public double getBalance(){
		return balance;
	}
}
