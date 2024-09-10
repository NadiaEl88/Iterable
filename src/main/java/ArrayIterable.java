import java.util.ArrayList;
import java.util.List;

public class ArrayIterable {
    private List<String> ObstList;
    public ArrayIterable() {
        ObstList = new ArrayList<>();
        ObstList.add("Bananen");
        ObstList.add("Äpfel");
        ObstList.add("Trauben");
        ObstList.add("Orangen");
        ObstList.add("Erdbeeren");
    }
    public List<String> getObstList() {
        return ObstList;
    }

}
