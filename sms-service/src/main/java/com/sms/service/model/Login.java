package com.sms.service.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;


@DynamoDBTable(tableName="Login")
public class Login {
	private String email;
	private String igAccessToken;
	private String igBio;
	private String igFullName;
	private String igProfilePic;
	private String igUserID;
	private String igUserName;
	private String password;
	
	public Login() {
		super();
	}

	public Login(String email, String igAccessToken, String igBio, String igFullName, String igProfilePic,
			String igUserID, String igUserName, String password) {
		super();
		this.email = email;
		this.igAccessToken = igAccessToken;
		this.igBio = igBio;
		this.igFullName = igFullName;
		this.igProfilePic = igProfilePic;
		this.igUserID = igUserID;
		this.igUserName = igUserName;
		this.password = password;
	}
	
	@DynamoDBHashKey(attributeName="email")
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	@DynamoDBAttribute(attributeName="igAccessToken")	
	public String getIgAccessToken() {
		return igAccessToken;
	}
	public void setIgAccessToken(String igAccessToken) {
		this.igAccessToken = igAccessToken;
	}
	
	@DynamoDBAttribute(attributeName="igBio")
	public String getIgBio() {
		return igBio;
	}
	public void setIgBio(String igBio) {
		this.igBio = igBio;
	}

	@DynamoDBAttribute(attributeName="igFullName")
	public String getIgFullName() {
		return igFullName;
	}
	public void setIgFullName(String igFullName) {
		this.igFullName = igFullName;
	}
	
	@DynamoDBAttribute(attributeName="igProfilePic")
	public String getIgProfilePic() {
		return igProfilePic;
	}
	public void setIgProfilePic(String igProfilePic) {
		this.igProfilePic = igProfilePic;
	}
	
	@DynamoDBAttribute(attributeName="igUserID")
	public String getIgUserID() {
		return igUserID;
	}
	public void setIgUserID(String igUserID) {
		this.igUserID = igUserID;
	}
	
	@DynamoDBAttribute(attributeName="igUserName")
	public String getIgUserName() {
		return igUserName;
	}
	public void setIgUserName(String igUserName) {
		this.igUserName = igUserName;
	}
	
	@DynamoDBAttribute(attributeName="password")
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	@Override
	public String toString() {
		return "Login [email=" + email + ", igAccessToken=" + igAccessToken + ", igBio=" + igBio + ", igFullName="
				+ igFullName + ", igProfilePic=" + igProfilePic + ", igUserID=" + igUserID + ", igUserName="
				+ igUserName + ", password=" + password + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((igAccessToken == null) ? 0 : igAccessToken.hashCode());
		result = prime * result + ((igBio == null) ? 0 : igBio.hashCode());
		result = prime * result + ((igFullName == null) ? 0 : igFullName.hashCode());
		result = prime * result + ((igProfilePic == null) ? 0 : igProfilePic.hashCode());
		result = prime * result + ((igUserID == null) ? 0 : igUserID.hashCode());
		result = prime * result + ((igUserName == null) ? 0 : igUserName.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Login other = (Login) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (igAccessToken == null) {
			if (other.igAccessToken != null)
				return false;
		} else if (!igAccessToken.equals(other.igAccessToken))
			return false;
		if (igBio == null) {
			if (other.igBio != null)
				return false;
		} else if (!igBio.equals(other.igBio))
			return false;
		if (igFullName == null) {
			if (other.igFullName != null)
				return false;
		} else if (!igFullName.equals(other.igFullName))
			return false;
		if (igProfilePic == null) {
			if (other.igProfilePic != null)
				return false;
		} else if (!igProfilePic.equals(other.igProfilePic))
			return false;
		if (igUserID == null) {
			if (other.igUserID != null)
				return false;
		} else if (!igUserID.equals(other.igUserID))
			return false;
		if (igUserName == null) {
			if (other.igUserName != null)
				return false;
		} else if (!igUserName.equals(other.igUserName))
			return false;
		if (password == null) {
			if (other.password != null)
				return false;
		} else if (!password.equals(other.password))
			return false;
		return true;
	}
	
	
	
}
