import products.Product;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private final List<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public Double getTotalPrice() {
        return products.stream()
                .map(this::calculatePrice)
                .reduce(BigDecimal.ZERO, BigDecimal::add)
                .doubleValue();
    }

    private BigDecimal calculatePrice(Product product) {
        return product.calculatePrice();
    }

}
