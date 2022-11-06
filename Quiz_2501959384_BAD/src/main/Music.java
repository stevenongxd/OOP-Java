package main;

import java.util.Random;

public class Music extends Creation{
	
	private String genreM;
	private String instrument;
	private Integer durationM;

	public Music(String creatorName, String creatorType, String title, Integer view, String genreM, String instrument, Integer durationM) {
		super(creatorName, creatorType, title, view);
		this.genreM = genreM;
		this.instrument = instrument;
		this.durationM = durationM;
	}

	public String getGenreM() {
		return genreM;
	}

	public void setGenreM(String genreM) {
		this.genreM = genreM;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setInstrument(String instrument) {
		this.instrument = instrument;
	}

	public Integer getDurationM() {
		return durationM;
	}

	public void setDurationM(Integer durationM) {
		this.durationM = durationM;
	}

	@Override
	public void calculateView() {
		Random rand = new Random();
		int initialM = rand.nextInt(4000-5000);
		int genreM = rand.nextInt(5-10);
		int instrumentM = rand.nextInt(2-5);
		int totalView = initialM + genreM + instrumentM;
		
		totalView = getView();
	}
	
}
