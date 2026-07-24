import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        if(n<=1){
            System.out.print("not prime");
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>0){
            System.out.print("not prime");
        }
        else{
            System.out.print("prime");
        }
        sc.close();
    }
}