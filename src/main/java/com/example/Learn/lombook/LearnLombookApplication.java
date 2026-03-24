package com.example.Learn.lombook;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LearnLombookApplication {

	public static void main(String[] args) {



		SpringApplication.run(LearnLombookApplication.class, args);

		//Student student1=new Student();
		//System.out.println(student1.getAge());
		//student1.setName("ali");
		//System.out.println(student1.getName());


		Home mahdi_home=Home.builder()
				.address("tehran")
				.windows(2)
				.description("bozorge")
				.build();

		System.out.println(mahdi_home.getDescription());

		mahdi_home=mahdi_home.toBuilder()
				.description("koochik mikonim")
				.build();
		System.out.println(mahdi_home.getDescription());

	}

}
