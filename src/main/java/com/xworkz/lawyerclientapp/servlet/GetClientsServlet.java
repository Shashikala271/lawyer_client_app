package com.xworkz.lawyerclientapp.servlet;

import com.xworkz.lawyerclientapp.dto.ClientDto;
import com.xworkz.lawyerclientapp.service.ClientService;
import com.xworkz.lawyerclientapp.service.impl.ClientServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;




@WebServlet(urlPatterns = "/getClients")
public class GetClientsServlet extends HttpServlet {


ClientService clientService=new ClientServiceImpl();


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        List<ClientDto> allClients= clientService.getAllClients();

     req.setAttribute("allClients",allClients);


        RequestDispatcher requestDispatcher= req.getRequestDispatcher("lawyerRegister.jsp");
        requestDispatcher.forward(req,resp);


    }
}
