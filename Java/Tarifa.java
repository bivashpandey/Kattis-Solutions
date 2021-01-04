/*
* Problem: https://open.kattis.com/problems/tarifa
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mbPerMonth = input.nextInt();
        int numOfMonths = input.nextInt();
        int[] dataUse = new int[numOfMonths];
        int totalDataAfter = mbPerMonth;
        for(int i=0; i<numOfMonths; i++) {
            dataUse[i] = input.nextInt();
            totalDataAfter += mbPerMonth - dataUse[i];
        }
        System.out.println(totalDataAfter);
    }
}