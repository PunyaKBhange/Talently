public class UnipolarLineCoding {

    // Method to encode data using Unipolar Encoding
    public static String encode(String data) {
        StringBuilder encoded = new StringBuilder();

        for (char bit : data.toCharArray()) {
            if (bit == '1') {
                encoded.append("1 ");  // Positive voltage for 1
            } else {
                encoded.append("0 ");  // Zero voltage for 0
            }
        }

        return encoded.toString().trim(); // Trim the trailing space
    }

    public static void main(String[] args) {
        String data = "11001110"; // Input data
        System.out.println("Input Data: " + data);

        // Encode the data using Unipolar Line Coding
        String encodedData = encode(data);

        // Output the encoded data
        System.out.println("Encoded Data (Unipolar Line Coding): " + encodedData);
    }
}
