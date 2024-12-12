//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Calculadora {
    public static void main(String[] args) {
        suma(3,2);
        resta(10,5);
        multiplicacion(5,5);
        division(10,2);
        potencia2(3);
        raizCuadrada(4);//Ejemplo de Raiz
        log(100);
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
    //Funcion de Raiz Cuadrada Añadida
   public static void raizCuadrada(double numero){
        if (numero < 0) {
            System.out.println("No se puede calcular la raíz cuadrada de un número negativo.");
        }
        System.out.println(Math.sqrt(numero));
   }
    // Parte Diego
    public static void modulo (Integer numero1, Integer numero2){
        System.out.println(numero1%numero2);
    }

    // Parte César
    public static void log(Integer num){
        String resultado = num > 0
                ? String.format(Locale.US, "%.2f", Math.log10(num))
                : "Error: log(x) solo es válido para x > 0";

        System.out.println(resultado);
    }
}
