package feqra.retail.store.domain;

import feqra.retail.store.domain.support.Identity;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Set;

@Entity
@Table(name = "PURCHASE_ORDER")
@Data
@EqualsAndHashCode(exclude = "items", callSuper = true)
@NoArgsConstructor
public class PurchaseOrder extends Identity
{
    /**
	 * 
	 */
	private static final long serialVersionUID = -4971937822033188251L;

	@Column(name = "order_name")
    private String orderName;

    @Column(name = "purchase_date")
    private LocalDateTime purchaseDate;

    @ManyToOne
    @JoinColumn
    private Customer customer;

    @OneToMany(mappedBy = "purchaseOrder")
    private Set<Item> items;

}
