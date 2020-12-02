package animalkingdom;

abstract class Abstractanimal
{
	private static int maxId = 0;

	protected int id;
	protected String name;
	protected int yearDiscovered;

	public Abstractanimal(String name, int yearDiscovered)
	{
		maxId++;
		id = maxId;
		this.name = name;
		this.yearDiscovered = yearDiscovered;
	}

	public String eat(String food)
	{
		return name + " eats " + food;
	}

	public int getYearNamed(){
		return yearDiscovered;
	}

	public String getName(){
		return name;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();

	@Override
	public String toString()
	{
		return "Animals{id=" + id + ", name=" + name + ", yearNamed=" + yearDiscovered +"}";
	}
}