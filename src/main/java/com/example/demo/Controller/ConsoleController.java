package com.example.demo.Controller;

import com.example.demo.Model.Console;

import com.example.demo.Service.ConsoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;

@Controller
public class ConsoleController {

    @Autowired
    private ConsoleService consoleService;

    @GetMapping("consolelist")
    public ModelAndView getAllConsoles() {
        ModelAndView mav2 = new ModelAndView("consolelist");
        mav2.addObject("consoles", consoleService.findAllConsoles());
        return mav2;
    }

    @GetMapping("consoleform")
    public ModelAndView addConsoleForm() {
        ModelAndView mav2 = new ModelAndView("consoleform");
        Console newConsole = new Console();
        mav2.addObject("console", newConsole);
        return mav2;
    }

    @PostMapping("consoleform")
    public String saveConsole(@ModelAttribute Console console) {
        consoleService.addConsole(console);
        return "redirect:/list";
    }

//    @GetMapping("consolelist")
//    String consolelist(Model model) {
//        model.addAttribute("consoles", Arrays.asList(
//                new Console(1L, "Nintendo Entertainment System", "Nintendo", "1983-07-15"),
//                new Console(2L, "Super Nintendo Entertainment System", "Nintendo", "1990-11-21"),
//                new Console(3L, "Nintendo 64", "Nintendo", "1996-06-23"),
//                new Console(4L, "GameCube", "Nintendo", "2001-09-14"),
//                new Console(5L, "PlayStation", "Sony", "1994-12-03"),
//                new Console(6L, "PlayStation 2", "Sony", "2000-03-04"),
//                new Console(7L, "PlayStation 3", "Sony", "2006-11-06"),
//                new Console(8L, "PlayStation 4", "Sony", "2013-11-15"),
//                new Console(9L, "Xbox", "Microsoft", "2001-11-15"),
//                new Console(10L, "Xbox 360", "Microsoft", "2005-11-22"),
//                new Console(9L, "Xbox One", "Microsoft", "2013-11-22")
//        ));
//        return "consolelist";
//    }
}
