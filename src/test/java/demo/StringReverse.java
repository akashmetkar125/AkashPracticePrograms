package demo;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s ="Akash";
		
	char []	arr =s.toCharArray();
	
	for (int i=arr.length-1;i>=0;i--) {
		
		System.out.print(arr[i]);
	}
	
	System.out.println("");
	
	String a ="Akash";
	
	for (int i =a.length()-1;i>=0;i--){
		
		System.out.print(a.charAt(i));
	}

	}

}
