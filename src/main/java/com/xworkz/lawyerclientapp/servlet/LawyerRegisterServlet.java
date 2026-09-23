package com.xworkz.lawyerclientapp.servlet;

import com.xworkz.lawyerclientapp.dto.ClientDto;
import com.xworkz.lawyerclientapp.dto.LawyerDto;
import com.xworkz.lawyerclientapp.service.LawyerService;
import com.xworkz.lawyerclientapp.service.impl.LawyerServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


@WebServlet(urlPatterns = "/lawyerRegister")
public class LawyerRegisterServlet extends HttpServlet {

LawyerService lawyerService = new LawyerServiceImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {



        LawyerDto lawyerDto = new LawyerDto();

      //  lawyerDto.setId(Integer.parseInt(req.getParameter("id")));
        lawyerDto.setName(req.getParameter("name"));
        lawyerDto.setEmail(req.getParameter("email"));
        lawyerDto.setAddress(req.getParameter("address"));
        lawyerDto.setPhoneNUmber(req.getParameter("phoneNumber"));

        ClientDto clientDto = new ClientDto();

        clientDto.setId(Integer.parseInt(req.getParameter("clientId")));
        clientDto.setName(req.getParameter("clientName"));
        clientDto.setEmail(req.getParameter("clientEmail"));
        clientDto.setPhoneNumber(req.getParameter("clientPhoneNumber"));


         lawyerDto.setClient(clientDto);


       boolean isSaved = lawyerService.saveAndValidateLawyer(lawyerDto);


        PrintWriter printWriter = resp.getWriter();

        if (isSaved){
            printWriter.println("Lawyer successfully registered!");
        }else {
            printWriter.println("Lawyer failed to register!");
        }
    }
}
