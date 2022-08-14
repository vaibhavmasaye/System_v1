package com.system.api.payload;

public class ServerResponse {

	 private Integer id;
	 private String useremail;
	 
	public ServerResponse(Integer id, String useremail) {
		super();
		this.id = id;
		this.useremail = useremail;
	}

	public ServerResponse() {
		super();
	}

	@Override
	public String toString() {
		return "ServerResponse [id=" + id + ", useremail=" + useremail + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUseremail() {
		return useremail;
	}

	public void setUseremail(String useremail) {
		this.useremail = useremail;
	}
	 
	
	 
	 
}

