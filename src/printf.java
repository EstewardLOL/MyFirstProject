public class printf {
    public static void main(String[] args) {

        /* printf() = print format/changes the format of the output
        %.[x]f - depending on how many decimal places you want to use replace x with a number

        [width]
        0 = no padding
        number = right
        -number = left

        [specifier-character]
        %s - strings
        %c - char
        %d - int
        %f - double
        %b - boolean

        [flags]
        %+ - symbol
        %, - thousand separator
        ( - enclose a negative number with a full ()
        space - all positive numbers has a space
         */

        String name = "Spongebob";
        char exclamation = '!';
        int age = 3;
        double height = 60.5;
        boolean isEmployed = true;

        System.out.printf("Hello! %s%c\n", name, exclamation);
        System.out.printf("You are aged: %d and your height is: %.1f\n", age, height); // Precision is equal to 1
        System.out.printf("Employed? %b\n", isEmployed);

        System.out.printf("%04d", age); // Width

    }
}
