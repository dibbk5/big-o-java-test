package com.example.bigojavatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BigojavatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(BigojavatestApplication.class, args);

		int[] newArray = new int[]{1,2,3,4,5,6,7,9,10};

		System.out.println(MissingNumber.missingNumber(newArray, 10));
		System.out.println(MissingNumber.missingNumberSort(newArray, 10));
		System.out.println(MissingNumber.missingNumberSum(newArray, 10));
	}

}
