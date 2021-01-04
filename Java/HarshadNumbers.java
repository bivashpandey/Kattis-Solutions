/*
* Problem: https://open.kattis.com/problems/harshadnumbers
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class HarshadNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int max = Integer.MAX_VALUE;
        for(int i=n; i<=max; i++) {
            int r, sum=0, m;
            m = i;
            while(m!=0) {
                r = m%10;
                sum = sum+r;
                m = m/10;
            }
            if(i%sum==0) {
                System.out.println(i);
                break;
            }
        }
    }
}