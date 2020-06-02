package kz.davletalin.fibo.entity;

import java.math.BigInteger;

public class Fibonacci {
    private long index;
    private BigInteger value;

    public Fibonacci() {
    }

    public Fibonacci(BigInteger value) {
        this.value = value;
    }

    public long getIndex() {
        return index;
    }

    public void setIndex(long index) {
        this.index = index;
    }

    public BigInteger getValue() {
        return value;
    }

    public void setValue(BigInteger value) {
        this.value = value;
    }
}
