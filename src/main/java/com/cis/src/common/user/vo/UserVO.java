package com.cis.src.common.user.vo;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class UserVO {
	
	private int idx;
	private String name;
	private String password;
	private String regDt;
	
}
