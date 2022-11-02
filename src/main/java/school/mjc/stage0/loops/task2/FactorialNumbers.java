package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int result = 0;
        while (result <= printToInclusive) {
            System.out.println(factorial(result));
            result++;
        }
    }
    static int factorial(int n) {
        return (n == 1 || n == 0) ? 1 : n *
                factorial(n - 1);
    }
}
