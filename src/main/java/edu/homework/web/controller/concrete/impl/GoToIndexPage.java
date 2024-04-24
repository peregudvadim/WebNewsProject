package edu.homework.web.controller.concrete.impl;

import edu.homework.web.bean.News;
import edu.homework.web.controller.concrete.Command;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class GoToIndexPage implements Command {
    public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        News news = new News("Владимир Ильич Ленин говорил:", "„Анализируя ошибки вчерашнего дня, " +
                "мы тем самым учимся избегать ошибок сегодня и завтра.");
        request.setAttribute("mainNews", news);


        RequestDispatcher dispatcher = request.getRequestDispatcher("WEB-INF/jsp/main_index.jsp");
        dispatcher.forward(request, response);


    }
}
