package tests;


import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

class YandexTest {
    @Test
void selenideSearchTest() {
        // Открыть Yandex
         open("https://yandex.ru");


// Ввести Autumn в поиск
                $(byName("text")).setValue("Autumn").pressEnter();
// Проверить, что TEST появился в результатах поиска
       $( "html").shouldHave(text("context.reverso.net"));
}


}
