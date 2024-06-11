package com.diegoandcontroll.order.kafka;

import java.math.BigDecimal;
import java.util.List;

import com.diegoandcontroll.order.customer.CustomerResponse;
import com.diegoandcontroll.order.domain.PaymentMethod;
import com.diegoandcontroll.order.product.PurchaseResponse;

public record OrderConfirmation (
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products

) {
}