/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.jairdaniel.comparable;

/**
 *
 * @author jairdaniel
 */
public class Reptile implements Comparable<Reptile>{
    private String name;
    private String species;

    public Reptile(String name, String species){
        this.name = name;
        this.species = species;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSpecies() {
        return species;
    }
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * Compares name and species Strings.
     */
    @Override
    public int compareTo(Reptile other) {
        int compareName = this.name.compareTo(other.name);
        return compareName == 0? this.species.compareTo(other.species): compareName;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder("Hello my name is ");
        message.append(this.name);
        message.append(" and I am a ");
        message.append(this.species);
        return message.toString();
    }
    
    
}
