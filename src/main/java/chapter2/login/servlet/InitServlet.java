package chapter2.login.servlet;

import chapter2.login.domain.User;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


/**
 * 用户注册的初始化的Servlet
 */
@WebServlet(loadOnStartup = 2)
public class InitServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		// 创建一个List集合用于保存用户注册的信息:
		List<User> list = new ArrayList<User>();
		// 将list保存到ServletContext作用域中:
		this.getServletContext().setAttribute("list", list);
	}
}
