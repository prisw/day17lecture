package sg.edu.nus.iss.day17lecture.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import sg.edu.nus.iss.day17lecture.services.ProcessService;

@RestController
@RequestMapping(path="/process",produces="application/json")
public class ProcessController {
    

    @Autowired
    ProcessService processSvc;

    @PostMapping(path="/searchBook")
    public String processBookSearch (@RequestBody MultiValueMap<String,String> form) {

        String author = form.getFirst("searchName");
        System.out.println("Author: " + author);
        String result = processSvc.searchBook(author);
        return result;

    
    }
}
