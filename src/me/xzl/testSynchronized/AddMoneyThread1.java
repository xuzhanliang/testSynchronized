package me.xzl.testSynchronized;

public class AddMoneyThread1 implements Runnable {

	private Account1 account;//�����˻�
	private double money;//������
	
	public AddMoneyThread1(Account1 account,double money) {
		this.account = account;
		this.money = money;
	}
	@Override
	public void run() {
		synchronized(account){
			account.deposit(money);
		}
	}

}
