package me.xzl.testSynchronized;

/**
 * 银行账户
 * 用synchronized关键字同步
 * @author lenovo
 *
 */
public class Account  {
	private double balance;//账户余额
	
	/**
	 * 存款
	 */
	public synchronized  void deposit(double money){
		double newBalance = balance + money;
		try {
			Thread.sleep(10);//模拟此业务需要一段时间处理
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		balance = newBalance;
	}
	/**
	 * 获取账户余额
	 */
	public double getBalance(){
		return balance;
	}
}
