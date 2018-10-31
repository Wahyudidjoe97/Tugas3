package com.company;

public class MainQueueFloat {
    public static void main(String[] args) {
        queue q = new queue();
        q.cetak();

        q.insert((float)67.399);
        q.cetak();
        q.insert((float)5.907);
        q.cetak();
        q.insert((float)6457.36);
        q.cetak();

        float o1 = q.get();
        q.cetak();

        float o2 = q.get();
        q.cetak();

        float o3 = q.get();
        q.cetak();

    }
}
