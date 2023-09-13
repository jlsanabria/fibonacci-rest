package net.sanabria.fibonacci.service;

import org.springframework.stereotype.Service;

@Service
public class FibonacciService {
    public Integer getFibonacciN(Integer n) {
        int a = -1, b = 1, c = a + b;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
        }
        return c;
    }
}
