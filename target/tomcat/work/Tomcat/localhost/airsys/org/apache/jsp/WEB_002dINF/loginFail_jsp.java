/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-27 06:49:27 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class loginFail_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<title>登录失败</title>\r\n");
      out.write("</head>\r\n");
      out.write("<style>\r\n");
      out.write(".box{\r\n");
      out.write("\twidth:300px;\r\n");
      out.write("\theight:200px;\r\n");
      out.write("\tposition:absolute;\r\n");
      out.write("\tleft:0;top:0;right:0;bottom:0;\r\n");
      out.write("\tmargin:auto;\r\n");
      out.write("\tborder:1px solid gray;\r\n");
      out.write("}\r\n");
      out.write(".top{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:30px;\r\n");
      out.write("\tline-height:50px;\r\n");
      out.write("\tbackground:blue;\r\n");
      out.write("}\r\n");
      out.write(".bottom{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:170px;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".bottom-con{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\theight:100px;\r\n");
      out.write("\tmargin-top:50px;\r\n");
      out.write("}\r\n");
      out.write("span{\r\n");
      out.write("\tcolor:red;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<script>\r\n");
      out.write("\twindow.onload=function(){\r\n");
      out.write("\t\tvar span=document.querySelector(\"span\")\r\n");
      out.write("\t\tvar num=3\r\n");
      out.write("\t\tfunction reduce(){\r\n");
      out.write("\t\t\tnum--\r\n");
      out.write("\t\t\tspan.innerHTML=num\r\n");
      out.write("\t\t\tspan.style.color=\"red\"\r\n");
      out.write("\t\t\tif(num<=0){\r\n");
      out.write("\t\t\t\twindow.location.href=\"loginView\"\r\n");
      out.write("\t\t\t\tclearInterval(t)\r\n");
      out.write("\t\t\t}\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t\r\n");
      out.write("\t\tvar t=setInterval(reduce,1000)\r\n");
      out.write("\t}\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div class=\"box\">\r\n");
      out.write("\t<div class=\"top\"></div>\r\n");
      out.write("\t<div class=\"bottom\">\r\n");
      out.write("\t\t<div class=\"bottom-con\">\r\n");
      out.write("\t\t\t<h3>登录失败，请重新登录</h3></br>\r\n");
      out.write("\t\t\t<span>3</span>秒后回到主页面</br>\r\n");
      out.write("\t\t\t如果没有跳转，请点击<a href=\"loginView\">这里</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
