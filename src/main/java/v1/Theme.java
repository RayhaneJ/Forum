package v1;

import java.util.ArrayList;
import java.util.List;

public class Theme {
    private final String topic;
    private List<Salon> salons = new ArrayList<>();

    public Theme(String topic) {
        this.topic = topic;
    }

    public String sujet(){
        return topic;
    }

    @Override
    public String toString() {
        return "Theme{" +
                "topic='" + topic + '\'' +
                '}';
    }

    public void add(Salon salon){
        salons.add(salon);
    }

    public void remove(Integer index){
        salons.remove(index);
    }

    public Integer size(){
        return salons.size();
    }
}
