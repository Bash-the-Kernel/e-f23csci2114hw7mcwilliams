//104743
public class McWilliams7 {
    public static void main(String[] args) {
        int n = 999999;

        boolean[] isPrime = new boolean[n + 1];  // We'll use 0-based indexing

        // Initialize the array assuming all numbers are prime
        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        // Apply the Sieve of Eratosthenes algorithm
        for (int i = 2; i * i <= n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int primeIndex = 0;
        for (int i = 2; i <= n; i++) {
            if (isPrime[i]) {
                primeIndex++;
                if(primeIndex == 10001)
                {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
