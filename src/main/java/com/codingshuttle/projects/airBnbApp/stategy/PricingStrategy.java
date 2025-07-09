package com.codingshuttle.projects.airBnbApp.stategy;

import com.codingshuttle.projects.airBnbApp.entity.Inventory;

import java.math.BigDecimal;

public interface PricingStrategy {

    BigDecimal calculatePrice(Inventory inventory);

}
