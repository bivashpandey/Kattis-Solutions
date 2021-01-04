/*
* Problem: https://open.kattis.com/problems/dicecup
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class DiceCup {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int start = Math.min(a, b);
        int end = Math.max(a, b);
        for(int i=start+1; i<=end+1; i++) {
            System.out.println(i);
        }
    }
}