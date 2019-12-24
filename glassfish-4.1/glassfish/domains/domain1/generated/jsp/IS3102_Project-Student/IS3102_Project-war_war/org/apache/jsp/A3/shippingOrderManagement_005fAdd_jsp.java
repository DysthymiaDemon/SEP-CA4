package org.apache.jsp.A3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import EntityManager.ShippingOrderEntity;
import EntityManager.WarehouseEntity;
import java.util.List;

public final class shippingOrderManagement_005fAdd_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header2.html", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../menu1.jsp", out, false);
      out.write("\n");
      out.write("            ");
 List<ShippingOrderEntity> shippingOrders = (List<ShippingOrderEntity>) (session.getAttribute("shippingOrders"));
                if (shippingOrders == null) {
                    response.sendRedirect("../ShippingOrderManagement_Servlet");
                } else {
                    List<WarehouseEntity> warehouses = (List<WarehouseEntity>) (session.getAttribute("warehouses"));
                    List<WarehouseEntity> warehouses1 = (List<WarehouseEntity>) (session.getAttribute("warehouse1"));
            
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <!-- Page Heading -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <h1 class=\"page-header\">\n");
      out.write("                                Create Shipping Order\n");
      out.write("                            </h1>\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li>\n");
      out.write("                                    <i class=\"icon icon-exchange\"></i> <a href=\"shippingOrderManagement.jsp\">Shipping Order Management</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <i class=\"icon icon-edit\"></i> Add Shipping Order\n");
      out.write("                                </li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../displayMessage.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\"> Shipping Order</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <form id=\"myForm\" role=\"form\" action=\"../ShippingOrderManagement_AddServlet\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Source</label>\n");
      out.write("                                            <select class=\"form-control\" id=\"select_source\" name=\"source\" required=\"true\">\n");
      out.write("                                                ");

                                                    for (int i = 0; i < warehouses.size(); i++) {
                                                        out.println("<option value='" + warehouses.get(i).getId() + "'>" + warehouses.get(i).getWarehouseName() + "</option>");
                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Destination</label>\n");
      out.write("                                            <select class=\"form-control\" id=\"select_destination\" name=\"destination\" required=\"true\">\n");
      out.write("                                                ");

                                                    for (int i = 0; i < warehouses1.size(); i++) {
                                                        out.println("<option value='" + warehouses1.get(i).getId() + "'>" + warehouses1.get(i).getWarehouseName() + "</option>");
                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Expected Receiving Date:</label>\n");
      out.write("                                            <input class=\"form-control\" name=\"expectedDate\" type=\"date\" required=\"true\"/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"submit\" value=\"Create Shipping Order\" class=\"btn btn-lg btn-primary btn-block\">\n");
      out.write("                                        </div>  \n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        $(\"#myForm\").submit(function (e) {\n");
      out.write("            var source = $(\"#select_source\").find(\":selected\").text();\n");
      out.write("            var destination = $(\"#select_destination\").find(\":selected\").text();\n");
      out.write("            if (source === destination) {\n");
      out.write("                alert(\"Source warehouse should not be the same as destination warehouse.\");\n");
      out.write("                e.preventDefault();\n");
      out.write("            }\n");
      out.write("            else\n");
      out.write("                return true;\n");
      out.write("        });\n");
      out.write("    </script>\n");
      out.write("    <script>\n");
      out.write("        var today = new Date().toISOString().split('T')[0];\n");
      out.write("        document.getElementsByName(\"expectedDate\")[0].setAttribute('min', today);\n");
      out.write("    </script>\n");
      out.write("</html>\n");
}
      out.write('\n');
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
