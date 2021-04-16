
class Mystack extends linkedlist{
   public linkedlist bb=new linkedlist();
     void push(int a){
        bb.add(a);
    }
     int pop() throws Exception{
        if (bb.isEmpty()){ 
            throw new Exception("poping from empty linked list");
            
        }
        return bb.removelast();
    }
     int peek()throws Exception{
    if(bb.isEmpty()){
        throw new Exception("peeking from empty list");
    }return bb.getLast();


}
public static void main(String args[])throws Exception{
    Mystack stack=new Mystack();
    stack.push(16);
    stack.push(32);
    int poped=stack.pop();
    System.out.println(poped);
}
}