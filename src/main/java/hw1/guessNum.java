package hw1;

import java.util.Random;
import java.util.Scanner;

public class guessNum {
    public static void main(String[] args) {
        String name;
        System.out.println("Enter your name: ");
        Scanner inputName = new Scanner(System.in);
        name = inputName.nextLine();
        Random rand = new Random();
        int userNum = rand.nextInt(100);
        Scanner input = new Scanner(System.in);
        System.out.println("Let the game begin: ");
        int guessNum;
        boolean win = false;


        while (win == false){


            guessNum = input.nextInt();



            if(guessNum == userNum) {
                win = true;
            }
            else if(guessNum<userNum){
                System.out.println("Your number is too small. Please, try again.");
            }
            else if(guessNum>userNum){
                System.out.println("Your number is too big. Please, try again.");
            }
        }


        System.out.println("The number was " + userNum);
        System.out.println("Congratulations, " + name + "!");


    }
}

