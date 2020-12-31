package com.main.member.model.vo;

import lombok.Data;

@Data
public class Member {

	private int mNo;
	private String mId;
	private String mPw;
	private String mEmail;
	private String mPhone;
	private int mGrade;
	private int warningCount;
	private String introduct;
	private String enrollDate;
	private String brandName;
	private String contactTime;
}
