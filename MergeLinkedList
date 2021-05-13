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
		ListNode l1=new ListNode(1);
		ListNode second=new ListNode(2);
		ListNode third=new ListNode(3);
		ListNode l2=new ListNode(1);
		ListNode second1=new ListNode(4);
		ListNode third1=new ListNode(6);
		l1.next=second;
		second.next=third;
		l2.next=second1;
		second1.next=third1;
		Solution solution=new Solution();
		ListNode li=solution.mergeTwoLists(l1, l2);
		while(li!=null){
			System.out.print(li.val+" ");
			li=li.next;
		}
	}
	
}
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

		if(l1==null && l2==null){
			return null;
		}
		if(l1 == null) {
			return l2;
		}
		
	 if(l2 == null) {
			return l1;
		}
		ListNode head=new ListNode(0);
		ListNode temp=head;
		while(l1!=null && l2!=null)
		{
			if(l1.val<l2.val){
				temp.next=new ListNode(l1.val);
				l1=l1.next;
				temp=temp.next;
			}
		else{
				temp.next=new ListNode(l2.val);
				l2=l2.next;
				temp=temp.next;
			}
			
		}
		if(l1 == null) {
			while(l2 != null) {
				temp.next = new ListNode(l2.val);
				l2 = l2.next;
				temp = temp.next;
			}
		}
		
		if(l2 == null) {
			while(l1 != null) {
				temp.next = new ListNode(l1.val);
				l1 = l1.next;
				temp = temp.next;
			}
		}
        return head.next;
    }
}
