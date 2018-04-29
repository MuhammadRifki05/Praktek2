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
public class Persegi {
    float panjang;
    float lebar;

    public Persegi() {
        panjang=20;
        lebar=15;           
    }

    public Persegi(float panjang, float lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }
    
    void cetakInfo(){
        System.out.println("===============================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar : "+lebar);
        System.out.println("===============================");
    }
    
    float HitungKeliling(){
        float keliling;
        keliling=2*(panjang+lebar);
        return keliling;
    }
    
    void cetakKeliling(){
        System.out.println("Kelilingnya adalah : "+HitungKeliling());
    }
}
