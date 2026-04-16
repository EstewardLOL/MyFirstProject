package DataStructures;

public class stringMethods {
    public static void main(String[] args) {

        /*
        string.length - the length of the string assignment
        string.charAt() - gets the character at specified Index
        string.indexOf() - gets the first occurrence of a letter
        string.lastIndexOf() - gets the last ever occurrence of a letter
        string.toUpperCase() - caps all letters
        string.toLowerCase() - small letters all
        string.trim() - eliminates white spaces
        string.replace() - replaces specified letters with given one: (a, b) a's with b's
        string.isEmpty() - returns boolean; is string empty?
        string.contains() - for example (a) then it checks if it contains any a's
        string.equals - checks if the string is equal to the inputed string inside (); (wow) var.space = wow = true
        - equalsIgnoreCase - ignores all cases
         */

        // Password System using .length and if
        String password = "password";
        String spaces = "              ESSTEWARDDD       ";
        int lenghtofname = password.length();


        System.out.println(password.indexOf("d")); // First occurrence of a letter
        System.out.println(password.lastIndexOf("d")); // Last occurrence of a letter
        System.out.println(password.toUpperCase()); // UPPERCASES ALL LETTERS AT VAR: PASSWORD
        System.out.println(password.toLowerCase()); // lowercases all letters at var: password
        System.out.println("The letter at 0 is: " + password.charAt(0)); // Gets character at Index 0
        System.out.println(lenghtofname); // Length of the string

        System.out.println("\n" + spaces.trim()); // Removes white spaces
        System.out.println(spaces.isEmpty()); // Check if var.spaces is empty
        System.out.println(spaces.contains("D")); // Checks if var.spaces has D
    }
}
