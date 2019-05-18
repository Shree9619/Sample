package com.passport.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;

@Entity
public class User {
	
	private String passportOffice;
	private String userId;
	private String userFullName;
	private String userSurname;
	private Date userDateOfBirth;
	private String userEmail;
	private String userLoginId;
	private String userPassword;
	private String userHintQuestion;
	private String userHintAnswer;
	private Date userLastLogin;
	private List<Application> applicationList;
	
	public User()
	{
		
	}

	public User(String passportOffice, String userId, String userFullName, String userSurname, Date userDateOfBirth,
			String userEmail, String userLoginId, String userPassword, String userHintQuestion, String userHintAnswer,
			Date userLastLogin, List<Application> applicationList) {
		super();
		this.passportOffice = passportOffice;
		this.userId = userId;
		this.userFullName = userFullName;
		this.userSurname = userSurname;
		this.userDateOfBirth = userDateOfBirth;
		this.userEmail = userEmail;
		this.userLoginId = userLoginId;
		this.userPassword = userPassword;
		this.userHintQuestion = userHintQuestion;
		this.userHintAnswer = userHintAnswer;
		this.userLastLogin = userLastLogin;
		this.applicationList = applicationList;
	}

	public String getPassportOffice() {
		return passportOffice;
	}

	public void setPassportOffice(String passportOffice) {
		this.passportOffice = passportOffice;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserFullName() {
		return userFullName;
	}

	public void setUserFullName(String userFullName) {
		this.userFullName = userFullName;
	}

	public String getUserSurname() {
		return userSurname;
	}

	public void setUserSurname(String userSurname) {
		this.userSurname = userSurname;
	}

	public Date getUserDateOfBirth() {
		return userDateOfBirth;
	}

	public void setUserDateOfBirth(Date userDateOfBirth) {
		this.userDateOfBirth = userDateOfBirth;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserLoginId() {
		return userLoginId;
	}

	public void setUserLoginId(String userLoginId) {
		this.userLoginId = userLoginId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserHintQuestion() {
		return userHintQuestion;
	}

	public void setUserHintQuestion(String userHintQuestion) {
		this.userHintQuestion = userHintQuestion;
	}

	public String getUserHintAnswer() {
		return userHintAnswer;
	}

	public void setUserHintAnswer(String userHintAnswer) {
		this.userHintAnswer = userHintAnswer;
	}

	public Date getUserLastLogin() {
		return userLastLogin;
	}

	public void setUserLastLogin(Date userLastLogin) {
		this.userLastLogin = userLastLogin;
	}

	public List<Application> getApplicationList() {
		return applicationList;
	}

	public void setApplicationList(List<Application> applicationList) {
		this.applicationList = applicationList;
	}
	
}
