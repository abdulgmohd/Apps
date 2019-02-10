public class Items {

    public static void printInfo(){
        String userId = System.getProperty("FTP_USER");
        String pw = System.getProperty("FTP_PASSWORD");
        System.out.println(userId);
        System.out.println(pw);
    }

    public static void main (String[] args){
        printInfo();
    }

}
