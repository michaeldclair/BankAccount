package ssa;

public class Checking extends Account{
	
	private static int lastCheckNbr=100;

	public Checking(){}
	
	public double withdraw(double amt, int aLastCheckNbr){
		this.lastCheckNbr = aLastCheckNbr;
		lastCheckNbr++;
		return super.withdraw(amt);
	}   

	public static int getLastCheckNbr() {
		return lastCheckNbr;
	}

	public static void setLastCheckNbr(int lastCheckNbr) {
		Checking.lastCheckNbr = lastCheckNbr;
	}

}
