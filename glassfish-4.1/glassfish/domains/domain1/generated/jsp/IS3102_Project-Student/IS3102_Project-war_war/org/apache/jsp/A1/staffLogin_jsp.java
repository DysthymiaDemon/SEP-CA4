package org.apache.jsp.A1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import java.util.List;

public final class staffLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      response.setHeader("X-Powered-By", "JSP/2.3");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<!--[if IE 8]>\t\t\t<html class=\"ie ie8\"> <![endif]-->\n");
      out.write("<!--[if IE 9]>\t\t\t<html class=\"ie ie9\"> <![endif]-->\n");
      out.write("<!--[if gt IE 9]><!-->\t\n");
      out.write("<html> <!--<![endif]-->\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header1.html", out, false);
      out.write("\n");
      out.write("    <body class=\"dark\">\n");
      out.write("\n");
      out.write("        <div role=\"main\" class=\"main\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"header-container\">\n");
      out.write("                    <div class=\"row\" style=\"background-color : rgb(153, 0, 0);\">\n");
      out.write("                        <div class=\"col-md-4 col-md-offset-4\">  \n");
      out.write("                            <img class=\"center-block img-responsive\"  src=\"../img/logo-label.png\" style=\"margin-top: 20px; margin-bottom: 20px;\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"col-md-4 col-md-offset-4\">  \n");
      out.write("                    <div class=\"featured-box featured-boxes.login\" style=\"height: auto;margin-top: 80px;\">\n");
      out.write("                        <div class=\"panel-heading\"> \n");
      out.write("                            <i class=\"icon-4x icon icon-unlock-alt\"  style=\"margin-top: 10px;\"></i><h6 class=\"panel-title\">Sign In</h6>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../displayMessageLong.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("                            <form role=\"form\" name=\"LoginForm\" action=\"../AccountManagement_LoginServlet\">\n");
      out.write("\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <label>E-mail Address</label>\n");
      out.write("                                            <input type=\"email\" name=\"email\" id=\"email\" class=\"form-control input-lg\" required=\"true\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"form-group\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <label>Password</label>\n");
      out.write("                                            <input type=\"password\" name=\"password\" id=\"password\" class=\"form-control input-lg\" required=\"true\">\n");
      out.write("                                            <a class=\"pull-right\" href=\"staffForgetPassword.jsp\">(Lost Password?)</a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input type=\"submit\" value=\"Login\" class=\"btn btn-lg btn-primary btn-block\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
