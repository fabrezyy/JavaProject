public class Task4 {
    public static void main(String[] args) {
        //4.	Create a 2D array of integers.
        // Develop a program which will calculate the sum of
        //even and odd numbers for that array.
            int[][]numbers={
                    {1,2,3,4,},
                    {7,8,9,10,},
                    {12,13,14,15}
            };
            int sum=0;
            int sumA=0;

            for (int i=0; i< 3;i++) {
                for (int j = 0; j < 4; j++) {
                    if (numbers[i][j] % 2 == 0) {
                        sum = sum + numbers[i][j];
                    }else if(numbers[i][j]%2!=0){
                        sumA=sumA+numbers[i][j];
                    }
                }
            }
            System.out.println (sum+"  is a sum of even numbers");
            System.out.println(sumA+ " is a sum of odd numbers");
        }
    }
