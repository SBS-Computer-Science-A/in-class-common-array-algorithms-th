// Authors: Harry Pan, Thomas Lin - Group 3
public class AverageOfArray {
    public static void main(String [] args) {
        // test case; expected result = 2.5
        double[] numbers = {1.0, 2.0, 3.0, 4.0};
        double average = findAvg(numbers);
        System.out.println("The average of the numbers in this array is: " + average);
    }
    public static double findAvg(double[] array1) {
        double sum = 0.0;
        for ( double nxtNum : array1) {
            sum = sum + nxtNum;
        }
        return sum/array1.length;
    }
}
