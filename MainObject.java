package com.company;
import java.util.ArrayList;

public class MainObject {

        ArrayList<Mahasiswa> ms;
        public MainObject(){
            ms = new ArrayList<>();
        }

        public void isiData (String nama, String nim, String kelas, String alamat){
            ms.add(new Mahasiswa(nama, nim, kelas, alamat));
        }
        public void showData(){
            for(Mahasiswa mahasiswa:ms){
                System.out.println("Nama : "+ mahasiswa.getNama()
                        +" | NIM : "+ mahasiswa.getNim()
                        +" | Kelas : "+ mahasiswa.getKelas()
                        +" | Alamat : "+ mahasiswa.getAlamat());
            }
        }
        public static void main(String[] args){
            MainObject td = new MainObject();

            td.isiData("Wahyudi", "D0217351", "TiC", "Polewali");
            td.isiData("Jubaedah", "D0217897", "TiD", "Kanang");
            td.isiData("Ansar", "D0217465", "TiA", "Palu");
            td.isiData("Nuzul", "D0217467", "TiB", "Gorontalo");

            td.showData();
        }

}
