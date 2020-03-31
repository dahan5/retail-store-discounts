package feqra.retail.store.service.rule;

import feqra.retail.store.dtos.CustomerDTO;

/**
 * @author Taleb DAHAN
 *
 * Rule interface following <b>The Rules Design Pattern</b>
 */
public  interface DiscountRule
{
     Integer calculateCustomerDiscount(CustomerDTO customer);
}
