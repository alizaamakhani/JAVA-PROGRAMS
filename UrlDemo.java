import java.net.*;

class UrlDemo {
    public static void main(String args[]) {
        try {
            URL u = new URL("https://www.google.com/index.html");

            System.out.println("Protocol: " + u.getProtocol());
            System.out.println("Host: " + u.getHost());
            System.out.println("Port: " + u.getPort());
            System.out.println("File: " + u.getFile());

        } catch(Exception e) {
            System.out.println(e);
        }
    }
}