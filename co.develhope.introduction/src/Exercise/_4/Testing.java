package Exercise._4;

public class Testing {
    public static void main(String[] args) {
        //Defina una variable int llamada a e inicialícela con el valor 15
        int a = 15;
        //Agregue 5 a a sin repetir la variable a (por ejemplo, no se acepta a = a + 5)
        a += 5;
        System.out.println(a);

        //luego resta 4 a "a" sin repetir la variable
        a-= 4;
        System.out.println(a);

        //Asigne el valor de a a int b e incremente b en uno sin usar a o int b = b + 1
        int b = a;
        b++;
        System.out.println(b);

        //Comprueba e imprime si las dos declaraciones siguientes son verdaderas:
        // declaración 1: comprueba si b es un número impar
        if (b % 2 == 1){
            System.out.println(b + " es un numero impar");
        }else{
            System.out.println(b + " es un numero par");
        }
        // declaración 2: comprueba si el resultado de (b multiplicado por b + 1) es un múltiplo de 3

        int c = (b * (b + 1));//variable para comprobar si la declaracion 2 es verdadera o falsa

        if (c % 3 == 0){
            System.out.println(c + " no es un numero impar");
        }else{
            System.out.println(c + " es un numero par");
        }
    }
}
