import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        SieveOfEratosthenes(20);


    }
    static void SieveOfEratosthenes(int n)
    {
        boolean[] prime = new boolean[n + 1];
        Arrays.fill(prime, true);

        for (int p = 2; p * p <= n; p++) {

            if (prime[p]) {
                for (int i = p * p; i <= n; i += p)
                    prime[i] = false;
            }
        }


        for (int p = 2; p <= n; p++)
            if (prime[p])
                System.out.println(p);
    }
}


