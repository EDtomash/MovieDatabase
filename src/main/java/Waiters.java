import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import java.time.Duration;

import static com.codeborne.selenide.Condition.visible;

public class Waiters {

    public SelenideElement getVisibilitiOfElement(SelenideElement element){
       return element.shouldBe(visible, Duration.ofSeconds(10));
    }

    public ElementsCollection getListPresentElements(ElementsCollection elements) {
        return elements.shouldBe(CollectionCondition.sizeGreaterThan(0), Duration.ofSeconds(10));
    }
}
