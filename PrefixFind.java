package begin;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Stack;

public class pract1{
	public  static final void main(String... args) 
	{
		String[] strs={"dog","dow","dop"};
		System.out.println(longestCommonPrefix(strs));
	}


	static public String longestCommonPrefix(String[] strs) {
        
        String prefix = strs[0];//dog
        for(int i=1; i<strs.length; i++){
            while(strs[i].indexOf(prefix)!=0){
                prefix = prefix.substring(0,prefix.length()-1);//dog===do
            }                      
        }
        return prefix; 
    }
}
