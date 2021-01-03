package com.pk.user.vo;

import com.pk.user.entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RestTemplateVO {

	
	private Department department;
	private User user;
	
}
