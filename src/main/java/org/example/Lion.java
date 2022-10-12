package org.example;

public class Lion implements Animal{

    private int age;
    private String colo;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColo() {
        return colo;
    }

    public void setColo(String colo) {
        this.colo = colo;
    }

    @Override
    public void animalPlus() {
        System.out.println("symbol of strength");

    }

    @Override
    public void animalMinus() {
        System.out.println("predator");

    }

    @Override
    public String toString() {
        return "Lion{" +
                "age=" + age +
                ", colo='" + colo + '\'' +
                '}';
    }
}

