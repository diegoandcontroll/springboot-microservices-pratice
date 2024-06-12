package com.diegoandcontroll.payment.notification;

import java.math.BigDecimal;

import com.diegoandcontroll.payment.domain.PaymentMethod;

public record PaymentNotificationRequest(
        String orderReference,
        BigDecimal amount,
        PaymentMethod paymentMethod,
        String customerFirstname,
        String customerLastname,
        String customerEmail
) {
}