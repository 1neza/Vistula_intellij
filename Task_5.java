/*TASK 5 - HOW NOT TO CALCULATE THE TAX IN
JAVA LANGUAGE
Using the double types, implement the following:
Suppose a product costs 9.99 net, calculate its gross value (we assume
VAT of 23%).
Then multiply it by 10,000 (i.e., we sold 10,000 pcs of this product), and
calculate this value excluding VAT.
-------------------------------------------------- ------------------------------------------------
Implement the above actions using the Big Decimal class. Print on the
console all computed values, compare their values. What conclusions do
you have?*/

import java.math.BigDecimal;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args){

        Scanner Scn = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the Product Price: ");
        double net_price = Double.parseDouble(Scn.nextLine());

        double VAT = 23 * (net_price)/100; //VAT per item

//        Used math ops with BigDecimal!

        BigDecimal VAT_Total = BigDecimal.valueOf(VAT).multiply(BigDecimal.valueOf(10_000)); //Total VAT Considering that Sold items are 10_000
        BigDecimal Gross_Price = BigDecimal.valueOf(net_price).add(BigDecimal.valueOf(VAT));

//        Terminal printing the results
        System.out.println("The Item's Net_price is: "+ net_price +" and it's VAT is: " + VAT);
        System.out.println();
        System.out.println("The Gross Price is: " + Gross_Price + " Considering that the sold items are 10_000. Total VAT is: "+VAT_Total);

        Scn.close();
    }
}

//Successfully Done! Task_5 MIV.Jean