/*
* Problem: https://open.kattis.com/problems/pot
* 
* @author  Bivash Pandey
*/
import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 0;
        for(int i=1; i<=n; i++) {
            int num = input.nextInt();
            sum += Math.pow(num/10, num%10);
        }
        System.out.println(sum);
    }
}