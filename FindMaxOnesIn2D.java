	//0 1 1 1
	//0 0 0 1
	//0 1 1 1
	//1 1 1 1 // nums[i][j]

	public static int findMaxOnes(int[][] nums,int n){
		int i=0,j=n-1;
		int ans=0;
		while(i<n){//0<4,0,
			while(j>=0 && nums[i][j]==1){//3>0,3-0 3=1,2-0 2=1 ,1-0 1=1,
				ans=i;//0,0,0
				j--;
			}
			i++;
		}
		return ans;
	} 
