package products;

import java.math.BigDecimal;

public class RegularProduct implements Product {
    private final String name;
    private final BigDecimal sellPrice;

    public RegularProduct(String name, BigDecimal sellPrice) {

        this.name = name;
        this.sellPrice = sellPrice;
    }


    @Override
    public BigDecimal calculatePrice() {
        return this.sellPrice;
    }
}
