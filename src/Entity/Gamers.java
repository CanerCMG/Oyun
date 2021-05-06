package Entity;

public class Gamers {
	private int Id ;
	private	String FirstName;
	private	String LastName;
	private	String TcKimlik;
	private	String BirthDate;
	
	
	
	
	public Gamers(int id, String firstName, String lastName, String tcKimlik, String birthDate) {
		super();
		Id = id;
		FirstName = firstName;
		LastName = lastName;
		this.TcKimlik = tcKimlik;
		this.BirthDate = birthDate;
		
	
	}
	public Gamers() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getTcKimlik() {
		return TcKimlik;
	}
	public void setTcKimlik(String tcKimlik) {
		TcKimlik = tcKimlik;
	}
	public String getBirthDate() {
		return BirthDate;
	}
	public void setBirthDate(String birthDate) {
		BirthDate = birthDate;
	}


	


}
