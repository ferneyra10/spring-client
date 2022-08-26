package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloController {
	
	@GetMapping("/hello")
    public String hello(@RequestParam(name="name", required=false, defaultValue="Hello World OpenShift 26/08/2022 16:00 pm") String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
	
}
