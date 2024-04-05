package products;

import java.math.BigDecimal;

public class GourmetProduct implements Product {

    private final String name;
    private final Integer age;
    private final boolean isStinky;

    public GourmetProduct(String name, Integer age, boolean isStinky) {

        this.name = name;
        this.age = age;
        this.isStinky = isStinky;
    }

    @Override
    public BigDecimal calculatePrice() {
        if (this.isStinky) {
            return BigDecimal.valueOf(10.0 * this.age);
        }
        return BigDecimal.valueOf(20.0* this.age);
    }

}
