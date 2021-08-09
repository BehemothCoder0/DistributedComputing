package subscriber;

import middleware.MessageBroker;
import model.Message;

public class BookNameSubscriber2 implements Subscriber{
	
	MessageBroker messageBroker = MessageBroker.getInstance();

	@Override
	public void printSubscribeMessage(Message message) {
		System.out.println("The Subscriber name is:"+this.getClass().getName());
		System.out.println("Message came from topic:"+message.getTopic()+" and the message is:"+message.getMessage());
		
	}

	@Override
	public void registerSubscriber() {
		messageBroker.registerSubscriber(this);
	}

	@Override
	public String getTopic() {
		// TODO Auto-generated method stub
		return "book";
	}

}
