package com.prueba_deuda_bancos.pruebaTecnicaBancos;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

import javax.sql.DataSource;

@SpringBootApplication
@EnableEurekaClient
public class serviceUserTaskApplication implements CommandLineRunner {

    private DataSource dataSource;
    private final Log logger = LogFactory.getLog(this.getClass());

    public serviceUserTaskApplication( DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {

        SpringApplication.run(serviceUserTaskApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {

    }


}
