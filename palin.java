import java.util.*;
class palin{
    public static void main(String[] args) {
        int n,a=0,r,c;
        System.out.println("Enter number");
        Scanner sc =new Scanner(System.in);
        n=sc.nextInt();
        c=n;
        while(n>0)
        {
            r=n%10;
            a=a*10+r;
            n=n/10;
        }
        if(c==a){
            System.out.println("palin");

        }else{
            System.out.println("not palin");
        }
    }
}