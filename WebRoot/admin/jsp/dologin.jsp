<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%
	String userNameAdmin = request.getParameter("username");
	String passwordAdmin = request.getParameter("password");
	
	if("admin".equals(userNameAdmin) && "admin".equals(passwordAdmin)) {
		request.getSession().setAttribute("userNameAdmin", userNameAdmin);
		response.sendRedirect("/SmartgenPlatform/admin/jsp/user.jsp");
	} else {
		response.sendRedirect("/SmartgenPlatform/admin_login/login.jsp");
	}
%>