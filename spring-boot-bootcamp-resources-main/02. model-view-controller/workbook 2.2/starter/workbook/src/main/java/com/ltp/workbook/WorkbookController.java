package com.ltp.workbook;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Controller
public class WorkbookController {
    
    @GetMapping("/shows")
    public ModelAndView getShows() {
        Map<String, Show> model = new HashMap<>();
        model.put("show1", new Show("Breaking Bad", "Ozymandias", 10.0));
        model.put("show2",new Show("Attack on Titan", "Hero", 9.9));
        model.put("show3",new Show("Attack on Titan", "Perfect Game", 9.9));
        model.put("show4",new Show("Star Wars: The Clone Wars", "Victory and Death", 9.9));
        model.put("show5",new Show("Mr. Robot", "407 Proxy Authentication Required", 9.9));



        return new ModelAndView("shows", model);
    }

}
