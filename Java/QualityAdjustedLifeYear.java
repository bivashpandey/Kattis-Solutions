/*
* Problem: https://open.kattis.com/problems/qaly
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class QualityAdjustedLifeYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numOfPeriods = input.nextInt();
        double qaly = 0.0;
        for(int i=1; i<=numOfPeriods; i++) {
            double qualityOfLife = input.nextDouble();
            double years = input.nextDouble();
            qaly += qualityOfLife * years;
        }
        System.out.println(String.format("%.3f", qaly));
    }
}
