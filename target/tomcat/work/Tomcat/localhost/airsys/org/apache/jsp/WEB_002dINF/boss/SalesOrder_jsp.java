/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2019-11-27 02:40:42 UTC
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

public final class SalesOrder_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <title>Layui</title>\r\n");
      out.write("  <meta name=\"renderer\" content=\"webkit\">\r\n");
      out.write("  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\">\r\n");
      out.write("  <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1\">\r\n");
      out.write("  <link rel=\"stylesheet\" href=\"/airsys/assets/css/bootstrap.css\"  media=\"all\">\r\n");
      out.write("  <!-- 注意：如果你直接复制所有代码到本地，上述css路径需要改成你本地的 -->\r\n");
      out.write("  <script src =\"http://static.runoob.com/assets/jquery-validation-1.14.0/lib/jquery.js\"> </script>\r\n");
      out.write("<script src =\"http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js\"> </script>\r\n");
      out.write("<script src=\"http://static.runoob.com/assets/jquery-validation-1.14.0/dist/localization/messages_zh.js\"></script>\r\n");
      out.write("<script src=\"/airsys/assets/js/echarts.min.js\"></script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("     <table class=\"table table-striped\">\r\n");
      out.write("       <tr>\r\n");
      out.write("      \r\n");
      out.write("       <th>工号</th>\r\n");
      out.write("       <th>姓名</th>\r\n");
      out.write("       <th>营业点ID</th>\r\n");
      out.write("       <th>该营业员的票数</th>\r\n");
      out.write("       <th>操作</th>\r\n");
      out.write("       </tr>\r\n");
      out.write("      ");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("     </table>      \r\n");
      out.write("<div style=\"width: 600px; height: 400px; float: left; margin-top: 7%; margin-left: 10%;\">\r\n");
      out.write("\t\t<div >当月售票量</div>\r\n");
      out.write("\t\t<div id=\"main\" style=\"width: 600px; height: 400px;\"></div>\r\n");
      out.write("</div>\r\n");
      out.write("<script>\r\n");
      out.write("\t\t// 基于准备好的dom，初始化echarts实例\r\n");
      out.write("\t\twindow.onload= function(){\r\n");
      out.write("\t\tvar myChart = echarts.init(document.getElementById('main'));\r\n");
      out.write("\t\twindow.test = null;\r\n");
      out.write("\t\twindow.b = null;\r\n");
      out.write("\t\tvar branchId=$(\".branchId\").html();\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t$.ajax({\r\n");
      out.write("\t\t\turl : \"/airsys/SalesOrderI\",\t\t\t\r\n");
      out.write("\t\t\tdataType : \"json\",\r\n");
      out.write("\t\t\tdata:{\r\n");
      out.write("\t\t\t\tbranchId:branchId\r\n");
      out.write("\t\t\t},\r\n");
      out.write("\t\t\tsuccess : function(e) {\r\n");
      out.write("\t\t\t\tconsole.log(e.x);\r\n");
      out.write("\t\t\t\tconsole.log(e.y);\r\n");
      out.write("\t\t\t\tvar data1 = e.x;\r\n");
      out.write("\t\t\t\tvar data2 = e.y;\r\n");
      out.write("\t\t\t\t// 指定图表的配置项和数据\r\n");
      out.write("\t\t\t\tvar option = {\r\n");
      out.write("\t\t\t\t\tcolor : [ '#97FFFF' ],\r\n");
      out.write("\t\t\t\t\ttooltip : {\r\n");
      out.write("\t\t\t\t\t\ttrigger : 'axis',\r\n");
      out.write("\t\t\t\t\t\taxisPointer : { // 坐标轴指示器，坐标轴触发有效\r\n");
      out.write("\t\t\t\t\t\t\ttype : 'shadow' // 默认为直线，可选为：'line' | 'shadow'\r\n");
      out.write("\t\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\tgrid : {\r\n");
      out.write("\t\t\t\t\t\tleft : '3%',\r\n");
      out.write("\t\t\t\t\t\tright : '4%',\r\n");
      out.write("\t\t\t\t\t\tbottom : '3%',\r\n");
      out.write("\t\t\t\t\t\tcontainLabel : true\r\n");
      out.write("\t\t\t\t\t},\r\n");
      out.write("\t\t\t\t\txAxis : [\r\n");
      out.write("\t\t\t\t\t{\r\n");
      out.write("\t\t\t\t\t\ttype : 'category',\r\n");
      out.write("\t\t\t\t\t    data : data1,\r\n");
      out.write("\t\t\t\t\t\taxisTick : {\r\n");
      out.write("\t\t\t\t\t\t\talignWithLabel : true\r\n");
      out.write("\t\t\t\t\t\t} \r\n");
      out.write("\t\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t\tyAxis : [ {\r\n");
      out.write("\t\t\t\t\t\ttype : 'value'\r\n");
      out.write("\t\t\t\t\t} ],\r\n");
      out.write("\t\t\t\t\tseries : [ {\r\n");
      out.write("\t\t\t\t\t\tname : '直接访问',\r\n");
      out.write("\t\t\t\t\t\ttype : 'bar',\r\n");
      out.write("\t\t\t\t\t\tbarWidth : '60%',\r\n");
      out.write("\t\t\t\t\t\tdata : data2,\r\n");
      out.write("\t\t\t\t\t} ]\r\n");
      out.write("\t\t\t\t};\r\n");
      out.write("\t\t\t\tmyChart.setOption(option);\r\n");
      out.write("\t\t\t\t// 使用刚指定的配置项和数据显示图表。   \r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t})\r\n");
      out.write("\t\t}\t\t\r\n");
      out.write("\t</script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("         var btn=document.querySelector(\".button\"); \r\n");
      out.write("         btn.onclick=function(){\r\n");
      out.write("         var jobId=$(this).parent().parent(\"tr\").children(\".jobId\").html()\r\n");
      out.write("       \r\n");
      out.write("         location.href=\"/airsys/SaleOrder/\"+jobId;\r\n");
      out.write("        \t  \r\n");
      out.write("         }  \r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
    // /WEB-INF/boss/SalesOrder.jsp(32,6) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/WEB-INF/boss/SalesOrder.jsp(32,6) '${sales}'",_el_expressionfactory.createValueExpression(_jspx_page_context.getELContext(),"${sales}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
    // /WEB-INF/boss/SalesOrder.jsp(32,6) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fforEach_005f0.setVar("sale");
    int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
      if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("      <tr>      \r\n");
          out.write("         <td class=\"jobId\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sale.jobId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sale.sName}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td class=\"branchId\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sale.branchId}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${sale.salesOrder}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
          out.write("</td>\r\n");
          out.write("         <td><button class=\"button\">查看售票记录</button></td>\r\n");
          out.write("          \r\n");
          out.write("         </tr>\r\n");
          out.write("      ");
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
