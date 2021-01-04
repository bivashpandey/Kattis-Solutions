/*
* Problem: https://open.kattis.com/problems/spavanac
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Spavanac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int h = input.nextInt();
        int m = input.nextInt();
        if(h==0) {
            h=24;
        }
        if(m >= 45) {
            System.out.println(h+" "+ (m-45));
        }
        if(m < 45) {
            System.out.println((h-1)+" "+ (60-(45-m)));
        }
    }
}