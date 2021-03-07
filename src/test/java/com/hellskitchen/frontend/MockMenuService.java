package com.hellskitchen.frontend;

import org.springframework.stereotype.Service;

public class MockMenuService implements MenuService {

    @Override
    public Menu get() {
        Menu menu = new Menu();
        menu.addPosition(1,"Frytki");
        menu.addPosition(2,"Jajecznica");
        return menu;
    }
}
