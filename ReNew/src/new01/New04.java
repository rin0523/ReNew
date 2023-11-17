package new01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class New04 {

	public static void main(String[] args) {
		/* 단어장 
		 * 단어: 의미
		 * 
		 * map으로 생성
		 * 입력받을 단어의 개수를 받아서 그만큼 map에 추가
		 * 콘솔에 찍기*/

		HashMap<String, String>map= new HashMap<>();
		Scanner scan = new Scanner(System.in);
		System.out.println("단어 개수 : ");
		int size= scan.nextInt();
		
		while(map.size()<size) {
			System.out.println("단어 : ");
			String word=scan.next();
			System.out.println("의미: ");
			String mean= scan.next();
			
			map.put(word,mean);
		}
		
		Iterator<String>it= map.keySet().iterator();
		while(it.hasNext()) {
			String word= it.next();
			System.out.println(word+":" + map.get(word));
		}
	
		
		scan.close();


	}

}
