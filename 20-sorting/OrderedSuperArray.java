import java.util.*;

public class OrderedSuperArray extends SuperArray {
    public String[] data;
    public int last;

    public OrderedSuperArray(){
	last=0;
	data=new String[1];
	for(int i=0; i<data.length;i++){
	    data[i]="";
	}
    }
    
    public boolean add(String s){
	if (last==0){
	    data[0]=s;
	    last++;
	    return true;
	}
	else if (last<data.length){
	    int i;
	    for (i=last; i>0 && s.compareTo(data[i-1])<0;i--){
		data[i]=data[i-1];
	    }
	    data[i]=s;
	    last++;
	    return true;
	}
	else{
	    String[] temp=new String[data.length+1];
	    for(int k=0;k<data.length;k++){
		temp[k]=data[k];
	    }
	    data=temp;
	    
	    int i;
	    for (i=last; i>0 && s.compareTo(data[i-1])<0;i--){
		data[i]=data[i-1];
	    }
	    data[i]=s;

	    last++;
	    return true;
	    
	}
    }

    public String set(int index, String s){
	String old=remove(index);
	add(s);
	return old;
    }

    public static void main(String[] args) {
	OrderedSuperArray o = new OrderedSuperArray();
	o.add("dino");
	o.add("popeye");
	o.add("banned");
	o.add("pickle");
	o.add("reptile");
	o.add("ant");
	o.test();
	o.set(0,"crab");
	o.test();
    }

}
