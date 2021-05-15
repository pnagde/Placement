static public boolean repeatedSubstringPattern(String s) {
		int n=s.length();//abaaba
		for(int i=n/2;i>=1;i--){//3
			if(n%i==0){
				int m=n/i;//3
				String sbr=s.substring(0, i);//aba
				StringBuilder sb=new StringBuilder();
				for(int j=0;j<m;j++){
					sb.append(sbr);//ababa
				}
				if(sb.toString().equals(s))return true;
			}
		}
		return false;
    }
