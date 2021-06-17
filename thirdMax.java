int i=0;
    int j=nums.length-1;
    Arrays.sort(nums);//1,2,3
    int count=0;
    while(j>=0){//2
        count++;//1 2
        i=j-1;//1
        while(i>=0 && nums[i]==nums[j]){//0 1//2==3
            i--;//0 -1
        }
        if(i==-1){//out of third
            return nums[nums.length-1];
        }
        j=i;//0=0
        if(count==2){
            return nums[j];//0
        }
    }
