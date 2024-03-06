//we first import the libraries Random for generating random numbers and Scanner to prompt user input
import java.util.Random;
import java.util.Scanner;

public class en539 {
    public static void main(String[] args){

//        below we initialise the objects of scanner and random
        Random rnd = new Random();
        Scanner scn = new Scanner(System.in);
        System.out.println();

//here while the user enters y the system generates a random integer else it terminates
        while (true){

            System.out.println("enter y to continue or x to terminate!: ");
            String inp = scn.nextLine();

            if (inp.equalsIgnoreCase("y")) {

                int rnd_number  = rnd.nextInt(100) + 1;
                if (rnd_number % 2 == 0) {
                    System.out.println(rnd_number + " the generated number is even");
                } else {
                    System.out.println(rnd_number + " the generated number is odd");
                }
            }
            else if(inp.equalsIgnoreCase("X")){
                break;
            }
        }
        scn.close();
    }
}
// end of task_3
