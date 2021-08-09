import publisher.BookNamePublisher;
import publisher.BookNamePublisher2;
import publisher.MovieNamePublisher;
import publisher.MovieNamePublisher2;
import subscriber.BookNameSubscriber;
import subscriber.BookNameSubscriber2;
import subscriber.MovieNameSubscriber;
import subscriber.MovieNameSubscriber2;

public class Main {
	public static void main(String[] args) {
		BookNamePublisher pub1 = new BookNamePublisher();
		MovieNamePublisher pub2 = new MovieNamePublisher();
		BookNamePublisher2 pub3 =  new BookNamePublisher2();
		MovieNamePublisher2 pub4 = new MovieNamePublisher2();
 		
		BookNameSubscriber sub1 = new BookNameSubscriber();
		MovieNameSubscriber sub2 = new MovieNameSubscriber();
		
		BookNameSubscriber2 sub3 = new BookNameSubscriber2();
		MovieNameSubscriber2 sub4 = new MovieNameSubscriber2();
		
		sub1.registerSubscriber();
		sub2.registerSubscriber();
		sub3.registerSubscriber();
		sub4.registerSubscriber();
		
		pub2.publishMessage();
		pub4.publishMessage();
	}
}
