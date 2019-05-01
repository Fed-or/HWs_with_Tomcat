package servlets;

import dao.UserDao;
import model.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(value = "/signin")
public class SignInServlet extends HttpServlet {

    private static final UserDao USERDAO = UserDao.getInstance();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        PrintWriter out = resp.getWriter();
        String name = req.getParameter("name");
        String password = req.getParameter("password");

        User user = USERDAO.getUser(name);
        if (user != null && user.getPassword().equals(password)) {
            out.print("Привет " + user.getName());
        }
        else{
            out.println("Такого пользователя в базе нет");
        }
    }
}
