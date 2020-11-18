/*
* Problem: https://open.kattis.com/problems/planina
* 
* @author  Bivash Pandey
*/
import java.util.Scanner;

public class Planina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int sum = 2;
        for(int i=1; i<=n; i++) {
            sum += (sum-1);
        }
        System.out.println(sum*sum);
    }
}