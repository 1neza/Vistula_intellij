//Task 2. Java Class

import java.util.Scanner;

public class Java_2 {
    public static void main(String[] args){

//        Using scanner and prompting user to type in the info
        System.out.println("");
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter Your Weight Dawg: ");
        String opn = scn.nextLine();
        scn.close();

//        next steps below we are doing the simple math_operations
        float kgm = ((Float.parseFloat(opn))*35)/100;
        System.out.println( opn + "Kg is your weight on earth and when converted to mars it is " +kgm + "Kg");

        double dkgm = Double.parseDouble(opn);
        System.out.println("is "+dkgm+"Kg when converted to double_datatype");

//        double opoe = 70.0f;
//        System.out.printf("weight on mars (double): %.5f\n", opoe);

//        limiting return decimal places using format()(floats and double numbers)
        double oper = (Double.parseDouble(opn)*100);
        System.out.printf("when converted to double but limiting the decimal places to four. %.2f\n", oper);

//        limiting return decimal places using  format () (ints)

//        05/04

    }

}
