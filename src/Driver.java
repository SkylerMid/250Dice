
public class Driver {
	public static void main(String[] args) 
	{
		Dice d20 = new Dice(20);

		System.out.println(d20.roll());
		
		for(int i = 0; i < 20; i++)
		{
			System.out.println(d20.roll());
		}

	}
}
