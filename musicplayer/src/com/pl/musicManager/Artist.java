package com.pl.musicManager;

public class Artist implements Comparable<Artist>{
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Artist(String name) {
		super();
		this.name = name;
	}
	
	@Override
	public int compareTo(Artist artist) {
		return this.name.compareTo(artist.getName());
	}
}
