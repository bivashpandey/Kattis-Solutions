/*
* Problem: https://open.kattis.com/problems/heartrate
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class HeartRate {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i=1; i<=n; i++) {
            int beats = input.nextInt();
            double time = input.nextDouble();
            System.out.println(String.format("%.4f",(60*beats/time - 60/time)) 
                + " " + String.format("%.4f",60*beats/time)
                + " " + String.format("%.4f",(60*beats/time + 60/time)));
        }
    }
}