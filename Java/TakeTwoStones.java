/*
* Problem: https://open.kattis.com/problems/twostones
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class TakeTwoStones {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println((n%2==0)?"Bob":"Alice");
    }
}
