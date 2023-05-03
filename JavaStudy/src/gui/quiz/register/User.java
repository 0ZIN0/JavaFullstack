package gui.quiz.register;

public class User {
	
	String id;
	String pw;
	String name;
	String regNum;
	String email;
	
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPw() {
		return pw;
	}
	public String getRegNum() {
		return regNum;
	}
	public String getEmail() {
		return email;
	}
	public void setId(String id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPw(String pw) {
		this.pw = pw;
	}
	public void setRegNum(String regNum) {
		this.regNum = regNum;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
