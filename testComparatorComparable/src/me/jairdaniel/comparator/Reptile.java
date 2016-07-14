package me.jairdaniel.comparator;

/**
 * The same Reptile class as in me.jairdaniel.comparable excluding Comparable interface implementation.
 * @author jxcorreasanchez
 *
 */
public class Reptile {

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

    @Override
    public String toString() {
        StringBuilder message = new StringBuilder("Hello my name is ");
        message.append(this.name);
        message.append(" and I am a ");
        message.append(this.species);
        return message.toString();
    }
}
