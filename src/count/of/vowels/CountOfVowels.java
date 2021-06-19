/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package count.of.vowels;
import java.util.Scanner;
public class CountOfVowels {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String str=in.next();
       int count=0;
       for(int i=0;i<str.length();i++)
       {
           char ch=str.charAt(i);
           if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
           {
               count++;
           }
       }
       System.out.println(count);
       
               
    }
    
}
