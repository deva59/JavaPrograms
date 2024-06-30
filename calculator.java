import java.util.*;
public class calculator {
public static void main(String[] args) {
    int x,y,add,sub,mul;
    float div,mod;
    Scanner sc =new Scanner(System.in);
    
    System.out.println("Enter two numbers");
    int a = sc.nextInt();
    int b = sc.nextInt();
    add =a+b;
    System.out.println(add);
    sub =a-b;
    System.out.println(sub);
    mul =a*b;
    System.out.println(mul);
    div =a/b;
    System.out.println(div);
    mod =a%b;
    System.out.println(mod);

}
   
}
