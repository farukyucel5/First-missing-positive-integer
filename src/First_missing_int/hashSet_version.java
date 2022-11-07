package First_missing_int;

import java.util.HashSet;
import java.util.Set;

public class hashSet_version {
    public static void main(String[] a) {
        int[] nums = {1,2,0,5,6,7,8};
        System.out.println(tams(nums));

    }
    public static int tams(int[] nums) {
        Set<Integer> sayi=new HashSet<>();
        for (int say:nums){
            sayi.add(say);
        }

        for (int i = 1; i < nums.length ; i++) {
            if (!sayi.contains(i)){
                return i;
            }

        }

        return nums.length;

    }
}
