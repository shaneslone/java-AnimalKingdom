package animalkingdom;

public class Bird extends Abstractanimal
{
	private static String move = "fly";
	private static String breath = "lungs";
	private static String reproduce = "eggs";

	public Bird(String name, int yearDiscovered)
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