package lab.andersen.katokoleg.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class UserAccount implements Observer {

    List<Message> unreadedMessages = new ArrayList<>();

    @Override
    public void inform(String data) {
        unreadedMessages.add(new Message(data));
        unreadedMessages.stream()
                .map(Message::getText)
                .forEach(System.out::println);
    }
}
