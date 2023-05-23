package org.example.codingDProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DProblems {

    public static void waveProblem() {
        int[] arr = {4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length - 1; i += 2) {
            int temp;
            temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;
        }
        System.out.println(arr);
        Arrays.stream(arr).boxed().forEach(System.out::println);
    }

    public static void moveAllZerosToEnd() {
        /*Integer[] integerArray = {0,2,3,0,4,0,6,0,1,0,0,2,0,0,4};
        Integer lengthOfArray = integerArray.length;
        for (Integer integer : integerArray) {

        }*/
        Integer[] nums = {0, 2, 3, 0, 4, 0, 6, 0, 1, 0, 0, 2, 0, 0, 4};
        int i = 0, j = 0;
        while (i < nums.length) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                System.out.println("value of j and nums[j] " + j + " " + nums[j]);
                j++;
            }
            i++;
        }
        while (j < nums.length) {
            nums[j] = 0;
            j++;
        }
        for (Integer num : nums) {
            System.out.println("num : " + num);
        }

    }


}
