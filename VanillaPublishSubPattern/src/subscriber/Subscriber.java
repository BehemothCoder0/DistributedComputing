package subscriber;

import model.Message;

public interface Subscriber {
	public void printSubscribeMessage(Message message);
	public void registerSubscriber();
	public String getTopic();
}
