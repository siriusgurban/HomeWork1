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
        scedule[2][1] = "do home work";
        scedule[3][0] = "Wednesday";
        scedule[3][1] = "go to courses; watch a film";
        scedule[4][0] = "Thursday";
        scedule[4][1] = "do home work";
        scedule[5][0] = "Friday";
        scedule[5][1] = "go to courses; watch a film";
        scedule[6][0] = "Saturday";
        scedule[6][1] = "do home work";


        String ex = "exit";
        boolean exit = true;
        String userIn;


        do{
            System.out.println("Please, input the day of the week: ");
            Scanner input = new Scanner(System.in);
            userIn = input.nextLine().trim().toLowerCase();

            if (userIn!=(ex)){


                for(int i=0; i<scedule.length; i++){
                    for(int j=0; j<scedule[i].length; j++){
                        if(userIn.equals(scedule[i][j].toLowerCase()) ){

                            switch (scedule[i][j]) {
                                case "Sunday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                                case "Monday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                                case "Tuesday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                                case "Wednesday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                                case "Thursday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                                case "Friday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                                case "Saturday":
                                    System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
                                    break;
                            }

                        }
                    }
                }
            }else if(userIn==(ex)){
                exit = false;
                System.out.println("Exit");

            }
        }

        while (exit = true);{



        }




//               do {
//
//            System.out.println("Please, input the day of the week: ");
//            Scanner input = new Scanner(System.in);
//            userIn = input.nextLine().trim().toLowerCase();
//
//            for(int i=0; i<scedule.length; i++){
//                for(int j=0; j<scedule[i].length; j++){
//                    if(userIn.equals(scedule[i][j].toLowerCase())){
//
//                        switch (scedule[i][j]) {
//
//            case "Sunday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//                break;
//            case "Monday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//                break;
//            case "Tuesday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//                break;
//            case "Wednesday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//                break;
//            case "Thursday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//                break;
//            case "Friday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//                break;
//            case "Saturday":
//               System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//                break;
//                default:
//                    System.out.println("Sorry, I don't understand you, please try again.");
//                break;
//        }
//                    }else if(userIn == exit){
//                        System.out.println("Sorry, I don't understand you, please try again.");
//                    }
//                }
//            }
//
//        }while (userIn != exit); {
//
//
//
//        }



//
//            default: System.out.println("Please, input the day of the week: ");
//                Scanner input = new Scanner(System.in);
//
//                userIn = input.nextLine().trim().toLowerCase();



//        switch (scedule[i][j]) {
//            case "Sunday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//
//            case "Monday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//
//            case "Tuesday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//
//            case "Wednesday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//
//            case "Thursday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//
//            case "Friday":
//                System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//
//            case "Saturday":
//               System.out.println("Your tasks for " + scedule[i][j] + ": " + scedule[i][j+1]);
//
//            default:
//                dayString = "Invalid day";
//                break;
//        }






        // System.out.println("Sorry, I don't understand you, please try again.");




    }
}