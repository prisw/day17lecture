package sg.edu.nus.iss.day17lecture.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path="/home")
public class HomeController {

    @GetMapping(path="/booksearch")
    public String bookSearchForm() {


        return "booksearch";
    }
    
}
