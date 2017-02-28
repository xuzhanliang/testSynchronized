package me.xzl.testSynchronized;

public class AddMoneyThread implements Runnable {

	private Account account;//�����˻�
	private double money;//������
	
	public AddMoneyThread(Account account,double money) {
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
