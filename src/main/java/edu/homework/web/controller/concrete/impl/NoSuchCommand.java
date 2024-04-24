package edu.homework.web.controller.concrete.impl;

import edu.homework.web.controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class NoSuchCommand implements Command {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().print("Command does not exist!");


    }
}
