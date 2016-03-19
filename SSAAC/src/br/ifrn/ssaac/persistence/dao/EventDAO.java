package br.ifrn.ssaac.persistence.dao;

import br.ifrn.ssaac.business.model.Event;

public interface EventDAO {
	public void addEvent(Event event);
	public void removeEvent(Event event);
}
