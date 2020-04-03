package co.davidguimaraes.oauthjwtdemo.resources;

import co.davidguimaraes.oauthjwtdemo.models.Hello;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

@RestController
@RequestMapping("/api")
public class MainResource {

    @GetMapping(value = "/hello", consumes = MediaType.ALL_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public Hello hello() {
        return new Hello(BigInteger.ONE, "Hello!");
    }
}
