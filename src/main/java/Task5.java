public class Task5 {
    public static void main(String[] args) {
        //5.	Write a program to swap 2 numbers without a temporary variable?
            int a=10;
            int b=20;
            System.out.println( "a = "+ a + " b= "+b);
            a=a+b;
            b=a-b;
            a=a-b;
            System.out.println( "a = "+ a + " b= "+b);
        }
    }
