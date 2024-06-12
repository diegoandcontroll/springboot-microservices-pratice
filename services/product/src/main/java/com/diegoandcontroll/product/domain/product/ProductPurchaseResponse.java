package com.diegoandcontroll.product.domain.product;

import java.math.BigDecimal;

public record ProductPurchaseResponse(
        Integer productId,
        String name,
        String description,
        String image,
        BigDecimal price,
        double quantity
) {
}