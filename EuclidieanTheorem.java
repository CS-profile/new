/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidiean.theorem;

/**
 *
 * @author Khizer
 */
public class EuclidieanTheorem {
    public static int gcd1(int a, int b){
        if(b==0)
                return a;
        else 
            return gcd1(b,a%b);
        
    
    
    
    }
    
   /* public static int gcd(int a, int b){
    while(b!=0){
    int temp=b;
    b=a%b;
    a=temp;
    }
    return a;*/
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
{
        int a = 600, b = 136, G; 
        G= gcd1(a, b); 
        System.out.println("GCD(" + a +  " , " + b+ ") = " + G); 
          
        a = 35; b = 10; 
        G = gcd1(a, b); 
        System.out.println("GCD(" + a +  " , " + b+ ") = " + G); 
          
        a = 1150; b = 500; 
        G = gcd1(a, b); 
        System.out.println("GCD(" + a +  " , " + b+ ") = " + G);
        
       // int a = Integer.parseInt(args[0]);
       // int b= Integer.parseInt(args[1]);
      //  int gcd_result= gcd1(a,b);
     //   System.out.println("gcd("  + a + "," + b + ") = " + gcd_result);
//System.out.println("gcd("  + a + "," + b + ") = " + gcd_result);
        // TODO code application logic here
}
    
}
