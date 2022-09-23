/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectbangundatar2;

/**
 *
 * @author MSI
 */
public class PersegiPanjang {
    int panjang;
    int lebar;
    
    int luasPersegiPanjang(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
     
    int kelilingPersegiPanjang(int panjang, int lebar){
        int keliling = 2*panjang + 2*lebar;
        return keliling;
        
        
        
    }
}
