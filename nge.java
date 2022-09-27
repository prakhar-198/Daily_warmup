import java.util.*;

public class nge{

    public static void main(String args[])throws Exception{
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int[] nge=solve(a);
        for(int i=0;i<nge.length;i++){
            System.out.print(nge[i]+" ");
        }
    }
    public static int[] solve(int a[]){
        int nge[]=new int[a.length];
        Stack <Integer> st =new Stack<Integer>();
        nge[a.length-1]=-1;
        st.push(a[a.length-1]);
        for(int i=a.length-2;i>=0;i--){
            while(st.size()>0 && a[i]>=st.peek()){
                st.pop();
            }
            if(st.size()==0){
                nge[i]=-1;
            }else{
                nge[i]=st.peek();
            }
            st.push(a[i]);
        }
        return nge;
    }
}
