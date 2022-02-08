/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nilaisiswa;

import java.util.Scanner;

/**
 *
 * @author krisn
 */
public class siswa {
        Scanner input = new Scanner(System.in);
    String nama;
    String nilai;
    String Mapel;
    String NISN;
    String Detail;
    String inputData;
    String inputneh;
    String inputlgi;
    int Nilai;

    void NAMA() {
        nama = "NAMA :";
        System.out.print(nama);
    }

    void input() {
        inputData = input.nextLine();

    }

    void NONIS() {
        NISN = "NISN :";
        System.out.print(NISN);
    }
     void Tengah() {
        inputneh = input.nextLine();
    }
    void MapelOP() {
        Mapel = "Mata Pelajaran :";
        System.out.print(Mapel);       
    }
    void Hampir() {
        inputlgi = input.nextLine();
    }
    void NILAISISWA() {
        nilai = " Masukkan Nilai :";
        System.out.print(nilai);
    }

    void selesai() {
        Nilai = input.nextInt();
    }

    void DETAIL() {
        Detail = "Hasil Keterangan Kelulusan : ";
        System.out.println("SABAR YA BROOO....");
        System.out.println("...");
        System.out.println("...");
        System.out.println("...");
        System.out.println("============");
        System.out.println("Nama Anda : " + inputData);
        System.out.println("NISN Anda : " + inputneh);
        System.out.print(Detail);
    }

    void HASIL() {
        if (Nilai > 75) {
            System.out.println("HORE! Anda Lulus! Dengan Nilai " + Nilai + " di Mata Pelajaran "+inputlgi+ " Ibukmu Bangga le...");

        }
        if (Nilai < 75) {
            System.out.println("Anda tidak lulus di Mata Pelajaran "+inputlgi+ "Dengan Nilai " + Nilai + " mohon sabar ini ujian");
        }
    }

}

