public class Main{
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Calculator calc1 = new Calculator(5,2);
        System.out.println(calc1.add(5,2));
        System.out.println(calc1.subtract(5,2));
        System.out.println(calc1.multipy(5,2));
        System.out.println(calc1.divide(5,2));


    }
}