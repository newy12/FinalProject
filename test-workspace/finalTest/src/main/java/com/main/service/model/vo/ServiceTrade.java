package com.main.service.model.vo;

import lombok.Data;

@Data
public class ServiceTrade {
	private int tNo;
	private int sNo;
	private int mNo;
	private int tStatus;
	private int tPrice;
	private String startDate;
	private String endDate;
}
