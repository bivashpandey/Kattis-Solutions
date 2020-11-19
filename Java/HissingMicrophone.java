/*
* Problem: https://open.kattis.com/problems/hissingmicrophone
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class HissingMicrophone {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        String ans = "no hiss";
        for(int i=0; i<word.length()-1; i++) {
            if(word.charAt(i)=='s' && word.charAt(i+1)=='s') {
                ans = "hiss";
                break;
            }
        }
        System.out.println(ans);
    }
}