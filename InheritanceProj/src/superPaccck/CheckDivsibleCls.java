package superPaccck;

public class CheckDivsibleCls extends AdditionCls{
	
	int total = 0;
	public static void main(String[] args) {
		CheckDivsibleCls obj = new CheckDivsibleCls();
		obj.checkDivisible();

	}
	public boolean checkDivisible() {
		int d = super.add(2, 30);
		System.out.println("d===" + d);
		if(d%10 == 0) {
			System.out.println("Divisible by 10");
			return true;
		} else {
			System.out.println("Not Divisible by 10");
			return false;
		}
	}

}
