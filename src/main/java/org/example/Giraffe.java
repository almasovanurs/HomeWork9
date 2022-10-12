package org.example;

public class Giraffe implements Animal {


    private String breed;
    private int growth;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public int getGrowth() {
        return growth;
    }

    public void setGrowth(int growth) {
        this.growth = growth;
    }

    @Override
    public void animalPlus() {
        System.out.println("Giraffes are very beautifil and cute");

    }

    @Override
    public void animalMinus() {
        System.out.println("long neck makes them uncomfortable");

    }

    @Override
    public String toString() {
        return "Giraffe{" +
                "breed='" + breed + '\'' +
                ", growth=" + growth +
                '}';
    }
}
