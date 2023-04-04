package demo.repo;

import demo.model.Product;

import java.util.List;

public interface ProductRepository {

    List<Product> getProductList();

    Product getById(int id);
}
