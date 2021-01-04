/*
* Problem: https://open.kattis.com/problems/trik
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String moves = input.next();
        int ballAt = 1;
        for(int i=0; i<moves.length(); i++) {
            if(ballAt == 1) {
                if(moves.charAt(i) == 'A') {
                    ballAt = 2;
                }
                if(moves.charAt(i) == 'C') {
                    ballAt = 3;
                }
            }
            else if(ballAt == 2) {
                if(moves.charAt(i) == 'B') {
                    ballAt = 3;
                }
                if(moves.charAt(i) == 'A') {
                    ballAt = 1;
                }
            }
            else {
                if(moves.charAt(i) == 'C') {
                    ballAt = 1;
                }
                if(moves.charAt(i) == 'B') {
                    ballAt = 2;
                }
            }
        }
        System.out.println(ballAt);
    }
}