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
    private int age;

    public Reptile(String name, String species, int age){
        this.name = name;
        this.species = species;
        this.age = age;
    }
    
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * @param species the species to set
     */
    public void setSpecies(String species) {
        this.species = species;
    }

    /**
     * @return the age
     */
    public int getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Reptile other) {
        int compareName = this.name.compareTo(other.name);
        return compareName == 0? this.species.compareTo(other.species): compareName;
    }

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder("Hello, my name is ");
        message.append(this.name);
        message.append(" and I am a ");
        message.append(this.species);
        message.append(" and I have ");
        message.append(this.age);
        message.append(" years");
        return message.toString();
    }
    
    
    
}
