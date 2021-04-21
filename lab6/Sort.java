package lab6;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
public class Sort {
	public static void main(String[] args) {
		HashMap<Integer,String> mymap=new HashMap<Integer,String>();
		mymap.put(1001, "HARSH");
		mymap.put(1002, "Rohan");
		mymap.put(1003, "Shyam");
		mymap.put(1004, "Rajat");
		mymap.put(1005, "Rahul");
		mymap.put(1006, "Sachin");
		List mylist = new ArrayList<String>();
		mylist.addAll(getValues(mymap));
		System.out.println(mylist);
		}
		public static List<String> getValues(HashMap<Integer,String> m ) {
			List l = new ArrayList<String>();
			//.values()
			l.addAll(m.values());
			Collections.sort(l);
			return l;
}
}
