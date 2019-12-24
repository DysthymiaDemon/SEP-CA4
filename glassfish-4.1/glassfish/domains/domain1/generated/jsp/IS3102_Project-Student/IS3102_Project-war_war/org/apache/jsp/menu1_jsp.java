package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Calendar;
import java.util.Date;
import EntityManager.MessageInboxEntity;
import CommonInfrastructure.AccountManagement.AccountManagementBeanLocal;
import javax.ejb.EJB;
import java.util.ArrayList;
import EntityManager.RoleEntity;
import java.util.List;
import EntityManager.StaffEntity;

public final class menu1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");

    StaffEntity staffEntity = (StaffEntity) (session.getAttribute("staffEntity"));
    if (staffEntity == null) {

      out.write('\n');
      if (true) {
        _jspx_page_context.forward("A1/staffLogin.jsp?errMsg=Session Expired.");
        return;
      }
      out.write('\n');

} else {
    List<RoleEntity> roles = staffEntity.getRoles();
    Long[] approvedRolesID;
    boolean roleCanView;
    boolean roleCanView2;
    boolean roleCanView3;
    boolean roleCanView4;
    boolean roleCanView5;


      out.write('\n');
      out.write('\n');
    List<MessageInboxEntity> listOfInboxMsg = (List<MessageInboxEntity>) session.getAttribute("inboxMessages");
    /*  MessageInboxEntity msg = new MessageInboxEntity();
     msg.setId(1L);
     msg.setMessage("helloooooooo how are you?");
     StaffEntity staff = new StaffEntity();
     staff.setName("Gabriel");
     msg.setSender(staff);
     msg.setSentDate(Calendar.getInstance().getTime());

     listOfInboxMsg.add(msg);*/

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!-- Navigation -->\n");
      out.write("<nav class=\"navbar navbar-inverse navbar-fixed-top\" role=\"navigation\" >\n");
      out.write("    <!-- Brand and toggle get grouped for better mobile display -->\n");
      out.write("    <div class=\"navbar-header\">\n");
      out.write("        <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\".navbar-ex1-collapse\">\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("            <span class=\"icon-bar\"></span>\n");
      out.write("        </button>\n");
      out.write("        <a class=\"navbar-brand\" href=\"../Workspace_Servlet\" style=\"color: #C5C5C5;\">Island Furniture - Staff Portal</a>\n");
      out.write("    </div>\n");
      out.write("    <!-- Top Menu Items -->\n");
      out.write("    <ul class=\"nav navbar-right top-nav\">\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            <a style=\"color: #C5C5C5;\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"icon icon-envelope\"> Inbox</i> <b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu message-dropdown\">\n");
      out.write("                ");

                    if (listOfInboxMsg.size() > 0) {
                        for (int i = 0; i < listOfInboxMsg.size() && i < 3; i++) {
                
      out.write("\n");
      out.write("\n");
      out.write("                <li class=\"message-preview\">\n");
      out.write("                    <a href=\"../WorkspaceMessage_Servlet\">\n");
      out.write("                        <div class=\"media\">\n");
      out.write("                            <div class=\"media-body\">\n");
      out.write("                                <h5 class=\"media-heading\"><strong>");
      out.print(listOfInboxMsg.get(i).getSender().getName());
      out.write("</strong></h5><!--Sender-->\n");
      out.write("                                <p class=\"small text-muted\"><i class=\"icon icon-clock-o\">");
      out.print(listOfInboxMsg.get(i).getSentDate().toString());
      out.write("</i> </p><!--Date sent-->\n");
      out.write("                                <p>");
      out.print(listOfInboxMsg.get(i).getMessage());
      out.write("</p> <!--Message Content-->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </a>\n");
      out.write("                </li>\n");
      out.write("                ");

                    }
                
      out.write("\n");
      out.write("                <li class=\"message-footer\">\n");
      out.write("                    <a href=\"../WorkspaceMessage_Servlet\">Read All New Messages</a>\n");
      out.write("                </li>\n");
      out.write("                ");
} else {
      out.write("\n");
      out.write("\n");
      out.write("                <li class=\"message-footer\">\n");
      out.write("                    <a href=\"#\">No Message</a>\n");
      out.write("                </li>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("        ");
 if (roles.size() != 0) {
      out.write("\n");
      out.write("\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            <a style=\"color: #C5C5C5;\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\n");
      out.write("                <i class=\"icon icon-group\"></i> \n");
      out.write("                ");
      out.print(roles.get(0).getName());
      out.write("\n");
      out.write("                ");

                    if ((roles.get(0).getId() == 2L) || (roles.get(0).getId() == 7L)) {
                        for (int i = 0; i < roles.get(0).getAccessRightList().size(); i++) {
                            if (roles.get(0).getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                out.print("of " + roles.get(0).getAccessRightList().get(i).getRegionalOffice().getName());
                            }
                        }
                    }
                    if (roles.get(0).getId() == 8L) {
                        for (int i = 0; i < roles.get(0).getAccessRightList().size(); i++) {
                            if (roles.get(0).getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                out.print("of " + roles.get(0).getAccessRightList().get(i).getManufacturingFacility().getName());
                            }
                        }
                    }
                    if (roles.get(0).getId() == 3L) {
                        for (int i = 0; i < roles.get(0).getAccessRightList().size(); i++) {
                            if (roles.get(0).getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                out.print("of " + roles.get(0).getAccessRightList().get(i).getWarehouse().getWarehouseName());
                            }
                        }
                    }
                    if (roles.get(0).getId() == 4L || roles.get(0).getId() == 9L || roles.get(0).getId() == 10L || roles.get(0).getId() == 12L) {
                        for (int i = 0; i < roles.get(0).getAccessRightList().size(); i++) {
                            if (roles.get(0).getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                out.print("of " + roles.get(0).getAccessRightList().get(i).getStore().getName());
                            }
                        }
                    }
                
      out.write("\n");
      out.write("                <b class=\"caret\"></b>\n");
      out.write("            </a>\n");
      out.write("\n");
      out.write("            <ul class=\"dropdown-menu\" style=\"min-width: 300px\">\n");
      out.write("                ");

                    for (RoleEntity role : roles) {
                
      out.write("\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"#\"><i class=\"icon icon-user\"></i> ");
      out.print( role.getName());
      out.write("\n");
      out.write("                        ");
if ((role.getId() == 2L) || (role.getId() == 7L)) {
                                for (int i = 0; i < role.getAccessRightList().size(); i++) {
                                    if (role.getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                        out.print("of " + role.getAccessRightList().get(i).getRegionalOffice().getName());
                                    }
                                }
                            }
                            if (role.getId() == 8L) {
                                for (int i = 0; i < role.getAccessRightList().size(); i++) {
                                    if (role.getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                        out.print("of " + role.getAccessRightList().get(i).getManufacturingFacility().getName());
                                    }
                                }
                            }
                            if (role.getId() == 3L) {
                                for (int i = 0; i < role.getAccessRightList().size(); i++) {
                                    if (role.getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                        out.print("of " + role.getAccessRightList().get(i).getWarehouse().getWarehouseName());
                                    }
                                }
                            }
                            if (role.getId() == 4L || role.getId() == 9L || role.getId() == 10L || role.getId() == 12L) {
                                for (int i = 0; i < role.getAccessRightList().size(); i++) {
                                    if (role.getAccessRightList().get(i).getStaff().getId() == staffEntity.getId()) {
                                        out.print("of " + role.getAccessRightList().get(i).getStore().getName());
                                    }
                                }
                            }
      out.write("\n");
      out.write("                    </a>\n");
      out.write("                </li>    \n");
      out.write("                ");

                    }
                
      out.write("                       \n");
      out.write("            </ul>\n");
      out.write("\n");
      out.write("        </li>");
}
      out.write("\n");
      out.write("        <li class=\"dropdown\">\n");
      out.write("            <a style=\"color: #C5C5C5;\" href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\"><i class=\"icon icon-user\"></i> ");
      out.print(staffEntity.getName());
      out.write("<b class=\"caret\"></b></a>\n");
      out.write("            <ul class=\"dropdown-menu\">\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"../A1/staffProfile.jsp\"><i class=\"icon icon-user\"></i> Profile</a>\n");
      out.write("                </li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"../WorkspaceMessage_Servlet?view=inbox\"><i class=\"icon icon-envelope\"></i> Inbox</a>\n");
      out.write("                </li>  \n");
      out.write("                <li class=\"divider\"></li>\n");
      out.write("                <li>\n");
      out.write("                    <a href=\"../AccountManagement_LogoutServlet\"><i class=\"icon icon-power-off\"></i> Log Out</a>\n");
      out.write("                </li>\n");
      out.write("            </ul>\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("    <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->\n");
      out.write("    <div class=\"collapse navbar-collapse navbar-ex1-collapse\">\n");
      out.write("        <ul class=\"nav navbar-nav side-nav\">\n");
      out.write("            ");

                approvedRolesID = new Long[]{1L, 2L, 11L};
                roleCanView = false;
                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                            break;
                        }
                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#commonInfrastructure\" style=\"color: #C5C5C5;\">\n");
      out.write("                    <i class=\"icon icon-user\"></i> Common Infrastructure <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"commonInfrastructure\" class=\"collapse\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../A1/accountManagement.jsp\">Account Management</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");
}
                approvedRolesID = new Long[]{1L, 2L, 8L, 11L};
                roleCanView = false;
                roleCanView2 = true;
                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                            break;
                        }
                    }
                    if (roleEntity.getId().equals(8L)) {//Manufacturing Facility Manager
                        roleCanView2 = false;
                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("            <!--<li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#MRP\" style=\"color: #C5C5C5;\" >\n");
      out.write("                    <i class=\"icon icon-book\"></i> MRP <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"MRP\" class=\"collapse\">\n");
      out.write("                    ");
if (roleCanView2) {
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../SaleForecast_Servlet/SaleForecast_index_GET\">Sales Forecast</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../SaleAndOperationPlanning_Servlet/sop_index_GET\">Sales and Operations Planning</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../PPD_index_GET/*\">Production Plan Distribution</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../DemandManagement_index_GET/*\">Demand Management</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../MRP_index_GET/*\">Manufacturing Requirement Planning</a>\n");
      out.write("                    </li>\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>-->\n");
      out.write("            ");
 }
                approvedRolesID = new Long[]{1L, 2L, 3L, 4L, 7L, 8L, 11L};
                roleCanView = false;
                roleCanView2 = true;
                roleCanView3 = true;
                roleCanView4 = true;
                roleCanView5 = true;

                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                        }
                        if (roleEntity.getId().equals(8L)) {//Manufacturing Facility Manager
                            roleCanView2 = false;
                        }
                        if (roleEntity.getId().equals(3L)) {//Manufacturing Facility Manager
                            roleCanView3 = false;
                        }
                        if (roleEntity.getId().equals(4L)) {//Manufacturing Facility Manager
                            roleCanView4 = false;
                        }
                        if (roleEntity.getId().equals(7L)) {//Manufacturing Facility Manager
                            roleCanView5 = false;
                        }
                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#SCM\" style=\"color: #C5C5C5;\">\n");
      out.write("                    <i class=\"icon icon-home\"></i> SCM <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"SCM\" class=\"collapse\" style=\"color: #C5C5C5;\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../PurchaseOrderManagement_Servlet\">Retail Products and Raw Materials Purchasing</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
if ((roleCanView3) && (roleCanView2) && (roleCanView4)) {
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../SupplierManagement_SupplierServlet\">Supplier Management</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
if (roleCanView5) {
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../ShippingOrderManagement_Servlet\">Inbound and Outbound Logistics</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                    ");
if ((roleCanView4) && (roleCanView5)) {
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../ManufacturingWarehouseManagement_Servlet\">Manufacturing's Warehouse Management</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");
 }
                approvedRolesID = new Long[]{1L, 2L, 3L, 4L, 11L};
                roleCanView = false;
                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                        }
                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#store\" style=\"color: #C5C5C5;\">\n");
      out.write("                    <i class=\"icon icon-home\"></i> Store Inventory <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"store\" class=\"collapse\">                 \n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../RetailWarehouseManagement_Servlet\">Store's Inventory Management</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");
 }
                approvedRolesID = new Long[]{1L, 2L, 11L};
                roleCanView = false;
                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                            break;
                        }
                        if (roleEntity.getId().equals(5L)) {
                            roleCanView2 = false;
                        }

                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("           <!-- <li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#Kitchen\" style=\"color: #C5C5C5;\" >\n");
      out.write("                    <i class=\"icon icon-book\"></i> Kitchen Management <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"Kitchen\" class=\"collapse\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../KitchenManagement_servlet/KitchenSaleForecast_index_GET\">Kitchen Requirement Planning</a>\n");
      out.write("                    </li>                                \n");
      out.write("                </ul>\n");
      out.write("            </li>-->\n");
      out.write("\n");
      out.write("            ");
}
                approvedRolesID = new Long[]{1L, 2L, 4L, 5L, 11L, 10L};
                roleCanView = false;
                roleCanView2 = true;
                roleCanView3 = true;
                roleCanView4 = true;
                roleCanView5 = true;
                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                            break;
                        }
                        if (roleEntity.getId().equals(5L)) {//Marketing Director 
                            roleCanView2 = false;
                        }
                        if (roleEntity.getId().equals(4L)) {
                            roleCanView3 = false;
                        }
                        if (roleEntity.getId().equals(2L)) {
                            roleCanView4 = false;
                        }
                        if (roleEntity.getId().equals(10L)) {//Receptionist
                            roleCanView2 = false;
                            roleCanView3 = false;
                            roleCanView5 = false;
                        }
                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#operationalCRM\" style=\"color: #C5C5C5;\">\n");
      out.write("                    <i class=\"icon icon-cogs\"></i> Operational CRM <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"operationalCRM\" class=\"collapse\">\n");
      out.write("                    ");
 if ((roleCanView3) && (roleCanView4)) { 
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../LoyaltyManagement_Servlet\">Loyalty & Rewards</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../A4/loyaltyCardMgt.jsp\">Loyalty Card Management</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
 if (roleCanView2) { 
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../A4/customerServiceManagement.jsp\">Customer Service</a>\n");
      out.write("                    </li>                    \n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    ");
 if (roleCanView5) {
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../PromotionalSalesManagement_Servlet\">Promotional Sales</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");
 }
                approvedRolesID = new Long[]{1L, 5L, 6L, 11L};
                roleCanView = false;
                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                            break;
                        }
                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("          <!--  <li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#analyticalCRM\" style=\"color: #C5C5C5;\">\n");
      out.write("                    <i class=\"icon icon-bar-chart-o\"></i> Analytical CRM <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"analyticalCRM\" class=\"collapse\">\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../A5/analytical.jsp\">Analytics</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>-->\n");
      out.write("            ");
 }
                approvedRolesID = new Long[]{1L, 6L, 11L};
                roleCanView = false;
                roleCanView2 = true;
                for (RoleEntity roleEntity : roles) {
                    for (Long ID : approvedRolesID) {
                        if (roleEntity.getId().equals(ID)) {
                            roleCanView = true;
                            break;
                        }
                    }
                    if (roleEntity.getId().equals(6L)) {//Marketing Director 
                        roleCanView2 = false;
                    }
                    if (roleCanView) {
                        break;
                    }
                }
                if (roleCanView) {
            
      out.write("\n");
      out.write("            <li>\n");
      out.write("                <a href=\"javascript:;\" data-toggle=\"collapse\" data-target=\"#corporateCRM\" style=\"color: #C5C5C5;\">\n");
      out.write("                    <i class=\"icon icon-briefcase\"></i> Corporate Management <i class=\"icon icon-caret-down\"></i>\n");
      out.write("                </a>\n");
      out.write("                <ul id=\"corporateCRM\" class=\"collapse\">\n");
      out.write("                    ");
 if (roleCanView2) { 
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../A6/facilityManagement.jsp\">Facility Management</a>\n");
      out.write("                    </li>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../A6/itemManagement.jsp\">Item Management</a>\n");
      out.write("                    </li>\n");
      out.write("                    <li>\n");
      out.write("                        <a href=\"../A6/restaurantManagement.jsp\">Restaurant Management</a>\n");
      out.write("                    </li>\n");
      out.write("                </ul>\n");
      out.write("            </li>\n");
      out.write("            ");
 }
            
      out.write("\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.navbar-collapse -->\n");
      out.write("</nav>\n");
      out.write("\n");
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
