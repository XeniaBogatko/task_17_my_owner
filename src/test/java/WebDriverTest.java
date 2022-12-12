import com.bogatko.config.WebDriverProvider;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class WebDriverTest {

    @BeforeAll
    static void configure() {
        WebDriverProvider.configure();
    }

    @Test
    public void testGithub() {
        open("https://github.com/");
        $("title").shouldHave(attribute("text", "GitHub: Let’s build from here · GitHub"));
    }
}
