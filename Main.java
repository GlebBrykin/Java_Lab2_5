public class Main
{
    public static void main(String[] args)
    {
        System.out.printf("1 + 2 = %d\n", Calculator.add(1, 2));
        System.out.printf("1.5 + 2.5 = %f\n", Calculator.add(1.5, 2.5));
        System.out.printf("1 - 2 = %d\n", Calculator.substract(1, 2));
        System.out.printf("1.5 - 2.5 = %f\n", Calculator.substract(1.5, 2.5));
        System.out.printf("1 * 2 = %d\n", Calculator.multiply(1, 2));
        System.out.printf("1.5 * 2.5 = %f\n", Calculator.multiply(1.5, 2.5));
        System.out.printf("1 / 2 = %d\n", Calculator.divide(1, 2));
        System.out.printf("1.0 / 2.0 = %f\n", Calculator.divide(1.0, 2.0));
    }
}