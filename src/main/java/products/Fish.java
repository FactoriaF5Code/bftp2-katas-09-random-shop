package products;

import java.math.BigDecimal;

public class Fish implements Product {
    private final String name;
    private final String color;
    private final BigDecimal basePrice;

    public Fish(String name, String color, BigDecimal basePrice) {

        this.name = name;
        this.color = color;
        this.basePrice = basePrice;
    }

    @Override
    public BigDecimal calculatePrice() {
        return switch (this.color) {
            case "blue" -> this.basePrice.add(BigDecimal.valueOf(0.1));
            case "gold" -> this.basePrice.multiply(BigDecimal.valueOf(100.0));
            default -> this.basePrice;
        };
    }
}
