package com.kamid.kamid_back;

import com.kamid.kamid_back.domain.Product;
import com.kamid.kamid_back.repository.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(MyRunner.class);

    @Autowired
    private ProductRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.deleteAll();

        repository.save(new Product("Szczypka", 0.45f));
        repository.save(new Product("Baranek", 2.60f));
        repository.save(new Product("Sopla", 0.60f));

        repository.findAll().forEach(product -> {
            logger.info("{}", product);
        });
    }
}
