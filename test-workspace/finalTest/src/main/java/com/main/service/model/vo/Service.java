package com.main.service.model.vo;

import lombok.Data;

@Data
public class Service {
	private int sNo;
	private String mId;
	private String sTitle;
	private int sPrice;
	private String sContent;
	private String sArea;
	private String sImg;
	private int sRate;
	private int mainCategory;
	private int subCategory;
	private int workingDate;
	private int workingCount;
	private String writeDate;
	private char deleteStatus;
	private char adminApproval;
}
