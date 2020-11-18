/*
* Problem: https://open.kattis.com/problems/pieceofcake2
* 
* @author  Bivash Pandey
*/

import java.util.Scanner;

public class PieceOfCake{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length = input.nextInt();
        int horCut = input.nextInt();
        int verCut = input.nextInt();
        int firstVol = 4 * horCut * verCut;
        int secondVol = 4 * verCut * (length - horCut);
        int thirdVol = 4 * (length-horCut) * (length-verCut);
        int fourthVol = 4 * (length - verCut) * horCut;
        System.out.println(Math.max(Math.max(firstVol, secondVol), Math.max(thirdVol, fourthVol)));
    }
}