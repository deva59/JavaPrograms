import java.util.*;
class arms{
    public static void main(String[] args) {
        int n,a=0,c,r;
        System.out.println("Enter number");
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        c=n;
        while(n>0){
            r=n%10;
            a=(r*r*r)+a;
            n=n/10;
        }
        if(c==a){
            System.out.println("armstrog");
        }else{
            System.out.println("Not armstring");
        }
    }
}