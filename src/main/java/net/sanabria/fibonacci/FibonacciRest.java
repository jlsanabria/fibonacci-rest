package net.sanabria.fibonacci;

import net.sanabria.fibonacci.service.FibonacciService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api")
public class FibonacciRest {
    public final FibonacciService fibonacciService;

    public FibonacciRest(FibonacciService fibonacciService) {
        this.fibonacciService = fibonacciService;
    }

    @GetMapping(value = "/fibonacci/{n}")
    public Integer getFibonacciN(@PathVariable Integer n){
        return fibonacciService.getFibonacciN(n);
    }
}
