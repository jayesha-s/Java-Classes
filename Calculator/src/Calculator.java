public class Calculator {

    int num1;
    int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public String add(int num1, int num2) {
        int addition = num1+num2;
        return "These two numbers, when added, result in: " + addition;
    }

    public String subtract(int num1, int num2) {
        int subtraction = num1-num2;
        return "These two numbers, when subtracted, result in: " + subtraction;
    }

    public String multipy(int num1, int num2) {
        int multiplication = num1*num2;
        return "These two numbers, when multiplied, result in: " + multiplication;
    }

    public String divide(int num1, int num2) {
        double division = num1/num2;
        return "These two numbers, when divded, result in: " + division;
    }



}

