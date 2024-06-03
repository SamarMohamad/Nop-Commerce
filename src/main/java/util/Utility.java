package util;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.util.*;

public class Utility {


    public static void main(String[] args) {
        System.out.println(generateRandomFirstName());
    }

    public static String generateRandomFirstName() {
        String[] firstNames = {"Alice", "Bob", "Charlie", "David", "Emily", "Frank", "Grace", "Henry", "Isabel", "Jack"};
        int randomIndex = (int) (Math.random() * firstNames.length);
        return firstNames[randomIndex];

    }


    public static String generateRandomEmail(){
        int leftLimit = 97; // 'a'
        int rightLimit = 122; // 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder email = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomInt = random.nextInt(rightLimit - leftLimit) + leftLimit;
            email.append((char) randomInt);
        }
        email.append("test@test.com"); // Replace with your desired domain
        return email.toString();
    }

    public static int getRandomIntBetweenOneAndSeven(){
        Random random = new Random();
        // nextInt(bound) generates a random int from 0 (inclusive) to bound (exclusive)
        return random.nextInt(7) + 1;

    }





}



