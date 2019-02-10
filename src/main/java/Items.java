public class Items {

    public String getFtpUser(){
        String userId = System.getenv("FTP_USER");
        return userId;
    }


    public String getFtpPassword(){
        String pw = System.getenv("FTP_PASSWORD");
        return pw;
    }



}
