import java.io.Serializable;

public class Null  implements Serializable {

    public String toString(){
        return "null";
    }

    public boolean equals(Object o){
        if(o==null||o.getClass().getName().equals("Null"))return true;
        return false;
    }
}
