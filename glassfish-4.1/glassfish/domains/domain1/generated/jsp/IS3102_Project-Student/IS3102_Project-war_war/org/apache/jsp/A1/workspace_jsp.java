package org.apache.jsp.A1;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import EntityManager.AnnouncementEntity;
import EntityManager.ToDoEntity;
import java.util.ArrayList;
import EntityManager.MessageEntity;
import java.util.List;
import java.util.List;
import EntityManager.StaffEntity;

public final class workspace_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("        <div id=\"wrapper\">\n");
      out.write("            ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../menu1.jsp", out, false);
      out.write("\n");
      out.write("            ");
  
                StaffEntity staffEntity = (StaffEntity) (session.getAttribute("staffEntity"));
                if (staffEntity != null) {                 
                    List<AnnouncementEntity> announcement = (List<AnnouncementEntity>) (session.getAttribute("listOfAnnouncements"));
                    List<MessageEntity> unreadMessages = (List<MessageEntity>) (session.getAttribute("unreadMessages"));
                    List<MessageEntity> inbox = (List<MessageEntity>) (session.getAttribute("inboxMessages"));
                    List<ToDoEntity> toDoList = (List<ToDoEntity>) (session.getAttribute("toDoList"));
                    if (announcement == null)
                        announcement = new ArrayList();
                    if (unreadMessages == null)
                        unreadMessages = new ArrayList();
                    if (inbox == null)
                        inbox = new ArrayList();
                    if(toDoList == null)
                        toDoList = new ArrayList();
            
      out.write("\n");
      out.write("            <div id=\"page-wrapper\">\n");
      out.write("                <div class=\"container-fluid\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-12\">\n");
      out.write("                            <h1 class=\"page-header\">Holla! ");
      out.print(staffEntity.getName());
      out.write("</h1>\n");
      out.write("                            <ol class=\"breadcrumb\">\n");
      out.write("                                <li class=\"active\">\n");
      out.write("                                    <i class=\"icon icon-dashboard\"></i> Workspace\n");
      out.write("                                </li>\n");
      out.write("                            </ol>\n");
      out.write("                        </div>\n");
      out.write("                        <!-- /.col-lg-12 -->\n");
      out.write("                    </div>\n");
      out.write("                    <!-- /.row -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                            <div class=\"panel panel-primary\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-3\">\n");
      out.write("                                            <i class=\"icon icon-bell icon-5x\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-9 text-right\">\n");
      out.write("                                            <div class=\"huge\">");
      out.print(announcement.size());
      out.write("</div>\n");
      out.write("                                            <div>Announcement");
if(announcement.size()!=1){
      out.write('s');
}
      out.write("</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"../WorkspaceAnnouncement_Servlet\">\n");
      out.write("                                    <div class=\"panel-footer\" style=\"padding-bottom: 30px;\">\n");
      out.write("                                        <span class=\"pull-left\">View Details</span>\n");
      out.write("                                        <span class=\"pull-right\"><i class=\"icon icon-arrow-circle-right\"></i></span>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                            <div class=\"panel panel-green\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-3\">\n");
      out.write("                                            <i class=\"icon icon-comments icon-5x\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-9 text-right\">\n");
      out.write("                                            ");
 if(unreadMessages.size()>0) { 
      out.write("\n");
      out.write("                                            <div class=\"huge\">");
      out.print(unreadMessages.size());
      out.write("</div>\n");
      out.write("                                            <div>New Message");
if(inbox.size()!=1){
      out.write('s');
}
      out.write("!</div>\n");
      out.write("                                            ");
} else { 
      out.write("\n");
      out.write("                                            <div class=\"huge\">");
      out.print(inbox.size());
      out.write("</div>\n");
      out.write("                                            <div>Message");
if(inbox.size()!=1){
      out.write('s');
}
      out.write(" in Inbox</div>\n");
      out.write("                                            ");
}
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"../WorkspaceMessage_Servlet\">\n");
      out.write("                                    <div class=\"panel-footer\" style=\"padding-bottom: 30px;\">\n");
      out.write("                                        <span class=\"pull-left\">View Details</span>\n");
      out.write("                                        <span class=\"pull-right\"><i class=\"icon icon-arrow-circle-right\"></i></span>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-lg-3 col-md-6\">\n");
      out.write("                            <div class=\"panel panel-yellow\">\n");
      out.write("                                <div class=\"panel-heading\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-xs-3\">\n");
      out.write("                                            <i class=\"icon icon-list icon-5x\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-xs-9 text-right\">\n");
      out.write("                                            <div class=\"huge\">");
      out.print(toDoList.size());
      out.write("</div>\n");
      out.write("                                            <div>Item");
if(toDoList.size()!=1){
      out.write('s');
}
      out.write(" in Todo List</div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <a href=\"../WorkspaceToDoList_Servlet\">\n");
      out.write("                                    <div class=\"panel-footer\" style=\"padding-bottom: 30px;\">\n");
      out.write("                                        <span class=\"pull-left\">View Details</span>\n");
      out.write("                                        <span class=\"pull-right\"><i class=\"icon icon-arrow-circle-right\"></i></span>\n");
      out.write("                                        <div class=\"clearfix\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <!-- /.container-fluid -->\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <!-- /#page-wrapper -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- /#wrapper -->\n");
      out.write("        ");
}
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page-Level Demo Scripts - Tables - Use for reference -->\n");
      out.write("        <script>\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('#dataTables-example').dataTable();\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
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
