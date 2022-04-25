package org.buturiuncle.examples.lambda;

public class LambdaExamples2 implements MyFunctionsInterface {

    public static void main(String[] args) {
        LambdaExamples2 lambdaExamples2 = new LambdaExamples2();
        MyFunctionsInterface.printItToSystemOut("Ciao Mondo !!!");
    }

    @Override
    public void printIt(String text) {
        System.out.println(text);
    }
}
