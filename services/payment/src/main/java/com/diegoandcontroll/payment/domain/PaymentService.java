package com.diegoandcontroll.payment.domain;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import com.diegoandcontroll.payment.notification.NotificationProducer;
import com.diegoandcontroll.payment.notification.PaymentNotificationRequest;

@Service
@RequiredArgsConstructor
public class PaymentService {

  private final PaymentRepository repository;
  private final PaymentMapper mapper;
  private final NotificationProducer notificationProducer;

  public Integer createPayment(PaymentRequest request) {
    var payment = this.repository.save(this.mapper.toPayment(request));

    this.notificationProducer.sendNotification(
            new PaymentNotificationRequest(
                    request.orderReference(),
                    request.amount(),
                    request.paymentMethod(),
                    request.customer().firstname(),
                    request.customer().lastname(),
                    request.customer().email()
            )
    );
    return payment.getId();
  }
}
