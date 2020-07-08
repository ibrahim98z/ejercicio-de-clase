package problema;
import utils.Leer;
//autor Armaulia Espinoza

public class ejerciciodeclase {
    public static int factorial(){
       int i;
   int fact=1;
   int numero;
   System.out.println("Ingrese un númnero: ");
   numero = Leer.entero();
   if(numero<0) fact =0;
   else if(numero==0) fact=1;
   else{
      for (i = 1; i <= numero; i++){
         fact = fact*i;
      }
   }
   System.out.println("factorial de "+numero+" es  "+fact+" ..");
        return 0;
}
 public static void Potencia(){
        double base, expo, result;
        System.out.println("Potencia de un numero");
        System.out.print("Ingrese la base: ");
        base = Leer.decimal();
        System.out.print("Ingrese el exponente");
        expo = Leer.decimal();
        result = Math.pow(base, expo);
        System.out.println("la potencia es igual a "+result);
    }   
    
    
    public static void Raiz(){
        double numero, result=0;
        System.out.print("Ingrese un número: ");
        numero = Leer.decimal();
        result = Math.sqrt(numero);
        System.out.println("La raíz cuadrada de "+numero+" es "+result);
    }
public static void Rangodenumeros(){
       int a,b, temp;
        System.out.print("Valor a = ");
        a =  Leer.entero();
        System.out.print("Valor b = ");
        b =  Leer.entero();
        
        System.out.println("[" + a + "," + b + "]");
        if (a>b){
            temp = a;
            a = b;
            b = temp;
        }
        do{
            System.out.println(a);
            a++;
        }while (a <= b);
      
    }
    
    
    public static void error(){
        System.out.println("Error. Opción incorrecta");
    }
    public static void salir(){
        System.out.println("Gracias por visitarnos...");
    }
    public static void menu(){
        System.out.println("MENU PRINCIPAL");
        System.out.println("1. factorial");
        System.out.println("2. Potencia");
        System.out.println("3. Raiz");
        System.out.println("4. Rango de dos numeros");
        System.out.println("5. Salir");
        System.out.print("Ingrese opción [1-5]: ");
    }
    public static void inicio(){
        int opcion;
        do{
            menu();
            opcion = Leer.entero();
            switch(opcion){
                case 1: factorial();
                        break;
                case 2: Potencia();
                        break;
                case 3: Raiz();
                        break;
                case 4: Rangodenumeros();
                        break;
                case 5: salir();
                        break;
                default:error();
            }
        }while(opcion!=5);
    }
    // Método principal
    public static void main(String[] args) {
        inicio();
    }
}

    
