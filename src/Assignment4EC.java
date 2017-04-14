/*score:
9.5 + 1.5
comments: you could change and print the result during your debug process, but do not change the return type when handing in
/**
 * Created by Kevin on 2/6/2017.
 */

public class Assignment4EC {

    // Extra Credit

    /**
     * Given an array containing n distinct numbers taken from 0, 1, 2 …, n,
     * find the one that is missing from the array. For example, given nums =
     * {0, 1, 3}, return 2.
     */

    public static void missingNumber(int[] nums) {              //do not change the return type

        for (int i = 0; i < nums.length - 1; i++) { // corner case: not ordered from lowest to highest

            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[i]) {
                    int t = 0;
                    t = nums[i];
                    nums[i] = nums[j];
                    nums[j] = t;
                }
            }
        }
        if (nums.length > 2) { // have more than 2 numbers
            for (int i = 0; i < nums.length - 1; i++) {
                if (i == 0) {
                    if (nums[i] != 0) {
                        for (int j = 0; j < nums[i]; j++) {
                            System.out.print(j + " ");
                        }
                        if (nums[i + 1] - nums[i] > 1) {
                            for (int j = 1; j < (nums[i + 1] - nums[i]); j++) {
                                System.out.print((nums[i] + j) + " ");
                            }
                        }
                    }
                } else if (nums[i + 1] - nums[i] > 1) {
                    for (int j = 1; j < (nums[i + 1] - nums[i]); j++) {
                        System.out.print((nums[i] + j) + " ");
                    }
                }
            }
        } else {
            if (nums.length == 1) { // only have one number
                if (nums[0] > 0) {
                    for (int j = 0; j < nums[0]; j++) {
                        System.out.print(j + " ");
                    }
                } else if (nums[0] < 0) { // corner case: negative number
                    for (int j = (nums[0] + 1); j < 1; j++) {
                        System.out.print(j + " ");
                    }
                }
            } else { // only have two numbers
                if ((nums[1] - nums[0]) != 0) {
                    for (int j = 0; j < nums[0]; j++) {
                        System.out.print(j + " ");
                    }
                    for (int j = nums[0] + 1; j < nums[1]; j++) {
                        System.out.print(j + " ");
                    }
                } else {
                    if (nums[0] > 0) {
                        for (int j = 0; j < nums[0]; j++) {
                            System.out.print(j + " ");
                        }
                    } else if (nums[0] < 0) { // corner case: negative number
                        for (int j = (nums[0] + 1); j < 1; j++) {
                            System.out.print(j + " ");
                        }
                    }
                }
            }
        }
        System.out.println();

    }

    /**
     * Given an array nums, write a function to move all 0's to the end of it
     * while maintaining the relative order of the non-zero elements. For
     * example, given nums = {0, 1, 0, 3, 12}, after calling your function, nums
     * should be {1, 3, 12, 0, 0}, You must do this in-place without making a
     * copy of the array.
     */

    public static void moveZeroes(int[] nums) {               //it is correct, but do not change the return type

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                for (int j = 1; j < (nums.length - i); j++) {
                    if (nums[i + j] != 0) {
                        nums[i] = nums[i + j];
                        nums[i + j] = 0;
                        break;
                    }
                }
            }
        }
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

    }

    /**
     * Given a non-empty array of integers, return the third maximum distinct
     * number in this array. If it does not exist, return the maximum number.
     * For example, given{3,2,1}, return 1; given{1,2}, return 2;
     * given{2,2,3,1}, return 1.
     */

    public int thirdMax(int[] nums) {                         //correct

        int c = 0;
        int cd = 0;

        if (nums.length < 2) {
            return nums[0];
        } else {
            for (int i = 0; i < nums.length - 1; i++) {
                for (int j = i + 1; j < nums.length; j++) {
                    if (nums[j] < nums[i]) {
                        int t = 0;
                        t = nums[i];
                        nums[i] = nums[j];
                        nums[j] = t;
                    }
                }
            }
        }

        if (nums.length == 2) {
            return nums[1];
        } else {
            for (int i = (nums.length - 2); i > -1; i--) {
                if (nums[i] < nums[(nums.length - 1)]) {
                    c = i;
                    cd++;
                    break;
                }
            }
            for (int i = (c - 1); i > -1; i--) {
                if (nums[i] < nums[c]) {
                    c = i;
                    cd++;
                    break;
                }
            }

            if (cd == 2) {
                return nums[c];
            } else {
                return nums[nums.length - 1];
            }
        }
    }

}
