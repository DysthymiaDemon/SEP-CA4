package org.apache.jsp.A3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import HelperClasses.ItemStorageBinHelper;
import EntityManager.ShippingOrderEntity;
import EntityManager.WarehouseEntity;
import java.util.List;

public final class shippingOrderManagement_005fAddLineItem_jsp extends org.apache.jasper.runtime.HttpJspBase
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
                if (shippingOrders == null || id == null) {
                    response.sendRedirect("../ShippingOrderManagement_Servlet");
                } else {
                    ShippingOrderEntity shippingOrder = new ShippingOrderEntity();
                    for (int i = 0; i < shippingOrders.size(); i++) {
                        if (shippingOrders.get(i).getId() == Integer.parseInt(id)) {
                            shippingOrder = shippingOrders.get(i);
                        }
                    }
            
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("                    <!-- Page Heading -->\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <h1 class=\"page-header\">\n");
      out.write("                                Add Line Item\n");
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
      out.write("                                    <i class=\"icon icon-edit\"></i> Add Line Item\n");
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
      out.write(" - Add Line Item </h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <form role=\"form\" action=\"../ShippingOrderLineItemManagement_AddServlet\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>SKU</label>\n");
      out.write("                                            <select required=\"true\" name=\"sku\" class=\"form-control\">\n");
      out.write("                                                ");

                                                    List<ItemStorageBinHelper> listOfItems1 = (List<ItemStorageBinHelper>) session.getAttribute("listOfLineItems");
                                                    if (listOfItems1 != null) {
                                                        for (int i = 0; i < listOfItems1.size(); i++) {
                                                            out.println("<option value='" + listOfItems1.get(i).getSKU() + "'>" + listOfItems1.get(i).getSKU() + "</option>");
                                                        }
                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Quantity</label>\n");
      out.write("                                            <input class=\"form-control\" name=\"quantity\" type=\"number\" min=\"1\" step=\"1\" max=\"9999\" required=\"true\" >\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"submit\" value=\"Add Line Item\" class=\"btn btn-lg btn-primary btn-block\">\n");
      out.write("                                        </div>  \n");
      out.write("                                        <input type=\"hidden\" value=\"");
      out.print(shippingOrder.getId());
      out.write("\" name=\"id\">\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\"> Items in Outbound Bin </h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\" style=\"\">\n");
      out.write("                                    <div class=\"table-responsive\">\n");
      out.write("                                        <div id=\"dataTables-example_wrapper\" class=\"dataTables_wrapper form-inline\" role=\"grid\">\n");
      out.write("                                            <br>\n");
      out.write("                                            <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                                <thead>\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <th>SKU</th>\n");
      out.write("                                                        <th>Item Name</th>\n");
      out.write("                                                        <th>Item Type</th>\n");
      out.write("                                                        <th>Quantity</th>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                </thead>\n");
      out.write("                                                <tbody>\n");
      out.write("                                                    ");

                                                        List<ItemStorageBinHelper> listOfLineItems = (List<ItemStorageBinHelper>) session.getAttribute("listOfLineItems");
                                                        if (listOfLineItems != null) {
                                                            for (ItemStorageBinHelper item : listOfLineItems) {

                                                    
      out.write("\n");
      out.write("                                                    <tr>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            ");
      out.print(item.getSKU());
      out.write("\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            ");
      out.print(item.getItemName());
      out.write("\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            ");
      out.print(item.getItemType());
      out.write("\n");
      out.write("                                                        </td>\n");
      out.write("                                                        <td>\n");
      out.write("                                                            ");
      out.print(item.getItemQty());
      out.write("\n");
      out.write("                                                        </td>\n");
      out.write("                                                    </tr>\n");
      out.write("                                                    ");

                                                            }
                                                        }
                                                    
      out.write("\n");
      out.write("                                                </tbody>\n");
      out.write("                                            </table>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /#page-wrapper -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#container fluid -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("    </body>\n");
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
