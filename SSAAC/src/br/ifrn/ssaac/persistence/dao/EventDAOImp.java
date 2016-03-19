package br.ifrn.ssaac.persistence.dao;

import br.ifrn.ssaac.business.model.Event;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import br.ifrn.ssaac.persistence.util.ConnectionFactory;

public class EventDAOImp implements EventDAO {
	
	private Connection conn;
	
	public EventDAOImp() {
		conn = ConnectionFactory.getInstance().getConnection();
	}
	
	@Override
	public void addEvent(Event event) {
		
		try {
			String sql = "INSERT INTO event (name, begin, end) VALUES (?, ?, ?)";
			PreparedStatement pstInsere = conn.prepareStatement(sql);
			pstInsere.setString(1, event.getName());
			pstInsere.setString(2, event.getDateBegin());
			pstInsere.setString(3, event.getDateEnd());
			pstInsere.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeEvent(Event event) {
		
		try {
		String sql = "DELETE FROM event as s WHERE s.id = ?";
			PreparedStatement pstRemove = conn.prepareStatement(sql);
			pstRemove.setLong(1, event.getId());
			pstRemove.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
