public class Primes {
    public static void main(String[] args) {
        int N = Integer.parseInt(args[0]);

        boolean[] isPrime = new boolean[N + 1];

        for (int i = 2; i < isPrime.length; i++) {
            isPrime[i] = true;
        }

        int limit = (int) Math.sqrt(N);
        
        for (int p = 2; p <= limit; p++) {
            if (isPrime[p] == true) {
                for (int i = p + p; i <= N; i = i + p) {
                    isPrime[i] = false;
                }
            }
        }

        System.out.println("Prime numbers up to " + N + ":");
        int count = 0;
        
        for (int i = 2; i <= N; i++) {
                       if (isPrime[i]) {
                System.out.println(i);
                count++;
            }
        }

              double percent = (double) count / N * 100;
        System.out.println("There are " + count + " primes between 2 and " + N + 
                           " (" + (int)percent + "% are primes)");
    }
}


