package test;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class Selenide {


    @Test
    public void testIssue(){
    open("https://github.com/");
    $(".header-search-input").click();
    $(".header-search-input").sendKeys("3osnovy_java");
    $(".header-search-input").submit();

    $(partialLinkText("3osnovy_java")).click();

    $(partialLinkText("Issues")).click();
    $(withText("#1")).should(Condition.exist);


}

}

