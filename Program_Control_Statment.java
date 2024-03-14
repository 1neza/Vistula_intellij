/* TASK 1 – SIMPLE CALCULATOR, USING FROM INPUT - OUTPUT OPERATIONS
Please create a program that will calculate sum, difference, product and a quotient for two user-entered numbers (example
variable names: firstNumberBielecki, secondNumberBielecki).
Variables entered by the user should be assigned to the float type.
All calculations (sum, difference, product, and quotient) are calculated
at once (the user does not choose the action to be performed).
The result of the calculation should be displayed in two decimal places.*/
//Task_1 Above!
/*TASK 2 – CALCULATION OF THE BMI INDEX
(IF-ELSE–IF LADDER)
Please create a program that will calculate the BMI (I encourage you to use the Math.pow () method) after
user enters his height and weight (example variable names: heightBielecki, weightBielecki) - the variables passed by the user are assigned to
the float type.
After calculating the BMI value, thanks to the if-else-if ladder statement, the value will be assigned to the appropriate range and the correct
message will appear on the console. Intervals
of BMI index:
- 16.00 – starvation
- 16.00 - 16.99 – emaciation
- 17.00 - 18.49 – underweight
- 18.50 - 22.99 – normal, low range
- 23.00 - 24.99 – normal, high range
- 25.00 - 27.49 – overweight, low range
- 27.50 - 29.99 – overweight, high range
- 30 - 34.9 – 1st degree obesity
- 35 - 39.9 – 2nd degree obesity
- 40 – 3rd degree obesity*/
//Task_2 Above!
/*TASK 3 – CALCULATION OF THE ELEMENTS OF THE
EQUATION SQUARE (USING THE SWITCH
INSTRUCTIONS)
Please write a program that will calculate the roots of the quadratic equation
ax2+bx+c= 0 using the switch selection statement, where variables a, b, c are
real numbers entered from the keyboard.
Variables a, b, c, x1 and x2 should be displayed on the screen with an accuracy
of two decimal places.
Hints:
1. We check if the user has not entered zero as "a".
2. We calculate the delta and determine the number of elements.
3. Depending on the number of roots in the switch statement, we execute
specific actions (we calculate x1 or x1 and x2)*/
//Task_3 Above!
/*TASK 4 – SUMMARY OF EVEN NUMBERS
FROM 1 TO 100 - USING A FOR LOOP
Please write a program that sums even numbers from 1 to 100, you must
use for loop.*/
//Task_4 Above!

import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//import java.util.Scanner;
public class Program_Control_Statment {
    public static void main(String [] args) {

//Task_1

     /* System.out.println();
        System.out.println("The System will Print the result of simple math ops from user input data.");
        Scanner Scn = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the First number: ");
        int Nb1 = Integer.valueOf(Scn.nextLine());
        System.out.println("Enter the Second number: ");
        int Nb2 = Integer.valueOf(Scn.nextLine());

        double sumz = Nb1+Nb2;
        double diff = Nb1-Nb2;
        double pro = Nb1*Nb2;
//        int quot = Nb1/Nb2;

        double qt = Double.parseDouble(String.valueOf((float) Nb1/(float) Nb2));

//        int sum = Math.addExact(Nb1, Nb2);
//        int diff = Math.subtractExact(Nb1, Nb2);
//        int pro = Math.multiplyExact(Nb1, Nb2);

        System.out.printf("The Summation of entered numbers is: %.2f\n",sumz);
        System.out.printf("The Difference of entered numbers is: %.2f\n", diff);
        System.out.printf("The Product of entered numbers is: %.2f\n", pro);
        System.out.printf("The Summation of entered numbers is: %2f\n", qt);

        Scn.close();*/

//Task_2
        /*System.out.println();
        System.out.println("This will Print Your BMI");

        Scanner Scn = new Scanner(System.in);
        System.out.println("Enter Your Height in (Meter): ");
        double Ht =  Double.parseDouble(Scn.nextLine());
        System.out.println("Enter your weight(Kg) : ");
        double wt = Double.parseDouble(Scn.nextLine());

        double Bmi = Math.pow(Ht, 2);
        double BMI = wt/Bmi;

        System.out.println("The Your BMI is: "+BMI);

        if (BMI <= 16){
            System.out.println("Starvation.");
        } else if (BMI <= 16.99) {
            System.out.println("emaciation.");
        } else if (BMI <= 18.49) {
            System.out.println("UnderWeight.");
        }else if (BMI <= 22.99) {
            System.out.println("Normal, Low Range.");
        }else if (BMI <= 24.99) {
            System.out.println("Normal, High Range.");
        }else if (BMI <= 27.49) {
            System.out.println("overweight, Low Range.");
        }else if (BMI <= 29.99) {
            System.out.println("overweight, High Range.");
        }else if (BMI <= 34.99) {
            System.out.println("1st Degree obesity.");
        }else if (BMI <= 39.99) {
            System.out.println("2nd Degree obesity.");
        }else {
            System.out.println("3rd Degree obesity.");
        }
        Scn.close();
        Task_2 Done Successfully!*/

//Task_3
        /*writing a program that will calculate the quadratic equation ax**(2)+bx+c = 0
    using switch selection statement where a,b and c are real numbers entered from the keyboard.
    the a, b, c, x1 and x2 should be displayed on the screen with accuracy of two decimal places*/

                /*double a, b, c, x1, x2;

                System.out.println();
                System.out.println("The system will calculate the Quadratic eqn Ax2+Bx+C= 0, and the use has to Enter A, B and C.");
                Scanner Scn = new Scanner(System.in);
                System.out.print("Enter A: ");
                a = Scn.nextDouble();
                System.out.print("Enter B: ");
                b = Scn.nextDouble();
                System.out.print("Enter C: ");
                c = Scn.nextDouble();
                System.out.println();
                System.out.print("Delta: b**(2)-4(a*c) = ");

//        calculating delta
                double delta = Math.sqrt(Math.pow(b, 2) - 4 * (a * c));
                System.out.println(delta);
                System.out.println();
                x1 = ((b + Math.sqrt(delta)) / (2 * a));
                x2 = ((b - Math.sqrt(delta)) / (2 * a));
                System.out.println("The X1 = (b+sqrt(delta))/(2*a) = (" + b + "+ sqrt(" + delta + "))/(2*" + a + ")= " + x1);
                System.out.println("The X2 = (b-sqrt(delta))/(2*a) = (" + b + "- sqrt(" + delta + "))/(2*" + a + ")= " + x2);
                System.out.println("Therefore X1 = " + x1 + " and X2 = " + x2);

                Scn.close();

task_3 Completed successfully! (! problem with some numbers that returns NaN)*/

//TASK_4
/*SUMMARY OF EVEN NUMBERS FROM 1 TO 100 - USING A FOR LOOP
Please write a program that sums even numbers from 1 to 100, you must use for loop.*/
        /*System.out.println();
        System.out.println("This System will print The summary of Even numbers from 1 to 100.");

        List<Integer> range = new ArrayList<>();
        int a = 0;
        for (int i = 1 ; i<=100; i++){
            if( i%2 == 0 ){
                range.add(i);
                a += i;
            }
        }
        System.out.println(range+" These are all even numbers in range 1 to 100");
        System.out.println("The Sum of these numbers are: "+a);
        Task_4 Done Successfully!*/
//Task_5
/*TASK 5 – FINDING THE BIGGEST AND THE SMALLEST NUMBERS FROM THE SET OF NUMBERS DRAWN BY A LOOP WHILE
Please write a program which will use the while loop to find the largest and smallest number from
the set of 10 randomly drawn integers from 1 to 100.
Hint: In this task, please do not use an array or other collection.*/

//        Random rnd = new Random();
//        int count = 0;
//        int large = Integer.MAX_VALUE;
//        int small = Integer.MIN_VALUE;
//
//        while (count < 10){
//            int rdm = rnd.nextInt(100)+1;
//            if(rdm>large){
//                large = rdm;
//            }
//            if(rdm<small){
//                small = rdm;
//            }
//            count++;
//        }
//
//        System.out.println();
//        System.out.println(" The Maximum Number is: "+large);
//        System.out.println(" The Minimum Number is: "+small);

    }
}
