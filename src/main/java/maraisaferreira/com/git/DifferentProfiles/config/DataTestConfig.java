package maraisaferreira.com.git.DifferentProfiles.config;

import lombok.RequiredArgsConstructor;
import maraisaferreira.com.git.DifferentProfiles.entities.Product;
import maraisaferreira.com.git.DifferentProfiles.entities.enums.ProductCategories;
import maraisaferreira.com.git.DifferentProfiles.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.List;

@RequiredArgsConstructor
@Configuration
@Profile("dev")
public class DataTestConfig implements CommandLineRunner {
    private final ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Product lapiseira = new Product(null, "Lapiseira Gummy", 7.9, 10, ProductCategories.PAPELARIA);
        Product cadeira = new Product(null, "Cadeira Giratória Gammer", 790.0, 5, ProductCategories.MOVEIS);
        Product mouse = new Product(null, "Mouse Gammer", 35.90, 12, ProductCategories.INFORMATICA);

        productRepository.saveAll(List.of(
                lapiseira,
                cadeira,
                mouse
        ));
    }
}
