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
public class test6 {
    
    public static void main(String[] args){
        
        File my_file_dir = new File ("C:\\Users\\Docto\\Downloads\\Test 6") ;
         if (my_file_dir.exists()) {
             System.out.println("The directroty of file exist.\n");
         }else {
             System.out.println("The directory or file does not exist.\n");
           
        }
      
         }
    }

