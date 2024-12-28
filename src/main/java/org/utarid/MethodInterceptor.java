package org.utarid;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

class MethodInterceptor implements InvocationHandler {

    private final Object target;

    public MethodInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Before method execution: " + method.getName());
        Object result = method.invoke(target, args);
        System.out.println("After method execution: " + method.getName());
        return result;
    }
}