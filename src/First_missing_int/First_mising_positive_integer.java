package First_missing_int;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class First_mising_positive_integer {
    /*
Given an unsorted integer array nums, return the smallest missing positive integer.

Example 1:

Input: nums = [1,2,0]
Output: 3
Explanation: The numbers in the range [1,2] are all in the array.
Example 2:

Input: nums = [3,4,-1,1]
Output: 2
Explanation: 1 is in the array but 2 is missing.
Example 3:

Input: nums = [7,8,9,11,12]
Output: 1
Explanation: The smallest positive integer 1 is missing.
     */

    public static void main(String[] args) {

        int[] nums ={3,0,5,1,4};

        List<Integer> nums_list=new ArrayList<>();

        for (int each:nums) {
            nums_list.add(each);//The array given above was converted to list for flexibility.
        }

        System.out.println("The array passed in: "+nums_list);

        int the_greatest_one= bigger_element(nums_list);//The biggest element is found out by the method

        int missing_smallest_positive= missing_smallest_int(nums_list,the_greatest_one);
        System.out.println("The missing smallest positive integer in the array above: "
                +missing_smallest_positive);

    }

    private static int missing_smallest_int(List<Integer> nums_list, int the_greatest_one) {
       int upper_bound=the_greatest_one+1;
        List<Integer> the_mising_value_list=new ArrayList<>();
        for (int i = 1; i <=upper_bound; i++) {

            if (!nums_list.contains(i))
                the_mising_value_list.add(i);
        }
        Collections.sort(the_mising_value_list);//The array was sorted to be able to get the smallest value from
        //the index 0.
        return the_mising_value_list.get(0);
    }

    private static int bigger_element(List<Integer> nums_list) {

        int max_value=0;
        for (int each : nums_list) {
            if (max_value < each)
                max_value = each;
        }
        return max_value;
    }
}
