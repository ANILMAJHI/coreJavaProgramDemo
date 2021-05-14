import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RepeatedArrayList {

	public static void main(String[] args) throws Exception {

		ArrayList<Integer> al = new ArrayList<>();
		al.add(3);
		al.add(2);
		al.add(5);
		al.add(5);
		al.add(1);
		al.add(4);
		al.add(6);
		al.add(7);
		al.add(8);
		al.add(9);
		al.add(10);
		al.add(6);
		//System.out.println(al.size());
		System.out.print(al);
		System.out.println("------------");
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			Object o = (Object) itr.next();
			System.out.print(","+o);
		}
		Set s1 = new HashSet();
		//Set s2 = new HashSet();
		for (Integer set : al) {
			if (!s1.add(set)) {
				//s2.add(set);
				System.out.println("------------");
				System.out.print(s1);
				//throw new Exception("Duplicte");
			}
		}
		//System.out.println(s2);

/*		Set<String> s=new HashSet<String>();
		Set<String> s1=new HashSet<String>();
	List<String> l=new ArrayList<String>();
	l.add("Port-channel1");
	l.add("Port-channel2");
	l.add("Port-channel2");
	l.add("Port-channel4");
	l.add("Port-channel4");
	
	l.add("Port-channel3");
	System.out.println(l.toString());
	
	
	for(String name:l)
	{
		System.out.println("Name : "+name);
		if(!s.add(name))
		{
			System.out.println("S : "+s);
			throw new Exception("Duplicate ");
		}
	}
*/	
	}
}
