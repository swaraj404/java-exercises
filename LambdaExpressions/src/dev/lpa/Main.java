package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>(List.of("alpha","bravo","ramu","beta"));
        list.forEach(((var s )-> System.out.println(s)));  //This is an lambda expression used instead of for loop.

        System.out.println("------");
        list.forEach((var mystring )-> {
            char first = mystring.charAt(0);
            System.out.println(mystring+" means " + first);
        });
        int result = calculator((a,b)-> a + b ,5,2 );
        
    }

    public static <T> T calculator(Operation<T> function, T value1, T value2){
        T result = function.operate(value1,value2);
        System.out.println("Result of operation: " +result);
        return result;
    }
}