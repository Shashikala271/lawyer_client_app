package com.xworkz.lawyerclientapp.servlet;

import com.xworkz.lawyerclientapp.service.LawyerService;
import com.xworkz.lawyerclientapp.service.impl.LawyerServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebServlet(urlPatterns = "/getClientNameByLawyerId")
public class GetClientNameByLawyerIdServlet extends HttpServlet {

LawyerService lawyerService = new LawyerServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String lawyerId=req.getParameter("lawyerId");


      String clientName=  lawyerService.getClientNameByLawyerId(Integer.valueOf(lawyerId));

      req.setAttribute("clientName",clientName);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("getClientNameByLawyerId.jsp");
        requestDispatcher.forward(req,resp);



    }

}
