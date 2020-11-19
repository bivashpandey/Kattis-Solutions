/*
* Problem: https://open.kattis.com/problems/grassseed
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class GrassSeedInc {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double perCost = input.nextDouble();
        double totalArea = 0.0;
        int noOfLawn = input.nextInt();
        for(int i=0; i<noOfLawn; i++) {
            double width = input.nextDouble();
            double length = input.nextDouble();
            totalArea += width * length;
        }
        System.out.println(String.format("%.7f", totalArea*perCost));
    }
}