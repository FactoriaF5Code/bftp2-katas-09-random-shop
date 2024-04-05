package products;

import java.math.BigDecimal;

public class MagicCard implements Product {
    private final String name;
    private final String color;

    public MagicCard(String name, String color) {

        this.name = name;
        this.color = color;
    }

    @Override
    public BigDecimal calculatePrice() {
        if (this.name.contains("Black Lotus")) {
            return BigDecimal.valueOf(40000.0);
        }

        return switch (this.color) {
            case "blue" -> BigDecimal.valueOf(5.0);
            case "red" -> BigDecimal.valueOf(3.5);
            case "green" -> BigDecimal.valueOf(4.40);
            case "black" -> BigDecimal.valueOf(6.80);
            default -> BigDecimal.valueOf(2.0);
        };
    }
}
