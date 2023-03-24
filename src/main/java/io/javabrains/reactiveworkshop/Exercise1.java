package io.javabrains.reactiveworkshop;

import static io.javabrains.reactiveworkshop.StreamSources.intNumbersStream;
import static io.javabrains.reactiveworkshop.StreamSources.userStream;

public class Exercise1 {

    public static void main(String[] args) {

        // Use StreamSources.intNumbersStream() and StreamSources.userStream()

        // Print all numbers in the intNumbersStream stream
        // TODO: Write code here
        System.out.println("----- 1st exercise -----");
        intNumbersStream().forEach(num -> System.out.println(num));

        // Print numbers from intNumbersStream that are less than 5
        // TODO: Write code here
        System.out.println("----- 2nd exercise -----");
        intNumbersStream().filter(num -> num < 5)
                .forEach((num -> System.out.println(num)));

        // Print the second and third numbers in intNumbersStream that's greater than 5
        // TODO: Write code here
        System.out.println("----- 3rd exercise -----");
        intNumbersStream().filter(num -> num > 5)
                .skip(1)
                .limit(2)
                .forEach((num -> System.out.println(num)));

        //  Print the first number in intNumbersStream that's greater than 5.
        //  If nothing is found, print -1
        // TODO: Write code here
        System.out.println("----- 4th exercise -----");
        Integer firstNum = intNumbersStream().filter(num -> num > 5)
                .findFirst()
                .orElse(-1);
        System.out.println(firstNum);

        // Print first names of all users in userStream
        // TODO: Write code here
        System.out.println("----- 5th exercise -----");
        userStream().forEach(user -> System.out.println(user.getFirstName()));

        // Print first names in userStream for users that have IDs from number stream
        // TODO: Write code here
        System.out.println("----- 6th exercise -----");
        userStream().filter(user -> intNumbersStream().anyMatch(num -> num.equals(user.getId())))
                .forEach((user -> System.out.println(user.getFirstName())));
    }

}
