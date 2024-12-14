
public class Address 
{

	String state;
	String city;
	int pin;
	public Address(String state, String city, int pin) {
		
		this.state = state;
		this.city = city;
		this.pin = pin;
	}
	
	void dispAddress()
	{
		System.out.println(state+city+pin);
	}
}
