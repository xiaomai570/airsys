/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-12-01 05:30:36 UTC
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

public final class statuslogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>登录窗口</title>\n");
      out.write("<link rel=\"stylesheet\"\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/npm/bootstrap@3.3.7/dist/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("\twindow.onload=function(){\n");
      out.write("\t\tvar inp=document.getElementsByTagName(\"input\");\n");
      out.write("\t\tfor(var i=0;i<inp.length;i++){\n");
      out.write("\t\t\tinp[i].onclick=function(){ //ie的BUG\n");
      out.write("\t\t\t\tif (this.value == '4') {\n");
      out.write("\t\t            $(\".select\").css({\"display\":\"block\"});\n");
      out.write("\t\t        }else{\n");
      out.write("\t\t        \t$(\".select\").css({\"display\":\"none\"});\n");
      out.write("\t\t        }\n");
      out.write("\t\t\t}\n");
      out.write("\t\t}\n");
      out.write("\t}\n");
      out.write("</script>\n");
      out.write("<body\n");
      out.write("\tstyle=\"background-image: url('/airsys/assets/img/xv.jpg'); background-size: 100%, 100%; background-repeat: no-repeat\">\n");
      out.write("\t<div style=\"width: 25%; height: 100%; margin-top: 8%; margin-left: 6%;\">\n");
      out.write("\t\t<img src=\"/airsys/assets/img/logo.jpg\"\n");
      out.write("\t\t\tstyle=\"width: 35%; margin-left: 33%; margin-bottom: 10%;\">\n");
      out.write("\t\t<form action=\"/airsys/decide\" method=\"post\">\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"exampleInputEmail1\" font=\"color:#876ED7;\">网点账号</label> <input\n");
      out.write("\t\t\t\t\tname=\"bname\" type=\"text\" class=\"form-control\"\n");
      out.write("\t\t\t\t\tid=\"exampleInputEmail1\" placeholder=\"账号输入：\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"exampleInputPassword1\" font=\"color:#876ED7;\">密码</label>\n");
      out.write("\t\t\t\t<input name=\"bpassword\" type=\"password\" class=\"form-control\"\n");
      out.write("\t\t\t\t\tid=\"exampleInputPassword1\" placeholder=\"密码\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<div class=\"form-group\">\n");
      out.write("\t\t\t\t<label for=\"pwd\">身份选择</label><br> 管理员:<input type='radio'\n");
      out.write("\t\t\t\t\tclass=\"status\" name=\"status\" value=\"1\" checked='checked'>&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t老板:<input type='radio' class=\"status\" name=\"status\" value=\"2\">&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t营业员:<input type='radio' class=\"status\" name=\"status\" value=\"3\">&nbsp;&nbsp;&nbsp;\n");
      out.write("\t\t\t\t网点经理:<input type='radio' class=\"status\" name=\"status\" value=\"4\">\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<select name=\"branchId\"\n");
      out.write("\t\t\t\tstyle=\"height: 30px; border-radius: 5%; margin-top: 1%; display: none;\"\n");
      out.write("\t\t\t\tclass=\"select\">\n");
      out.write("\t\t\t\t<option>营业网店选择</option>\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\t\t\t</select>\n");
      out.write("\t\t\t<button type=\"submit\" class=\"btn btn-default\"\n");
      out.write("\t\t\t\tstyle=\"margin-left: 40%;\">登录</button>\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"/airsys/assets/jquery-validation-1.14.0/lib/jquery.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"/airsys/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\"\n");
      out.write("\t\tsrc=\"/airsys/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js\"></script>\n");
      out.write("</body>\n");
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
    // /WEB-INF/statuslogin.jsp(54,4) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/statuslogin.jsp(54,4) '${mv}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${mv}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/statuslogin.jsp(54,4) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("sale");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("\t\t\t\t\t<option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sale.branch_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sale.branch_id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</option>\n");
          out.write("\t\t\t\t");
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
