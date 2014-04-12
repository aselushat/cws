package ru.cat;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Xeks on 06.04.14.
 */
@Controller
public class WebDispatchServlet{

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(ModelMap map){
        map.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }
}
