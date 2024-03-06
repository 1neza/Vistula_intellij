/*
Task 4: Choose an odd number between 50 and 100 and save it as an int variable
        telling us how many Lego bricks we have. (e.g. amountOfBricks), then
        select an even number between 5 and 10 stating how many Lego blocks
        fit in one container (e.g.: containerCapacity) and save it as an int variable
        as well.
        Write a program that will calculate how many full containers we have and
        how many containers in general (full and not full), and how many blocks
        are in the container that is not completely full (use modulo operator for
        this).
        Each of the above actions should be listed on the console, explaining what
        has been done*/


import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter the number of total bricks between 50 and 100: ");
        String AmountOfBricks = scn.nextLine(); //lego bricks we have

        System.out.println("Enter the number of Lego blocks per container you want: ");
        String ContainerCapacity = scn.nextLine(); //number of bricks in a single container

        int result =Integer.parseInt(AmountOfBricks) / Integer.parseInt(ContainerCapacity);
        int modulus = Integer.parseInt(AmountOfBricks) % Integer.parseInt(ContainerCapacity);

        if(modulus == 0){
            System.out.println("The number of full containers are: " + result + " No remaining bricks." );
        }
        else{
            int bricks_in_full_tanks = result * Integer.parseInt(ContainerCapacity);
            System.out.println("the number of full containers are: "+ result +" with total full_tanks bricks: "+ bricks_in_full_tanks +" and the remaining bricks are: "+ modulus);
        }
        scn.close();
    }
}
//Task 4 Done Successfully MIV.Jean.