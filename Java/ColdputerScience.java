/*
* Problem: https://open.kattis.com/problems/cold
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class ColdputerScience {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] temperatures = new int[n];
        int count=0;
        for(int i=0; i<n; i++) {
            temperatures[i] = input.nextInt();
            if(temperatures[i] < 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}