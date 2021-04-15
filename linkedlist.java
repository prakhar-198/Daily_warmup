import java.util.*;
public class linkedlist{
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        next=null;
    }
}
Node head;
void add(int data){
    Node toAdd=new Node(data);
    if(isEmpty()){
        head=toAdd;
        return;
    }
    Node temp=head;
    while(temp.next!=null){
        temp=temp.next;
    }temp.next=toAdd;
}public boolean isEmpty(){
    return head==null;
}
void print(){
    Node temp=head;
    while(temp!=null){
        System.out.println(temp.data);
        temp=temp.next;
    }
}
public int removelast() throws Exception{
    Node temp=head;
    if(temp==null){
        throw new Exception("cannot remove last element from empty linked list");
    }
    if(temp.next==null){
        Node toRemove=head;
        head=null;
        return toRemove.data;
    }
    while(temp.next.next!=null){
        temp=temp.next;
    }
    Node toRemove=temp.next;
    temp.next=null;
    return toRemove.data;
} 
public int getLast()throws Exception {
    Node  temp=head;
    if(temp==null){
        throw new Exception("cannot peek last element from empty");
    }
    while(temp.next!=null){temp=temp.next;}
    return temp.data;

}
/*public static void main(String args[]){
    linkedlist myll=new linkedlist();
    for(int i=0;i<10;i++){
        myll.add(i);}
    myll.print();
}*/
}