/*
* Problem: https://open.kattis.com/problems/timeloop
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class StuckInATimeLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String mantra = "Abracadabra";
        for(int i=1; i<=n ;i++) {
            System.out.println(i+" "+mantra);
        }
    }
}