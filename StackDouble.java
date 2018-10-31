import java.util.ArrayList;

public class stackDouble {
    ArrayList<Double> stakD = new ArrayList<Double>();
    int top = -1;

    public void push(Double value){
        top = top+1;
        stakD.add(top, value);

    }

    public Double pop(){

        double value = 0;
        stakD.get(top);
        stakD.remove(top);
        top = top-1;

        return value;
    }

    public void cetak(){

        System.out.println(stakD);
    }
}
