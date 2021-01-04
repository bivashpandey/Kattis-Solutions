/*
* Problem: https://open.kattis.com/problems/zamka
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int l = input.nextInt();
        int d = input.nextInt();
        int x = input.nextInt();
        int min=0, max=0;
        for(int i=l;i<=d;i++) {
            if(sumOfDigit(i)==x) {
                min = i;
                break;
            }
        }
        for(int i=d;i>=l;i--) {
            if(sumOfDigit(i)==x) {
                max = i;
                break;
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
    public static int sumOfDigit(int n) {
        int r, sum=0;
        while(n!=0) {
            r = n%10;
            sum+=r;
            n=n/10;
        }
        return sum;
    }
}