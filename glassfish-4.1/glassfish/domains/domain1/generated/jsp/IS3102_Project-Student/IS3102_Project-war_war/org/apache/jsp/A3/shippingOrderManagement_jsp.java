package org.apache.jsp.A3;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.SimpleDateFormat;
import EntityManager.AccessRightEntity;
import EntityManager.RoleEntity;
import EntityManager.StaffEntity;
import java.util.ArrayList;
import EntityManager.WarehouseEntity;
import EntityManager.ShippingOrderEntity;
import java.util.List;

public final class shippingOrderManagement_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../header2.html", out, false);
      out.write("\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <script>\n");
      out.write("            function updateSO(id) {\n");
      out.write("                shippingOrderManagement.id.value = id;\n");
      out.write("                document.shippingOrderManagement.action = \"../ShippingOrderLineItemManagement_Servlet\";\n");
      out.write("                document.shippingOrderManagement.submit();\n");
      out.write("            }\n");
      out.write("            function addSO() {\n");
      out.write("                window.event.returnValue = true;\n");
      out.write("                document.shippingOrderManagement.action = \"shippingOrderManagement_Add.jsp\";\n");
      out.write("                document.shippingOrderManagement.submit();\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../menu1.jsp", out, false);
      out.write("\n");
      out.write("            ");
 List<ShippingOrderEntity> shippingOrders = (List<ShippingOrderEntity>) (session.getAttribute("shippingOrders"));
                if (shippingOrders == null) {
                    response.sendRedirect("../ShippingOrderManagement_Servlet");
                } else {
                    try {
            
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <h1 class=\"page-header\">Shipping Order Management</h1>\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <i class=\"icon icon-exchange\"></i> Shipping Order Management\n");
      out.write("                                </li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.col-lg-12 -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <div class=\"panel panel-default\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    ");

                                        String errMsg = request.getParameter("errMsg");
                                        String goodMsg = request.getParameter("goodMsg");
                                        if (errMsg == null && goodMsg == null) {
                                            out.println("Add shipping orders");
                                        } else if ((errMsg != null) && (goodMsg == null)) {
                                            if (!errMsg.equals("")) {
                                                out.println(errMsg);
                                            }
                                        } else if ((errMsg == null && goodMsg != null)) {
                                            if (!goodMsg.equals("")) {
                                                out.println(goodMsg);
                                            }
                                        }
                                    
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                                <!-- /.panel-heading -->\n");
      out.write("                                <form name=\"shippingOrderManagement\">\n");
      out.write("                                    <div class=\"panel-body\">\n");
      out.write("                                        <div class=\"table-responsive\">\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-12\">\n");
      out.write("                                                    <input class=\"btn btn-primary btnCreate\" name=\"btnAdd\" type=\"submit\" value=\"Create Shipping Order\" onclick=\"addSO()\"  />\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("                                            <br>\n");
      out.write("                                            <div id=\"dataTables-example_wrapper\" class=\"dataTables_wrapper form-inline\" role=\"grid\">\n");
      out.write("                                                <table class=\"table table-striped table-bordered table-hover\" id=\"dataTables-example\">\n");
      out.write("                                                    <thead>\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <th hidden></th>\n");
      out.write("                                                            <th style=\"width: 8%\">SO ID</th>\n");
      out.write("                                                            <th>Shipping Origin</th>\n");
      out.write("                                                            <th>Shipping Destination</th>\n");
      out.write("                                                            <th>Expected Receiving Date</th>\n");
      out.write("                                                            <th>Created Date</th>\n");
      out.write("                                                            <th>Submitted By</th>\n");
      out.write("                                                            <th>Status</th>\n");
      out.write("                                                            <th>Action</th>\n");
      out.write("                                                        </tr>\n");
      out.write("                                                    </thead>\n");
      out.write("                                                    <tbody>\n");
      out.write("\n");
      out.write("                                                        ");

                                                            List<ShippingOrderEntity> finalListOfSO = new ArrayList<ShippingOrderEntity>();
                                                            StaffEntity staff = (StaffEntity) (session.getAttribute("staffEntity"));
                                                            List<RoleEntity> listOfRoles = staff.getRoles();
                                                            boolean isAdmin = false;
                                                            for (RoleEntity role : listOfRoles) {
                                                                if (role.getName().equals("Administrator") || role.getName().equals("Global Manager")) {
                                                                    isAdmin = true;
                                                                    finalListOfSO = shippingOrders;
                                                                    break;
                                                                }
                                                            }

                                                            boolean isRegional = false;
                                                            if (!isAdmin) {
                                                                for (RoleEntity role : listOfRoles) {
                                                                    if (role.getName().equals("Regional Manager")) {
                                                                        isRegional = true;
                                                                        List<AccessRightEntity> accessList = role.getAccessRightList();
                                                                        for (AccessRightEntity accessRight : accessList) {
                                                                            for (ShippingOrderEntity SO : shippingOrders) {
                                                                                if (accessRight.getStaff().getId().equals(staff.getId()) && accessRight.getRegionalOffice() != null && (accessRight.getRegionalOffice().getId().equals(SO.getOrigin().getRegionalOffice().getId()) || accessRight.getRegionalOffice().getId().equals(SO.getDestination().getRegionalOffice().getId()))) {
                                                                                    if (!finalListOfSO.contains(SO)) {
                                                                                        finalListOfSO.add(SO);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }

                                                                }
                                                                if (!isRegional) {
                                                                    for (RoleEntity role : listOfRoles) {
                                                                        if (role.getName().equals("Warehouse Manager")) {
                                                                            List<AccessRightEntity> accessList = role.getAccessRightList();
                                                                            for (AccessRightEntity accessRight : accessList) {
                                                                                for (ShippingOrderEntity SO : shippingOrders) {
                                                                                    if (accessRight.getStaff().getId().equals(staff.getId()) && accessRight.getWarehouse() != null && ((accessRight.getWarehouse().getId().equals(SO.getDestination().getId()) && !SO.getStatus().equals("Pending")) || accessRight.getWarehouse().getId().equals(SO.getOrigin().getId()))) {
                                                                                        if (!finalListOfSO.contains(SO)) {
                                                                                            finalListOfSO.add(SO);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    for (RoleEntity role : listOfRoles) {
                                                                        if (role.getName().equals("Store Manager")) {

                                                                            List<AccessRightEntity> accessList = role.getAccessRightList();
                                                                            for (AccessRightEntity accessRight : accessList) {
                                                                                for (ShippingOrderEntity SO : shippingOrders) {
                                                                                    if (accessRight.getStaff().getId().equals(staff.getId()) && accessRight.getStore() != null && ((accessRight.getStore().getWarehouse().getId().equals(SO.getDestination().getId()) && !SO.getStatus().equals("Pending")) || accessRight.getStore().getWarehouse().getId().equals(SO.getOrigin().getId()))) {
                                                                                        if (!finalListOfSO.contains(SO)) {
                                                                                            finalListOfSO.add(SO);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    for (RoleEntity role : listOfRoles) {
                                                                        if (role.getName().equals("Manufacturing Facility Manager")) {
                                                                            System.out.println("test1");
                                                                            List<AccessRightEntity> accessList = role.getAccessRightList();
                                                                            for (AccessRightEntity accessRight : accessList) {
                                                                                for (ShippingOrderEntity SO : shippingOrders) {
                                                                                    if (accessRight.getStaff().getId().equals(staff.getId()) && accessRight.getManufacturingFacility() != null && ((accessRight.getManufacturingFacility().getWarehouse().getId().equals(SO.getDestination().getId()) && !SO.getStatus().equals("Pending")) || accessRight.getManufacturingFacility().getWarehouse().getId().equals(SO.getOrigin().getId()))) {
                                                                                        if (!finalListOfSO.contains(SO)) {
                                                                                            finalListOfSO.add(SO);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }

                                                            if (finalListOfSO != null) {
                                                                for (int i = 0; i < finalListOfSO.size(); i++) {
                                                                    WarehouseEntity source = finalListOfSO.get(i).getOrigin();
                                                                    WarehouseEntity destination = finalListOfSO.get(i).getDestination();
                                                        
      out.write("\n");
      out.write("                                                        <tr>\n");
      out.write("                                                            <td hidden></td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(finalListOfSO.get(i).getId());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(source.getWarehouseName());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(destination.getWarehouseName());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
 SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
                                                                    String date = DATE_FORMAT.format(finalListOfSO.get(i).getExpectedReceivedDate());
      out.write("\n");
      out.write("                                                                ");
      out.print(date);
      out.write(" \n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
 SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("dd-MM-yyyy hh:mm");
      out.write("\n");
      out.write("                                                                ");
      out.print( DATE_FORMAT2.format(finalListOfSO.get(i).getCreatedDate()));
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(finalListOfSO.get(i).getSubmittedBy());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td>\n");
      out.write("                                                                ");
      out.print(finalListOfSO.get(i).getStatus());
      out.write("\n");
      out.write("                                                            </td>\n");
      out.write("                                                            <td style=\"width:80px\">\n");
      out.write("                                                                <input type=\"button\" name=\"btnEdit\" class=\"btn btn-primary btn-block\"  value=\"View\" onclick=\"javascript:updateSO('");
      out.print(finalListOfSO.get(i).getId());
      out.write("')\"/>\n");
      out.write("                                                            </td>\n");
      out.write("\n");
      out.write("                                                        </tr>\n");
      out.write("                                                        ");

                                                                    }
                                                                }
                                                            } catch (Exception ex) {
                                                                response.sendRedirect("../A1/workspace.jsp");
                                                            }
                                                        
      out.write("\n");
      out.write("                                                    </tbody>\n");
      out.write("                                                </table>\n");
      out.write("                                            </div>\n");
      out.write("                                            <!-- /.table-responsive -->\n");
      out.write("                                            <div class=\"row\">\n");
      out.write("                                                <div class=\"col-md-12\">\n");
      out.write("                                                    <input class=\"btn btn-primary btnCreate1\" name=\"btnAdd\" type=\"submit\" value=\"Create Shipping Order\" onclick=\"addSO()\"  />\n");
      out.write("                                                </div>\n");
      out.write("                                            </div>\n");
      out.write("\n");
      out.write("                                            <input type=\"hidden\" name=\"id\" value=\"\">    \n");
      out.write("                                            <input type=\"hidden\" name=\"source\" value=\"\">   \n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <!-- /.panel-body -->\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                            <!-- /.panel -->\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.col-lg-12 -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function () {\n");
      out.write("                $('#dataTables-example').dataTable();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
}
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
