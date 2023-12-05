package sg.edu.nus.iss.day17lecture.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ProcessService {

       //to call the API
        String url_booksearch = "https://openlibrary.org/search.json?author=";
        RestTemplate template = new RestTemplate();

    public String searchBook(String author){

        url_booksearch += author;
        String result = template.getForObject(url_booksearch, String.class);
        return result;

    }
    
}
