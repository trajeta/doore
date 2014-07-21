package com.bit.java54th.softdrink.doore.control;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.bit.java54th.softdrink.doore.dao.CustomerVO;
import com.bit.java54th.softdrink.doore.dao.DAOFactory;
import com.bit.java54th.softdrink.doore.dao.ProductDAO;
import com.bit.java54th.softdrink.doore.dao.ProductVO;

public class SharingCommand implements Command {

	public CommandResult execute(HttpServletRequest request,
			HttpServletResponse response)
			throws javax.servlet.ServletException, java.io.IOException {
		CommandResult commandResult = null;
		String productID = request.getParameter("productid");
		HttpSession session = request.getSession(false);
		CustomerVO customer = (CustomerVO) session.getAttribute("login");
		int idInt = Integer.parseInt(productID);
		System.out.println("productID = " + idInt);
		ProductVO product = findProductByID(idInt);
		request.setAttribute("product", product);
		// 디버깅용
		System.out.println("****************");
		System.out.println("productName : " + product.getProduct_name());
		System.out.println("****************");
		commandResult = new CommandResult("/WEB-INF/view/sharing.jsp");
		return commandResult;
	}

	public ProductVO findProductByID(int productid) {
		DAOFactory mysqlFactory = DAOFactory.getDAOFactory(DAOFactory.MYSQL);
		ProductDAO productDAO = mysqlFactory.getProductDAO();

		return productDAO.findProductByID(productid);
	}

}
