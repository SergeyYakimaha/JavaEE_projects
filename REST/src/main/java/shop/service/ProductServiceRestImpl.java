package shop.service;

import shop.Store;
import shop.entity.Product;
import shop.entity.ProductList;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;

@Path(Constants.PRODUCTS_SERVICE_PATH)
public class ProductServiceRestImpl {

	private static final int LONG_WORK_WAIT_TIMEOUT = 1000;

	private static final int DEFAULT_THREAD_POOL_SIZE = 10;

	private Store store;

	ExecutorService executor = Executors.newFixedThreadPool(DEFAULT_THREAD_POOL_SIZE);
	
	@PostConstruct
	public void init() throws JAXBException {
		store = Store.getInstance();
	}

	@PreDestroy
	public void destroy() {
		store = null;
	}

	@GET
	public Response all() {
		return Response.ok(new ProductList(store.all().stream().
				map(p -> p.getProduct()).collect(Collectors.toList()))
				).build();
	}
	
	@GET
	@Path("{pattern}")
	public ProductList find(@PathParam("pattern") String pattern) {
		return new ProductList(store.all(pattern).stream().
				map(p -> p.getProduct()).collect(Collectors.toList()));
	}
	
	@Path("search")
	public ProductsSearcher find() throws IOException {
		return new ProductsSearcher();
	}
	
	@GET
	@Path("/{id: \\d+}")
	public Product productDetails(@PathParam("id") long id) throws ProductNotAvailableException {
		ProductLine product = store.get(id);
		if (product == null) {
			throw new ProductNotAvailableException("Продукт не найден id: " + id);
		}
		return product.getProduct();
	}

	@PUT
	public long add(Product product, @QueryParam("amount") int amount) throws ProductNotValidException {
		return store.add(new ProductLine(product, amount));
	}

	@POST
	public void update(Product product, @QueryParam("amount") int amount) throws ProductNotValidException, ProductNotAvailableException {
		store.update(new ProductLine(product, amount));
	}

	@DELETE
	public void remove() throws ProductNotAvailableException {
		store.clear();
	}

}
