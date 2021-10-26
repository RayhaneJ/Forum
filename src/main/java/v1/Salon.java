package v1;

import java.util.ArrayList;
import java.util.List;

public class Salon {
    private final String topic;
    private List<Message> messages = new ArrayList<>()

    public Salon(String topic){
        this.topic = topic;
    }

    public String sujet(){
        return topic;
    }

    public void add(Message message){
        messages.add(message);
    }

    public void remove(Integer index){
        messages.remove(index);
    }

    public Integer size(){
        return messages.size();
    }

    @Override
    public String toString() {
        return "Salon{" +
                "topic='" + topic + '\'' +
                ", messages=" + messages +
                '}';
    }
}
