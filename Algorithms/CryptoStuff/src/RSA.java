/*
 * RSA asymmetric cryptographic algorithm.
 * prime number are relatively small compared
 *  to practical application
 */

public class RSA {
    static double gcd(double a, double b){
        double temp;
        // euclid method to find the greatest common divisor
        while(true){
            temp = a%b;
            if(temp == 0){
                return b;
            }
            a = b;
            b = temp;
        }
    }

    public static void main(String args[]){
        /* 2 relatively small
         prime number were taken  */
        double p = 3;
        double q = 7;

        double n = p*q; // our public key is the result of 2 prime numbers multiply

        double e = 2;
        double phi = (p-1)-(q-1); // Euler function calc
        while (e < phi){
            if(gcd(e,phi)==1){
                break;
            }
            else{
                e++;
            }
        }
        int k = 2;
        double d = (1+(k*phi))/e;
        double msg = 12;
        System.out.println("Message data = " + msg);

        // Encryption c = (msg ^ e) % n
        double c = Math.pow(msg, e);
        c = c % n;
        System.out.println("Encrypted data = " + c);

        // Decryption m = (c ^ d) % n
        double m = Math.pow(c, d);
        m = m % n;
        System.out.println("Original Message Sent = " + m);
    }

}
