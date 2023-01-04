package com.example.demo.entity;

import java.io.Serializable;

import lombok.Data;

@Data
public class BirthStone implements Serializable{

	private static final long serialVersionUID = 1L;
	
	/** 月 */
	private String month;
	/** 名前 */
	private String name;
	/** 色 */
	private String color;
	
}
