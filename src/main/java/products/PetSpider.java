package products;

import java.math.BigDecimal;

public class PetSpider implements Product {
    private final String name;
    private final int numberOfLegs;
    private final String color;
    private final boolean isStinky;

    public PetSpider(String name, int numberOfLegs, String color, boolean isStinky) {

        this.name = name;
        this.numberOfLegs = numberOfLegs;
        this.color = color;
        this.isStinky = isStinky;
    }

    @Override
    public BigDecimal calculatePrice() {
        BigDecimal price = BigDecimal.valueOf(1.20 * numberOfLegs);
        if (color.equals("red")) {
            price = price.add(BigDecimal.valueOf(2.0));
        }
        if (isStinky) {
            price = price.divide(BigDecimal.valueOf(2));
        }
        return price;
    }
}
