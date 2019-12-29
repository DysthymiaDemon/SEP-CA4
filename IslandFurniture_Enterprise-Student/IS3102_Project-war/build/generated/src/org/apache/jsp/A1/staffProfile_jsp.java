package org.apache.jsp.A1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import EntityManager.RoleEntity;
import java.util.List;
import EntityManager.StaffEntity;

public final class staffProfile_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header2.html", out, false);
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        <div id=\"wrapper\">\r\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../menu1.jsp", out, false);
      out.write("\r\n");
      out.write("            <div id=\"page-wrapper\">\r\n");
      out.write("                <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Page Heading -->\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-12\">\r\n");
      out.write("                            <h1 class=\"page-header\">\r\n");
      out.write("                                User Profile\r\n");
      out.write("                            </h1>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <!-- /.row -->\r\n");
      out.write("\r\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../displayMessage.jsp", out, false);
      out.write("\r\n");
      out.write("                    ");

                        try {
                            StaffEntity staffEntity = (StaffEntity) session.getAttribute("staffEntity");
                    
      out.write("\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-6\">\r\n");
      out.write("                            <div class=\"tabs\">\r\n");
      out.write("                                <ul class=\"nav nav-tabs\">\r\n");
      out.write("                                    <li class=\"active\">\r\n");
      out.write("                                        <a href=\"#overview\" data-toggle=\"tab\"><i class=\"icon icon-user\"></i> Overview</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                    <li>\r\n");
      out.write("                                        <a href=\"#roles\" data-toggle=\"tab\">Roles</a>\r\n");
      out.write("                                    </li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                                <div class=\"tab-content\">\r\n");
      out.write("                                    <div id=\"overview\" class=\"tab-pane active\">\r\n");
      out.write("                                        <form role=\"form\" action=\"../StaffManagement_UpdateStaffServlet\" onsubmit=\"return validatePassword()\">\r\n");
      out.write("                                            <h4>Personal Information</h4>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Identification No</label>\r\n");
      out.write("                                                <input class=\"form-control\" required=\"true\" name=\"identificationNo\" type=\"text\" value=\"");
      out.print(staffEntity.getIdentificationNo());
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Name</label>\r\n");
      out.write("                                                <input class=\"form-control\" required=\"true\" name=\"name\" type=\"text\" value=\"");
      out.print(staffEntity.getName());
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>E-mail Address</label>\r\n");
      out.write("                                                <input class=\"form-control\" required=\"true\" value=\"");
      out.print(staffEntity.getEmail());
      out.write("\" disabled/>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Set Challenge Question</label>\r\n");
      out.write("                                                <select name=\"securityQuestion\">\r\n");
      out.write("                                                    ");
int securityQn = 0;
                                                        if (staffEntity.getSecurityQuestion() == null) {
                                                            securityQn = 0;
                                                        } else {
                                                            securityQn = staffEntity.getSecurityQuestion();
                                                        }
      out.write("\r\n");
      out.write("                                                    <option value=\"1\" ");
if (securityQn == 1) {
                                                            out.println("selected");
                                                        }
      out.write(">What is your mother's maiden name?</option>\r\n");
      out.write("                                                    <option value=\"2\" ");
if (securityQn == 2) {
                                                            out.println("selected");
                                                        }
      out.write(">What is your first pet's name?</option>\r\n");
      out.write("                                                    <option value=\"3\" ");
if (securityQn == 3) {
                                                            out.println("selected");
                                                        }
      out.write(">What is your favourite animal?</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                                        <input class=\"form-control\" type=\"text\" required=\"true\" name=\"securityAnswer\" value=\"");
if (staffEntity.getSecurityAnswer() == null || staffEntity.getSecurityAnswer().equals("null")) {
                                                        out.println("");
                                                    } else {
                                                        out.println(staffEntity.getSecurityAnswer());
                                                    }
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Phone</label>\r\n");
      out.write("                                                <input class=\"form-control\" required=\"true\" type=\"text\" name=\"phone\" value=\"");
      out.print(staffEntity.getPhone());
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Address</label>\r\n");
      out.write("                                                <input class=\"form-control\" type=\"text\" required=\"true\" name=\"address\" value=\"");
      out.print(staffEntity.getAddress());
      out.write("\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <hr class=\"more-spaced \"/>\r\n");
      out.write("                                            <h4>Change Password</h4>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>New Password (leave blank unless setting a new password).</label>\r\n");
      out.write("                                                <input class=\"form-control\" type=\"password\" name=\"password\" id=\"password\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <label>Re-enter New Password</label>\r\n");
      out.write("                                                <input class=\"form-control\" type=\"password\"  name=\"repassword\" id=\"repassword\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("\r\n");
      out.write("                                            <div class=\"panel-footer\" style=\"padding-bottom: 0px;\">\r\n");
      out.write("                                                <div class=\"row\">\r\n");
      out.write("                                                    <div class=\"form-group\">\r\n");
      out.write("                                                        <input type=\"submit\" value=\"Submit\" class=\"btn btn-primary\"/>\r\n");
      out.write("                                                        <input type=\"reset\" value=\"Reset\" class=\"btn btn-primary\"/>\r\n");
      out.write("                                                    </div>\r\n");
      out.write("                                                    <input type=\"hidden\" value=\"");
      out.print(staffEntity.getId());
      out.write("\" name=\"id\">\r\n");
      out.write("                                                    <input type=\"hidden\" value=\"A1/staffProfile.jsp\" name=\"source\"/>\r\n");
      out.write("                                                    <input type=\"hidden\" value=\"");
      out.print(staffEntity.getEmail());
      out.write("\" name=\"email\"/>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </form>\r\n");
      out.write("\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div id=\"roles\" class=\"tab-pane\">\r\n");
      out.write("                                        <h4>Position held in Island Furniture</h4>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            ");

                                                List<RoleEntity> roles = staffEntity.getRoles();
                                                for (int i = 0; i < roles.size(); i++) {
                                                    out.println("<li>" + roles.get(i).getName() + "</li>");
                                                }
                                            
      out.write("\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("                <!-- /#page-wrapper -->\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- /#wrapper -->\r\n");
      out.write("\r\n");
      out.write("            ");
                } catch (Exception ex) {
                    response.sendRedirect("../StaffManagement_StaffServlet");
                    ex.printStackTrace();
                }
      out.write("\r\n");
      out.write("            <script>\r\n");
      out.write("                function validatePassword() {\r\n");
      out.write("                    var password = document.getElementById(\"password\").value;\r\n");
      out.write("                    var repassword = document.getElementById(\"repassword\").value;\r\n");
      out.write("                    var ok = true;\r\n");
      out.write("                    if ((password != null && repassword != null) || (password != \"\" && repassword != \"\")) {\r\n");
      out.write("                        if (password != repassword) {\r\n");
      out.write("                            //alert(\"Passwords Do not match\");\r\n");
      out.write("                            document.getElementById(\"password\").style.borderColor = \"#E34234\";\r\n");
      out.write("                            document.getElementById(\"repassword\").style.borderColor = \"#E34234\";\r\n");
      out.write("                            alert(\"Passwords do not match. Please key again.\");\r\n");
      out.write("                            ok = false;\r\n");
      out.write("                        }\r\n");
      out.write("                    } else {\r\n");
      out.write("                        return ok;\r\n");
      out.write("                    }\r\n");
      out.write("                    return ok;\r\n");
      out.write("                }\r\n");
      out.write("            </script>\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("</html>\r\n");
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
