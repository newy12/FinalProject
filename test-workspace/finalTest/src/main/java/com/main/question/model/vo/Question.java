package com.main.question.model.vo;

import lombok.Data;

@Data
public class Question {
	private int qNo;
	private int mNo;
	private String qTitle;
	private String qContent;
	private int secretStatus;
	private String writeDate;
	private int answerStatus;
	private String answerContent;
	private String answerDate;
}
