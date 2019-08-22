package com.designpattern.composite;

public class File extends FileSystemComponent {
	
	private String Owner;
	
	public File(String name, String owner) {
		this.setName(name);;
		this.Owner = owner;
	}
	
	@Override
	public void print(String spacing) {
		System.out.println(spacing + "-->" + this.getName() + " (Erstellung: " + this.Owner + ")" );
	}
}
