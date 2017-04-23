import java.util.ArrayList;

public class Vowels {

	public static void main(String [] args){
		
	
	ArrayList<String> list = new ArrayList<String>();
	list.add("home");
	list.add("joooo");
	list.add("go");
	
	list.sort(new VowelComparator());
	System.out.println(list);
 }
	

}
