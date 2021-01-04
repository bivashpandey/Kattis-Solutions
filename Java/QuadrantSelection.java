/*
* Problem: https://open.kattis.com/problems/quadrant
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class QuadrantSelection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        int quadrant;
        if(x>0 && y>0) {
            quadrant = 1;
        }
        else if(x<0 && y>0) {
            quadrant=2;
        }
        else if(x <0 && y<0) {
            quadrant = 3;
        }
        else {
            quadrant = 4;
        }
        System.out.println(quadrant);
    }
}