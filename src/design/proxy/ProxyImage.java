package design.proxy;

public class ProxyImage implements Image{

    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void displayImage() {
        // 객체의 초기화를 지연시켜 실제로 사용될 때 생성함으로써 메모리 절약
        if (realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.displayImage(); // 프록시가 RealImage()의 메소드를 호출
    }
}
