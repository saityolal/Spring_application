package spring_annotation_application;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {


	Random myRandom = new Random();

	private List<String> fortunes;


	public FileFortuneService() {
		
		
		
		fortunes = new ArrayList<String>();
		String line;

		try {
			FileInputStream fis =new FileInputStream("C:\\Users\\sado\\eclipse-workspace\\spring_annotation_application\\src\\spring_annotation_application\\fortune-data.txt");
			InputStreamReader isr =new InputStreamReader(fis);
			BufferedReader br = new BufferedReader(isr);

			while((line=br.readLine())!=null) {
				fortunes.add(line);

			}
			br.close();
		}

		catch(Exception e) {
			System.out.println("Error Message is : " + e);
		}
		
	}

	@Override
	public String getFortune() {
		int index = myRandom.nextInt(fortunes.size());

		return fortunes.get(index);
	}
}
