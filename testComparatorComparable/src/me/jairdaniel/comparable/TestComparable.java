/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.jairdaniel.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author jairdaniel
 */
public class TestComparable {
    
    public static void main(String [] args){
        
    	List<Reptile> reptiles = createReptilesList();
        
        /** Sort the list and print it **/
        Collections.sort(reptiles);
        System.out.println("Ordered list: \n" + reptiles);
        
        /** Create a Set collection and add all list objects **/
        Set<Reptile> set = new TreeSet<>(reptiles);
        
        /** Now try to add duplicate values. TreeSet looks for 
         * Comparable implementation. Others (e.g. HashSet) 
         * work with hash code to define uniqueness**/
        set.add(new Reptile("Dilberto", "Russian Tortoise"));
        set.add(new Reptile("Bigu", "Sulcat"));
        System.out.println("Set still has 3 reptiles: " + set.size());
    }
    
    /**
     * Returns a list of 3 reptiles/
     * @return
     */
    public static List<Reptile> createReptilesList(){
    	
    	 /** I create 3 reptiles **/
        Reptile tortoise1 = new Reptile("Dilberto", "Russian Tortoise");
        Reptile tortoise2 = new Reptile("Bigu", "Sulcat");
        Reptile snake = new Reptile("Spike", "Rattle snake");
        
        /** Add them to a list **/
        List<Reptile> reptiles = new ArrayList<Reptile>();
        reptiles.add(tortoise1);
        reptiles.add(tortoise2);
        reptiles.add(snake);
        return reptiles;
    }
}
