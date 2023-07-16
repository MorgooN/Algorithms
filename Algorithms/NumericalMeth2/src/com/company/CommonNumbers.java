package com.company;
import java.util.*;

public class CommonNumbers {
    public static void main(String args[]){
        CommonNumbers cN = new CommonNumbers();
        System.out.println(cN.findFactor(17));
    }

    ArrayList<Integer> findFactor(int n){
        ArrayList<Integer> factors = new ArrayList<>();

        while(n%2==0){
            factors.add(2);
            n=n/2;
        }
        int i = 3;
        int max_factor =(int) Math.sqrt(n);
        while(i<=max_factor){
            while(n%i==0){
                factors.add(i);
                n=n/i;
                max_factor = (int) Math.sqrt(n);

            }
            i+=2;
        }
        return factors;
    }
}
