package org.example;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Data Types Exercises
        //Integer
        rectanglePerimeter();
        minutesToSeconds();
        squareArea();
        //Double
        cylinderVolume();
        fahrenheitToCelsius();
        computeHypotenuse();
        //Boolean
        assignAndPrint();
        compareBooleans();
        checkWeatherConditions();
        //Char
        printChar();
        convertCase();
        charToStringConcat();
        //String
        printString();
        stringConcat();
        replaceStringChar();
        //Operators, If blocks and Switch, Break and Continue Exercises
        //Operators
        printMathOperations(10, 2);
        modulusMagic(3);
        compoundOperators(30);
        //If Blocks
        gradeCalculator(50);
        passwordChecker("password1");
        isLeapYear();
        //Switch
        dayOfTheWeek();
        simpleCalculator(23,24, '/');
        trafficLightSimulator();
        //Break and Continue
        firstPositiveDivisor();
        skipNegativeNumbers();
        guessTheNumber();
        //Loops
        //For Loop
        multiplicationTable();
        factorialCalculator();
        countdown();
        //For-Each Loop
        findMaximum();
        countVowels();
        sumEvenNumbers();
        //While Loops
        inputSum();
        guessingGame();
        palindromeChecker();
    }

    //Data Types Exercises
    //Integer
    public static void rectanglePerimeter() {
        int length = 12;
        int width = 13;
        System.out.println("Perimeter: " + length * width);
    }

    public static void minutesToSeconds() {
        int minutes = 14;
        System.out.println("Seconds : " + minutes * 60);
    }

    public static void squareArea() {
        int side = 3;
        System.out.println("Square area: " + Math.pow(side, 2));
    }

    //Double
    public static void cylinderVolume() {
        double radius = 5.0;
        double height = 6.0;
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.println("Cylinder volume: " + volume);
    }

    public static void fahrenheitToCelsius() {
        double fahrenheit = 14.56;
        double celsius = (fahrenheit - 32) / 1.80;
        System.out.println("Celsius: " + celsius);
    }

    public static void computeHypotenuse() {
        double lengthOne = 10.14;
        double lengthTwo = 15.21;
        double hypotenuse = Math.sqrt(Math.pow(lengthOne, 2) + Math.pow(lengthTwo, 2));
        System.out.println("Hypotenuse: " + hypotenuse);
    }

    //Boolean
    public static void assignAndPrint() {
        boolean dummyValue = true;
        System.out.println("Boolean Print: " + dummyValue);
    }

    public static void compareBooleans() {
        boolean compareResult = 10 > 11;
        System.out.println("Boolean Comparison: " + compareResult);
    }

    public static void checkWeatherConditions() {
        boolean isSunny = true;
        boolean isWarm = false;
        boolean chanceOfRain = true;
        boolean shouldGoOut = (isSunny && isWarm) || (isWarm && !chanceOfRain);
        System.out.println(shouldGoOut ? "It's okay to go outside." : "Stay indoors!!");
    }

    //Char
    public static void printChar() {
        char simpleChar = 'A';
        System.out.println("Print char: " + simpleChar);
    }

    public static void convertCase() {
        char lowerCaseChar = 'a';
        char upperCaseChar = 'B';
        char toUpperCase = Character.toUpperCase(lowerCaseChar);
        char toLowerCase = Character.toLowerCase(upperCaseChar);
        System.out.println("toUpperCase char -> " + toUpperCase);
        System.out.println("toLowerCase char -> " + toLowerCase);
    }

    public static void charToStringConcat() {
        char prefixChar = 'A';
        char sufixChar = 'B';
        String testString = "test";
        System.out.println(prefixChar + testString + sufixChar);
    }

    //String
    public static void printString() {
        String testString = "test";
        System.out.println(testString);
    }

    public static void stringConcat() {
        String firstString = "firstString";
        String secondString = "secondString";
        System.out.println(firstString + secondString);
    }

    public static void replaceStringChar() {
        String testString = "test";
        System.out.println(testString.replace("t", "T"));
    }

    //Operators, If blocks and Switch, Break and Continue Exercises
    //Operators
    public static void printMathOperations(int firstInteger, int secondInteger) {
        int addResult = firstInteger + secondInteger;
        System.out.println(firstInteger + " + " + secondInteger + " = " + addResult);

        int subtractResult = firstInteger - secondInteger;
        System.out.println(firstInteger + " - " + secondInteger + " = " + subtractResult);

        int multiplyResult = firstInteger * secondInteger;
        System.out.println(firstInteger + " * " + secondInteger + " = " + multiplyResult);

        if (secondInteger < 1) {
            System.out.println("Unable to divide by 0.");
        } else {
            int divideResult = firstInteger / secondInteger;
            System.out.println(firstInteger + " / " + secondInteger + " = " + divideResult);
        }
    }

    public static void modulusMagic(int numberToCheck) {
        System.out.println(numberToCheck + " is even? -> " + (numberToCheck % 2 == 0));
    }

    public static void compoundOperators(int number) {
        System.out.println(number + " += 1 = " + (number += 1));
        System.out.println(number + " -= 1 = " + (number -= 1));
        System.out.println(number + " *= 3 = " + (number *= 3));
        System.out.println(number + " /= 2 = " + (number /= 2));
    }

    //If Blocks
    public static void gradeCalculator(int numericGrade) {
        String convertedGrade = "F";

        if (numericGrade < 1 || numericGrade > 100) {
            System.out.println("Invalid grade.");
        } else if (numericGrade >= 90) {
            convertedGrade = "A";
        } else if (numericGrade >= 80) {
            convertedGrade = "B";
        } else if (numericGrade >= 70) {
            convertedGrade = "C";
        } else if (numericGrade >= 60) {
            convertedGrade = "D";
        }

        System.out.println(numericGrade + " is equivalent to " + convertedGrade);
    }

    public static void passwordChecker(String password) {
        if (password.length() < 8) {
            System.out.println("Weak password.");
        } else {
            for (int nr = 0; nr < 10; nr++) {
                if (password.contains(Integer.toString(nr))) {
                    System.out.println("Strong password.");
                    break;
                } else if (nr == 9) {
                    System.out.println("Moderate password.");
                }
            }
        }
    }

    public static void isLeapYear() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the number to be checked.");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        System.out.println(isLeapYear ? year + " is a leap year" : year + " is not a leap year.");
    }

    //Switch
    public static void dayOfTheWeek() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number from 1 to 7.");
        int day = scanner.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day number.");
        }
    }

    public static void simpleCalculator(int numberOne, int numberTwo, char operation) {
        String allowedOperations = "+-*/";

        if (allowedOperations.contains(String.valueOf(operation))) {
            if (numberTwo != 0) {
                int result = switch (operation) {
                    case '+' -> numberOne + numberTwo;
                    case '-' -> numberOne - numberTwo;
                    case '*' -> numberOne * numberTwo;
                    case '/' -> numberOne / numberTwo;
                    default -> 0;
                };
                System.out.println(numberOne + " " + operation
                        + " " + numberTwo + " = " + result);
            } else System.out.println("Unable to divide by 0.");
        } else System.out.println("Invalid Operation.");
    }

    public static void trafficLightSimulator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the color of the traffic light:");
        String input = scanner.nextLine();

        switch (input) {
            case "red":
                System.out.println("Stop!");
                break;
            case "yellow":
                System.out.println("Stop if you can do it safely, it's about to get red");
                break;
            case "green":
                System.out.println("Drive further!");
                break;
            default:
                System.out.println("Invalid color");
        }
    }

    //Break and Continue
    public static void firstPositiveDivisor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a whole number:");
        int userInput = scanner.nextInt();
        int divisor = 2;

        while (true) {
            if (userInput % divisor == 0) {
                System.out.println("The first divisor of " + userInput + " is " + divisor);
                break;
            } else divisor++;
        }
    }

    public static void skipNegativeNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int userInput;

        while (true) {
            System.out.println("Type in a whole number:");
            userInput = scanner.nextInt();

            if (userInput < 0) {
                continue;
            } else if (userInput == 0) {
                break;
            }
            sum += userInput;
        }
        System.out.println("The sum of your numbers is " + sum);
    }

    public static void guessTheNumber() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(1, 11);
        System.out.println(numberToGuess);
        int userInput;

        for (int nrOfAttemps = 0; nrOfAttemps < 5; nrOfAttemps++) {
            System.out.println("Guess the number:");
            userInput = scanner.nextInt();

            if (numberToGuess == userInput) {
                System.out.println("You've won");
                break;
            }
            if (nrOfAttemps == 4) {
                System.out.println("You've lost");
            }
        }
    }

    //Loops
    //For Loops
    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number:");
        int userInput = scanner.nextInt();
        int result;

        for (int multiplier = 1; multiplier <= 10; multiplier++) {
            result = userInput * multiplier;
            System.out.println(userInput + " x " + multiplier + " = " + result);
        }
    }

    public static void factorialCalculator() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a number:");
        int userInput = scanner.nextInt();
        int result = 1;

        for (int nr = 1; nr <= userInput; nr++) {
            result *= nr;
        }
        System.out.println("The factorial of " + userInput + " is " + result);
    }

    public static void countdown() throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in the start of the countdown:");
        int userInput = scanner.nextInt();

        for (int count = userInput; count > 0; count--) {
            System.out.println(count);
            Thread.sleep(1000);
        }
        System.out.println("Count down ended.");
    }

    //For-Each Loop
    public static void findMaximum() {
        int[] numbers = {1, 2, 3, 7, 4, 5, 6};
        int maxValue = 0;

        for (int number : numbers) {
            maxValue = Math.max(maxValue, number);
        }

        System.out.println("The max value is " + maxValue);
    }

    public static void countVowels() {
        String[] vowels = {"A", "E", "I", "O", "U"};
        int vowelsCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a word:");
        String userInput = scanner.nextLine();
        String[] userInputArray = userInput.split("");

        for (String vowel : vowels) {
            for (String letter : userInputArray) {
                if (vowel.equalsIgnoreCase(letter)) {
                    vowelsCount++;
                }
            }
        }
        System.out.println("The number of vowel in your word is " + vowelsCount);
    }

    public static void sumEvenNumbers() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 10};
        int sum = 0;

        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        System.out.println("The sum of even numbers is: " + sum);
    }

    //While Loops
    public static void inputSum() {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int sum = 0;

        while (true) {
            System.out.println("Type in a number to sum it or 0 to exit:");
            userInput = scanner.nextInt();
            if (userInput == 0) {
                break;
            } else sum += userInput;
        }
        System.out.println("The sum of your numbers is " + sum);
    }

    public static void guessingGame() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numberToGuess = random.nextInt(1, 101);
        int userInput;
        System.out.println("Guess the number between 1 and 100");

        while (true) {
            userInput = scanner.nextInt();
            if (userInput == numberToGuess) {
                System.out.println("You've guessed the number " + numberToGuess);
                break;
            } else if (userInput < numberToGuess) {
                System.out.println("The number is too low.");
            } else {
                System.out.println("The number is too high.");
            }
        }
    }

    public static void palindromeChecker() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in a word to check");
        String userInput = scanner.nextLine();

        int startIndex = 0;
        int endIndex = userInput.length() - 1;
        while (true) {
            if (userInput.charAt(startIndex) == userInput.charAt(endIndex)) {
                if (startIndex == endIndex || userInput.length() == 2) {
                    System.out.println("The word " + userInput + " is a palindrome.");
                    break;
                }
                startIndex++;
                endIndex--;
            } else {
                System.out.println("The word " + userInput + " is not a palindrome.");
                break;
            }
        }
    }
}