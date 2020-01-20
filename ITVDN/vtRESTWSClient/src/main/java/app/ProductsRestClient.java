package app;

import shop.entity.Student;
import shop.entity.StudentList;
import shop.service.Constants;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.net.URI;
import java.util.concurrent.Future;

public class ProductsRestClient extends Application {

	private static final URI BASE_URI = getBaseURI(Constants.BASE_URI, Constants.PORT, Constants.APPLICATION_PATH,
			Constants.PRODUCTS_SERVICE_PATH);

	private static final Client client = ClientBuilder.newClient();

	private static class Canceler<T> implements Runnable {
		final private Future<T> future;
		private long timeout = 30_000;
		
		public Canceler(final Future<T> future, long timeout) {
			this.future = future;
			this.timeout = timeout;
		}
		@Override
		public void run() {
			try {
				Thread.sleep(timeout);
			} catch (InterruptedException e) {
				return;
			}

			if (!future.isDone())
				future.cancel(true);
			System.out.println("Canceler. Wait done ...");
		}
	}
	
	public static void main(String[] args) throws JAXBException {
		runGet();
		getStudentByIdFromResponse(1);
		getStudentByIdFromResponse(5);
		getStudentByIdObject(2);
		getStudentByIdObject(6);
		getStudentList();
	}

	public static void runGet() {
		//Client client = ClientBuilder.newClient();
		WebTarget target = client.target(BASE_URI).path("test");
		//target.register(StudentList.class);
		Invocation.Builder request = target.request().accept(MediaType.TEXT_PLAIN);
		String result = request.get(String.class);
		System.out.println(result);
	}

	public static void getStudentList() {
		WebTarget target = client.target(BASE_URI).path("list");
		Invocation.Builder request = target.request().accept(MediaType.APPLICATION_XML);
		StudentList result = request.get(StudentList.class);
		System.out.println(result);
	}

	public static void getStudentByIdObject(int id) {
		WebTarget target = client.target(BASE_URI).path("student").path(String.valueOf(id));
		Invocation.Builder request = target.request();
		Student result = request.get(Student.class);
		System.out.println(result);
	}

	public static void getStudentByIdFromResponse(int id) throws JAXBException {
		WebTarget webTarget = client.target(BASE_URI).path("student").path("response").path(String.valueOf(id));
		Invocation.Builder invocationBuilder =  webTarget.request(MediaType.APPLICATION_XML);
//  1.
		Response response = invocationBuilder.get();
		Student student = (Student)response.readEntity(Student.class);

//	2.
//		Response response = invocationBuilder.get();
//		String body = response.readEntity(String.class);
//		JAXBContext context = JAXBContext.newInstance(Student.class);
//		Unmarshaller unmarshaller = context.createUnmarshaller();
//		Student student = (Student) unmarshaller.unmarshal(new StringReader(body));

		//Student student = response.readEntity(Student.class);

		System.out.println(student);
	}

	public static URI getBaseURI(String basePath, int port, String... path) {
		UriBuilder builder = UriBuilder.fromUri(basePath).port(port);
		for (String part : path) {
			builder.path(part);
		}
		URI uri = builder.build();
		System.out.println("uri: " + uri);
		return uri;
	}
}
