package com.tarek.spring_boot_deep_drive;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import static org.springframework.data.web.config.EnableSpringDataWebSupport.PageSerializationMode.VIA_DTO;

@EnableSpringDataWebSupport(pageSerializationMode = VIA_DTO)
@SpringBootApplication
public class SpringBootDeepDriveApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDeepDriveApplication.class, args);
	}

}
