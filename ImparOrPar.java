import java.util.Scanner;

public class ImparOrPar {
    static void Declare(){
        Scanner Scan= new Scanner(System.in);
        System.out.println("Bienvenido a mi Código para saber si un número es impar o no");
        System.out.println("Introuzca el número que desea conocer su paridad (solo pueden ser de tipo entero)");
        int x = Scan.nextInt();
        int y = x%2;
        if (y==1){
            System.out.println("El número introducido es impar");
        }else{
            System.out.println("El número introducido es par");
        }
        Scan.close();
    }
    public static void main(String[]args){
        Declare();
    }
}
