# Operators #

## Unary operators ##

- Value creating operator: =;

```
       int apple = 152;
       int pear = apple;
       apple = 35;
```

- Sign operators: +, -;

```
        int plusFive = 5;
        int minusThree = -3;
        int minusFive = -plusFive; // conversion to a negative sign
```

- Logic operator: it can have 2 values (true, false).
Negation operator: !

```
        boolean yes = true;
        boolean no = !yes;
```

- Arithmetic operators integer: +, -, *, /, %

```
        int addition = 5 + 2;
        int subtraction = 17 - 6;
        int multiplication = 3 * 4;
        int integerDivision = 20 / 3;
        int divisionWithRemainder = 18 % 7;
```

- String concatenation: + 

```
        String hello = "Hello";
        String wordl = "World!";

        String result = hello + " " + wordl;
```

- Combined operation: +=, -=, *=, /=, %=

```
        int integer = 1;
        integer = integer + 4;
        integer += 5;
```

- Comperative operators: <, >, <=, >=, ==

```
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
```

- Logical operators: ||, &&, ^

```
        int age = 20;
        int numberOfBeers = 0;
        boolean adult = age >= 18;
        boolean thereIsBeer = numberOfBeers > 0;
        boolean itIsSaturday = true;
        boolean itIsSunday = false;

        boolean and = adult && thereIsBeer;
        boolean or = itIsSaturday || itIsSunday;
        boolean exclusiveOr = true ^ true;
```

short-circuit term: `` boolean b = (age > 15) && (numberOfBeers == 0); ``

conditional expression:

```
        int apple3 = 3, pear3 = 5;
        int larger2 = apple3 > pear3 ? apple3 : pear3;
```