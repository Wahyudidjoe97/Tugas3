import java.util.ArrayList;

public class stack {
    ArrayList<String> stak = new ArrayList<String>();
    int top = -1;

    public void push(String value){
        top = top+1;
        stak.add(top, value);
    }
	
    public String pop(){
        String value = "";
        stak.get(top);
        stak.remove(top);
        top = top-1;

        return value;
    }

    public void cetak(){

        System.out.println(stak.toString());
    }
}