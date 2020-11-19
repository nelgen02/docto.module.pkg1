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
public class test1 {

public static void main (String [] args) {
    
String data = "leticia";
char date[] = {'l','e','t','i','c','i','a'};
char middlechar = data.charAt(data.length()/2);
char midar[] = {middlechar};
String up=new String (midar).toUpperCase();

System.out.println(data.replace(middlechar, up.charAt(0)));
System.out.println(data.indexOf("a"));



}    
}
