import com.codeborne.selenide.WebDriverRunner;
import com.setup.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.pages.Pages.mainPage;

public class TestMain extends BaseTest {

    @Test
    public void search() {
        open("https://amazon.com");
        mainPage().filter("Books");
        mainPage().searchFor("Java");
        String expectedURL = "https://www.amazon.com/s/ref=nb_sb_noss?url=search-alias%3Dstripbooks-intl-ship&field-keywords=Java";
        String actualURL = WebDriverRunner.getWebDriver().getCurrentUrl();
        Assert.assertEquals(actualURL,expectedURL );
    }

}
