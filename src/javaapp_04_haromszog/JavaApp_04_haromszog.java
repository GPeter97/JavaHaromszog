/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapp_04_haromszog;

import java.util.Scanner;

/**
 *
 * @author grabe
 */
public class JavaApp_04_haromszog {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
            System.out.println("Kérem adja meg a háromszog A oldalát:");
            int A = sc.nextInt();
            System.out.println("Kérem adja meg a háromszog B oldalát:");
            int B = sc.nextInt();
            System.out.println("Kérem adja meg a háromszog C oldalát:");
            int C = sc.nextInt();
        if (A+B<C||A+C<B||B+C<A) {
            System.out.println("Nem megfeleő adatok");
        } else {
               System.out.println("A három szög kerülete: " +(A+B+C)); 
                }
        int honap =sc.nextInt();
        
        switch(honap){
            case 1:System.out.println("januar");
            case 2:System.out.println("februar");
            case 3:System.out.println("marcius");
            case 4:System.out.println("aprilis");
        }
        
        
        
    }
    
}
