package com.cat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.io.IOError;
import java.io.IOException;

@SpringBootApplication
@Controller
@EnableScheduling
public class Application {

	@RequestMapping("")
	public String greeting() {
		return "default";
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
