package br.ifrn.ssaac.business.facade;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.userbi.UserBI;
import br.ifrn.ssaac.business.model.Event;
import br.ifrn.ssaac.business.eventbi.EventBI;

public class SSAACImp implements SSAAC {
	
	private UserBI userBI;
	private EventBI eventBI;
	
	public void setUserBI(UserBI userBI) {
		this.userBI = userBI;
	}
	
	public void setEventBI(EventBI eventBI) {
		this.eventBI = eventBI;
	}
	
	@Override
	public void addStudentAuthor(Student student) {
		userBI.addStudentAuthor(student);
	}
	
	@Override
	public void addEvent(Event event) {
		eventBI.addEvent(event);
	}
}