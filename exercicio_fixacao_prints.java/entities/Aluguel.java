package entities;

public class Aluguel {
	
	private String hospede;
	private String email;
	
	public Aluguel (String hospede, String email) {
		this.hospede = hospede;
		this.email = email;
	}
	
	public String getHospede() {
		return hospede;
	}

	public void setHospede(String hospede) {
		this.hospede = hospede;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		
		return hospede + ", " + email;
	}
	
}
