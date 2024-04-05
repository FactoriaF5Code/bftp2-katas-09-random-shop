package products;

import java.math.BigDecimal;

public class LandAnimal implements Product {
    private final String name;
    private final Integer numberOfLegs;

    public LandAnimal(String name, Integer numberOfLegs) {

        this.name = name;
        this.numberOfLegs = numberOfLegs;
    }

    @Override
    public BigDecimal calculatePrice() {
        return BigDecimal.valueOf(4.2*this.numberOfLegs);
    }

}
