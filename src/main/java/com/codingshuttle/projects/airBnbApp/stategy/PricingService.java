package com.codingshuttle.projects.airBnbApp.stategy;

import com.codingshuttle.projects.airBnbApp.entity.Inventory;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
@Service
public class PricingService {
    public BigDecimal calculateDynamicPricing(Inventory inventory) {
        PricingStrategy pricingStrategy = new BasePricingStrategy();

        pricingStrategy = new SurgePricingStrategy(pricingStrategy);
        pricingStrategy = new OccupancyPricingStrategy(pricingStrategy);
        pricingStrategy = new  UrgencyPricingStrategy(pricingStrategy);
        pricingStrategy = new HolidayPricingStrategy(pricingStrategy);

        return pricingStrategy.calculatePrice(inventory);
    }
}
