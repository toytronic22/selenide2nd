package pack;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class HoverTest {
    @Test
    void hoverSolutionsTest() {
        step("Перейти на сатй github", () -> {
            open("https://github.com/");
        });
        step("Выбрать меню Solutions", () -> {
            $(byText("Solutions")).hover();
        });
        step("Перейти на страницу Enterprise", () -> {
            $(byText("Enterprise")).click();
        });
        step("Проверить что есть текст Build like the best", () -> {
            $("div h1").shouldHave(text("Build like the best"));
        });

    }
}