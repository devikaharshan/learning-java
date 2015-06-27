/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package add;
import java.io.*;
import java.util.Scanner;

/**
 *
 * @author uers
 */
public class sum {
    public int a,b;
    Scanner sc = new Scanner(System.in);
    public void accept()
    { 
    System.out.println("enter two numbers");
    
            
    a=sc.nextInt();
    b=sc.nextInt();
    }
    public void total()
    {
        System.out.println("the sum is"+(a+b));
    }
    
}
