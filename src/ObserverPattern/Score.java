package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Score
{
    private int data;
    public List<Observer> observers= new ArrayList<>();

    public void addChannel(Observer observer){
        observers.add(observer);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
        execute();
    }

    public void execute(){
        for(Observer observer:observers){
            observer.update();
        }
    }
}
