package creationalPattern.prototypePattern;

/**
 * Created by medasta on 04/11/2016.
 */
public abstract class Shape implements Cloneable{
    private int id;
    protected String type;


    public abstract void draw();
    @Override
    protected Object clone() {

        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
            return null;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
