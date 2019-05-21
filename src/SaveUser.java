import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "SaveUser")
public class SaveUser extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        User temp=new User();
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter pw=response.getWriter();
        pw.write("开始写入数据库......"+"</br>");
        temp.setSname(request.getParameter("Sname"));
        pw.write("姓名写入成功......"+"</br>");
        temp.setSaddress(request.getParameter("Saddress"));
        pw.write("地址写入成功......"+"</br>");
        temp.setSage(Integer.parseInt(request.getParameter("Sage")));
        pw.write("年龄写入成功......"+"</br>");
        temp.setSno(request.getParameter("Sno"));
        pw.write("学号写入成功......"+"</br>");
        temp.setSsex(request.getParameter("Ssex"));
        pw.write("性别写入成功......"+"</br>");
        pw.write("写入完成"+"</br>");
//        pw.write(temp.getSaddress()+temp.getSname()+temp.getSno()+temp.getSsex()+temp.getSage()+"<br/>");
        if(SetUser.setUser(temp))
        {
            pw.write("数据库导入完成");
        }
        else
        {
            pw.write("数据库导入失败");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
}
