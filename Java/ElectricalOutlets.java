/*
* Problem: https://open.kattis.com/problems/electricaloutlets
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class ElectricalOutlets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i=0; i<t; i++) {
            int n = input.nextInt();
            int maxOutlet = 0;
            int[] arr = new int[n];
            for(int j=0; j<n; j++) {
                int numOutlet = input.nextInt();
                maxOutlet += numOutlet;
            }
            System.out.println(maxOutlet - n + 1);
        }
    }
}