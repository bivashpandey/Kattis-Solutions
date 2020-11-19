/*
* Problem: https://open.kattis.com/problems/batterup
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] scores = new int[n];
        int nonStrugglingScores = 0;
        int sumScores = 0;
        for(int i=0; i<n; i++) {
            scores[i] = input.nextInt();
            if(scores[i]!= -1) {
                sumScores += scores[i];
                nonStrugglingScores++;
            }
        }
        System.out.println((double)sumScores/nonStrugglingScores);
    }
}