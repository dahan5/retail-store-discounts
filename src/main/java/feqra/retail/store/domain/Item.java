package feqra.retail.store.domain;

import feqra.retail.store.domain.support.Identity;
import feqra.retail.store.domain.support.ItemType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name = "ITEM")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
public class Item extends Identity
{

    /**
	 * 
	 */
	private static final long serialVersionUID = -5322972882688908777L;

	@Column(name = "item_name")
    private String itemName;

    @Column(name = "item_type")
    @Enumerated(EnumType.STRING)
    private ItemType itemType;

    @Column(name = "item_price")
    private BigDecimal itemPrice;

    @ManyToOne
    @JoinColumn
    private PurchaseOrder purchaseOrder;

    public Item(String itemName, ItemType itemType, BigDecimal itemPrice)
    {
        this.itemName = itemName;
        this.itemType = itemType;
        this.itemPrice = itemPrice;
    }
}
