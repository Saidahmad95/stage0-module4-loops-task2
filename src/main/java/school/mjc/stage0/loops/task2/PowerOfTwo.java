package school.mjc.stage0.loops.task2;

public class PowerOfTwo {
    public void printPower(int power) {
        if (power<0) System.out.println("too much power");
        else {
            int i = 0;
            while (i <= power){
                int l=0,temp=2;
                while (l<i){
                    temp*=2;
                    l++;
                }
                System.out.println((int) Math.pow(2,i));
                i++;
            }
        }
    }
}
