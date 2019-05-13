package com.example.GetAllBean;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Arrays;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {


		ApplicationContext ac= SpringApplication.run(Application.class, args);
		String [] str =ac.getBeanDefinitionNames();
		Arrays.sort(str);
		for(String s:str){
			System.out.println(s);
		}


	}

}
