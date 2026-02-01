public class maximum_product_subarray {
        public int maxProduct(int[] nums) {
            if(nums ==null || nums.length ==0){
                return 0;
            }
            int maxProduct = nums[0];
            int minProduct = nums[0];
            int result =nums[0];
            for(int i = 1;i<nums.length;i++){
                int current = nums[i];
                if(current < 0){
                    int temp = maxProduct;
                    maxProduct = Math.max(current ,minProduct * current);
                    minProduct = Math.min(current , temp*current);
                }
                else{
                    maxProduct = Math.max(current,maxProduct*current);
                    minProduct = Math.min(current,minProduct*current);
                }
                result =Math.max(result , maxProduct);
            }
            return result;
        }
        public static void main(String args[]){
            int[] nums = {2,3,-2,4};
            maximum_product_subarray obj = new maximum_product_subarray();
            int result = obj.maxProduct(nums);
            System.out.println(result);
        }

}
