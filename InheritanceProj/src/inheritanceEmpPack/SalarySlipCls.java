package inheritanceEmpPack;

public class SalarySlipCls extends CalculateHRA_PFcls  {

	public static void main(String[] args) {
		SalarySlipCls objSal = new SalarySlipCls();
		objSal.calculate_hra_pf();
		double totSalary = (objSal.basicPay + objSal.hra - objSal.pf - objSal.deduction + objSal.bonus);
		System.out.println("SALARY SLIP");
		System.out.println("***************");
		System.out.println("Basic Pay = " + objSal.basicPay);
		System.out.println("Deduction = " + objSal.deduction);
		System.out.println("hra = " + objSal.hra);
		System.out.println("pf = " + objSal.pf);
		System.out.println("bonus = " + objSal.bonus);
		System.out.println("Total salary by hand = " + totSalary);
	}

}
