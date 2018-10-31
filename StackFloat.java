import java.util.ArrayList;

public class stackFloat {
    ArrayList<Float> stakF = new ArrayList<Float>();
    int top = -1;

    public void push(Float value){
        top = top+1;
        stakF.add(top, value);

    }

    public Float pop(){

        float value = 0;
        stakF.get(top);
        stakF.remove(top);
        top = top-1;

        return value;
    }

    public void cetak(){

        System.out.println(stakF);
    }
}
