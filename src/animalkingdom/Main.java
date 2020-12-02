package animalkingdom;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

public class Main 
{
	private static List<Abstractanimal> filterAnimals(List<Abstractanimal> theList, CheckAnimal tester)
	{
		List<Abstractanimal> tempList = new ArrayList<>();

		for(Abstractanimal a : theList)
		{
			if(tester.test(a))
			{
				tempList.add(a);
			}
		}
		return tempList;
	}
	public static void main(String[] args)
	{
		System.out.println("*** MVP ***");

		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		List<Abstractanimal> animalList = new ArrayList<>();

		animalList.addAll(Arrays.asList(panda, zebra, koala, sloth, armadillo, raccoon, bigfoot, pigeon, peacock, toucan, parrot, swan, salmon, catfish, perch));

		System.out.println();
		System.out.println("*** List all the animals in descending order by year named ***");
		animalList.sort((a1, a2) -> a2.getYearNamed() - a1.getYearNamed());
		animalList.forEach(a -> System.out.println(a));

		System.out.println();
		System.out.println("*** List all the animals alphabetically ***");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach(a -> System.out.println(a));

		System.out.println();
		System.out.println("*** List all the animals order by how they move ***");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalList.forEach(a -> System.out.println(a));


		System.out.println();
		System.out.println("*** List only the animals that breath with lungs ***");
		List<Abstractanimal> filteredList = filterAnimals(animalList, a -> a.breath() == "lungs");
		filteredList.forEach(a -> System.out.println(a));

		System.out.println();
		System.out.println("*** List only the animals that breath with lungs and were named in 1758 ***");
	    filteredList = filterAnimals(animalList, a -> (a.breath() == "lungs") && (a.getYearNamed() == 1758));
		filteredList.forEach(a -> System.out.println(a));

		System.out.println();
		System.out.println("*** List only the animals that lay eggs and breath with lungs ***");
	    filteredList = filterAnimals(animalList, a -> (a.breath() == "lungs") && (a.reproduce() == "eggs"));
		filteredList.forEach(a -> System.out.println(a));

		System.out.println();
		System.out.println("*** List alphabetically only those animals that were named in 1758 ***");
	    filteredList = filterAnimals(animalList, a -> a.getYearNamed() == 1758);
	    filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredList.forEach(a -> System.out.println(a));

		System.out.println();
		System.out.println("*** List alphabetically those animals that are mammals ***");
	    filteredList = filterAnimals(animalList, a -> a instanceof Mammal);
	    filteredList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		filteredList.forEach(a -> System.out.println(a));
	}
}