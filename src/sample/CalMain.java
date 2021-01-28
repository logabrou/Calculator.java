package sample;



public class CalMain {

    public static void main(String[] args) {

//      This is the instance of Calculator
        Calculator calc = new Calculator();
//      Run some tests on the methods. With Calculator methods, Magic Calculator methods are not obtainable.
        System.out.println("Here is the Calculator class called calc.");
        System.out.println(calc.add(56, 75));
        System.out.println(calc.square(6));
        System.out.println(calc.multiply(56, 75));
        System.out.println(calc.divide(358, 6));
        System.out.println(calc.square(24));




//      This is the instance of Magic Calculator
        MagicCalculator fact = new MagicCalculator();

//      Run some tests on the methods. Magic Calculator allows me to run Magic Calculator methods and the parent
//      Calculator methods.
        System.out.println("\nHere is the Magic Calculator class called fact.");

//      These are methods from Magic Calculator.
        System.out.println("\nHere are class methods from Magic Calculator.");
        System.out.println(fact.factorial(6));
        System.out.println(fact.factorial(10));
        System.out.println(fact.sin(6));
        System.out.println(fact.cosin(6));
        System.out.println(fact.sqrt(81));
        System.out.println(fact.tan(6));


//      These are methods pulled from Calculator.
        System.out.println("\nHere are class methods from Calculator, called from the Magic Calculator class.");
        System.out.println(fact.add(3, 6));
        System.out.println(fact.multiply(3, 6));
        System.out.println(fact.square(6));
        System.out.println(fact.divide(358, 6));
        System.out.println(fact.square(24));





    }

}
