import org.junit.Assert;
import org.junit.Test;

public class ItemsTest {

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
