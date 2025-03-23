package others;

/*
*   An array of integers is given.
*   A value called target is also given.
*   Return the index position of numbers which add to target
*   Example:
*   nums = [11,21,30,40,50]
*   target = 80
*   Answer = index  2 and index 4 add to 90.
 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int lengthOfArray = nums.length;
        int[] resultArray = new int[2];
        for (int i=0; i < lengthOfArray ;i++){
            for (int j = i+1; j<lengthOfArray;j++ )
             if (nums[i] + nums[j] == target) {
                 resultArray[0] = i;
                 resultArray[1] = j;
             }
        }
        return resultArray;
    }
}
