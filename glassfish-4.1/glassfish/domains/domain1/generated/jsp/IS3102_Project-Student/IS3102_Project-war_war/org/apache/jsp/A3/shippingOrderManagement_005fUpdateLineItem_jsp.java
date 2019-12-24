package org.apache.jsp.A3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import EntityManager.LineItemEntity;
import EntityManager.ShippingOrderEntity;
import EntityManager.WarehouseEntity;
import java.util.List;

public final class shippingOrderManagement_005fUpdateLineItem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
                String id = request.getParameter("id");
                String lineItemId = request.getParameter("lineItemId");
                if (shippingOrders == null || id == null || lineItemId == null) {
                    response.sendRedirect("../ShippingOrderManagement_Servlet");
                } else {
                    ShippingOrderEntity shippingOrder = new ShippingOrderEntity();
                    for (int i = 0; i < shippingOrders.size(); i++) {
                        if (shippingOrders.get(i).getId() == Integer.parseInt(id)) {
                            shippingOrder = shippingOrders.get(i);
                        }
                    }
                    List<LineItemEntity> lineItems = shippingOrder.getLineItems();
                    LineItemEntity lineItem = new LineItemEntity();
                    for (int i = 0; i < lineItems.size(); i++) {
                        if (lineItems.get(i).getId() == Integer.parseInt(lineItemId)) {
                            lineItem = lineItems.get(i);
                        }
                    }
            
      out.write("            \n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <!-- Page Heading -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <h1 class=\"page-header\">\n");
      out.write("                                Update Line Item\n");
      out.write("                            </h1>\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li>\n");
      out.write("                                    <i class=\"icon icon-exchange\"></i> <a href=\"shippingOrderManagement.jsp\">Shipping Order Management</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li>\n");
      out.write("                                    <i class=\"icon icon-exchange\"></i> <a href=\"shippingOrderManagement_Update.jsp?id=");
      out.print(shippingOrder.getId());
      out.write("\">Shipping Order ID: ");
      out.print(shippingOrder.getId());
      out.write("</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <i class=\"icon icon-edit\"></i> Update Line Item\n");
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
      out.write("                                    <h3 class=\"panel-title\"> Shipping Order ID: ");
      out.print(shippingOrder.getId());
      out.write(" - Update Line Item ID: ");
      out.print(lineItem.getId());
      out.write(" </h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <form role=\"form\" action=\"../ShippingOrderLineItemManagement_UpdateServlet\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>SKU</label>\n");
      out.write("                                            <input class=\"form-control\" name=\"sku\" type=\"text\"  value=\"");
      out.print(lineItem.getItem().getSKU());
      out.write("\" disabled/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Quantity</label>\n");
      out.write("                                            <input class=\"form-control\" name=\"quantity\" type=\"number\" required=\"true\"  min=\"1\" max=\"9999\" step=\"1\" value=\"");
      out.print(lineItem.getQuantity());
      out.write("\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"submit\" value=\"Update Line Item\" class=\"btn btn-lg btn-primary btn-block\">\n");
      out.write("                                        </div>  \n");
      out.write("                                        <input type=\"hidden\" value=\"");
      out.print(shippingOrder.getId());
      out.write("\" name=\"id\">\n");
      out.write("                                        <input type=\"hidden\" value=\"");
      out.print(lineItem.getId());
      out.write("\" name=\"lineitemId\">\n");
      out.write("                                        <input type=\"hidden\" value=\"");
      out.print(lineItem.getItem().getSKU());
      out.write("\" name=\"sku\">                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>                              \n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /#page-wrapper -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#container fluid -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("    </body>\n");
      out.write("\n");
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
