package com.cg.interim;

public class excep4 { 
	public static void main(String[] args) {
		try{
		int i,sum;
		sum=10;
				for(i=-1; i<3; i++) {
					sum=(sum/i);
							System.out.print(i);
				}
	}
		catch(ArithmeticException e) {
			System.out.print("0");
		}
	}

}
