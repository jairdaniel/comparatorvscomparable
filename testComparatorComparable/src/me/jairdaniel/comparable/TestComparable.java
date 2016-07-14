/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.jairdaniel.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author jairdaniel
 */
public class TestComparable {
    
    public static void main(String [] args){
        
        /** I create 4 reptiles **/
        Reptile tortoise1 = new Reptile("Dilberto", "Russian Tortoise", 2);
        Reptile tortoise2 = new Reptile("Bigu", "Sulcat", 0);
        Reptile tortoise3 = new Reptile("Burocracia", "Dragon", 10);
        Reptile snake = new Reptile("Spike", "Rattle snake", 5);
        
        /** Add them to a list **/
        List<Reptile> reptiles = new ArrayList<Reptile>();
        reptiles.add(tortoise1);
        reptiles.add(tortoise2);
        reptiles.add(tortoise3);
        reptiles.add(snake);
        
        /** Sort the list and print it **/
        Collections.sort(reptiles);
        System.out.println("Checking ordered list");
        System.out.println(reptiles);
        
        /** Create a Set collection and add all list objects **/
        Set<Reptile> set = new HashSet<>(reptiles);
        
        /** Now try to add duplicate values **/
        set.add(tortoise1);
        set.add(tortoise2);
        set.add(tortoise3);
        System.out.println("Checking that the set only has 4 elements");
        System.out.println(set.size());
        
        /** Finally I add to the set a different reptile **/
        set.add(new Reptile("Lind", "Iguana", 1));
        System.out.println("Now the set collection should have 5 elements");
        System.out.println(set.size());
    }
}
