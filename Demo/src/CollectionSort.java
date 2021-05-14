import java.util.Comparator;
import java.util.TreeSet;

public class CollectionSort {

	public static void main(String[] args) {
		//ArrayList<String> al = new  ArrayList<>(new MyComprator());
		TreeSet<String> al=new TreeSet<>(new Mycompartor());
		al.add("a");
		al.add("f");
		al.add("m");
		al.add("x");
		al.add("e");
		System.out.println(al);
		//Collections.sort(al,new Mycompartor());
		//Collections.binarySearch(al, "gssg");
		System.out.println("after sorting" + al);
	}
}

class Mycompartor implements Comparator<String> {

	@Override
	public int compare(String obj1, String obj2) {
		// TODO Auto-generated method stub
		String i1 =  obj1;
		String i2 =  obj2;
		return i1.compareTo(i2);
	}
}