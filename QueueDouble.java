package com.company;
import java.util.ArrayList;

public class QueueDouble {

    ArrayList<Double> isiQueue = new ArrayList<Double>();
    int ekor = -1;

    public void insert (Double value){
        ekor++;
        isiQueue.add(ekor, value);

    }

    public Double get(){
        double value = 0;

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
