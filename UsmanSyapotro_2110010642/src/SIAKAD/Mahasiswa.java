/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SIAKAD;

/**
 *
 * @author User
 */
public class Mahasiswa {
    private String nim;
    private String nama;
    private String jeniskelamin;
    private String tglLahir;
    private String programStudi;
    private String alamat;
    private String nohp;
  
    public Mahasiswa(String nim, String nama, String jeniskelamin, String tglLahir, String programStudi, String alamat, String nohp) {
        this.nim = nim;
        this.nama = nama;
        this.jeniskelamin = jeniskelamin;
        this.tglLahir = tglLahir;
        this.programStudi = programStudi;
        this.alamat = alamat;
        this.nohp = nohp;
    }
  
    // Getter dan setter untuk semua atribut
  
    public String getNim() {
        return nim;
    }
  
    public void setNim(String nim) {
        this.nim = nim;
    }
  
    public String getNama() {
        return nama;
    }
  
    public void setNama(String nama) {
        this.nama = nama;
    }
  
    public String getJenisKelamin() {
        return jeniskelamin;
    }
  
    public void setJenisKelamin(String jeniskelamin) {
        this.jeniskelamin = jeniskelamin;
    }
    
    public String getTglLahir() {
        return tglLahir;
    }
  
    public void setTglLahir(String tglLahir) {
        this.tglLahir = tglLahir;
    }
  
    public String getProgramStudi() {
        return programStudi;
    }
  
    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }
    
    public String getAlamat() {
        return alamat;
    }
  
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
    public String getNoHp() {
        return nohp;
    }
  
    public void setNoHp(String nohp) {
        this.nohp = nohp;
    }
  
    public void displayInfo() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("Jenis Kelamin : " + jeniskelamin);
        System.out.println("Tanggal Lahir : " + tglLahir);
        System.out.println("Program Studi: " + programStudi);
        System.out.println("Alamat : " + alamat);
        System.out.println("No HP : " + nohp);
    } 
}
