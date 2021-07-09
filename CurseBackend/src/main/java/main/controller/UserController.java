package main.controller;

import main.model.User;
import main.objects.CurrentUser;
import main.service.impl.UserControllerServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UserController {

    @Autowired
    private UserControllerServiceImpl userControllerServiceImpl;

    @PostMapping("/registration")
    @ResponseBody
    public ModelAndView userRegistration(@RequestParam User user, Model model) {
        ModelAndView modelAndView = new ModelAndView();
        boolean save = userControllerServiceImpl.saveUser(user);
        if (save) {
            modelAndView.setViewName("index");
            return modelAndView;
        }
        model.addAttribute("userExists", true);
        modelAndView.setViewName("index");
        return modelAndView;
    }

    @GetMapping("/authorization")
    public ModelAndView getUser(User user) {
        ModelAndView modelAndView = new ModelAndView();
        if (userControllerServiceImpl.findByUsername(user) != null) {
            modelAndView.setViewName("index");
            CurrentUser currentUser = new CurrentUser(user.getUsername(), true);
            return modelAndView;
        }
        modelAndView.setViewName("login");
        return modelAndView;
    }
}
