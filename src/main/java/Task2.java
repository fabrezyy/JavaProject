public class Task2 {
    public static void main(String[] args) {
        //2.	Create an array of integer values. After the array
        // is created, calculate the sum of
        // all stored elements in that array.
            int []numbers= {23,34,19,32,12,35};
            int sum=0;
            for(int num:numbers) {
                sum = sum + num;
            }
            System.out.println(sum);
        }
    }
