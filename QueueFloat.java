package com.company;

import java.util.ArrayList;

public class QueueFloat{

    ArrayList<Float> isiQueue = new ArrayList<Float>();
    int ekor = -1;

    public void insert (Float value){
        ekor++;
        isiQueue.add(ekor, value);

    }

    public Float get(){
        float value = (float) 0;

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
