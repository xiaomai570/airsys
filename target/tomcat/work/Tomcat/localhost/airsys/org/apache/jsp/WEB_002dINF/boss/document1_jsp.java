/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-27 01:20:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.boss;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.io.*;
import java.util.*;
import java.sql.*;
import javax.servlet.http.*;
import javax.servlet.*;

public final class document1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta name=\"viewport\"\r\n");
      out.write("          content=\"width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\r\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"/airsys/assets/css/bootstrap.css\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("    <style>\r\n");
      out.write("        .title{\r\n");
      out.write("            height: 60px;\r\n");
      out.write("            background: rgba(238,242,255,0.74);\r\n");
      out.write("        }\r\n");
      out.write("        .title1{\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 30px;\r\n");
      out.write("            font-size: 30px;\r\n");
      out.write("            margin-top: 5px;\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .title2{\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 15px;\r\n");
      out.write("            margin-top: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .progress{\r\n");
      out.write("            width: 60%;\r\n");
      out.write("            float: left;\r\n");
      out.write("            margin-left: 30px;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        .title3{\r\n");
      out.write("            float:right;\r\n");
      out.write("            margin-right: 10px;\r\n");
      out.write("            margin-left: 20px;\r\n");
      out.write("            margin-top: 15px;\r\n");
      out.write("        }\r\n");
      out.write("        .bottom{\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 500px;\r\n");
      out.write("\r\n");
      out.write("            float: left;\r\n");
      out.write("        }\r\n");
      out.write("        .bottom1{\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 100%;\r\n");
      out.write("            height: 50px;\r\n");
      out.write("            border-bottom: 1px solid black;\r\n");
      out.write("        }\r\n");
      out.write("        .left1{\r\n");
      out.write("            float: left;\r\n");
      out.write("            font-size: 25px;\r\n");
      out.write("            margin-left: 30px;\r\n");
      out.write("            margin-top: 10px;\r\n");
      out.write("\r\n");
      out.write("           width: 180px;\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        }\r\n");
      out.write("        .content1{\r\n");
      out.write("            float: left;\r\n");
      out.write("            width: 40%;\r\n");
      out.write("            height: 25px;\r\n");
      out.write("            margin-left: 150px;\r\n");
      out.write("            margin-top: 20px;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            font-size: 15px;\r\n");
      out.write("        }\r\n");
      out.write("       .right1{\r\n");
      out.write("        float: right;\r\n");
      out.write("           margin-right: 50px;\r\n");
      out.write("           margin-top: 20px;\r\n");
      out.write("           font-size: 15px;\r\n");
      out.write("       }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("        <div class=\"title1\">我的信息</div>\r\n");
      out.write("        <div class=\"title2\">资料完善度</div>\r\n");
      out.write("        <div class=\"progress\">\r\n");
      out.write("            <div class=\"progress-bar progress-bar-warning\" role=\"progressbar\" aria-valuenow=\"60\" aria-valuemin=\"0\" aria-valuemax=\"100\" style=\"width: 60%\">\r\n");
      out.write("                <span class=\"sr-only\">60% Complete (warning)</span>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("         <div class=\"title3\">预览我的主页</div>\r\n");
      out.write("        <div class=\"title4\"></div>\r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    </div>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fforEach_005f0.setParent(null);
    // /WEB-INF/boss/document1.jsp(97,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/boss/document1.jsp(97,4) '${users}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${users}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/boss/document1.jsp(97,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("user");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <div class=\"bottom\">\r\n");
          out.write("    \r\n");
          out.write("        <div class=\"bottom1\">\r\n");
          out.write("            <div class=\"left1\">登录账号</div>\r\n");
          out.write("            <div class=\"content1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.bossNumber}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("            <div class=\"right1\">\r\n");
          out.write("                <a href=\"/airsys/xiupassword1\">修改密码</a>\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("        <div class=\"bottom1\">\r\n");
          out.write("            <div class=\"left1\">姓名</div>\r\n");
          out.write("            <div class=\"content1\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${user.bName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</div>\r\n");
          out.write("            <div class=\"right1\">\r\n");
          out.write("\r\n");
          out.write("            </div>\r\n");
          out.write("        </div>\r\n");
          out.write("       \r\n");
          out.write("       \r\n");
          out.write("     ");
          int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fforEach_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
    }
    return false;
  }
}
