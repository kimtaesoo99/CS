package design.proxy;

public class RealImage implements Image{

    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    private void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }

    @Override
    public void displayImage() {
        System.out.println("Displaying " + fileName);
    }
}
