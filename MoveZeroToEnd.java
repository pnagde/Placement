package begin;

public class practice {


    public static void main(String[] args) {
    int[] nums={0,1,0,3,12};
    int replaceIndex=0,count=0;
    for(int index=0;index<nums.length;index++){
        if(nums[index]!=0){
            nums[replaceIndex++]=nums[index];
        }else{
            count++;
        }
    }
    while(count>0){
        nums[replaceIndex++]=0;
        count--;
    }
    for (int i : nums) {
        System.out.print(i+" ");
    }
    }
    
}
