public class Primes {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        boolean[] primes = new boolean[n + 1];
        
        for (int i = 2; i < primes.length; i++) primes[i] = true;

        for (int i = 2; i < Math.sqrt(primes.length); i++)
        {
            if (isPrime(i)){
                for (int j = i * 2; j < primes.length; j += i){
                    primes[j] = false;
                }
            }
        }
        
        System.out.println("Prime numbers up to " + n + ":");
        double primesCount = 0;
        for (int k = 0; k < primes.length; k++){
            if (primes[k]) {
                System.out.println(k);
                primesCount++;
            }
        }
        double primesPercentage = (primesCount / n) * 100;
        String finalStr = String.format("There are %d primes between 2 and %d (%d%% are primes)", (int) primesCount, n, (int) primesPercentage);
        System.out.println(finalStr);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++){
            if (num % i == 0 && num != i) return false;
        }
        return true;
    }
}