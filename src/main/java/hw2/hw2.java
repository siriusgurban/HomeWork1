package hw2;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;


public class hw2 {
    public static void main (String[] args) {


        Random rand = new Random();
        int max = 5, min = 1;
        int x = rand.nextInt((max - min) + 1) + min;
        int y = rand.nextInt((max - min) + 1) + min;

        System.out.println("Correct row: " + x);
        System.out.println("Correct column: " + y);

        String[][] numbers = new String[][]{
                {"0","1","2","3","4","5"},
                {"1","-","-","-","-","-",},
                {"2","-","-","-","-","-",},
                {"3","-","-","-","-","-",},
                {"4","-","-","-","-","-",},
                {"5","-","-","-","-","-",}
        };

        int row;
        int column;


        for (int i=0; i<numbers.length;i++){
            for (int j=0; j<numbers[i].length ;j++ ){
                System.out.print(numbers[i][j] + " | ");
            }
            System.out.println();
        }

        do {
            System.out.println("Enter row: ");
            Scanner input1 = new Scanner(System.in);
            row = input1.nextInt();
            System.out.println("Enter column: ");
            Scanner input2 = new Scanner(System.in);
            column = input2.nextInt();



            numbers[row][column] = "*";

            for (int i=0; i<numbers.length;i++){
                for (int j=0; j<numbers[i].length ;j++ ){
                    System.out.print(numbers[i][j] + " | ");
                }
                System.out.println();
            }



        } while (numbers[x][y] != numbers[row][column]);{

            numbers[row][column] = "x";

            for (int i=0; i<numbers.length;i++){
                for (int j=0; j<numbers[i].length ;j++ ){
                    System.out.print(numbers[i][j] + " | ");
                }
                System.out.println();
            }

            System.out.println("You have won!");
        }







        //int[row][column]numbers = int[][];

      /*  for (int i=0; i<numbers.length;i++){

            for (int j=0; j<numbers[i].length ;j++ ){

                System.out.print(numbers[i][j] + " | ");
            }
            System.out.println();
        }


       */

      /*  if (row>1 && column>1  && row<numbers.length && column<numbers.length)
        {
            int[row][column]numbers = int[][];
        }
        else
        {
            System.out.println("Invalid input.......");
        }
*/

    }

}

