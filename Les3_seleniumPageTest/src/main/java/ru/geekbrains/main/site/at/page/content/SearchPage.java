package ru.geekbrains.main.site.at.page.content;

import org.openqa.selenium.WebDriver;
import ru.geekbrains.main.site.at.view.SearchTabsView;

public class SearchPage extends ContentBasePage {

    private SearchTabsView searchTabs;

    public SearchPage(WebDriver driver) {
        super(driver);
        this.searchTabs = new SearchTabsView(driver);
    }

    @Override
    public SearchPage openUrl() {
        driver.get("https://geekbrains.ru/search");
        return this;
    }

    public SearchTabsView getSearchTabView() {
        return searchTabs;
    }
}
