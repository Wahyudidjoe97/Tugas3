package com.company;

public class Main1 {
    public static void main(String[] args) {
        queue q = new queue();
        q.cetak();

        q.insert("AKU");
        q.cetak();
        q.insert("DIA");
        q.cetak();
        q.insert("KAMU");
        q.cetak();

        String o1 = q.get();
        q.cetak();

        String o2 = q.get();
        q.cetak();

        String o3 = q.get();
        q.cetak();

    }
}
