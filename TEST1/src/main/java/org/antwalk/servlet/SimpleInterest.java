package org.antwalk.servlet;

public class SimpleInterest {
	private int principal;
	private int rate;
	private int time;
	private double intrst;
	private double amount;
	public int getPrincipal() {
		return principal;
	}
	public void setPrincipal(int principal) {
		this.principal = principal;
	}
	public int getRate() {
		return rate;
	}
	public void setRate(int rate) {
		this.rate = rate;
	}
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public SimpleInterest()
	{
		this.principal=0;
		this.time=0;
		this.rate=0;
		this.intrst=0.0;
		this.amount=0.0;
	}
	public SimpleInterest(int principal, int rate, int time) {
		super();
		this.principal = principal;
		this.rate = rate;
		this.time = time;
		this.intrst=0.0;
		this.amount=0.0;
	}
	public double interest(int principal,int rate,int time)
	{
		intrst=((principal*rate*time)/100.0);
		System.out.println("The simple interest is: "+amount);
		return intrst;
	}
	public double amounttotal()
	{
		amount=principal+intrst;
		return amount;
	}


}
