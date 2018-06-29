package sp.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class ExpertFilter implements Filter {
	FilterConfig config;

	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println(11);
	}

	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println(22);
		HttpServletRequest request = (HttpServletRequest) arg0;
		HttpServletResponse response = (HttpServletResponse) arg1;
		String a = request.getRequestURI();
		/*
		 * if (a.contains(".css") || a.contains(".js") || a.contains(".png") ||
		 * a.contains(".jpg")) { // 如果发现是css或者js文件，直接放行 arg2.doFilter(arg0,
		 * arg1); } else {
		 */
		String encoding = config.getInitParameter("encoding");
		if (null == encoding) {
			request.setCharacterEncoding("UTF-8");
		} else {
			request.setCharacterEncoding(encoding);
		}
		Integer Expert_jobNumber = (Integer) request.getSession().getAttribute("Expert_jobNumber");

		String exceptPage = config.getInitParameter("exceptPage");
		if (null != exceptPage && !"".equals(exceptPage.trim())) {
			String[] exceptPages = exceptPage.split(";");
			for (String except : exceptPages) {
				if (request.getRequestURI().indexOf(except) != -1) {
					arg2.doFilter(arg0, arg1);
					return;
				}

			}
		}
		System.out.println(33);
		if (null != Expert_jobNumber) {
			arg2.doFilter(arg0, arg1);
		} else {
			response.sendRedirect(request.getContextPath() + "/login.html");
		}
	}

	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(44);
		this.config = arg0;
	}
}