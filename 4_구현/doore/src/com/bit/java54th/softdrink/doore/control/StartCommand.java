package com.bit.java54th.softdrink.doore.control;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class StartCommand implements Command {

	public CommandResult execute(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		CommandResult commandResult = null;
		HttpSession session = request.getSession(false);
		session.setAttribute("login", 1);
		commandResult = new CommandResult("/WEB-INF/view/start.jsp");
		return commandResult;
	}


}