package me.jairdaniel.comparator;

import java.util.Collections;
import java.util.List;

import me.jairdaniel.comparable.Reptile;
import static me.jairdaniel.comparable.TestComparable.createReptilesList;

public class TestComparator {

	public static void main(String[] args) {
		
		List<Reptile> reptiles = createReptilesList();
		
		/** Sort the list and print it **/
        Collections.sort(reptiles, (Reptile r1, Reptile r2)-> {
        	int compareName = r1.getName().compareTo(r2.getName());
            return compareName == 0? r1.getSpecies().compareTo(r2.getSpecies()): compareName;
        });
        System.out.println("Ordered list: \n" + reptiles);
	}
}
