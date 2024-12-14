
public class TestOverriding
{

	public static void main(String[] args) 
	{
		float bonus;
		Manager m = new Manager(1001,"shan",30000);
		m.displayEmployee();
		
		bonus =m.calculateBonus();
		System.out.println(bonus);
		
		Engineer e = new Engineer(1002,"nsnathan",40000);
		e.displayEmployee();
		bonus =e.calculateBonus();
		System.out.println(bonus);
	}
	
}
