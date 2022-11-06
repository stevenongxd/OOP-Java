package main;

import java.util.Random;

public class Podcast extends Creation{

	private String genreP;
	private String guestName;
	private Integer durationP;
	
	public Podcast(String creatorName, String creatorType, String title, Integer view, String genreP, String guestName, Integer durationP) {
		super(creatorName, creatorType, title, view);
		this.genreP = genreP;
		this.guestName = guestName;
		this.durationP = durationP;
	}

	public String getGenreP() {
		return genreP;
	}

	public void setGenreP(String genreP) {
		this.genreP = genreP;
	}

	public String getGuestName() {
		return guestName;
	}

	public void setGuestName(String guestName) {
		this.guestName = guestName;
	}

	public Integer getDurationP() {
		return durationP;
	}

	public void setDurationP(Integer durationP) {
		this.durationP = durationP;
	}

	@Override
	public void calculateView() {
		Random rand = new Random();
		int initialP = rand.nextInt(3000-5000);
		int genreP = rand.nextInt(3-5);
		int guestP = rand.nextInt(2-5);
		int totalView = initialP + genreP + guestP;
		
		totalView = getView();
	}

	}
