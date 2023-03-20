package com.mysite.sbb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication // 클래스에 이런 거 붙으면 대체로 주석! 어노테이션
public class SbbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SbbApplication.class, args); // 스프링부트 앱을 실행하는 코드다~
	}

}
