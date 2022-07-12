package com.foodject.admin.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class MainVO {
	private String uid;
	private String pwd;
	private String name;
	private String addr;
	private String phon;
	private String birth;
}


