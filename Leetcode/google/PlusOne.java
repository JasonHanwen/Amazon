//This is the list question
//link:https://leetcode.com/problems/plus-one/
//last-submitted: 2016/6/28
//analysis: the time complexity is O(n).
//The space complixity is O(n). I can achieve better space complixity using the original array.

public class Solution {
    public int[] plusOne(int[] digits) {
        if(digits == null || digits.length == 0)
            return null;
        int length = digits.length;
        int[] tem = new int[length];

        int bit = 1;
        for(int i = length - 1; i >= 0; i--){
            int temNum = digits[i] + bit;
            bit = 0;
            if(temNum > 9){
                temNum = temNum - 10;
                bit =1;
            }
            tem[i] = temNum;
        }
        if(bit == 1){
            int[] result = new int[length + 1];
            for(int i = length - 1; i >= 0; i--){
                result[i+1] = tem[i];
            }
            result[0] = 1;
            tem = result;
        }
        return tem;
    }
}
