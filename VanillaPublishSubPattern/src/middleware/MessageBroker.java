package middleware;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import model.Message;
import subscriber.Subscriber;

public class MessageBroker {
	
	
	private List<Subscriber> subscribers = new ArrayList<>();
	
	private static final MessageBroker instance =  new MessageBroker();
	
	private MessageBroker() {
		
	}
	
	public static MessageBroker getInstance() {
		return instance;
	}
	
	
	public void registerSubscriber(Subscriber subscriber) {
		if(subscribers.stream().anyMatch(sub -> sub.getTopic().contentEquals(subscriber.getTopic()))) {
			List<Subscriber> topicSubscribers = subscribers.stream().
					filter(sub -> sub.getTopic().contentEquals(subscriber.getTopic())).collect(Collectors.toList());
			
			subscribers.add(subscriber);
			
		}
		else {
			subscribers.add(subscriber);
		}
	}
	
	
	public void sendMessage(Message message) {
		String topic = message.getTopic();
		List<Subscriber> topicSubscribers = subscribers.stream().
				filter(sub -> sub.getTopic().contentEquals(message.getTopic())).collect(Collectors.toList());
		if(topicSubscribers.isEmpty()) {
			System.out.println("No Subscribers for this topic:"+topic);
			return;
		}
		
		for(Subscriber sub:topicSubscribers) {
			sub.printSubscribeMessage(message);
		}
		
	}

}
