package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int i = 2;
        while (i < printToInclusive) {
            System.out.print(isPrime(i) ? i+"\n" : "");
            i++;
        }

    }

    static boolean isPrime(int i) {
        if (i <= 1) return false;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) return false;
        }
        return true;
    }
}
