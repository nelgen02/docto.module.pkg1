/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docto.module.pkg1;

/**
 *
 * @author User-pc
 */
public class test5 {
 
    public static int[] mask;
    public static void main(String[] args ){
        String a = "abcde";
        String b = "abc";
        System.out.println("the given string is: "+ a);
        System.out.println("the given string is: "+ b);
        char arr[] = new char [a.length()];
        char[] mask = new char [345];
        for (int i =0; i < b.length(); i++){
            mask[b.charAt(i)]++;
        }
       System.out.println("the new string is; ");
       for (int i =0; i < a.length(); i++) {
           if (mask[a.charAt(i)] == 0){
               System.out.println(a.charAt(i));
           }
       }
    }
}
