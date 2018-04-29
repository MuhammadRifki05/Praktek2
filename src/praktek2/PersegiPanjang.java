/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktek2;

/**
 *
 * @author Rifki
 */
public class PersegiPanjang {
    public static void main(String[] args) {
        Persegi l = new Persegi();
        
        l.panjang=15;
        l.lebar=10;
        
        l.cetakInfo();
        
        System.out.println("Keliling Persegi : "+l.HitungKeliling());
        l.cetakKeliling();
        
        Persegi l1 = new Persegi();
        l1.cetakInfo();
        
        Persegi l2 = new Persegi(30, 20);
        l2.cetakInfo();
    }
    
}
