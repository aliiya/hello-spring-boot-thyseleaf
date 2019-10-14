package com.train.spring.boot.thyseleaf.controller;

import com.train.spring.boot.thyseleaf.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @Author: aliya
 * @Description:
 * @Data: Create in 2019/10/10 16:43
 * @Modify By:
 */
@Controller
public class MainController {

    @RequestMapping(value = {"", "index"}, method = RequestMethod.GET)
    public String index(Model model){
        User user = new User();
        user.setUsername("Aliya");
        model.addAttribute("user", user);
        return "index";
    }
}
