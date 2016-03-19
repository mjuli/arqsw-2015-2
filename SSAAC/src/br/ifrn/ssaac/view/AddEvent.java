package br.ifrn.ssaac.view;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.ifrn.ssaac.business.facade.SSAAC;
import br.ifrn.ssaac.business.factory.SSAACFactory;
import br.ifrn.ssaac.business.model.Event;

@WebServlet("/addEvent")
public class AddEvent extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public AddEvent() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Recupera uma instância da fachada a partir da fábrica
		SSAAC facade = SSAACFactory.getInstance().getFacade();
		
		// Recuperando parâmetros do formulário
		String name = request.getParameter("name");
		String dateBegin = request.getParameter("datebegin");
		String dateEnd = request.getParameter("dateend");
		
		// Testa se os parâmetros são válidos
		if (name != null && !name.isEmpty() && dateBegin != null && 
				!dateBegin.isEmpty() && dateEnd != null && !dateEnd.isEmpty()) {
			
			// Cria o objeto evento a ser inserido
			Event event = new Event(name, dateBegin, dateEnd);
			
			// Solicita a fachada que insira o evento
			facade.addEvent(event);
			response.sendRedirect("/SSAAC/success.jsp?msg=Evento%20criado");
		} else {
			response.sendRedirect("/SSAAC/formCadastro.jsp?msg=Parâmetros%20inválidos");
		}
	}

}
