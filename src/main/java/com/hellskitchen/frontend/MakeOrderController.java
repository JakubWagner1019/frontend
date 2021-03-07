package com.hellskitchen.frontend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MakeOrderController {

    private final MenuService menuService;

    public MakeOrderController(MenuService menuService) {
        this.menuService = menuService;
    }

    @GetMapping("/make")
    public String showMakeOrderPage(Model model){
        Menu menu = menuService.get();
        model.addAttribute("menu",menu);
        return "make";
    }

}
