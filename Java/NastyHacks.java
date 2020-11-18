/*
* Problem: https://open.kattis.com/problems/nastyhacks
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n; i++) {
            int revWithoutAd = input.nextInt();
            int revWithAd = input.nextInt();
            int costOfAd = input.nextInt();
            if(revWithoutAd > (revWithAd - costOfAd)) {
                System.out.println("do not advertise");
            }
            else if(revWithoutAd < (revWithAd - costOfAd)) {
                System.out.println("advertise");
            }
            else {
                System.out.println("does not matter");
            }
        }
    }
}