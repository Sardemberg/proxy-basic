public class Main {
    public static void main(String[] args) {
        String filename = "/etc/hosts";

        ProxyImage image = new ProxyImage(filename);

        image.display();
    }
}