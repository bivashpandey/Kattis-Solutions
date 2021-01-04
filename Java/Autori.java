/*
* Problem: https://open.kattis.com/problems/autori
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String name = input.next();
        String[] splitName = name.split("-");
        String shortName = "";
        for(int i=0; i<splitName.length; i++) {
            shortName += splitName[i].charAt(0);
        }
        System.out.println(shortName);
    }
}