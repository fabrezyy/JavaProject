public class Task9 {
    public static void main(String[] args) {

        int[] numb = {23, 34, 19, 32, 12, 35, 23};
        int highest = numb[0];
        int secondHighest = numb[0];
        for (int num : numb) {
            if (highest < num) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
            }
        }
        System.out.println("The second highest number is " + secondHighest);
    }
}
