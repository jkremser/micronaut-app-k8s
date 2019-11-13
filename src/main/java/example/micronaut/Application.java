package example.micronaut;

import io.micronaut.runtime.Micronaut;
//import sun.misc.Signal;
//import sun.misc.SignalHandler;

public class Application {

    public static void main(String[] args) {
//        SignalHandler sh = sig -> System.exit(128 + sig.getNumber());
//        Signal.handle(new Signal("INT"), sh);
//        Signal.handle(new Signal("TERM"), sh);
        Micronaut.run(Application.class);
    }
}