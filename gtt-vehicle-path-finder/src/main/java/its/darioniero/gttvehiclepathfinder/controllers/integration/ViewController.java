package its.darioniero.gttvehiclepathfinder.controllers.integration;

import its.darioniero.gttvehiclepathfinder.entities.Fermata;
import its.darioniero.gttvehiclepathfinder.services.FermataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

import java.util.List;

@Controller
public class ViewController {

    @Autowired
    FermataService fermataService;

    @GetMapping
    public String getLinee(Model model) {
        List<Fermata> fermate = fermataService.fetchAllFermata();
        model.addAttribute("fermate", fermate);
        return "fermate";
    }


    @GetMapping("/linee")
    String getFermate(@RequestParam("firstStop") String firstFermata,
                      @RequestParam("secondStop") String secondFermata) {
        return "linee";
    }

    @GetMapping("/goto/linee")
    public RedirectView redirectToLinee(@RequestParam("firstStop") String firstFermata,
                                     @RequestParam("secondStop") String secondFermata) {

        String url = "/linee?firstStop=" + firstFermata + "&secondStop=" + secondFermata;
        RedirectView redirectView = new RedirectView(url);


        return redirectView;
    }

//    @GetMapping("/linee")
//    public RedirectView redirectToLinee(@RequestParam("firstStop") String firstFermata,
//                                        @RequestParam("secondStop") String secondFermata) {
//        RedirectView redirectView = new RedirectView("/linee.html");
//        redirectView.addQueryParameter("firstStop", firstFermata);
//        redirectView.addQueryParameter("secondStop", secondFermata);
//        return redirectView;
//    }

}
