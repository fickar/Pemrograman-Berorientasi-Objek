/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.projectluasbangunkompleks;

/**
 *
 * @author MSI
 */
public class ProjectLuasBangunKompleks {

    public static void main(String[] args) {
    
        Persegi x = new Persegi();
        x.sisi = 42;
        
        Lingkaran o = new Lingkaran();
        o.r = 21;
        
        Lingkaran b = new Lingkaran();
        b.r = 14;
        
        Lingkaran c = new Lingkaran();
        c.r = 7;
        
        double hitungtotalluas = x.hitungLuas() + 2 * o.hitungluas(o.r);
        double hitungtotalluas2 = b.hitungluas(b.r)/2 - c.hitungluas(c.r);
        System.out.println("total luas no 1 adalah = "+hitungtotalluas);
        System.out.println("total luas no 2 adalah = "+hitungtotalluas2);
        
        
        
        
        
    }
}
