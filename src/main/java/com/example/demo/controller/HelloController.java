package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.BirthStone;

@RestController
@RequestMapping("/birth-stones")
@CrossOrigin(origins= "*")
public class HelloController {
	
	@GetMapping("/{month}")
	@ResponseBody
	public BirthStone getBirthStone(@PathVariable String month) {
		BirthStone birthStone = new BirthStone();
		if ( month.equals("January")) {
			
			birthStone.setMonth("1月");
			birthStone.setName("ガーネット");
			birthStone.setColor("赤");			
			
		} else if ( month.equals("February")) {
			
			birthStone.setMonth("2月");
			birthStone.setName("アメシスト");
			birthStone.setColor("紫色");
			
		} else if ( month.equals("March")) {
			
			birthStone.setMonth("3月");
			birthStone.setName("アクアマリン");
			birthStone.setColor("水色");
			
		} else if ( month.equals("April")) {
			
			birthStone.setMonth("4月");
			birthStone.setName("ダイヤモンド");
			birthStone.setColor("無色");
			
		} else if ( month.equals("May")) {
			
			birthStone.setMonth("5月");
			birthStone.setName("エメラルド");
			birthStone.setColor("緑色");
			
		} else if ( month.equals("June")) {
			
			birthStone.setMonth("6月");
			birthStone.setName("ムーンストーン");
			birthStone.setColor("乳白色");
			
		} else if ( month.equals("July")) {
			
			birthStone.setMonth("7月");
			birthStone.setName("ルビー");
			birthStone.setColor("深紅色");
			
		} else if ( month.equals("August")) {
			
			birthStone.setMonth("8月");
			birthStone.setName("ペリドット");
			birthStone.setColor("黄緑色");
			
		} else if ( month.equals("September")) {
			
			birthStone.setMonth("9月");
			birthStone.setName("サファイヤ");
			birthStone.setColor("青色");
			
		} else if ( month.equals("October")) {
			
			birthStone.setMonth("10月");
			birthStone.setName("オパール");
			birthStone.setColor("虹色");
			
		} else if ( month.equals("November")) {
			
			birthStone.setMonth("11月");
			birthStone.setName("トパーズ");
			birthStone.setColor("無色");
			
		} else if ( month.equals("December")) {
			
			birthStone.setMonth("12月");
			birthStone.setName("ターコイズ");
			birthStone.setColor("青緑色");
		}
		return birthStone;
	} 
}
