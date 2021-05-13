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
		String strs="(){}";
    System.out.println(isValid(strs));
	}
	
}

static public boolean isValid(String s) {
		HashMap<Character,Character> map=new HashMap<>();
		map.put('(', ')');
		map.put('{', '}');
		map.put('[', ']');

       Stack<Character> stack=new Stack<>();

	   for(int i=0;i<s.length();i++){
		   if(map.containsKey(s.charAt(i))){//({})
			   stack.push(s.charAt(i));
		   }
		   else{
			   if(stack.isEmpty() || s.charAt(i)!=map.get(stack.pop())){
				   return false;
			   }
		   }
	   }
	   return stack.isEmpty()? true: false;

    }
