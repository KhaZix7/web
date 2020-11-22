package com.example.ch5_2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class helloController {
    @RequestMapping("/hello")
    public String SayHello(String name) {
        return "Hello" + name;
    }


    @RequestMapping("/receive")
    public String doReceive(Model model,String username, int password) {

        System.out.println(username);
        System.out.println(password);
        if((username.equals("KhaZix"))&&(password==123456))
        return "directory";
        else
            return "failLogin";
    }
    @RequestMapping("/")
    public String welcome()
    {
        return "login";
    }
    @RequestMapping("/edit")
    public String edit()
    {
        return "edit";
    }
    @RequestMapping("/add")
    public String add()
    {
        return "add";
    }
    @RequestMapping("/delete")
    public String delete()
    {
        return "delete";
    }
    @RequestMapping("/directory")
    public String directory()
    {
        return "directory";
    }
    @RequestMapping("/receiveAdd")
    public String receiveAdd(String name, String email,String phoneNum,String address,String qqNum,HttpSession session)
    {
        System.out.println(name);
        System.out.println(phoneNum);
        System.out.println(address);
        System.out.println(qqNum);
        session.setAttribute("name",name);
        session.setAttribute("email",email);
        session.setAttribute("phoneNum",phoneNum);
        session.setAttribute("address",address);
        session.setAttribute("qqNum",qqNum);
        return "addSucess";
    }
    @RequestMapping("/dodelete")
    public String dodelete(HttpSession session)
    {
        session.removeAttribute("name");
        session.removeAttribute("email");
        session.removeAttribute("phoneNum");
        session.removeAttribute("address");
        session.removeAttribute("qqNum");
        return "directory";
    }
    @RequestMapping("/receiveEdit")
    public String doedit(String name, String email,String phoneNum,String address,String qqNum,HttpSession session)
    {
        session.setAttribute("name",name);
        session.setAttribute("email",email);
        session.setAttribute("phoneNum",phoneNum);
        session.setAttribute("address",address);
        session.setAttribute("qqNum",qqNum);
        return "directory";
    }
}


