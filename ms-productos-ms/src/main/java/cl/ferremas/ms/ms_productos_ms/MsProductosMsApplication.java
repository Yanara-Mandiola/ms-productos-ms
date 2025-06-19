package cl.ferremas.ms.ms_productos_ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients  
public class MsProductosMsApplication {

    public static void main(String[] args) {
        SpringApplication.run(MsProductosMsApplication.class, args);
    }

}
