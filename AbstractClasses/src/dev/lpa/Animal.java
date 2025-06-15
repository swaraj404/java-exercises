package dev.lpa;

abstract class Animal {
    protected String type;
    private String size;
    private double weight;

    public Animal(String size, String type,double weight) {
        this.size = size;
        this.type = type;
        this.weight = weight;
    }

    public abstract void move(String speed);
    public abstract void makeNoise();

}
