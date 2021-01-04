/*
* Problem: https://open.kattis.com/problems/transitwoes
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class TransitWoes{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int s = input.nextInt();
        int t = input.nextInt();
        int n = input.nextInt();
        
        int[] dist = new int[n+1];
        int[] busTime = new int[n];
        int[] busArrival = new int[n];
        int requiredTime = 0;
        for(int i=0; i<n+1; i++) {
            dist[i] = input.nextInt();
            requiredTime += dist[i];
        }
        for(int i=0; i<n; i++) {
            busTime[i] = input.nextInt();
            requiredTime += busTime[i];
        }
        for(int i=0; i<n; i++) {
            busArrival[i] = input.nextInt();
        }
        
        if(n > 1) {
            for(int i=0; i<busArrival.length-1; i++) {
                requiredTime += busArrival[i+1]-busArrival[i];
            }
        }
        else {
            requiredTime += busArrival[0];
        }
        if(requiredTime < (t-s)) System.out.println("yes");
        else System.out.println("no");
    }
}