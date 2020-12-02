package animalkingdom;

public class Fish extends Abstractanimal
{
	private static String move = "swim";
	private static String breath = "gills";
	private static String reproduce = "eggs";

	public Fish(String name, int yearDiscovered)
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