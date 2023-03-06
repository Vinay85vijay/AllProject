package application1;

public class Bonus {
	public static int  getbonus(int sal)
	{
		sal=(int) (sal*0.1);
		return sal;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	Employee e=new Employee(10, "rani",1000);
	
	System.out.println("The bonus"+Bonus.getbonus(e.sal));
	

	}

}
