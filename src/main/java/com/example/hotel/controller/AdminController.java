//package com.example.hotel.controller;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import javax.servlet.http.HttpServletRequest;
//
//@Controller
//public class AdminController {
//    @GetMapping("/adminLogin")
//    public String admin(){return "adminLogin";}
//
//    @PostMapping("/home-page")
//    public String adminLogin(HttpServletRequest request, Model model){
//        String adminEmail = request.getParameter("adminEmail");
//        String adminPassword = request.getParameter("adminPassword");
//        if (adminEmail.equals("admin@yahoo.com") && adminPassword.equals("admin0123")){
//            return "redirect:/home-page";
//        }
//        else{
//            model.addAttribute("message", "Invalid credentials");
//            return "adminLogin";
//        }
//    }
//
//
//}
