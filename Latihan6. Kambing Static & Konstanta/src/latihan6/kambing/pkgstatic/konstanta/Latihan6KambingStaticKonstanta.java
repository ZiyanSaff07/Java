/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan6.kambing.pkgstatic.konstanta;

/**
 *
 * @author USER
 */

public class Latihan6KambingStaticKonstanta {
 {
     // Variabel jumlahKambing dideklarasikan sebagai static
    public static int jumlahKambing 
            
    // NAMA_KAMBING sebagai konstanta
    public static final String NAMA_KAMBING = "MIDUN";

    
    public static void main(String[] args) {
        // TODO code application logic here
        Latihan6KambingStaticKonstanta.jumlahKambing = 485000;
        System.out.println(NAMA_KAMBING + " memiliki kambing sebanyak " 
        + Latihan6KambingStaticKonstanta.jumlahKambing);
    }
    
}
