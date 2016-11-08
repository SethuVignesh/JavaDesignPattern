package ProxyPattern;

/**
 * Created by sethugayu on 8/14/16.
 */
public class RealImage implements Image {
    private String fileName;
    public RealImage(String fileName){
        this.fileName=fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying Image of "+fileName);
    }
    public void loadFromDisk(String fileName){
        System.out.println("Loading "+fileName+" Image from Disk");
    }
}
