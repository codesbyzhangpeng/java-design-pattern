package com.designpattern.composite;

public class Main {

	public static void main(String[] args) {
		Directory videokurs = new Directory("Videokurs");
		
		File kursScript = new File("Kursscript", "Zhangpeng");
		Directory kursVideo = new Directory("Kurs Video");
		
		videokurs.add(kursVideo);
		videokurs.add(kursScript);
		
		Directory modul1 = new Directory("Modul 1");
		Directory modul2 = new Directory("Modul 2");
		
		kursVideo.add(modul1);
		kursVideo.add(modul2);

		File file2 = new File("Einführung", "Zhangpeng");
		File file1 = new File("Installation", "Zhangpeng");
		File file3 = new File("Variablen", "Zhangpeng");

		modul1.add(file3);
		modul2.add(file1);
		modul2.add(file2);
		
		videokurs.print("");
				
	}
}
