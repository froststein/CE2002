package Lab4;

public class SalePerson implements Comparable {
	private String firstName;
	private String lastName;
	private int totalSales;
	
	public String getFirstNme() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getTotalSales() {
		return totalSales;
	}
	
	public String toString() {
		return "";
	}

	
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
