/*
* Problem: https://open.kattis.com/problems/zanzibar
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class StandOnZanzibar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] ans = new int[n];
        for(int i=0; i<n; i++) {
            int a = input.nextInt();
            int start = a;
            int sum = 0;
            while(a!=0) {
                a = input.nextInt();
                if(a >= 2*start) {
                    sum += a - 2*start;
                }
                start = a;
            }
            ans[i] = sum;
        }
        for(int a: ans) {
            System.out.println(a);
        }
    }
}