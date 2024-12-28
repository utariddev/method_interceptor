package org.utarid;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        ICalculator proxyCalculator = (ICalculator) Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[]{ICalculator.class},
                new MethodInterceptor(calculator)
        );

        int result = proxyCalculator.calculate(10, 20, "*");
        System.out.println("result : " + result);
    }
}