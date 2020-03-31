package feqra.retail.store.service.rule;

import feqra.retail.store.domain.support.CustomerType;
import feqra.retail.store.dtos.CustomerDTO;
import feqra.retail.store.service.rule.engine.DiscountType;

public class EmployeeDiscountRule implements  DiscountRule
{
    @Override
    public Integer calculateCustomerDiscount(CustomerDTO customer)
    {
        return CustomerType.EMPLOYEE.equals(customer.getCustomerType())
                ? DiscountType.EMPLOYEE_DISCOUNT.getPercentage():0;
    }
}
