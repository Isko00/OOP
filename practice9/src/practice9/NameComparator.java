package practice9;

import java.util.Comparator;

public class NameComparator implements Comparator<Polygon> {
	 public int compare(Polygon a, Polygon b) {
		 return a.getName().compareTo(b.getName());
	 }
}
