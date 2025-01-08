import java.util.Arrays;
public class PlusOne {
    public static void main(String[] args) {
        int[] arr = {9};
//        int[] arr = {9,8,7,6,5,4,3,2,1,0};
        int[] and = plusOne(arr);

        System.out.println(Arrays.toString(and));

    }

    static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] + 1 != 10) {
                digits[i] += 1;
                return digits;
            }
            digits[i] = 0;
        }
// if the array size is one and the number is 9 so this will run
        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }

}
