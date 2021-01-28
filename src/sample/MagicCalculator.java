package sample;
import java.lang.Math;


public class MagicCalculator extends Calculator {

//  Empty constructor.
    public MagicCalculator() {

    }

    //  A collection of Magic Calculator methods
    public double sin(int num) {
        return Math.sin(num);
    }

    public double cosin(int num) {
        return Math.cos(num);
    }

    public double tan(int num) {
        return Math.tan(num);
    }

    public double sqrt(int num) {
        return Math.sqrt(num);
    }
    public int factorial(int num) {
        int mult = 1;
        for (int i = num; i > 0; i--) {
            mult *= i;
        }
        return mult;
    }
}
