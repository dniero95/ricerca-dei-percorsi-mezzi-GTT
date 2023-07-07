package its.darioniero.gttvehiclepathfinder.controllers.integration;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class ViewController {

    @GetMapping
    String getLinee(){
        return "fermate";
    }

    @GetMapping("/linee")
    String getFermate() {
        return "linee";
    }

    @GetMapping("/goto/linee")
    public RedirectView redirectToLinee() {
        return new RedirectView("/linee");
    }
}
