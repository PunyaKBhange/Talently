public class DifferentialManchesterEncoding {

    // Method to encode data using Differential Manchester Encoding
    public static String encode(String data) {
        StringBuilder encoded = new StringBuilder();
        boolean lastLevel = true; // Assume the signal starts with a high level

        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                // No transition at the beginning, transition at the middle
                encoded.append(lastLevel ? "1" : "0"); // No transition at the start
                lastLevel = !lastLevel; // Flip at the middle
                encoded.append(lastLevel ? "1 " : "0 "); // Transition at the middle
            } else {
                // Transition at the beginning, transition at the middle
                lastLevel = !lastLevel; // First transition at the beginning
                encoded.append(lastLevel ? "1" : "0"); // Transition at the start
                lastLevel = !lastLevel; // Second transition at the middle
                encoded.append(lastLevel ? "1 " : "0 "); // Transition at the middle
            }
        }

        return encoded.toString().trim(); // Remove trailing space
    }

    public static void main(String[] args) {
        String data = "11001110"; // Input data
        System.out.println("Input Data: " + data);

        // Encode the data using Differential Manchester Encoding
        String encodedData = encode(data);

        // Output the encoded data
        System.out.println("Encoded Data (Differential Manchester): " + encodedData);
    }
}