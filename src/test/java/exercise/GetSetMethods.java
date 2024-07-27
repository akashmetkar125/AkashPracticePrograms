package exercise;

public class GetSetMethods {
	
	
	private String name;
	private String city;
	private int age;
	
	public GetSetMethods(String name,String city, int age) {
		this.name=name;
		this.age=age;
		this.city=city;
	}

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getCity() {
		return city;
	}



	public void setCity(String city) {
		this.city = city;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}

	
}

