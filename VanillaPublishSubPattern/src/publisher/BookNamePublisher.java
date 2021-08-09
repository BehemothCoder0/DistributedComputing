package publisher;

import middleware.MessageBroker;
import model.Message;

public class BookNamePublisher implements Publisher {
	
	MessageBroker messageBroker = MessageBroker.getInstance();

	@Override
	public void publishMessage() {
		Message message = new Message();
		message.setTopic("book");
		message.setMessage("New Book came to town its Robin Cook Coma");
		messageBroker.sendMessage(message);
	}

}