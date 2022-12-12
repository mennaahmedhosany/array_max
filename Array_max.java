/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array_max;

import java.util.Scanner;

/**
 *
 * @author ORIGINAL
 */
public class Array_max {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input=new Scanner (System.in);
        int size=6;
        double max=0 ;
        double [] arr= new double[size];
        for(int i=0;i<6;i++)
        {
           System.out.println("enter the value of array"+ (i));
           arr[i]=input.nextDouble();
        }
        for(int i=0;i<6;i++)
        {
          if(max<=arr[i])  
          {
              max=arr[i];
          }
        }
        
        System.out.println("the max value of array"+ max);
    }
    
}
