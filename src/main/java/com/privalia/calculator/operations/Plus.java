package com.privalia.calculator.operations;

public class Plus implements Operation{
    @Override
    public Double calc(Double a, Double b) {
        return a + b;
    }
}
