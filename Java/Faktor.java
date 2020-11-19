/*
* Problem: https://open.kattis.com/problems/faktor
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class Faktor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int noOfArticle = input.nextInt();
        int impact = input.nextInt();
        System.out.println(noOfArticle*(impact-1)+1);
    }
}