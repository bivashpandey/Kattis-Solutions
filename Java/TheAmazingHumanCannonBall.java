/*
* Problem: https://open.kattis.com/problems/humancannonball2
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class TheAmazingHumanCannonBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double gravity = 9.81;
        int n = input.nextInt();
        String[] cases = new String[n];
        for(int i=0; i<n;i++) {
            double v = input.nextDouble();
            double theta = input.nextDouble();
            double x1 = input.nextDouble();
            double h1 = input.nextDouble();
            double h2 = input.nextDouble();
            double t = x1/(v * (Math.cos(Math.toRadians(theta))));
            double y = v* t* Math.sin(Math.toRadians(theta)) - (1/2.0) * gravity * t*t;
            if(h2 - y >= 1 && y - h1 >=1) {
                cases[i] = "Safe";
            }
            else {
                cases[i] = "Not Safe";
            }
        }
        
        for(String s: cases) {
            System.out.println(s);
        }
    }
}