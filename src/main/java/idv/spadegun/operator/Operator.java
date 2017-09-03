package idv.spadegun.operator;

public class Operator {
    public static void main(String[] args) {
        double firstValue = 20d;
        double secondValue = 80d;
        double result = ((firstValue + secondValue) * 25) % 40;
        if (result <= 20)
            System.out.println("Total was over the limit");
    }
}
