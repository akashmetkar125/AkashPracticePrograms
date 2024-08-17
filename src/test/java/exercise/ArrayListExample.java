package exercise;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList al = new ArrayList();
		al.add("Akash");
		al.add("Metkar");
		al.add(60);
		al.add(65.5f);
		
		System.out.println(al);
		
		al.set(0, "Aakash");
		System.out.println(al);
		
		al.add(1, "Ramkishanrao");
		System.out.println(al);
		
		al.remove(1);
		System.out.println(al);
		
		for (int i=0;i<al.size();i++) {
			
			System.out.println(al.get(i));
		
		}
		
		System.out.println("Reversed Vector elements");
        for (int i=al.size()-1;i>=0;i--) {
			
    			System.out.println(al.get(i));
		
		}
		
		for (Object a : al) {
			System.out.println(a);
			
		}
		
		Iterator itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		ListIterator iter = al.listIterator();
		while(iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}

}
