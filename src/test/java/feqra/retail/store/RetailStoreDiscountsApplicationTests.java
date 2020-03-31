package feqra.retail.store;

import static org.springframework.test.util.AssertionErrors.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class RetailStoreDiscountsApplicationTests {

	@Test
	void contextLoads() {
	}
	
	@Test
    public void bootContextTest() {
        RetailStoreDiscountsApplication.main(new String[] {});
        assertTrue("I am here, Means application started successfully", true);
    }

}
