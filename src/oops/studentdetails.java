package oops;

public class studentdetails {
	private String emailid;
	private String password;
	//method
	//public void setemailid(string emaildid){
	//this.emailid
    //}
	//public void setpassword(string password){
		//this.password
	    //}
	public void Setvalues(String emailid ,String password) {
		this.emailid=emailid;
		this.password=password;
	}
	public String getemailid() {
		return emailid;
		
	}
	public String getpassword() {
		return password;
	}

	

}
