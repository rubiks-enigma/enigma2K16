import java.util.*;
class r1a_msp
{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int test=sc.nextInt(); int temp=0; long sum=0;
        for(int i=1;i<=test;i++){
            int size=sc.nextInt();
            int A[]=new int[size];
            int B[]=new int[size];
            for(int j=0;j<size;j++)
             A[j]=sc.nextInt();
            for(int j=0;j<size;j++)
             B[j]=sc.nextInt();
            for(int j=0;j<size;j++)
            {
                for(int k=0;k<size-j-1;k++){
                    if(A[k]>A[k+1])
                     {temp=A[k];A[k]=A[k+1];A[k+1]=temp;}
                    if(B[k]<B[k+1])
                     {temp=B[k];B[k]=B[k+1];B[k+1]=temp;} 
                }
            }
            for(int j=0;j<size;j++){
                sum = sum + (A[j]*B[j]);
            }
         System.out.println("Case #"+i+": "+sum);
         sum=0;
        }
    }
}