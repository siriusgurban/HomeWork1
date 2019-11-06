package hw3;

import sun.plugin.javascript.navig.Array;

import java.util.Scanner;
import java.util.Arrays;

public class main{
    public static void main(String[] args) {

        String[][] scedule = new String[7][2];

        scedule[0][0] = "Sunday";
        scedule[0][1] = "do home work";
        scedule[1][0] = "Monday";
        scedule[1][1] = "go to courses; watch a film";
        scedule[2][0] = "Tuesday";
        scedule[2][1] = "learn java";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "learn OOP";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "learn collections";
        scedule[5][0] = "Friday";
        scedule[5][1] = "learn inheritance";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "learn polymorphism";

        String userIn = "";

        do{
            System.out.println("Please, input the day of the week: ");
            Scanner input = new Scanner(System.in);
            userIn = input.nextLine().trim().toLowerCase();
            if (userIn.equals("sunday") || userIn.equals("monday") || userIn.equals("tuesday") || userIn.equals("wednesday") || userIn.equals("thursday")){
                if (!userIn.equals("exit")){
                    for(int i=0; i<scedule.length; i++){

                        for(int j=0; j<scedule[i].length; j++){

                             if(userIn.equals(scedule[i][j].toLowerCase()) ){

                            switch (scedule[i][j]) {
                                case "Sunday":
                                case "Monday":
                                case "Tuesday":
                                case "Wednesday":
                                case "Thursday":
                                case "Friday":
                                case "Saturday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                                default:
//                                    System.out.println("Sorry, I don't understand you, please try again.");
                                    break;

                            } }

                        } } }else{ System.exit(0);}
            }else {
                System.out.println("Sorry, I don't understand you, please try again.");
            }
            }

                     while (!userIn.equals("exit"));


    }
}
