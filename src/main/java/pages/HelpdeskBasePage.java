package pages;

import elements.MainMenu;

public class HelpdeskBasePage extends AbstractPage {

    public MainMenu mainMenu() {
        return new MainMenu(driver);
    }
}
