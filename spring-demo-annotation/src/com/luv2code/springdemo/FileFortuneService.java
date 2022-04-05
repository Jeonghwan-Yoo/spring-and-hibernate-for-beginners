package com.luv2code.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {

	private Random random = new Random();
	private List<String> fortunes;
	private String fileName = "C:\\Users\\Jeonghwan\\Desktop\\Udemy\\Spring & Hibernate\\workspace\\spring-demo-annotation\\src\\com\\luv2code\\springdemo\\fortune-data.txt";
	
	public FileFortuneService() {
		File file = new File(fileName);
		
		System.out.println("Reading file : " + file);
		System.out.println("File exists : " + file.exists());
		
		fortunes = new ArrayList<String>();
		
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String tmp;
			while ((tmp = br.readLine()) != null) {
				fortunes.add(tmp);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String getFortune() {
		int index = random.nextInt(fortunes.size());
		return fortunes.get(index);
	}

}
