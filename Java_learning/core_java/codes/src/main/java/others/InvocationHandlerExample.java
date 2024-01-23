package others;

import java.lang.reflect.*;

public class InvocationHandlerExample {
    public static void main(String[] args) {
        Calculator calculator = createCalculatorProxy();

        int result = calculator.calculate(5, 3);

        System.out.println("Result: " + result);
    }

    public static Calculator createCalculatorProxy() {
        Calculator target = new CalculatorImpl();
        InvocationHandler handler = new TraceHandler(target);

        return (Calculator) Proxy.newProxyInstance(
                Calculator.class.getClassLoader(),
                new Class[] { Calculator.class },
                handler
        );
    }
}

interface Calculator {
    int calculate(int a, int b);
}

class CalculatorImpl implements Calculator {
    @Override
    public int calculate(int a, int b) {
        return a + b;
    }
}

class TraceHandler implements InvocationHandler {
    private Object target;

    public TraceHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("Calling method: " + method.getName());
        if (args != null) {
            System.out.print("Arguments: ");
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println();
        }

        Object result = method.invoke(target, args);

        System.out.println("Method result: " + result);
        return result;
    }
}
