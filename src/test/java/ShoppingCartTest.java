import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import products.*;

import java.math.BigDecimal;
import java.util.stream.Stream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class ShoppingCartTest {


    private static Stream<Arguments> provideProducts() {
        return Stream.of(
                Arguments.of(new MagicCard("Magic: The Gathering - Lightning Bolt", "red"), 3.5),
                Arguments.of(new MagicCard("Magic: The Gathering - Maga Eternal", "blue"), 5.0),
                Arguments.of(new MagicCard("Magic: The Gathering - Forest", "green"), 4.40),
                Arguments.of(new MagicCard("Magic: The Gathering - artifact", "brown"), 2.0),
                Arguments.of(new MagicCard("Magic: The Gathering - swamp", "black"), 6.8),
                Arguments.of(new MagicCard("Magic: The Gathering - Black Lotus", "brown"), 40000.0),
                Arguments.of(new GourmetProduct("el tio juanillo", 5, false), 100.0),
                Arguments.of(new GourmetProduct("French Camembert", 5, true), 50.0),
                Arguments.of(new LandAnimal("cienpies", 100), 420.0),
                Arguments.of(new LandAnimal("perro", 4), 16.8),
                Arguments.of(new Fish("pez payaso", "orange", BigDecimal.valueOf(1L)), 1.0),
                Arguments.of(new Fish("pez azul", "blue", BigDecimal.valueOf(1L)), 1.1),
                Arguments.of(new Fish("pez dorado", "gold", BigDecimal.valueOf(1L)), 100.0),
                Arguments.of(new RegularProduct("lata de atun", BigDecimal.valueOf(3.64)), 3.64),
                Arguments.of(new PetSpider("araña mascota roja", 8, "red", true), 5.8)
        );
    }

    @ParameterizedTest
    @MethodSource("provideProducts")
    void calculatePriceForProducts(Product product, Double expectedPrice) {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.addProduct(product);

        assertThat(shoppingCart.getTotalPrice(), equalTo(expectedPrice));
    }

}
