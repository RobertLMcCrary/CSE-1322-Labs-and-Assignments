import java.util.LinkedList;
import java.math.*;

public class Prime {
    public LinkedList<Integer> primeList = new LinkedList<>();

    Prime(int max) {
        boolean[] maxArr = new boolean[max + 1];

        for (int i = 0; i < maxArr.length; i++) {
            maxArr[i] = true;
        }

        //true = prime number
        //false = not prime number

        for (int i = 2; i <= Math.sqrt(max); i++) {
            if (maxArr[i]) {
                // Mark multiples of i as false (not prime)
                for (int j = i * i; j <= max; j += i) {
                    maxArr[j] = false;
                }
            }
        }

        //adding the prime numbers into the linked list
        for (int i = 0; i < maxArr.length; i++) {
            if (maxArr[i] == true) {
                primeList.add(i);
            }
        }
    }    

    public boolean isPrime(int num) {
        //returns true if num is found in the linked list (it is prime)
        for (int i : primeList) {
            if (i == num) {
                return true;
            }
        }    
        return false; 
    }


    public int getPrime(int position) {
        return primeList.get(position);
    }

    
}
