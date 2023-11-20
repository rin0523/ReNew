package word;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class WordManager {

	Word W = new Word();
	private ArrayList<Word> list = new ArrayList<>();

	public void add(Scanner scan) {// 단어등록
		System.out.println("단어입력");
		String word = scan.next();
		System.out.println("뜻입력");
		String mean = scan.next();

		Word W = new Word(word, mean);
		list.add(W);
		System.out.println("단어등록 완료");

	}

	public void search(Scanner scan) {// 검색
		System.out.println("검색할 단어");
		String searchword = scan.next();
		if (searchword == null) {
			System.out.println("찾는 단어가 없습니다");
			return;
		} else {

			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getWord().equals(searchword)) {
					System.out.println(list.get(i));

				}
			}

		}

	}

	public void mod(Scanner scan) {// 단어수정
		System.out.println("수정할 단어 입력해주세요");
		String word = scan.next();
		System.out.println("수정해주세요");
		String mean = scan.next();

		Word W = new Word(word, mean);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getWord().equals(word)) {
				System.out.println("뜻입력");
				mean = scan.next();
				list.get(i).setMean(mean);
				System.out.println("단어등록 완료");

			}

		}
	}

	public void print() {// 단어출력
		System.out.println("--단어장--");
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
	}

	public void filePrint() throws IOException {// 파일로 출력

		FileWriter fw = new FileWriter("word.txt");
		BufferedWriter bw = new BufferedWriter(fw);

		StringBuffer sb = new StringBuffer();

		String data = "";
		int cnt = 0; // 리스트의 index

		while (cnt < list.size()) {
			sb.append(list.get(cnt).toString());
			sb.append("\r\n"); // 줄바꿈
			cnt++;
		}

		data = sb.toString();
		System.out.println(data);
		fw.write(data);
		fw.close();
	}

}
