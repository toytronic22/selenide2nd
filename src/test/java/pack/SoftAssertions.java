package pack;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class SoftAssertions {
    @Test
    public void paragraphCanBeFoundTest() {
        Configuration.browserSize = "1920x1080";
        //Open Selenide page in Github
        open("https://github.com/selenide/selenide");
        //Open project Wiki
        $("#wiki-tab").click();
        //Check that pages list contains SoftAssertions
        //$$(".markdown-body ul li a").findBy(text("Soft assertions")).click();
        $(byText("Soft assertions")).click();
        //Open page SoftAssertions, check that it contains JUnit5 code example
        $(byTagAndText("h4","3. Using JUnit5 extend test class:")).sibling(0).$("pre").
                shouldBe(visible);

    }
}
