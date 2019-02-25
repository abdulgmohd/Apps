import org.junit.Assert;
import org.junit.Test;

public class ItemsTest {
    @Test
    public void getCCNumber(String[] creditCard) throws Exception {
        String[] card = Constants.VISA_CARD.split(",");
       String cardNumber = card[0];
       Assert.assertEquals("4444444444444448", cardNumber);
    }


    @Test
    public void verifyFtpUser(){
        Items item = new Items();
        String userId= item.getFtpUser();
        Assert.assertEquals(userId , "ftpuser");

    }

    @Test
    public void verifyFtpUserPassword(){
        Items item = new Items();
        String pw = item.getFtpPassword();
        Assert.assertEquals(pw , "password");

    }


}
