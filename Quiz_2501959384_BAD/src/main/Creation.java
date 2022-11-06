package main;

public abstract class Creation {
	
	private String creatorName;
	private String creatorType;
	private String title;
	private Integer view;
	
	public Creation(String creatorName, String creatorType, String title, Integer view) {
		super();
		this.creatorName = creatorName;
		this.creatorType = creatorType;
		this.title = title;
		this.view = view;
	}

	public String getCreatorName() {
		return creatorName;
	}

	public void setCreatorName(String creatorName) {
		this.creatorName = creatorName;
	}

	public String getCreatorType() {
		return creatorType;
	}

	public void setCreatorType(String creatorType) {
		this.creatorType = creatorType;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getView() {
		return view;
	}

	public void setView(Integer view) {
		this.view = view;
	}
	
	public abstract void calculateView();
	
}
