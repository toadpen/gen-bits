package main;

// IMPORTS
import Generation.Generate;

import java.util.Scanner;

public class Main {


    // MAIN
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Generate gen = new Generate();

        System.out.println("Length: >> ");
        String in1 = scanner.nextLine();

        System.out.println("Height: >> ");
        String in2 = scanner.nextLine();

        System.out.println("Range: >> ");
        String in3 = scanner.nextLine();

        String ran = "placeholder";

        ran = gen.generate2D(Integer.parseInt(in1), Integer.parseInt(in2), Integer.parseInt(in3));
        System.out.println(ran);

    }
}
