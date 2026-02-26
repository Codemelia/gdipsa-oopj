package classesandobjects;

public class Instantiation {

	// instance variables
	private String title;
	private String date;
	
	// getters setters
	public void setTitle(String title) { this.title = title; }
	public String getTitle() { return title; }
	public void setDate(String date) { this.date = date; }
	public String getDate() { return date; }
	
	// constructors
	// default
	public Instantiation() {
		this("title", "date"); // can have variables, can be empty
	}
	
	// dynamic variables
	public Instantiation(String title, String date) {
		this.setTitle(title);
		this.setDate(date);
	}
	
	// to string reference of values
	public String toString() {
		return String.format("Title: %s | Date: %s", title, date);
	}
	
}