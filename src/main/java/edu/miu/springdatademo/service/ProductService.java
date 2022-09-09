package edu.miu.springdatademo.service;

import edu.miu.springdatademo.dto.ProductDTO;
import edu.miu.springdatademo.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ProductService {

    //Read
    public List<ProductDTO>  getAllProduct();
    public ProductDTO getProductById();

    //Create
   public ProductDTO saveProduct(ProductDTO productDTO);

    //Update
    public ProductDTO updateProduct(ProductDTO productDTO,Integer id);

    //Delete
    public ProductDTO deleteProduct(Integer id);


    List<ProductDTO> getProductsByMinPrice(Integer minPrice);
}