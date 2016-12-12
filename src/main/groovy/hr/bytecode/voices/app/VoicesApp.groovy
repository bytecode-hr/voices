package hr.bytecode.voices.app

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cache.annotation.EnableCaching
import org.springframework.context.annotation.ComponentScan

/**
 * Created by mihael.sedmak on 12.12.2016..
 */

@SpringBootApplication
@ComponentScan(basePackages = ["hr.bytecode.voices" ])
@EnableCaching
class VoicesApp {

    public static void main(String[] args) {
        SpringApplication.run(VoicesApp.class, args)
    }
}
