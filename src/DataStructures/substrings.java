package DataStructures;

import java.util.Scanner;

public class substrings {
    public static void main(String[] args) {

        /*
        .substring(start, end) - extract a specified part of a string
         */

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        email = email.trim();

        if (email.contains("@")) {
            if (email.contains(" ")) {
                System.out.println("Emails cannot contain spaces!");
            } else {
                username = email.substring(0, email.indexOf("@")); // we get the index of @ and insert it to the last index number of substring
                domain = email.substring(email.indexOf("@") + 1); // get the index of @ and plus 1 so it only outputs after @

                System.out.println("Your email is valid");
                System.out.println(username);
                System.out.println(domain);
            }
        } else {
            System.out.println("Emails need to have a '@' symbol!");
        }

            scanner.close();
        }

    }