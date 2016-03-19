package br.ifrn.ssaac.business.facade;

import br.ifrn.ssaac.business.model.Student;
import br.ifrn.ssaac.business.model.Event;

public interface SSAAC {
	public void addStudentAuthor(Student student);
	public void addEvent(Event event);
}