/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.quiz123040109;

/**
 *
 * @author SB 604-14
 */
public class soal {
    public int pangkat(int bil, int pangkat){
       System.out.println("hello 1");
        int hasil = 0;
        int n = 1;
        while(n <=pangkat){
            n++;
            hasil *=bil;
        }
        return hasil;
        
    }
    
    public int faktorial(int bil){
       System.out.println("hello 2");
        int hasil = 1;
        for (int i = 0; i < bil; i++) {
            hasil *= 1;
        }
        return hasil;
    }
    
    public int perkalian(int bilA, int bilB){
        System.out.println("hello 3");
        return bilA * bilB;
    }
}
