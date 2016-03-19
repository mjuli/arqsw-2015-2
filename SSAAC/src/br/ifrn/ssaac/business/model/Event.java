package br.ifrn.ssaac.business.model;

//import java.sql.Date;

public class Event {
	private long id;
	private String name;
	private String dateBegin;
	private String dateEnd;
	
	public Event() {
		super();
	}
	
	public Event(String name, String dateBegin, String dateEnd) {
		super();
		this.name = name;
		this.setDateBegin(dateBegin);
		this.setDateEnd(dateEnd);
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDateBegin() {
		return dateBegin;
	}

	public void setDateBegin(String dateBegin) {
		this.dateBegin = dateBegin;
	}

	public String getDateEnd() {
		return dateEnd;
	}

	public void setDateEnd(String dateEnd) {
		this.dateEnd = dateEnd;
	}
	
	
}
