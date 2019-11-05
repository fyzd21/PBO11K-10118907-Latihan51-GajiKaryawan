/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118907.latihan51.gajikaryawan;

/**
 *
 * @author
 * NAMA     : Yazid Fadlullah At-Taukily
 * KELAS    : PBO11K
 * NIM      : 10118907
 * Deskripsi Program : Latihan menampilkan gaji karyawan
 * 
 */
public class Manager extends Karyawan{
    private int kehadiran;
    private float tunjanganGolongan, tunjanganJabatan, tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    float tunjanganJabatan(String jabatan) {
        if(jabatan.toLowerCase().equals("manager")) {
            tunjanganJabatan = 2000000;
        } else if(jabatan.toLowerCase().equals("kabag")) {
            tunjanganJabatan = 1000000;
        } else {
            tunjanganJabatan = 0;
        }
        
        return tunjanganJabatan;
    }
    
    float tunjanganGolongan(int golongan) {
        if(golongan == 1) {
            tunjanganGolongan = 500000;
        } else if(golongan == 2) {
            tunjanganGolongan = 1000000;
        } else if(golongan == 3) {
            tunjanganGolongan = 1500000;
        } else {
            tunjanganGolongan = 0;
        }
        
        return tunjanganGolongan;
    }
    
    float gajiTotal() {
        return tunjanganGolongan+tunjanganJabatan+tunjanganKehadiran;
    }
}
