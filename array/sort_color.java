
class sort_colors {
    public void sortColors(int[] nums) {
        int lo=0,mid=0,hi=nums.length-1;
        while(mid<=hi){
            switch(nums[mid]){
                case 0:int temp=nums[lo];
                    nums[lo]=nums[mid];
                    nums[mid]=temp;
                    lo++;
                    mid++;
                    break;
                case 1:mid++;break;
                case 2:int temp1=nums[mid];
                    nums[mid]=nums[hi];
                    nums[hi]=temp1;
                    hi--;
            }
        }
    }
}