/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package docto.module.pkg1;

import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;
import static javax.management.Query.value;

/**
 *
 * @author User-pc
 */
public class test3 {
    
    public static void main(String[] args) {
        int[] numbers = new int[] {80,80,80,80,85,80,80};
        //calcute sum of all array elements
        
        
        double sum=0;
        for(int i=0; i < numbers.length ; i++) {
            sum = sum + numbers[i];
        }
        //calcute average value
        double average = sum / numbers.length;
        System.out.println(average + "Average value of the array elements is");
        
    }
}

