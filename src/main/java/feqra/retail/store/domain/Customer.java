package feqra.retail.store.domain;

import feqra.retail.store.domain.support.CustomerType;
import feqra.retail.store.domain.support.Identity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "CUSTOMER")
@Data
@EqualsAndHashCode(exclude = "purchaseOrders",callSuper = true)
@NoArgsConstructor
public class Customer extends Identity
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -3230777510981354775L;

	@Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "created_date")
    private LocalDateTime createdDate;

    @Column(name = "customer_type")
    @Enumerated(EnumType.STRING)
    private CustomerType customerType;

    @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
    private Set<PurchaseOrder> purchaseOrders;

    /**
     * Explicit Arguments constructor
     * @param firstName
     * @param lastName
     * @param customerType
     */
    public Customer(String firstName, String lastName, CustomerType customerType)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.customerType = customerType;
    }

}
