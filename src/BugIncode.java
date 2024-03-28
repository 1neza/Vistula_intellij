import javax.swing.*;
import java.util.Scanner;
import java.util.SortedSet;

//Task 2
/*public class BugInCode {
    public static void main(String[] args){
        System.out.println("The sum of the numbers in the array is: "
                + calcSumArray(new int[]{0, 1, 2, 3, 4}));
    }

    public static int calcSumArray(int [] arr){
        int result = 0;
        for(int i=1; i < arr.length; i++){
            result += arr[i];
        }
        return result;
    }
}*/
//Task 3
public class BugIncode{
    public static double Large_sib{

        Scanner Scn = new Scanner(System.in);
        System.out.print("\nEnter the non negative integer in range 0 to 10,000: ");
        String len = Scn.nextLine();
        String rev = "";

        double num = Double.parseDouble(len);

        for(int i = 1; i < len.length(); i++){
            for(int j = 1; j < len.length() ; j--){
                rev += len.charAt(j);
            }
        }

    }
}