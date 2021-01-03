package com.pk.user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pk.user.entity.User;
import com.pk.user.repository.UserRepository;
import com.pk.user.vo.Department;
import com.pk.user.vo.RestTemplateVO;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class UserService {

	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RestTemplate restTemplate;

	
	public User saveUser(User user) {
		log.info("USERSERVICE ::: SAVE_USER");
		return userRepository.save(user);
	}


	public RestTemplateVO getUserWithDepartment(Long userId) {
		log.info("USERSERVICE ::: GETUSERWITHDEPARTMENT");
		RestTemplateVO vo = new RestTemplateVO();
		User user = userRepository.findByUserId(userId);
		Department department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId(), Department.class);
		vo.setUser(user);
		vo.setDepartment(department);
		return vo;				
	}
}
