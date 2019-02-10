public class Items {

    public static void printInfo(){
        String userId = System.getenv("FTP_USER");
        String pw = System.getenv("FTP_PASSWORD");
        System.out.println("FTP_USER: " + userId);
        System.out.println("FTP_PASSWORD: "+ pw);
    }

    public static void main (String[] args){
        printInfo();
    }

}
