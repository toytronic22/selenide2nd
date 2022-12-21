import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class CawaBanga {
    @Test
    void successfulSearchTest() {
        //Откройте страницу Selenide в Github
        open("https://github.com/selenide/selenide");
        //Перейдите в раздел Wiki проекта
        $("[id=wiki-tab]").click();
        //Убедитесь, что в списке страниц (Pages) есть страница SoftAssertions
        $("[id=wiki-pages-box] button").click();
        $("[id=wiki-pages-box]").shouldHave(text("SoftAssertions"));
        //Откройте страницу SoftAssertions, проверьте что внутри есть пример кода для JUnit5
        $("[id=wiki-pages-box]").$(byText("SoftAssertions")).click();
        $("[class=markdown-body]").shouldHave(text("Using JUnit5 extend test class"));

    }
}
