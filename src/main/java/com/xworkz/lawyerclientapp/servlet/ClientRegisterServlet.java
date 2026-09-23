package com.xworkz.lawyerclientapp.servlet;

import com.xworkz.lawyerclientapp.dto.ClientDto;
import com.xworkz.lawyerclientapp.service.ClientService;
import com.xworkz.lawyerclientapp.service.impl.ClientServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/clientRegister")
public class ClientRegisterServlet extends HttpServlet {


    ClientService clientService = new ClientServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        ClientDto clientDto = new ClientDto();

        clientDto.setName(req.getParameter("name"));
        clientDto.setEmail(req.getParameter("email"));
        clientDto.setAddress(req.getParameter("address"));
        clientDto.setPhoneNumber(req.getParameter("phoneNumber"));

        boolean isSaved=clientService.validateAndSaveClient( clientDto);

        PrintWriter printWriter=resp.getWriter();
        if(isSaved){
            printWriter.println("Client successfully saved");
        }else {
            printWriter.println("Failed to save client");
        }

    }
}
