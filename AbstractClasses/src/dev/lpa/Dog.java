package dev.lpa;

public class Dog extends Animal {

    public Dog(String size, String type, double weight) {
        super(size, type, weight);
    }

    @Override
    public void move(String speed) {
        if(speed.equals("slow")){
            System.out.println(type + " walking");
        }else{
            System.out.println(type + " running");
        }

    }

    @Override
    public void makeNoise() {
        if(type== "Wolf".toLowerCase()){
            System.out.println("Howling");
        }else {
            System.out.println("woof!");
        }
    }
}