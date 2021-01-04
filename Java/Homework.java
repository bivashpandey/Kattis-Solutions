/*
* Problem: https://open.kattis.com/problems/heimavinna
* 
* @author  Bivash Pandey
*/

import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.next();
        String[] problems = str.split(";");
        int numQuestions = 0;
        for(int i=0; i<problems.length; i++) {
            if(problems[i].contains("-")) {
                String[] temp = problems[i].split("-");
                numQuestions += Integer.parseInt(temp[1]) - Integer.parseInt(temp[0]) + 1;
            }
            else {
                numQuestions += 1;
            }
        }
        System.out.println(numQuestions);
    }
}