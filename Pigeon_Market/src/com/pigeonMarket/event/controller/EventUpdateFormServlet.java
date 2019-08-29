package com.pigeonMarket.event.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pigeonMarket.event.model.service.EventService;
import com.pigeonMarket.event.model.vo.Event;
import com.pigeonMarket.notice.model.service.NoticeService;
import com.pigeonMarket.notice.model.vo.Notice;

/**
 * Servlet implementation class EventUpdateFormServlet
 */
@WebServlet("/updateForm.eo")
public class EventUpdateFormServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EventUpdateFormServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int eventNo = Integer.parseInt(request.getParameter("nno"));
		
		Event event = new EventService().selectEvent(eventNo);
		
		
		
		if(event != null) {
			request.setAttribute("event", event);
			request.getRequestDispatcher("views/event/eventUpdateForm.jsp").forward(request, response);
		} else {
			
			request.getRequestDispatcher("views/common/menubar.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
