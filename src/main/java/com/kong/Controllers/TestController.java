package com.kong.Controllers;

import com.kong.models.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    Response response;

    @GetMapping(path = "secure", produces = "application/json")
    public Response testSecuredEndpoint(){

     response.setCode("00");
     response.setMessage("This is a secure endpoint");
      return  response;
    }

    @GetMapping(path = "open", produces = "application/json")
    public Response testOpenEndpoint(){

        response.setCode("00");
        response.setMessage("This is a open endpoint");
        return  response;

    }



}
