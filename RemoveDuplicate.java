class Solution {
    public int removeDuplicates(int[] nums) {
int j=0;
Set obj=new HashSet();
for(int i=0;i<nums.length;i++)
{
obj.add(nums[i]);
}
Iterator it=obj.iterator();
while(it.hasNext())
{
String k=String.valueOf(it.next());
nums[j++]=Integer.parseInt(k);
}
Arrays.sort(nums,0,obj.size());
return obj.size();
}
}
