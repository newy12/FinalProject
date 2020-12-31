package com.main.notice.model.vo;

import lombok.Data;

@Data
public class Notice {

	private int nNo;
	private String nTitle;
	private String nContent;
	private String filename;
	private String filepath;
	private String writeDate;
}
