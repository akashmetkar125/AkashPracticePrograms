package exercise;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Vector v = new Vector();
		v.add("Akash");
		v.add("Metkar");
		v.add(1, "Ramkishanrao");
		
		System.out.println(v);
		
		v.remove(1);
		System.out.println(v);
		
		v.set(0, "Aakash");
		System.out.println(v);
		
		Enumeration enu = v.elements();
		while(enu.hasMoreElements())
{
			
		System.out.println(enu.nextElement());
}
	}

}
