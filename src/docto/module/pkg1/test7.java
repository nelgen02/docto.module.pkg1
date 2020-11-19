/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docto.module.pkg1;

import java.io.File;

/**
 *
 * @author User-pc
 */
public class test7 {
   
    
    
public static void main(String[] args){
    
File docto = new File ("C:\\Users\\docto\\Downloads") ;
   String[] fileList = docto.list();
   for (String Dog: fileList){
       System.out.println(Dog); }
       
       
   }
   
   
}

