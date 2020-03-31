package feqra.retail.store.service.rule;

import feqra.retail.store.dtos.CustomerDTO;
import feqra.retail.store.service.rule.engine.DiscountType;

import java.time.LocalDateTime;

public class TwoYearsDiscountRule implements  DiscountRule
{
    @Override
    public Integer calculateCustomerDiscount(CustomerDTO customer)
    {
        return customer.getCreatedDate().isBefore(LocalDateTime.now().minusYears(2))?
                DiscountType.CUSTOMER_OVER_TWO_YEARS.getPercentage():0;
    }
}
