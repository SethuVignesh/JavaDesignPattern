package Prototype;

/**
 * Created by sethugayu on 8/14/16.
 */
public abstract class Shape implements Cloneable{
    protected String type;
private String id;

    abstract void draw();

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
    public  Object clone(){
        Object clone = null;
        try{
            clone=super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
