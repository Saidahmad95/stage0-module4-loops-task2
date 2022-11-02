package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        if (multiplyByAndToInclusive == 0) {
            System.out.println("");
            return;
        }
        System.out.println(0);
        int i = multiplyByAndToInclusive;
        while (i < multiplyByAndToInclusive * multiplyByAndToInclusive) {
            System.out.println(multiplyByAndToInclusive > 0 ? i : "-"+i);
            i += multiplyByAndToInclusive;
        }
    }
}
