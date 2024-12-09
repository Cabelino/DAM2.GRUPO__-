//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {
    public static void main(String[] args) {
        suma(3,2);
        resta(10,5);
        multiplicacion(5,5);
        division(10,2);
        potencia2(3);
    }
    public static void suma(Integer num, Integer num1){
        System.out.println(num+num1);
    }
    public static void resta(Integer num, Integer num1){
        System.out.println(num-num1);
    }
    public static void multiplicacion(Integer num, Integer num1){
        System.out.println(num*num1);
    }
    public static void division(Integer num, Integer num1){
        System.out.println(num/num1);
    }
    public static void potencia2(Integer num){
        System.out.println(num*num);
    }
}