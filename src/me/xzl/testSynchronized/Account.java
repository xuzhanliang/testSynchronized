package me.xzl.testSynchronized;

/**
 * �����˻�
 * ��synchronized�ؼ���ͬ��
 * @author lenovo
 *
 */
public class Account  {
	private double balance;//�˻����
	
	/**
	 * ���
	 */
	public synchronized  void deposit(double money){
		double newBalance = balance + money;
		try {
			Thread.sleep(10);//ģ���ҵ����Ҫһ��ʱ�䴦��
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		balance = newBalance;
	}
	/**
	 * ��ȡ�˻����
	 */
	public double getBalance(){
		return balance;
	}
}
