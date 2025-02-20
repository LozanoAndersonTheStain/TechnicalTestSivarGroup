package com.technical.test.technicaltestsivargroup;

import com.technical.test.technicaltestsivargroup.config.DataBaseConfig;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TechnicalTestSivarGroupApplication {

    public static void main(String[] args) {
        Dotenv dotenv = Dotenv.load();
        DataBaseConfig.loadDatabaseProperties();
        SpringApplication.run(TechnicalTestSivarGroupApplication.class, args);

        DataBaseConfig.getConnection();
    }


}
