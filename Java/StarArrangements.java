/*
* Problem: https://open.kattis.com/problems/stararrangements
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class StarArrangements {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stars = input.nextInt();
        System.out.println(stars+":");
        for(int i=2; i<=Math.ceil(stars/2.0); i++) {
            for(int j=i-1; j<=i; j++) {
                 if(stars%(i+j)==0) {
                    System.out.println(i+","+j);
                }
                else if(test(stars, i,j)) {
                    System.out.println(i+","+j);
                }
            }
        }
    }
    public static boolean test(int stars, int a, int b) {
        for(int i=1; i<= stars; i++) {
            if(a*i+b*(i-1) == stars) {
                return true;
            }
        }
        return false;
    }
}
