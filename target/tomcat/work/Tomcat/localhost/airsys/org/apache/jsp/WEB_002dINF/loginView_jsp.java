/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-30 08:59:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginView_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write('\r');
      out.write('\n');

request.setCharacterEncoding("utf-8");

      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<script src=\"http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js\"></script>\r\n");
      out.write("<script src=\"http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js\"></script>\r\n");
      out.write("<script src=\"assets/js/loginView.js\"></script>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/loginView.css\">\r\n");
      out.write("\r\n");
      out.write("<title>登录界面</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-image: url('/airsys/assets/img/xv.jpg'); background-size: 100%, 100%; background-repeat: no-repeat\">\r\n");
      out.write("\t<div>\r\n");
      out.write("\t\t<div class=\"a\">\r\n");
      out.write("\t\t\t<form action=\"clogin\" class=\"form\" method=\"post\">\r\n");
      out.write("\t\t\t\t<label class=\"l1\">用户名</label>\r\n");
      out.write("\t\t\t\t<input type=\"text\" name=\"c_number\" blaceholder=\"请设置用户名\" class=\"c_number\" autocomplete=\"off\"><br>\r\n");
      out.write("\t\t\t\t<label class=\"l2\">密码</label>\r\n");
      out.write("\t\t\t\t<input type=\"password\" name=\"c_password\" blaceholder=\"请输入密码\" class=\"c_password\"><br>\r\n");
      out.write("\t\t\t\t<input type=\"submit\" class=\"yes\" value=\"登录\">\r\n");
      out.write("\t\t\t\t<input type=\"button\" class=\"no\" value=\"取消\" onclick=\"window.location.href='index.jsp'\">\r\n");
      out.write("\t\t\t</form>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
