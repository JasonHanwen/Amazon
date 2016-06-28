/**
Given a sorted integer array where the range of elements are [lower, upper] inclusive, return its missing ranges.

For example, given [0, 1, 3, 50, 75], lower = 0 and upper = 99, return ["2", "4->49", "51->74", "76->99"].

Time: 2016/06/28
Link: https://leetcode.com/problems/missing-ranges/
*/

public class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
       int length = nums.length;
       int lowNum = lower;
       int highNum = upper;

       //find the lower bound
       int position = 0;
       List<String> result = new LinkedList<String>();
       for( ; position < length && nums[position] < lower; position++);
       if(position == length)
       {
         return result;
       }
       if(lower == nums[position]){
         System.out.print("good condition");
       }
       //print out the range missed.
       else{
         result.add(Integer.ToString(lower))
       }
       //find the upper bound

    }
}
