
import java.util.Arrays;
import java.util.HashMap;

 class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int diff=0;
        int i;
        for(i=0;i<nums.length;i++){
        diff=target-nums[i];
        
        if(map.containsKey(diff)){
          return new int[] {map.get(diff),i};
        }
        map.put(nums[i],i);
        }
        
        return new int[]{};
    }
    public static void main(String[] args){
        int[] nums={2,7,11,15};
        int target=9;
        Solution solution = new Solution();
        int[] result = solution.twoSum(nums, target);
        System.out.println(Arrays.toString(result));
    }
}
