class Main {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; // Replace this with your input string
        boolean isPangram = isPangram(input.toLowerCase()); // Convert to lowercase for case-insensitive check

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        // Create a boolean array to track the presence of each letter (a-z)
        boolean[] alphabetPresent = new boolean[26];

        // Iterate through each character in the input
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            // Check if the character is a lowercase letter
            if (c >= 'a' && c <= 'z') {
                // Set the corresponding index in the boolean array to true
                alphabetPresent[c - 'a'] = true;
            }
        }

        // Check if all letters (a-z) are present in the boolean array
        for (boolean letterPresent : alphabetPresent) {
            if (!letterPresent) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}

