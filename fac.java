//PREDEFINED FACTORIAL NUMBER
// class fac{
//     public static void main(String[] args) {
//         int n=7,fact=1;
//         for(int i=1;i<=n;i++){
//             fact=fact*i;
//         }
//         System.out.println("factorial num is: "+ n + " is " + fact);
//     }
// }

//USERDEFINED FACTORIAL NUMBER

import java.util.*;
class fac{
    public static void main(String[] args) {
        int n=1,fact=1;
        System.out.println("Enter number" );
        Scanner s = new Scanner(System.in);
        n=s.nextInt();
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial num is: "+ n + " is " + fact);

    }
}
