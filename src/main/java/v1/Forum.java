package v1;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final String topic;
    private List<Theme> themes = new ArrayList<>();

    public Forum(String topic){
        this.topic = topic;
    }

    public String sujet(){
        return topic;
    }

    public void add(Theme theme){
        themes.add(theme);
    }

    public void remove(Integer index){
        themes.remove(index);
    }

    public Integer size(){
        return themes.size();
    }

    @Override
    public String toString() {
        return "Forum{" +
                "topic='" + topic + '\'' +
                ", themes=" + themes +
                '}';
    }
}
