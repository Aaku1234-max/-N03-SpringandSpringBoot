package org.tnsif.springwebapp;

import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringWebAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=SpringApplication.run(SpringWebAppApplication.class, args);
		Scanner sc=new Scanner(System.in);
		/*Employee e=context.getBean(Employee.class);
		e.setEmpid(1034);
		e.setEmpname("Aakanksha Barkale");
		e.print();*/
		HomeController h=context.getBean(HomeController.class);
		h.home();
		
	}

}
