package com.hellskitchen.frontend;

import org.springframework.stereotype.Service;

@Service
public class MenuServiceImpl implements MenuService {

    private final MenuRepository menuRepository;

    public MenuServiceImpl(MenuRepository menuRepository) {
        this.menuRepository = menuRepository;
    }

    @Override
    public Menu get() {
        return menuRepository.get();
    }
}
