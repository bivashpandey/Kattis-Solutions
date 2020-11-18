/*
* Problem: https://open.kattis.com/problems/everywhere
* 
* @author  Bivash Pandey
*/

import java.util.*;

public class IveBeenEverywhere {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i=1; i<=t; i++) {
            Set<String> cities = new HashSet<String>();
            int numOfCities = input.nextInt();
            for(int j=1; j<= numOfCities; j++) {
                String city = input.next();
                cities.add(city);
            }
            System.out.println(cities.size());
        }
    }
}