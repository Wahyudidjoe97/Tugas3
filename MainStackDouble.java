package com.company;

public class MainStackDouble {

    public static void main(String[] args) {
	// write your code here
        stack so = new stack();
        so.cetak();

        so.push(6.9);
        so.cetak();

        so.push(78.55);
        so.cetak();

        so.push(57.0);
        so.cetak();

        so.push(6.9);
        so.cetak();

        double d1 = so.pop();
        so.cetak();

        double d2 = so.pop();
        so.cetak();

        double d3 = so.pop();
        so.cetak();

        double d4 = so.pop();
        so.cetak();





    }
}
