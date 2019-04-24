package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String responseText = "Enter your response here or Q to quit: ";
        String input = "";
        System.out.print("Good day. What is your problem?");

        while(! input.equalsIgnoreCase("q")){
            System.out.print(responseText);
            input = scanner.nextLine();
            if (! input.equalsIgnoreCase("q")){
                System.out.println(input);
            }
        }


    }
}
