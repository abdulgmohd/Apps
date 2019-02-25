public class Items {

    public String getFtpUser(){
        String userId = Constants.FTP_USER;
        return userId;
    }


    public String getFtpPassword(){
        String pw = Constants.FTP_PASSWORD;
        return pw;
    }

    public String getCCNumber(String[] creditCard){
        return creditCard[0];

    }
    public String getExpirty(String[] creditCard){
        return creditCard[1];

    }
    public String getCVC(String[] creditCard){
        return creditCard[2];
    }


}
