package inheritanceEmpPack;

public class CalculateHRA_PFcls   {
	
	int basicPay = 0;
	int bonus = 0;
	int deduction = 0;
	double hra = 0.0;
	double pf = 0.0;
	public  void calculate_hra_pf() {
		DetailsFrmConsleCls obj = new DetailsFrmConsleCls();
		System.out.println("After parent constructor call");
		//obj.getDetailsFromConsole();
		basicPay = obj.basic_pay;
		bonus = obj.bonus;
		deduction = obj.deduction;
		hra = (5* basicPay)/100;
		pf = (20 * basicPay)/100;
		System.out.println("hra===" + hra);
		System.out.println("pf=====" + pf);
		
		
		
	}
	
	
	
	
}
