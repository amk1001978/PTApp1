public class PrinterApp {
    public static void main(String[] args) {
        // Variable declarations
       
        String creator = "MD Sabir Hossin";
        int number1 = 5;
        int number2 = 2;
        int multiplication;
        int addition;
        int subtraction;
        double division;

        // Printing basic info

        System.out.println("Printer App");
        System.out.print("This app is made by: ");
        System.out.println(creator);

        
        System.out.println("The value of number1 is " + number1);
        System.out.println("The value of number2 is " + number2);

        multiplication = number1 * number2;
        addition = number1 + number2;
        subtraction = number1 - number2;
        division = (double) number1 / number2;

        System.out.println(number1 + " * " + number2 + " = " + multiplication);
        System.out.println(number1 + " + " + number2 + " = " + addition);
        System.out.println(number1 + " - " + number2 + " = " + subtraction);
        System.out.println(number1 + " / " + number2 + " = " + division);
    }
}
