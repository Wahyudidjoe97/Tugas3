package com.company;

public class MainStack {

    public static void main(String[] args) {
	// write your code here
        stack so = new stack();
        so.cetak();

        so.push("Buku Fisika");
        so.cetak();

        so.push("Buku Kimia");
        so.cetak();

        so.push("Buku Matematika");
        so.cetak();

        so.push("Buku Bahasa Indonesia");
        so.cetak();

        String d1 = so.pop();
        so.cetak();

        String d2 = so.pop();
        so.cetak();

        String d3 = so.pop();
        so.cetak();
		
		String d4 = so.pop();
        so.cetak();





    }
}
