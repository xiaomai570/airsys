/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-30 09:13:51 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.*;
import controller.*;
import entity.*;
import service.*;
import dao.*;

public final class ticketorder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("<title>TicketOrder</title>\r\n");
      out.write("<link rel=\"stylesheet\" href=\"/airsys/assets/css/airsys.css\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<h3 align=\"center\">订票记录查询</h3>\r\n");
      out.write("\t<hr color=\"#ccc\" size=\"5px\">\r\n");
      out.write("\t<center>\r\n");
      out.write("\t\t<table>\r\n");
      out.write("\t\t\t<tr>\r\n");
      out.write("\t\t\t\t<th>航班编号</th>\r\n");
      out.write("\t\t\t\t<th>乘客姓名</th>\r\n");
      out.write("\t\t\t\t<th>证件号码</th>\r\n");
      out.write("\t\t\t\t<th>出票日期</th>\r\n");
      out.write("\t\t\t\t<th>舱位等级</th>\r\n");
      out.write("\t\t\t\t<th>营业网点编号</th>\r\n");
      out.write("\t\t\t\t<th>营业员编号</th>\r\n");
      out.write("\t\t\t\t<th>操作</th>\r\n");
      out.write("\t\t\t</tr>\r\n");
      out.write("\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t</table>\r\n");
      out.write("\t\t<form action=\"/airsys/updateticketorder\" method=\"post\" name=\"form\"\r\n");
      out.write("\t\t\tclass=\"updateticketorder\">\r\n");
      out.write("\t\t\t<h3 style=\"margin-bottom: 20px;\">Ticket Order信息修改</h3>\r\n");
      out.write("\t\t\t<input type=\"hidden\" class=\"id\" name=\"id\">\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"uname\">航班编号</label> <br><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"flight_number\" name=\"flight_number\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"num\">乘客姓名</label> <br><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"passenger_name\" name=\"passenger_name\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"num\">证件号码</label> <br><input type=\"text\"\r\n");
      out.write("\t\t\t\t\tclass=\"certification_number\" name=\"certification_number\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"num\">出票日期</label> <br><input type=\"date\" class=\"order_date\"\r\n");
      out.write("\t\t\t\t\tname=\"order_date\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"num\">舱位等级</label> <br><input type=\"text\" class=\"grade\"\r\n");
      out.write("\t\t\t\t\tname=\"grade\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"num\">营业网点编号</label> <br><input type=\"text\" class=\"branch_id\"\r\n");
      out.write("\t\t\t\t\tname=\"branch_id\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"form-group\">\r\n");
      out.write("\t\t\t\t<label for=\"num\">营业员编号</label> <br><input type=\"text\" class=\"sales_id\"\r\n");
      out.write("\t\t\t\t\tname=\"sales_id\">\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn\" style=\"margin-left: 30px;\">提交</button>\r\n");
      out.write("\t\t\t<button type=\"button\" class=\"btn1\" style=\"margin-right: 30px;\" onclick=\"goback()\">返回</button>\r\n");
      out.write("\t\t</form>\r\n");
      out.write("\t</center>\r\n");
      out.write("\t<script type=\"text/javascript\" src=\"/airsys/assets/js/airsys.js/\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/airsys/assets/jquery-validation-1.14.0/lib/jquery.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/airsys/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js\"></script>\r\n");
      out.write("\t<script type=\"text/javascript\"\r\n");
      out.write("\t\tsrc=\"/airsys/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
    // /WEB-INF/ticketorder.jsp(27,3) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/ticketorder.jsp(27,3) '${ticketorders}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${ticketorders}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/ticketorder.jsp(27,3) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("ticketorder");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t\t<tr>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.flight_number}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.passenger_name}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.certification_number}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.order_date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.grade}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.branch_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.sales_id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("\t\t\t\t\t<td><a href=\"#\" onclick=\"deleteticketorder(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\">删除</a>\r\n");
          out.write("\t\t\t\t\t\t<a href=\"#\" onclick=\"updateticketorder(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ticketorder}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write(")\">修改</a></td>\r\n");
          out.write("\t\t\t\t</tr>\r\n");
          out.write("\t\t\t");
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
