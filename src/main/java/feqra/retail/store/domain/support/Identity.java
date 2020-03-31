package feqra.retail.store.domain.support;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * Superclass of all major persistence objects.
 *
 * @author Taleb DAHAN
 */
@MappedSuperclass
@Data
public abstract class Identity implements Serializable
{

    /**
	 * 
	 */
	private static final long serialVersionUID = 8226006605360200926L;
	/**
     * The identificator of the object. It is unique in the context of the objects of certain type.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter(AccessLevel.PACKAGE)
    protected Long id;

}