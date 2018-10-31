package com.company;

public class MainStackFloat {

    public static void main(String[] args) {
	// write your code here
        stack so = new stack();
        so.cetak();

        so.push((float) 646.9);
        so.cetak();

        so.push((float) 7388.55);
        so.cetak();

        so.push((float) 5907.0);
        so.cetak();

        so.push((float) 96.979);
        so.cetak();

        float d1 = so.pop();
        so.cetak();

        float d2 = so.pop();
        so.cetak();

        float d3 = so.pop();
        so.cetak();

        float d4 = so.pop();
        so.cetak();
    }
}
