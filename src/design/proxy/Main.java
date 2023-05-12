package design.proxy;

public class Main {
    public static void main(String[] args) {
        Image image1 = new ProxyImage("test1.png");
        Image image2 = new ProxyImage("test2.png");

        image1.displayImage();
        System.out.println();

        image1.displayImage();
        System.out.println();

        image2.displayImage();

        //Loading test1.png
        //Displaying test1.png
        //
        //Displaying test1.png
        //
        //Loading test2.png
        //Displaying test2.png
    }
}
