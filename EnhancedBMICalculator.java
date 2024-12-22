import java.util.Scanner;

public class EnhancedBMICalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Collect user details
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume leftover newline

        System.out.print("Enter your gender (Male/Female): ");
        String gender = scanner.nextLine();

        System.out.println("Choose the measurement system:");
        System.out.println("1. Metric (kg, meters)");
        System.out.println("2. Imperial (lbs, inches)");
        int choice = scanner.nextInt();

        double weight, height, bmi = 0;

        if (choice == 1) {
            // Metric system
            System.out.print("Enter your weight in kilograms: ");
            weight = scanner.nextDouble();
            System.out.print("Enter your height in meters: ");
            height = scanner.nextDouble();

            // BMI calculation
            bmi = weight / (height * height);

        } else if (choice == 2) {
            // Imperial system
            System.out.print("Enter your weight in pounds: ");
            weight = scanner.nextDouble();
            System.out.print("Enter your height in inches: ");
            height = scanner.nextDouble();

            // BMI calculation
            bmi = (weight * 703) / (height * height);

        } else {
            System.out.println("Invalid choice! Please choose 1 or 2.");
            scanner.close();
            return;  // Graceful exit
        }

        // Display BMI and category
        System.out.printf("Your BMI is: %.2f\n", bmi);
        String category = determineBMICategory(bmi);
        System.out.println("Category: " + category);

        // Provide health recommendations
        provideHealthRecommendation(age, gender, category);

        scanner.close();  // Properly close the scanner
    }

    // Method to determine the BMI category
    public static String determineBMICategory(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obesity";
        }
    }

    // Method to provide health recommendations based on age, gender, and BMI category
    public static void provideHealthRecommendation(int age, String gender, String category) {
        System.out.println("Health Recommendations:");
        if (category.equals("Underweight")) {
            if (age < 18) {
                System.out.println("You are underweight. Consider consulting a pediatrician to ensure proper nutrition.");
            } else {
                System.out.println("Consider increasing your calorie intake with nutritious meals rich in proteins and healthy fats.");
                if (gender.equalsIgnoreCase("Male")) {
                    System.out.println("Focus on muscle-strengthening exercises.");
                } else {
                    System.out.println("Add nutrient-dense snacks between meals.");
                }
            }
        } else if (category.equals("Normal weight")) {
            System.out.println("Maintain a balanced diet and stay active.");
            if (age >= 18 && age <= 40) {
                System.out.println("Include a mix of cardio and strength exercises to stay fit.");
            } else if (age > 40) {
                System.out.println("Incorporate low-impact exercises like walking, swimming, or yoga.");
            }
        } else if (category.equals("Overweight")) {
            System.out.println("Consider portion control and a balanced diet rich in fruits, vegetables, and lean proteins.");
            if (gender.equalsIgnoreCase("Male")) {
                System.out.println("Engage in regular physical activity, focusing on cardio and resistance training.");
            } else {
                System.out.println("Focus on activities like aerobics, walking, or cycling.");
            }
        } else if (category.equals("Obesity")) {
            System.out.println("It's important to adopt a healthier lifestyle. Consider consulting a health professional.");
            if (age > 50) {
                System.out.println("Incorporate gentle physical activities like walking, water aerobics, and stretching exercises.");
            } else {
                System.out.println("Engage in regular physical activity and prioritize a low-calorie, nutrient-rich diet.");
            }
        }
    }
}