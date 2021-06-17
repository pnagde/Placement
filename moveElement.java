package begin;

public class practice {


    public static void main(String[] args) {
    int[] nums={3,1,2,4};
    int initial=0;
    for(int index=0;index<nums.length;index++){
        if(nums[index]%2==0){
            int temp=nums[initial];
            nums[initial++]=nums[index];
            nums[index]=temp;
        }
    }
    for (int i : nums) {
        System.out.print(i+" ");
    }
    }
    
}
