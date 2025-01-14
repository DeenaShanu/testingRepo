package inheritanceEmpPack;

import java.util.Scanner;

public class DetailsFrmConsleCls {
	
	int basic_pay = 0;
	int deduction = 0;
	int bonus = 0;
	
	public  DetailsFrmConsleCls() {
		System.out.println("inside parent constructor");
		Scanner scanObj = new Scanner(System.in);
		System.out.println("Enter the value of basic pay");
		basic_pay = scanObj.nextInt();
		//System.out.println("basic_pay = " + basic_pay);
		System.out.println("Enter the value of deduction");
		deduction = scanObj.nextInt();
		//System.out.println("deduction = " + deduction);
		System.out.println("Enter the value of bonus");
		bonus = scanObj.nextInt();
		//System.out.println(" bonus = " +  bonus);
	}

}
