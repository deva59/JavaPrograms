//fibonacci sequnce means next number addition using privious number eg-(5)0+1+1+2+3.
import java.util.*;
class fibbo{
    public static void main(String[] args) {
        int n, a=0,b=1,c;
        System.out.println("Enter number");
        Scanner v = new Scanner(System.in);
        n=v.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}