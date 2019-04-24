package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayList<String> words = new ArrayList<String>();

        String responseText = "Enter your response here or Q to quit: ";
        String input = "";
        System.out.print("Good day. What is your problem? ");

        while(! input.equalsIgnoreCase("q")){
            System.out.print(responseText);
            input = scanner.nextLine();
//            if (! input.equalsIgnoreCase("q")){
//                break;
//            }

            for (String inputs : input.split(" ")){
                words.add(inputs);
            }
            for (int i = 0; i < words.size(); i++){
                if (words.get(i).equalsIgnoreCase("i")){
                    words.set(i, "you");
                } else if (words.get(i).equalsIgnoreCase("me")){
                    words.set(i, "you");
                } else if (words.get(i).equalsIgnoreCase("my")){
                    words.set(i, "your");
                } else if (words.get(i).equalsIgnoreCase("am")){
                    words.set(i, "are");
                }
                System.out.print(words.get(i) + " ");
            }
            words.clear();
            System.out.println();
        }


    }
}
