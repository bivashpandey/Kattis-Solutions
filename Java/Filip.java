/*
* Problem: https://open.kattis.com/problems/filip
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Filip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        if(revNum(a) > revNum(b)) {
            System.out.println(revNum(a));
        }
        else {
            System.out.println(revNum(b));
        }   
    }
    public static int revNum(int n) {
        int r, rev=0;
        while(n!=0) {
            r = n%10;
            rev = rev * 10 +r;
            n = n/10;
        }
        return rev;
    }
}