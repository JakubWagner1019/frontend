package com.hellskitchen.frontend;

public class MockMenuRepository implements MenuRepository {

    @Override
    public Menu get() {
        Menu menu = new Menu();
        menu.addPosition(1,"Frytki");
        menu.addPosition(2,"Jajecznica");
        return menu;
    }

}
