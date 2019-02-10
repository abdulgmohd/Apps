import org.junit.Test;

public class ItemsTest {

    @Test
    public void verifyFtpUser(){
        Items item = new Items();
        item.getFtpUser().equalsIgnoreCase("ftpuser");

    }

    @Test
    public void verifyFtpUserPassword(){
        Items item = new Items();
        item.getFtpPassword().equalsIgnoreCase("passord");

    }
}
