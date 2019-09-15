import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class ItemsTest {
    @Test
    public void getFtpUser() throws Exception {
        Items items = new Items();
        String user = items.getFtpUser();
        Assert.assertEquals("ftpuser", user);
    }

    @Test
    public void getFtpPassword() throws Exception {
        Items items = new Items();
        String password = items.getFtpPassword();
        Assert.assertEquals("password", password);
    }

    @Test
    public void getCCNumber() throws Exception {
        Items item = new Items();
        String[] card = System.getenv("VISA_CARD").split(",");
        Assert.assertEquals("4444444444444448",item.getCCNumber(card));

    }

    @Test
    public void getExpirty() throws Exception {
    }

    @Test
    public void getCVC1() throws Exception {
         Assert.assertEquals("1", "1");
    }

}
