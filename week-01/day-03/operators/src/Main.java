public class Main {

    public static void main(String[] args) {

        // value creation
        int apple, pear;
        apple = 152;
        pear = apple;
        System.out.println("1.) Apple = " + apple + "\tpear = " + pear);

        apple = 35;

        System.out.println("2.) Apple = " + apple + "\tpear = " + pear);

        // sing operator
        int plusFive = 5;
        int minusThree = -3;
        int minusFive = -plusFive;

        System.out.println("plus five = " + plusFive + "\n" +
                "minus three = " + minusThree + "\n" +
                "minus five = " + minusFive);

        // logic negation operator
        boolean yes = true;
        boolean no = !yes;

        System.out.println("true = " + yes + ", !true = " + no);

        // arithmetic operators integer
        int addition = 5 + 2;
        int subtraction = 17 - 6;
        int multiplication = 3 * 4;
        int integerDivision = 20 / 3;
        int divisionWithRemainder = 18 % 7;

        System.out.println("\n5 + 2 = " + addition + "\n" +
                "17 - 6 = " + subtraction + "\n" +
                "3 * 4 = " + multiplication + "\n" +
                "20 / 3 = " + integerDivision + "\n" +
                "18 % 7 = " + divisionWithRemainder);

        double daddition = 5.3 + 2.1;
        double dsubtraction = 17.68 - 6.6;
        double dmultiplication = 30.15 * 0.4;
        double dintegerDivision = 20.0 / 3.0;
        double ddivisionWithRemainder = 18.0 % 7.5;

        System.out.println("\n5.3 + 2.1 = " + daddition + "\n" +
                "17.68 - 6.6 = " + dsubtraction + "\n" +
                "30.15 * 0.4 = " + dmultiplication + "\n" +
                "20.0 / 3.0 = " + dintegerDivision + "\n" +
                "18.0 % 7.5 = " + ddivisionWithRemainder);

        // other
        int phrases1 = addition * 2;
        int phrases2 = addition + subtraction - multiplication;

        double phrases3 = daddition * dsubtraction / dmultiplication;

        String hello = "Hello";
        String wordl = "World!";

        String result = hello + " " + wordl;
        System.out.println(result);

        String exclamationMark = result + "!";
        System.out.println(exclamationMark);

        int integer = 1;
        integer = integer + 4;
        integer += 5;

        System.out.println("Integer: " + integer);

        // comperative operators
        int apple2 = 15;
        int pear2 = 33;

        boolean larger = 5 > 3;
        boolean greaterThanOrEqualTo = 9 >= 9;
        boolean less = apple2 < -5;
        boolean lesshanOrEqualTo = 13.28 <= pear2;
        boolean equal = apple2 == 10;
        boolean notEqual = pear2 != 0;

        boolean characterComparison = 'A' > 'B';
        char questionMark = '?';
        boolean s = questionMark == ' ';
        boolean no2 = larger == false;
        boolean attention = "Something" == "Something";

        // logical operators
        int age = 20;
        int numberOfBeers = 0;
        boolean adult = age >= 18;
        boolean thereIsBeer = numberOfBeers > 0;
        boolean itIsSaturday = true;
        boolean itIsSunday = false;

        boolean and = adult && thereIsBeer;
        boolean or = itIsSaturday || itIsSunday;
        boolean exclusiveOr = true ^ true;

        // short-circuit term
        boolean b = (age > 15) && (numberOfBeers == 0);

        // conditional expression
        int apple3 = 3, pear3 = 5;
        int larger2 = apple3 > pear3 ? apple3 : pear3;
        System.out.println("Larger number: " + larger2);

        int examNumber = 3;
        String examGrade = examNumber == 1 ? "You failed..." : "You passed!";
        System.out.println(examGrade);
    }
}
