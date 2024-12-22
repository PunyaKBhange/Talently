package JAVAPROGRAMMING;
import java.util.*;
public class ArithmeticOperator {
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the 2 numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("enter 1 for addition ,2 for subtraction,3 for multiplication,4 for division");
        int ch=sc.nextInt();}
        switch(ch)
        {
            case1:
            System.out.println(a+"+"+b"="+ (a+b));
            break;
            case2:
            System.out.println(a+"-"+b"="+ (a-b));
            break;
            case3:
            System.out.println(a+"*"+b"="+ (a*b));
            break;
            case4:
            if(b==0)
            System.out.println("numerator cannot be 0");
            System.out.println(a+"+"+b"="+ (a/b));
            break;
            default:
            System.out.println("invalid input");
        }
    }

