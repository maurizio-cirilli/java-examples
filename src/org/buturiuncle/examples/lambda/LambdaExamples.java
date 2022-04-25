package org.buturiuncle.examples.lambda;

import java.io.OutputStream;

public class LambdaExamples {

    public static void main(String[] args) {

        MyFunctionsInterface myInterface1 = x -> {
            System.out.print(x);
        };
        myInterface1.printIt("Hello World!!!");
        MyFunctionsInterface myInterface2 = text -> {
            System.out.println(text);
        };
        OutputStream.nullOutputStream();
        myInterface2.printUtf8To("Hello World",  OutputStream.nullOutputStream());

        MyFunctionsInterface myInterface3 = new MyFunctionsInterface() {
            @Override
            public void printIt(String text) {
                System.out.println(text);
            }
        };


    }
}
