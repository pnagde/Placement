 static public int strStr(String haystack, String needle) 
	{
		
		if(haystack==null && needle==null)
			return 0;

		if(haystack==null){
				return -1;
			}
		int c=-1;
        	for(int i=0;i<haystack.length()-needle.length()+1;i++)
			{
				String s=haystack.substring(i,i+needle.length());
            	if(s.equals(needle))
           		 {
              	 c=i;
              	break;
            	}
			}
			return c;
    }
