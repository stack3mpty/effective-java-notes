package com.stack3mpty.effective.java.item01;

/**
 * @author stack3mpty
 * @date 2025/8/23 16:28
 */
public class Advantage05 {
    public static void main(String[] args) {
        Service service = ServiceFactory.getService();
        service.doSomething();
    }

    interface Service {
        void doSomething();
    }

    static class ServiceFactory {
        public static Service getService() {
            // Returns an instance of a class that may not exist when the factory was written
            // Concrete class could be added later
            return new MyServiceImpl();
        }
    }

    static class MyServiceImpl implements Service {
        @Override
        public void doSomething() {
            System.out.println("do something");
        }
    }

}
