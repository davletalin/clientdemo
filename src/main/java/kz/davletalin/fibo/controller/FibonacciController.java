package kz.davletalin.fibo.controller;

import kz.davletalin.fibo.dao.RequestDao;
import kz.davletalin.fibo.entity.Request;
import kz.davletalin.fibo.service.RequestService;
import org.hibernate.annotations.GeneratorType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class FibonacciController {

    private RequestService requestService=new RequestService();

    @GetMapping("/")
    public String showHome(){
        return "home";
    }
    @GetMapping("/allrequests")
    public String getAllRequests(Model model){
        List<Request> requests = requestService.getRequests();
        model.addAttribute("requests", requests);
        for (Request request :requests) {
            System.out.println("inside controller " +request);
        }

        return "requests";
    }
    @GetMapping("/testpage")
    public String goToTestPage(){
        return "testpage";
    }

    public String getLastRequest(){
        return null;
    }

}
