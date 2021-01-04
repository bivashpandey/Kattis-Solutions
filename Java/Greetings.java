/*
* Problem: https://open.kattis.com/problems/greetings2
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s = input.next();
        int len = s.length();
        String greeting = ""+s.charAt(0);
        for(int i=0; i<2 * (len-2); i++) {
            greeting += "e";
        }
        greeting += s.charAt(len-1);

        System.out.println(greeting);
    }
}