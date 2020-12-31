package com.main.service.model.vo;

import lombok.Data;

@Data
public class ServiceReview {
	private int rNo;
	private int tNo;
	private int sNo;
	private String mId;
	private String rContent;
	private int rRate;
	private String writeDate;
}
