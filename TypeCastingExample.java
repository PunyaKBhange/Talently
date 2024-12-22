import java.util.Scanner;
public class TypeCastingExample {
     public static void main(String[] args) { // Implicit Casting (Widening Conversion)
         int intValue = 10; 
    double doubleValue = intValue; // Automatic casting from int to double 
    System.out.println("intValue: " + intValue); 
    System.out.println("doubleValue: " + doubleValue); 
     
    // Explicit Casting (Narrowing Conversion) 
    double doubleVal = 15.75; 
    int intVal = (int) doubleVal; // Explicitly cast from double to int 
    System.out.println("doubleVal: " + doubleVal);
    System.out.println("intVal: " + intVal); 
 
// Type casting with loss of data 
int largeValue = 1000; 
byte smallValue = (byte) largeValue; // Explicit casting from int to byte (may lose data) 
System.out.println("largeValue: " + largeValue); 
System.out.println("smallValue: " + smallValue); 
 
// Type casting with overflow 
int bigNumber = 300; 
byte smallNumber = (byte) bigNumber; // Explicit casting from int to byte (overflow) 
System.out.println("bigNumber: " + bigNumber); 
System.out.println("smallNumber: " + smallNumber); 
}} 
 

