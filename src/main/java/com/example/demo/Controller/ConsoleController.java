package com.example.demo.Controller;

import com.example.demo.Model.Console;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;

@Controller
public class ConsoleController {

    @GetMapping("consolelist")
    String consolelist(Model model) {
        model.addAttribute("consoles", Arrays.asList(
                new Console(1L, "Nintendo Entertainment System", "Nintendo", "1983-07-15"),
                new Console(2L, "Super Nintendo Entertainment System", "Nintendo", "1990-11-21"),
                new Console(3L, "Nintendo 64", "Nintendo", "1996-06-23"),
                new Console(4L, "GameCube", "Nintendo", "2001-09-14"),
                new Console(5L, "PlayStation", "Sony", "1994-12-03"),
                new Console(6L, "PlayStation 2", "Sony", "2000-03-04"),
                new Console(7L, "PlayStation 3", "Sony", "2006-11-06"),
                new Console(8L, "PlayStation 4", "Sony", "2013-11-15"),
                new Console(9L, "Xbox", "Microsoft", "2001-11-15"),
                new Console(10L, "Xbox 360", "Microsoft", "2005-11-22"),
                new Console(9L, "Xbox One", "Microsoft", "2013-11-22")
        ));
        return "consolelist";
    }
}
