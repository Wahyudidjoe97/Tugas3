package com.company;

import java.util.ArrayList;

public class QueueString{

    ArrayList<String> isiQueue = new ArrayList<String>();
    int ekor = -1;

    public void insert (String value){
        ekor++;
        isiQueue.add(ekor, value);

    }

    public String get(){
        String value = "Kosong";

        if(!isiQueue.isEmpty()){
            value = isiQueue.get(0);
            isiQueue.remove(0);
            ekor--; 
        }
        return value;
    }

    public void cetak(){
        System.out.println(isiQueue.toString());
    }
}
