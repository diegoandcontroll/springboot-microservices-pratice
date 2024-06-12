package com.diegoandcontroll.order.payment;
import java.math.BigDecimal;

import com.diegoandcontroll.order.customer.CustomerResponse;
import com.diegoandcontroll.order.domain.PaymentMethod;

public record PaymentRequest(
    BigDecimal amount,
    PaymentMethod paymentMethod,
    Integer orderId,
    String orderReference,
    CustomerResponse customer
) {
}