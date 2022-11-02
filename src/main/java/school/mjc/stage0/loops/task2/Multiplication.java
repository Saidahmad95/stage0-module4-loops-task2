package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
            return;
        }
        int i = 0;
        while (Math.abs(i) <= multiplyByAndToInclusive * multiplyByAndToInclusive) {
            System.out.println(i);
            i += multiplyByAndToInclusive;
        }
    }
}
