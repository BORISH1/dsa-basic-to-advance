public class Maximumz_Subarray {
    public int subarray (int[] nums){
        int maxSoFar = nums[0];
        int currentSum = nums[0];
        for( int i = 1;i<nums.length; i++){
            if(currentSum < 0){
                currentSum = 0;
            }
            currentSum = currentSum + nums[i];
            if(maxSoFar < currentSum){
                maxSoFar = currentSum;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        Maximumz_Subarray obj = new Maximumz_Subarray();
        int result = obj.subarray(nums);
        System.out.println("The maximum subarray is " + result);

    }
}
