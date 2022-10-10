package com.zhang;

import org.junit.Test;

public class ProxyTest {
    @Test
    public void testStaticProxy() {
        CalculatorStaticProxy calculatorStaticProxy = new CalculatorStaticProxy(new CalculatorImpl());
        calculatorStaticProxy.add(1,2);
    }

    @Test
    public void testProxy(){
        ProxyFactory proxyFactory = new ProxyFactory(new CalculatorImpl());
        Calculator proxy = (Calculator) proxyFactory.getProxy();
        proxy.add(1,2);
    }
}
