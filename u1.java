import java.util.*;
class u1{
    public static void main(String[] args) {
        int x, a=0,b=1, c;
        System.out.println("Enter Element");
        Scanner s= new Scanner(System.in);
        x = s.nextInt();
        for(int i=1;i<=x;i++){
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}