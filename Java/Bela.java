/*
* Problem: https://open.kattis.com/problems/bela
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Bela {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        char c = input.next().charAt(0);
        int sum = 0;
        for(int i=0; i<4*n; i++) {
            String str = input.next();
            if(str.charAt(1) == c) {
                if(str.charAt(0) == 'J') {
                    sum += 20;
                }
                else if(Character.getNumericValue(str.charAt(0)) == 9){
                    sum += 14;
                }
            }
            else {
                if(str.charAt(0) == 'J') {
                    sum += 2;
                }
                else if(Character.getNumericValue(str.charAt(0)) == 9) {
                    sum += 0;
                }
            }
            if(str.charAt(0) == 'A') {
                sum += 11;
            }
            else if(str.charAt(0) == 'K') {
                sum += 4;
            }
            else if(str.charAt(0) == 'Q') {
                sum += 3;
            }
            else if(str.charAt(0)=='T') {
                sum += 10;
            }
        }
        System.out.println(sum);
    }
}