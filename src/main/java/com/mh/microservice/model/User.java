package com.mh.microservice.model;

import lombok.Data;

@Data
public class User extends BaseModel{

	private String userName;
	private String password;
}
