package edu.homework.web.controller.concrete.impl;

import edu.homework.web.controller.concrete.Command;
import edu.homework.web.logic.LogicStub;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import edu.homework.web.bean.AuthInfo;
import edu.homework.web.bean.User;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;


public class DoAuth implements Command {
    private final LogicStub logic = new LogicStub();

    @Override
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String login = request.getParameter("login");
        String password = request.getParameter("password");

        System.out.println("Perform user authentication and authorization. Login: " + login);
        User user = logic.checkAuth(new AuthInfo(login, password));
        if (user != null) {
            HttpSession session = (HttpSession) request.getSession(true);
            session.setAttribute("user", user);

            response.sendRedirect("Controller?command=go_to_main_page");

        } else {

            response.sendRedirect("Controller?command=go_to_index_page&authError=Wrong login or password!");

//            response.sendError(500, "Неправильный логин или пароль!");
        }

    }

}
