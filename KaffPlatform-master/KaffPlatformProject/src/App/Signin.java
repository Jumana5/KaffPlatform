package App;

public class Signin {
	
	public String username;
	public String password;
	
	public Signin() {}
	public void Signinuse(String username) {
		this.username=username;
		
	}
	public void Signinpass( String password) {
		
		this.password=password;
	}
	
	public Signin(String username, String password) {
		this.username=username;
		this.password=password;
	}
	

}
