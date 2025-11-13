import java.util.List;

public class ProductService {
    private ProductDAO dao = new ProductDAO();

    public void addProduct(Product product) {
        dao.addProduct(product);
    }

    public void listProducts() {
        List<Product> products = dao.getAllProducts();
        products.forEach(System.out::println);
    }

    public void updateProduct(Product product) {
        dao.updateProduct(product);
    }

    public void deleteProduct(int id) {
        dao.deleteProduct(id);
    }
}
