package org.apache.jsp.A3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import EntityManager.LineItemEntity;
import EntityManager.ShippingOrderEntity;
import EntityManager.WarehouseEntity;
import java.util.List;

public final class shippingOrderManagement_005fUpdate_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header2.html", out, false);
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function addSOLineItem(id) {//gogo\n");
      out.write("                var originId = $(\"#select_source\").val();\n");
      out.write("                shippingOrderManagement.originId.value = originId;\n");
      out.write("\n");
      out.write("                shippingOrderManagement.id.value = id;\n");
      out.write("                document.shippingOrderManagement.action = \"../ShippingOrderLineItemManagement_DisplayOutboundBinServlet\";\n");
      out.write("                document.shippingOrderManagement.submit();\n");
      out.write("            }\n");
      out.write("            function updateSOLineItem(lineItemId) {\n");
      out.write("                shippingOrderManagement.lineItemId.value = lineItemId;\n");
      out.write("                document.shippingOrderManagement.action = \"shippingOrderManagement_UpdateLineItem.jsp\";\n");
      out.write("                document.shippingOrderManagement.submit();\n");
      out.write("            }\n");
      out.write("            function submitSOLineItem() {\n");
      out.write("                window.event.returnValue = true;\n");
      out.write("                document.shippingOrderManagement_status.action = \"../ShippingOrderLineItemManagement_UpdateServlet\";\n");
      out.write("                document.shippingOrderManagement_status.submit();\n");
      out.write("            }\n");
      out.write("            function removeSOLineItem() {\n");
      out.write("                checkboxes = document.getElementsByName('delete');\n");
      out.write("                var numOfTicks = 0;\n");
      out.write("                for (var i = 0, n = checkboxes.length; i < n; i++) {\n");
      out.write("                    if (checkboxes[i].checked) {\n");
      out.write("                        numOfTicks++;\n");
      out.write("                    }\n");
      out.write("                }\n");
      out.write("                window.event.returnValue = true;\n");
      out.write("                document.shippingOrderManagement.action = \"../ShippingOrderLineItemManagement_RemoveServlet\";\n");
      out.write("                document.shippingOrderManagement.submit();\n");
      out.write("            }\n");
      out.write("            function checkAll(source) {\n");
      out.write("                checkboxes = document.getElementsByName('delete');\n");
      out.write("                for (var i = 0, n = checkboxes.length; i < n; i++) {\n");
      out.write("                    checkboxes[i].checked = source.checked;\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        </script>\n");
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
                    List<WarehouseEntity> warehouses = (List<WarehouseEntity>) (session.getAttribute("warehouses"));
                    List<WarehouseEntity> warehouses1 = (List<WarehouseEntity>) (session.getAttribute("warehouse1"));

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
      out.write("                                Shipping Order\n");
      out.write("                            </h1>\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li>\n");
      out.write("                                    <i class=\"icon icon-exchange\"></i> <a href=\"../ShippingOrderManagement_Servlet\">Shipping Order Management</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <i class=\"icon icon-edit\"></i> Shipping Order - Update\n");
      out.write("                                </li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("\n");
      out.write("                    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../displayMessageLong.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\"> Shipping Order ID: ");
      out.print(shippingOrder.getId());
      out.write("</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("\n");
      out.write("                                    <form role=\"form\" id=\"myForm\" action=\"../ShippingOrderManagement_UpdateServlet\">\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Origin</label>\n");
      out.write("                                            <select class=\"form-control\" id=\"select_source\" name=\"origin\" required=\"true\" ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(">\n");
      out.write("                                                ");

                                                    for (int i = 0; i < warehouses.size(); i++) {
                                                        if (warehouses.get(i).getWarehouseName().equals(shippingOrder.getOrigin().getWarehouseName())) {
                                                            out.println("<option selected value='" + warehouses.get(i).getId() + "'>" + warehouses.get(i).getWarehouseName() + "</option>");
                                                        } else {
                                                            out.println("<option value='" + warehouses.get(i).getId() + "'>" + warehouses.get(i).getWarehouseName() + "</option>");
                                                        }
                                                    }

                                                    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
                                                    String formatedDate = df.format(shippingOrder.getExpectedReceivedDate());
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Destination</label>\n");
      out.write("                                            <select class=\"form-control\" name=\"destination\" id=\"select_destination\" required=\"true\" ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(">\n");
      out.write("                                                ");

                                                    for (int i = 0; i < warehouses1.size(); i++) {
                                                        if (warehouses1.get(i).getWarehouseName().equals(shippingOrder.getDestination().getWarehouseName())) {
                                                            out.println("<option selected value='" + warehouses1.get(i).getId() + "'>" + warehouses1.get(i).getWarehouseName() + "</option>");
                                                        } else {
                                                            out.println("<option value='" + warehouses1.get(i).getId() + "'>" + warehouses1.get(i).getWarehouseName() + "</option>");
                                                        }
                                                    }

                                                    df = new SimpleDateFormat("yyyy-MM-dd");
                                                    formatedDate = df.format(shippingOrder.getExpectedReceivedDate());
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <label>Expected Receiving Date:</label>\n");
      out.write("                                            <input class=\"form-control\" name=\"expectedDate\" type=\"date\" required=\"true\" value=\"");
      out.print(formatedDate);
      out.write('"');
      out.write(' ');
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write("/>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"submit\" value=\"Update Shipping Order\" class=\"btn btn-lg btn-primary btn-block\" ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(">\n");
      out.write("                                        </div>  \n");
      out.write("                                        <input type=\"hidden\" value=\"");
      out.print(shippingOrder.getId());
      out.write("\" name=\"id\">\n");
      out.write("                                    </form>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-lg-6\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\"> Shipping Order Status: <span class=\"label label-success\">");
      out.print(shippingOrder.getStatus());
      out.write("</span></h3>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"panel-body\">\n");
      out.write("                                    <form role=\"form\" name=\"shippingOrderManagement_status\" >\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            ");

                                                if (shippingOrder.getStatus().equals("Pending")) {
                                                    out.println("<input type='hidden' name='status'>");
                                                } else {
                                            
      out.write("\n");
      out.write("\n");
      out.write("                                            <label>Status</label>\n");
      out.write("                                            <select class='form-control' name='status' required=\"true\">\n");
      out.write("                                                ");
}
                                                    if (shippingOrder.getStatus().equals("Submitted")) {
                                                        out.println("<option>Shipped</option>");
                                                        out.println("<option>Unfulfillable</option>");
                                                    } else if (shippingOrder.getStatus().equals("Shipped")) {
                                                        out.println("<option>Completed</option>");
                                                        out.println("<option>Unfulfillable</option>");
                                                    } else if (shippingOrder.getStatus().equals("Unfulfillable")) {
                                                        out.println("<option>Unfulfillable</option>");
                                                    } else if (shippingOrder.getStatus().equals("Completed")) {
                                                        out.println("<option>Completed</option>");
                                                    }
                                                
      out.write("\n");
      out.write("                                            </select>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"form-group\">\n");
      out.write("                                            <input type=\"hidden\" value=\"");
      out.print(shippingOrder.getDestination().getId());
      out.write("\" name=\"destinationWarehouseID\">\n");
      out.write("                                            <input type=\"hidden\" value=\"");
      out.print(shippingOrder.getId());
      out.write("\" name=\"id\">\n");
      out.write("                                            <a ");
 if ((shippingOrder.getStatus().equals("Completed") || (shippingOrder.getStatus().equals("Unfulfillable")))) {
      out.write("href=\"#\"");
} else {
      out.write("href=\"#submitConfirmation\"");
}
      out.write("  data-toggle=\"modal\"><button class=\"btn btn-lg btn-primary btn-block\" ");
 if ((shippingOrder.getStatus().equals("Completed") || (shippingOrder.getStatus().equals("Unfulfillable")))) {
      out.write("disabled");
}
      out.write('>');
 if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("Update");
} else {
      out.write("Submit");
}
      out.write(" Shipping Order</button></a>\n");
      out.write("                                        </div>\n");
      out.write("                                    </form>\n");
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\"> Submitted By: <span class=\"\" style=\"font-weight: bold;\">");
      out.print(shippingOrder.getSubmittedBy());
      out.write("</span></h3>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <h3 class=\"panel-title\">Line item Management</h3>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.panel-heading -->\n");
      out.write("                                <form name=\"shippingOrderManagement\">\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                            <div id=\"dataTables-example_wrapper\" class=\"dataTables_wrapper form-inline\" role=\"grid\">\n");
      out.write("                                                <div class=\"row\">\n");
      out.write("                                                    <div class=\"col-md-12\">\n");
      out.write("                                                        <input ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(" type=\"button\" name=\"btnAddLineItem\" class=\"btn btn-primary\" value=\"Add Line Item\" onclick=\"javascript:addSOLineItem('");
      out.print(shippingOrder.getId());
      out.write("')\"/>\n");
      out.write("                                                        <a href=\"#removeLineItem\" data-toggle=\"modal\"><button class=\"btn btn-primary\" ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(">Remove Line Item</button></a>\n");
      out.write("                                                    </div>\n");
      out.write("                                                </div>\n");
      out.write("                                                <br>\n");
      out.write("                                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th><input type=\"checkbox\"onclick=\"checkAll(this)\" /></th>\n");
      out.write("                                                            <th>SKU</th>\n");
      out.write("                                                            <th>Item Name</th>\n");
      out.write("                                                            <th>Quantity</th>\n");
      out.write("                                                            <th>Action</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("                                                        ");

                                                            List<LineItemEntity> lineItems = shippingOrder.getLineItems();
                                                            if (lineItems != null) {
                                                                for (int i = 0; i < lineItems.size(); i++) {
                                                        
      out.write("\n");
      out.write("\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                <input ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(" type=\"checkbox\" name=\"delete\" value=\"");
      out.print(lineItems.get(i).getId());
      out.write("\" />\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(lineItems.get(i).getItem().getSKU());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(lineItems.get(i).getItem().getName());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(lineItems.get(i).getQuantity());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                <input ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(" type=\"button\" name=\"btnEdit\" class=\"btn btn-primary btn-block\" value=\"Update\" onclick=\"javascript:updateSOLineItem('");
      out.print(lineItems.get(i).getId());
      out.write("')\"/>\n");
      out.write("                                                            </td>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        ");
}
                                                            }
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"row\">\n");
      out.write("                                            <div class=\"col-md-12\">\n");
      out.write("                                                <input ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(" type=\"button\" name=\"btnAddLineItem\" class=\"btn btn-primary\" value=\"Add Line Item\" onclick=\"javascript:addSOLineItem('");
      out.print(shippingOrder.getId());
      out.write("')\"/>\n");
      out.write("                                                <a href=\"#removeLineItem\" data-toggle=\"modal\"><button class=\"btn btn-primary\" ");
if (!shippingOrder.getStatus().equals("Pending")) {
      out.write("disabled");
}
      out.write(">Remove Line Item</button></a>\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <input type=\"hidden\" value=\"");
      out.print(shippingOrder.getId());
      out.write("\" name=\"id\">\n");
      out.write("                                    <input type=\"hidden\" name=\"lineItemId\">\n");
      out.write("                                    <input type=\"hidden\" name=\"originId\">\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div> \n");
      out.write("                    <!-- /.row for line item management -->\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /#page-wrapper -->\n");
      out.write("            </div>\n");
      out.write("            <!-- /#container fluid -->\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("        <div role=\"dialog\" class=\"modal fade\" id=\"removeLineItem\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4>Alert</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <p id=\"messageBox\">Line Item will be removed. Are you sure?</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">                        \n");
      out.write("                        <input class=\"btn btn-primary\" name=\"btnRemove\" type=\"submit\" value=\"Confirm\" onclick=\"removeSOLineItem()\"  />\n");
      out.write("                        <a class=\"btn btn-default\" data-dismiss =\"modal\">Close</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div role=\"dialog\" class=\"modal fade\" id=\"submitConfirmation\">\n");
      out.write("            <div class=\"modal-dialog\">\n");
      out.write("                <div class=\"modal-content\">\n");
      out.write("                    <div class=\"modal-header\">\n");
      out.write("                        <h4>Confirmation</h4>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-body\">\n");
      out.write("                        <p id=\"messageBox\">Are you sure?</p>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"modal-footer\">                        \n");
      out.write("                        <input class=\"btn btn-primary\" name=\"btnSubmit\" type=\"submit\" value=\"Confirm\" onclick=\"submitSOLineItem()\"  />\n");
      out.write("                        <a class=\"btn btn-default\" data-dismiss =\"modal\">Close</a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#dataTables-example').dataTable();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            $(\"#myForm\").submit(function (e) {\n");
      out.write("                var source = $(\"#select_source\").find(\":selected\").text();\n");
      out.write("                var destination = $(\"#select_destination\").find(\":selected\").text();\n");
      out.write("                if (source === destination) {\n");
      out.write("                    alert(\"Source warehouse should not be the same as destination warehouse.\");\n");
      out.write("                    e.preventDefault();\n");
      out.write("                }\n");
      out.write("                else\n");
      out.write("                    return true;\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("        <script>\n");
      out.write("            var today = new Date().toISOString().split('T')[0];\n");
      out.write("            document.getElementsByName(\"expectedDate\")[0].setAttribute('min', today);\n");
      out.write("        </script>\n");
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
