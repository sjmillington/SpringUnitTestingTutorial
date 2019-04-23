package co.uk.sjmillington.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {

    private final GreetingService greetingService;

    public GreetingController(GreetingService service){
        this.greetingService = service;
    }

    @GetMapping("/greeting")
    public @ResponseBody String greeting(){
        return greetingService.greet();
    }
}
