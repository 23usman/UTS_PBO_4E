/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usmansyapotro_2110010642;

import SIAKAD.Dosen;
import SIAKAD.Kelas;
import SIAKAD.Mahasiswa;
import SIAKAD.Mata_Kuliah;
import SIAKAD.Nilai;
import SIAKAD.Registrasi;

/**
 *
 * @author User
 */
public class UsmanSyapotro_2110010642 {

    public static void main(String[] args) {
        // Membuat objek Mahasiswa
        Mahasiswa Mahasiswa = new Mahasiswa("2110010642", "Usman", "Pria", "01 01 2000", "Teknik Informatika", "Jl.Bali", "0842523345");
      
        // Menampilkan informasi Mahasiswa
        Mahasiswa.displayInfo();
      
        System.out.println("------------------------");
      
        // Membuat objek Dosen
        Dosen dosen = new Dosen(1, "102873789", "Pa Jo", "S1", "Dosen Tetap");
      
        // Menampilkan informasi Dosen
        dosen.displayInfo();
      
        System.out.println("------------------------");
      
        // Membuat objek MataKuliah
        Mata_Kuliah Mata_Kuliah = new Mata_Kuliah(1, "Usman", 12, 4);
      
        // Menampilkan informasi MataKuliah
        Mata_Kuliah.displayInfo();
      
        System.out.println("------------------------");
      
        // Membuat objek Kelas
        Kelas kelas = new Kelas(1, "4E", "Pak Jo", 1);
      
        // Menampilkan informasi Kelas
        kelas.displayInfo();
      
        System.out.println("------------------------");
      
        // Membuat objek Registrasi
        Registrasi registrasi = new Registrasi("usman", "usman xxxxxxx", "6728wnhhys", "Lulus");
      
        // Menampilkan informasi Registrasi
        registrasi.displayInfo();
      
        System.out.println("------------------------");
      
        // Membuat objek Nilai
        Nilai nilai = new Nilai(1, 1, 1, 85.5);
      
        // Menampilkan informasi Nilai
        nilai.displayInfo();
    }

}
