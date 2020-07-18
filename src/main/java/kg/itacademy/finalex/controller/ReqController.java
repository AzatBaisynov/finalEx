package kg.itacademy.finalex.controller;

import kg.itacademy.finalex.entity.Request;
import kg.itacademy.finalex.service.RequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReqController {
    @Autowired
    private RequestService service;

    @PostMapping("/counter")
    public ResponseEntity<String> create(Request request){
        Request req = service.create(request);
        if (req == null) return new ResponseEntity<>(null, HttpStatus.BAD_REQUEST);
        return new ResponseEntity<>("Post request accepted", HttpStatus.OK);
    }

    @GetMapping("/counter")
    public String getCount(){
        Integer count = service.countAll();
        return "Count of requests: " + count;
    }

    @GetMapping("/report")
    public List<Request> getAll(){
        return service.getAll();
    }
}
