package publisher;

import middleware.MessageBroker;
import model.Message;

public class MovieNamePublisher implements Publisher {
	
	MessageBroker messageBroker = MessageBroker.getInstance();

	@Override
	public void publishMessage() {
		Message message = new Message();
		message.setTopic("movie");
		message.setMessage("New Movie came to town its Shawshank Redemption");
		messageBroker.sendMessage(message);
	}

}
