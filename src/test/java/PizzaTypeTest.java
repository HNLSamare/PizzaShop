import org.app.PizzaType;
import org.junit.jupiter.api.Test;

public class PizzaTypeTest {

    @Test
    public void testGetPrintableDescription() {
        // creating a sample data
        PizzaType pizzaType = new PizzaType();
        pizzaType.setId(199);
        pizzaType.setName("garlic");
        pizzaType.setPrice(890);

        //calling the actual function to be tested
        String result = pizzaType.getPrintableDescription();
        org.junit.jupiter.api.Assertions.assertEquals("Name:garlic,Pizza ID:199 and the price is:890.0",result);
    }


}
