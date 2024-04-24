package edu.homework.web.controller.concrete.impl;

import edu.homework.web.bean.AuthInfo;
import edu.homework.web.bean.User;
import edu.homework.web.controller.concrete.Command;
import edu.homework.web.logic.LogicStub;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

public class DoRegistration implements Command {
    private final LogicStub logic = new LogicStub();

    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String name = request.getParameter("name");
        String dob = request.getParameter("dob");
        String country = request.getParameter("country");
        User user = logic.checkAuth(new AuthInfo(username, password));
        HttpSession session = (HttpSession) request.getSession(true);
        session.setAttribute("user", user);
        response.sendRedirect("Controller?command=go_to_main_page");



    }
}
