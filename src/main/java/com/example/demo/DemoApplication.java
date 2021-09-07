package com.example.demo;

import java.util.LinkedList;

import com.example.demo.dao.AccountDAO;
import com.example.demo.dao.MembershipDAO;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
//import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplication {
	private static void printSth(){}

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DemoApplication.class, args);
		// AnnotationConfigApplicationContext context = new
		// AnnotationConfigApplicationContext(DemoConfig.class);
		System.out.println("CPUs: " + Runtime.getRuntime().availableProcessors());

		// get the bean

		AccountDAO accountDAO = context.getBean("accountDAO", AccountDAO.class);
		MembershipDAO membershipDAO = context.getBean("membershipDAO", MembershipDAO.class);

		// for (int i = 1; i <= 5; i++) {
		// new Thread(() -> {
		// accountDAO.addAccount();
		// System.out.println("Current thread: " + Thread.currentThread().getName());
		// }).start();
		// }
		// accountDAO.addAccount();
		accountDAO.addAccount(new Account("Tan", "Gold"));
		accountDAO.addAccount(new Account("Travish", "Gold"), 2);
		// membershipDAO.addAccountMember();

		accountDAO.setName("the Account");
		accountDAO.getName();

		// membershipDAO.setVIP(true);
		System.out.println("Accounts: " + accountDAO.findAccounts());
		
		try {
			accountDAO.throwExp();
		} catch (Exception e) {
			System.out.println("Main program caugth Exception");
		}
		context.close();

	}

}
