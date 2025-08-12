package com.codingshuttle.projects.airBnbApp.service;

import com.codingshuttle.projects.airBnbApp.entity.Booking;

public interface CheckoutService {
    String getCheckoutSession(Booking booking,String successUrl,String failureUrl);
}
