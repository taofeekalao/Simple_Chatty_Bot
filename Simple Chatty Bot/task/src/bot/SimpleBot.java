package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in); // Do not change this line
    final static int answer = 2;

    public static void main(String[] args) {
        greet("Aid", "2018"); // change it as you need
        remindName();
        guessAge();
        count();
        // ...
        test();
        end();
    }

    static void greet(String assistantName, String birthYear) {
        System.out.println("Hello! My name is " + assistantName + ".");
        System.out.println("I was created in " + birthYear + ".");
        System.out.println("Please, remind me your name.");
    }

    static void remindName() {
        String name = scanner.nextLine();
        System.out.println("What a great name you have, " + name + "!");
    }

    static void guessAge() {
        System.out.println("Let me guess your age.");
        System.out.println("Enter remainders of dividing your age by 3, 5 and 7.");
        int rem3 = scanner.nextInt();
        int rem5 = scanner.nextInt();
        int rem7 = scanner.nextInt();
        int age = (rem3 * 70 + rem5 * 21 + rem7 * 15) % 105;
        System.out.println("Your age is " + age + "; that's a good time to start programming!");
    }

    static void count() {
        System.out.println("Now I will prove to you that I can count to any number you want.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void test() {
        int optionOne = 1;
        int optionTwo = 2;
        int optionThree = 3;
        int optionFour = 4;

        System.out.println("Let's test your programming knowledge.");
        // write your code here
        System.out.printf("Why do we use methods?");

        System.out.printf("%d. To repeat a statement multiple times.", optionOne);
        System.out.printf("%d. To decompose a program into several small subroutines.", optionTwo);
        System.out.printf("%d. To determine the execution time of a program.", optionThree);
        System.out.printf("%d. To interrupt the execution of a program.", optionFour);

        int chosenOption = scanner.nextInt();
        while (answer != chosenOption) {
            System.out.println("Please, try again.");
            chosenOption = scanner.nextInt();
        }

        System.out.println("Congratulations, have a nice day!");

    }

    static void end() {
        System.out.println("Congratulations, have a nice day!"); // Do not change this text
    }
}
