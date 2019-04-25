package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    static String randomHedge(){
        Random random = new Random();

        ArrayList<String> hedge = new ArrayList<String>();

        hedge.add("Why do you say that ");
        hedge.add("You seem to think that ");
        hedge.add("So, you are concerned that ");

        int ranNum = random.nextInt(hedge.size());
        return hedge.get(ranNum);

    }

    static ArrayList<String> wordReplacer(String input){
        ArrayList<String> words = new ArrayList<String>();

        words.clear();

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
        }
        return words;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String responseText = "Enter your response here or Q to quit: ";
        String input = "";
        System.out.print("Good day. What is your problem? ");

        while(! input.equalsIgnoreCase("q")){
            System.out.print(responseText);
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")){
                break;
            }


            System.out.print(randomHedge());
            for (int i = 0; i < wordReplacer(input).size(); i++) {

                System.out.print(wordReplacer(input).get(i) + " ");
            }
            System.out.println();
        }

    }
}
