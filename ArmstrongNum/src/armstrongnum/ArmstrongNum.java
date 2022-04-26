/* Naming Conventions: * Package names are in lowercase*
 * Class/Interfaces names are in PascalCase * Method/Instances names are in camelCase*
 * Variable names are in camelCase (typeName) * Constants are in SNAKE_CASE*
 * Temporary variables names: i,j,k,m,n for int; c,d,e for char (else follow variable names)*
 * Sapere Aude */
package armstrongnum;

import java.util.Scanner;

/**
 * @author King Red Sanchez
 */
public class ArmstrongNum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String strNum, strLoop;
        do {
            int intTotal = 0, intBase, intTmp;
            char chrTmp;
            double dblPow;
            System.out.println("Enter a number:");
            strNum = in.next();
            // Parse string prompt into int
            intBase = Integer.parseInt(strNum);
            for (int i = 0; i < strNum.length(); i++) {
                // Parse string into char
                chrTmp = strNum.charAt(i);
                // Parse char into int
                intTmp = Integer.parseInt(String.valueOf(chrTmp));
                // Cube the int while parsing into double
                dblPow = Math.pow((double) intTmp, 3);
                // Total the cubes while parsing into int
                intTotal += (int) dblPow;
            }
            // Check if Base number == to Total of the cubes per digit
            if (intBase == intTotal) {
                System.out.println(intBase + " is an Armstrong Number!");
            } else {
                System.out.println(intBase + " is not an Armstrong Number.");
            }
            System.out.println("Enter \"y\" to try again, any to exit");
            // Looping prompt for user
            strLoop = in.next();
        } while (strLoop.equals("y"));
        in.close();
    }

}
