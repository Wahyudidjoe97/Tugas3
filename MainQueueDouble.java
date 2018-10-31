package com.company;
public class MainQueueDouble {
    public static void main(String[] args) {
        queue q = new queue();
        q.cetak();

        q.insert(9.7);
        q.cetak();
        q.insert(66.45);
        q.cetak();
        q.insert(13.55);
        q.cetak();

        double o1 = q.get();
        q.cetak();

        double o2 = q.get();
        q.cetak();

        double o3 = q.get();
        q.cetak();

    }
}
