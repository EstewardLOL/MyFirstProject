public class enhancedSwitches {
    public static void main(String[] args) {

        // Enhanced Switch = replacement to many "else if" statements

        // Check if weekend/weekday ; Similar to else if's
        String day = " ";

        if (day == null || day.isEmpty() || day.contains(" ")) { // checks for any input; skips if value provided
            System.out.println("Please provide a day.");
            return; // Exit the method early
        }

        // Format the string day above
        String formattedDay = day.substring(0, 1).toUpperCase() + day.substring(1).toLowerCase();

        // Switch Expression: Returning a value directly
        String typeOfDay = switch (day.toUpperCase()) {
            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "a weekday";
            case "SATURDAY", "SUNDAY" -> "a weekend";
            default -> "not a valid day";
        };

        System.out.println(formattedDay + " is " + typeOfDay);

        // Check if Minor/Adult ; Similar to if's
        int age = 5;

        switch (age) { // if
            case Integer a when a < 0 -> System.out.println("Not borned yet"); // if
            case Integer a when a == 0 -> System.out.println("Your a baby"); // else if
            case Integer a when a < 18 -> System.out.println("Minor"); // else if
            default -> System.out.println("Adult"); // else
        }

    }
}
