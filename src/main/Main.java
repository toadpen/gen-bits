package main;

// IMPORTS
import Generation.Generate;

public class Main {


    // MAIN
    public static void main(String[] args) {


        Generate gen = new Generate();
        String num = gen.generateNums(20);

        System.out.println(num);
    }
}
