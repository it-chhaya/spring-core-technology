package co.istad.sbdemo.config;

import co.istad.sbdemo.model.Product;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ProductConfig {

    @Bean("iPhone")
    @Primary
    public Product iPhone() {
        Product product = new Product();
        product.setModel("iPhone");
        return product;
    }

    @Bean("samsung")
    public Product samsung() {
        Product product = new Product();
        product.setModel("Samsung");
        return product;
    }

}
