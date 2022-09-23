/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectbangundatar2;

import java.awt.RadialGradientPaint;

/**
 *
 * @author MSI
 */
public class ProjectBangunDatar2 {

    public static void main(String[] args) {
        Segitiga a = new Segitiga();
        PersegiPanjang b = new PersegiPanjang();
        Persegi c = new Persegi();
        Lingkaran d = new Lingkaran();
        
        System.out.println("luas segitiga = "+a.Segitiga(3,4));
        System.out.println("luas Persegi Panjang = "+b.luasPersegiPanjang(4, 5));
        System.out.println("keliling Persegi Panjang = "+b.kelilingPersegiPanjang(3, 2));
        System.out.println("luas persegi = "+c.luasPersegi(5));
        System.out.println("keliling persegi = "+c.kelilingPersegi(5));
        System.out.println("luas lingkaran = "+d.lingkaran(5));
             
    }
    
}
