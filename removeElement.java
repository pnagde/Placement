package begin;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class pract1{
	public  static final void main(String... args) 
	{
		int[] nums={1,3,2};
		System.out.println(removeDuplicates(nums,3));
		for(int a:nums){
			System.out.print(a+" ");
		}
	}
	static public int removeDuplicates(int[] nums,int val) {
		int j=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
    }
}
