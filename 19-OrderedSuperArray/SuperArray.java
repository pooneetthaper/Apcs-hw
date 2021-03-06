public class SuperArray{
    private String[] data;//should be object[]
    private int last;

    public SuperArray(){
	last=0;
	data=new String[1];
	for(int i=0; i<data.length;i++){
	    data[i]="";
	}
    }

    public void test(){
	String s="";
	for(int i=0; i<data.length;i++){
	    s=s+data[i];
	    s=s+", ";	 
	}
	System.out.println(s);
    }

    public boolean add(String s){
	if (last==0){
	    data[0]=s;
	    last++;
	    return true;
	}
	else if (last<data.length){
	    int index=0;
	    for (int i=0;i<last;i++){
		if (s.compareTo(data[i])<=0){
		    index=i;
		    break;
		}
		else index=last;
	    }
	    for (int i=last; i>index;i--){
		data[i]=data[i-1];
	    }
	    data[index]=s;
	    last++;
	    return true;
	}
	else{
	    String[] temp=new String[data.length+1];
	    for(int k=0;k<data.length;k++){
		temp[k]=data[k];
	    }
	    int index=0;
	    for (int i=0;i<last;i++){
		if (s.compareTo(data[i])<=0){
		    index=i;
		    break;
		}
		else index=last;
	    }
	    for (int i=last; i>index;i--){
		temp[i]=temp[i-1];
	    }
	    temp[index]=s;
	    data=temp;
	    last++;
	    return true;
	    
	}
    }
	/*
	  public void add(int index,int i){
	try{//assuming index<data.length 
	if (last<data.length && index<=last){
	    for(int k=last;k>index;k--){
		data[k]=data[k-1];
	    }
	    data[index]=i;
	    last++;	
	}
	else if (last<data.length && (index>last && index<data.length)){
	    if (data[data.length-1]==0){
		for(int k=last;k>index;k--){
		    data[k]=data[k-1];
		}
		data[index]=i;
	    }
	    else{
		int[] temp=new int[data.length+1];
		for(int k=0;k<index;k++){
		    temp[k]=data[k];
		}
		for(int k=index;k<data.length;k++){
		    temp[k+1]=data[k];
		}
		temp[index]=i;
		data=temp;
	    }
	    //leaves a gap of zeros for position p
	    //last< p <index
	}
	else{
	    int[] temp=new int[data.length+1];
	    for(int k=0;k<index;k++){
		temp[k]=data[k];
	    }
	    for(int k=index;k<data.length;k++){
		temp[k+1]=data[k];
	    }
	    temp[index]=i;
	    data=temp;
	    last++;
	}
	}
	catch(Exception e){
	    System.out.println("uh oh");
	}
    }

    public int size(){
	int count=0;
	for(int i=0;i<data.length;i++){
	    if (data[i]!=0)
		count++;
	}
	return count;
    }

    public int get(int index){
	return data[index];
    }

    public int set(int index,int i){
	int old=data[index];
	data[index]=i;
	return old;
    }

    public int remove (int index){
	int old=data[index];
	data[index]=0;
	return old;
    }
    */
    public static void main(String[] args){
	SuperArray a=new SuperArray();
	a.test();
	a.add("banana");
	a.test();
	a.add("apple");
	a.test();
	a.add("carmelo");
	a.test();
	a.add("dog");
	a.test();
	a.add("applesauce");
	a.test();
	a.add("bandana");
	a.test();
	a.add("car");
	a.test();
	a.add("cat");
	a.test();
    }
}
