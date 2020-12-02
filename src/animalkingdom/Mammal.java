package animalkingdom;

public class Mammal extends Abstractanimal
{
	private static String move = "walk";
	private static String breath = "lungs";
	private static String reproduce = "live births";

	public Mammal(String name, int yearDiscovered)
	{
		super(name, yearDiscovered);
	}

	@Override
	public String move()
	{
		return move;
	}

	@Override
	public String breath()
	{
		return breath;
	}

	@Override
	public String reproduce()
	{
		return reproduce;
	}

	@Override
	public String toString()
	{
		return name + " " + reproduce + " " + move + " " + breath + " " + yearDiscovered;
	}
}