package spring_annotation_application;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneServiceLifeCycle implements FortuneService {


	
	//Define String List that must hold fortunes from txt file
	private ArrayList<String> fortunes = new ArrayList<String>();
	
	Random myRandom = new Random();
	
	private String line;
	
	
	public FileFortuneServiceLifeCycle(){
		System.out.println("FileFortuneServiceLifeCycle: inside of no-arg constructor method");
	}
	
	@PostConstruct
	public void doMyFileStuff() {
		
		try {
			System.out.println("doMyFileStuff: execution started!!");
			FileInputStream fis = new FileInputStream("C:\\Users\\sado\\eclipse-workspace\\spring_annotation_application\\src\\spring_annotation_application\\fortune-data.txt");
			InputStreamReader isr = new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);
			
			while((line=br.readLine())!= null) {
				
				fortunes.add(line);
			}
			
		}
		catch(Exception e){
			System.out.println("\nError message is : " + e );
		}
	}
	
	
	@PreDestroy
	public void doMyCleanFileStuff() {
		
		System.out.println("doMyCleanFileStuff:  The proccess is done");
		
	}
	
	
	
	@Override
	public String getFortune() {
		
		int index = myRandom.nextInt(fortunes.size());
		
		return fortunes.get(index);
	}

}
