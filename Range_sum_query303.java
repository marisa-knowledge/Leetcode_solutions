class NumArray {
    int[] myNums;
    public NumArray(int[] nums) {
        int n = nums.length;
        myNums = new int[n + 1];
        for(int i = 0; i < n ; i++){
            myNums[i + 1] = myNums[i] + nums[i];
        }
    }
    
    public int sumRange(int left, int right) {
        int sum;
        sum = myNums[right + 1] - myNums[left];
        return sum;
    }
}
