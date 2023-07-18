package com.company;

public class GreatestCommonDev {

    public static void main(String[] args) {
	        GreatestCommonDev g1 = new GreatestCommonDev();
            int gcdBrute = g1.gcdByBruteForce(60,12);
            System.out.println("Greatest common divisor by Brute force: "+ gcdBrute);
            int gcdEuclid = g1.gcdByEuclid(60,24);
             System.out.println(" GCD by Euclid algorithm: " + gcdEuclid);

    }

    int gcdByBruteForce(int n1, int n2){
        int gcd = 1;
        for(int i =1; i <=n1 && i<=n2; ++i){
            if((n1%i==0 && n2%i == 0)){
                gcd = i;
            }
        }
        return gcd;
    }

    int gcdByEuclid(int a, int b){
        while (b != 0) {
            int remainder = a%b;
            a=b;
            b = remainder;
        }
        return a;
    }

}

