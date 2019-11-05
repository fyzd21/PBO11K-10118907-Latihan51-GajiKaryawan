/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan51.gajikaryawan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan gaji karyawan
 * 
 */
public class PBO11K10118907Latihan51GajiKaryawan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Program perhitungan gaji karyawan");
        
        Manager m = new Manager();
        System.out.print("Masukkan NIK : ");
        Scanner s = new Scanner(System.in);
        m.setNik(s.next());
        System.out.print("Masukkan nama :");
        Scanner s2 = new Scanner(System.in);
        m.setNama(s2.nextLine());
        System.out.print("Masukkan golongan (1/2/3) : ");
        Scanner s3 = new Scanner(System.in);
        m.setGolongan(Integer.parseInt(s3.next()));
        System.out.print("Masukkan jabatan (manager/kabag) : ");
        Scanner s4 = new Scanner(System.in);
        m.setJabatan(s4.next());
        System.out.print("Masukkan jumlah kehadiran : ");
        Scanner s5 = new Scanner(System.in);
        m.setKehadiran(Integer.parseInt(s5.next()));
        
        System.out.println("\nHasil Perhitungan");
        System.out.println("NIK : "+m.getNik());
        System.out.println("Nama : "+m.getNama());
        System.out.println("Golongan : "+m.getGolongan());
        System.out.println("Jabatan : "+m.getJabatan());
        System.out.println("\nTunjangan Golongan : "+m.tunjanganGolongan(m.getGolongan()));
        System.out.println("Tunjangan Jabatan : "+m.tunjanganJabatan(m.getJabatan()));
        System.out.println("Tunjangan Kehadiran : "+m.tunjanganKehadiran(m.getKehadiran()));
        System.out.println("\nGaji Total : "+m.gajiTotal());
    }
    
}
