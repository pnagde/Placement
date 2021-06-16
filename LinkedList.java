package begin;

import java.util.Currency;

public class zero {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    static void push(int key){
        Node new_node=new Node(key);
        if(head==null){
            head=new Node(key);
        }else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=new_node;
        }
    }
    static void startPush(int key){
        Node new_node=new Node(key);
        if(head==null){
            head=new_node;
        }else{
            new_node.next=head;
            head=new_node;
        }
    }
    static void pushAtPoint(int key,int pos){
        Node new_node=new Node(key);
        if(head==null){
            head=new_node;
        }else{
            Node index=head;
            Node prev=null;
            if(pos<1)
                System.out.println("Not valid position");
            else
            if(pos==1){
                head=new_node;
                head.next=index;
            }else{
                    for(int i=1;i<=pos-1;i++){
                        if(index==null){
                            System.out.println("out of bound");
                            break;
                        }
                        prev=index;
                        index=index.next;
                    }
                    if(index!=null){
                        prev.next=new_node;
                        new_node.next=index;
                    }
            }
        }
    }
    static void deleteAtStart(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp=head;
            head=head.next;
            temp.next=null;
        }
    }
    static void deleteAtEnd(){
        if(head==null){
            System.out.println("List is empty");
        }else{
            Node temp=head;
            Node last=null;
            while(temp.next!=null){
                last=temp;
                temp=temp.next;
            }
            last.next=null;
        }
    }
    static void deleteAtPos(int pos){
        if(head==null){
            System.out.println("empty");
        }else{
            Node prev=null;
            Node index=head;
            if(pos<=0){
                System.out.println("invalid Position");
            }
            else{
            if(pos==1){
                head=head.next;
                index=null;
            }else{
                for(int i=1;i<=pos-1;i++){
                    prev=index;
                    index=index.next;
                }
                prev.next=index.next;
                index.next=null;
            }
        }
        }
    }
    static void BubbleSort(Node list){
        while(list!=null){
            Node next=list;
            while(next!=null){
                if(next.data<list.data){
                    swap(next,list);
                }
                next=next.next;
            }
            list=list.next;
        }
    }
    static Node sorted;
    static void insertionSort(Node list){
        sorted=null;
        Node current=list;
        while(current!=null){
            Node next=current.next;
            sortedInsert(current);
            current=next;
        }
        list=sorted;
    }
    static void sortedInsert(Node newNode){
        if(sorted==null || sorted.data>=newNode.data){
            newNode.next=sorted;
            sorted=newNode;
        }
        else{
            Node current=sorted;
            while(current.next!=null && current.next.data<newNode.data)
            {
                current=current.next;
            }
            newNode.next=current.next;
            current.next=newNode;
        }
    }
    static void swap(Node a,Node b){
        int temp=b.data;
        b.data=a.data;
        a.data=temp;
    }
    public static void main(String[] args) {
       startPush(1);
       startPush(2);
       startPush(5);
       startPush(8);
       startPush(9);
       push(10);
       push(16);
       push(4);
       push(3);
       push(6);
       push(7);
       push(20);
       Node current=head;
       System.out.print("Non-Sorted List:");
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
       insertionSort(head);
       System.out.println();
       System.out.print("Sorted List:    ");
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
}
