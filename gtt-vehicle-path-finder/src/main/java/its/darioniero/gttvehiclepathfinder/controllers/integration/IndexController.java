package its.darioniero.gttvehiclepathfinder.controllers.integration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping
    String getIndex(){
        return "index";
    }
}
