package mvc_homework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

    @GetMapping("/")
    public String askDetails(Model model){
        model.addAttribute("person", new Person());
        return "askDetails";
    }

    @GetMapping ("/showDetails")
    public String showDetails(@ModelAttribute(name = "person")
                                  Person person){

        return "showDetails";
    }
}
