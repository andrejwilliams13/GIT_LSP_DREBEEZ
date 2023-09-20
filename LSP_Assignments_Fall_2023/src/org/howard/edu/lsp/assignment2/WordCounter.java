package org.howard.edu.lsp.assignment2;


import java.io.FileNotFoundException;
import java.util.HashMap;

public class WordCounter {

	public static void main(String[] args) {
		FileReader filename = new FileReader();
		HashMap<String, Integer> hashmap = new HashMap<String, Integer>();
		try {
			String filepath = filename.readToString("main/java/resource/words.txt");
			System.out.println(filepath);
			//String[] seperated = filepath.toLowerCase().replaceAll("[^a-zA-z ]", "").split(" ");
			String[] seperated = filepath.toLowerCase().split(" ");
			for (int x = 0; x < seperated.length; x++) {
				if (seperated[x].length() > 3) {
					if (hashmap.get(seperated[x]) == null) {
						hashmap.put(seperated[x],1);
					}
					else {
						hashmap.put(seperated[x], hashmap.get(seperated[x]) + 1);
					}
				}
			}
			for (String i : hashmap.keySet()) {
				System.out.println(i + " " + hashmap.get(i));
			}
		}
		catch (FileNotFoundException e) {
			System.out.println("File not found in directory");
		}
	}
}
