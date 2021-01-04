/*
* Problem: https://open.kattis.com/problems/chanukah
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class ChanukahChallenge {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=1; i<=t; i++) {
            int num = input.nextInt();
            int days = input.nextInt();
            System.out.println(num + " "+ (days*(days+1)/2 + days));
        }
    }
}