package devops44;

public class MyCalc {
	int sum(int a, int b)
	{
		return a+b;
	}
	int diff(int a, int b)
	{
		return a-b;
	}
	int mul(int a, int b)
	{
		return a*b;
	}
	int div(int a, int b)
	{
		return a/b;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MyCalc calc = new MyCalc();
		System.out.println("Sum is "+calc.sum(20, 10));
		System.out.println("Diff is "+calc.diff(20, 10));
		System.out.println("Mul is "+calc.mul(50, 10));
		System.out.println("Div is "+calc.div(20, 10));
		System.out.println("final run corn job");

	}

}
