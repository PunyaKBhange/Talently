public class ManchesterLineCoding {

    // Method to encode data using Manchester Encoding
    public static String encode(String data) {
        StringBuilder encoded = new StringBuilder();

        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                encoded.append("10 ");  // Low to high transition for 1
            } else {
                encoded.append("01 ");  // High to low transition for 0
            }
        }

        return encoded.toString().trim(); // Trim the trailing space
    }

    public static void main(String[] args) {
        String data = "11001110"; // Input data
        System.out.println("Input Data: " + data);

        // Encode the data using Manchester Line Coding
        String encodedData = encode(data);

        // Output the encoded data
        System.out.println("Encoded Data (Manchester Line Coding): " + encodedData);
    }
}