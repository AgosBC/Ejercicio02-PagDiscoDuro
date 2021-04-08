import java.util.Random;


public class Persona {

   
    private String nombre;
    private int edad;
    private float peso;
    private float altura;
    private int dni;
    private char sexo;

    //los atributos tienen un valor por defecto menos el dni
    //para ello se usa modificador de acceso(public private) +
    //la palabra "final" + tipo de variable + variable = valor asignado
    

    private final char sexoPorDefecto = 'H'; //char comilla simple
   
    //para calcular el IMC el ejercicio recomienda usar constantes:
    private final int pesoIdeal = -1;
    private final int pesoBajo = 0;
    private final int sobrepreso = 1;
  
 // pide metodo para comprobar el sexo, si el introducido es correcto y 
// si no lo es por defecto marcara H

    
    public void comprobarSexo() {
        if (sexo != 'H' && sexo != 'M'){
            this.sexo = sexoPorDefecto;
        }
        
    }

 //pide saber si es mayor de edad, devuelve boolean

    public boolean esMayorDeEdad(){
        if (edad > 18){
            return true;
        }
        return false;
    }
//generar un numero aleatorio  de 8 cifras
    public void generarDni(){

        //int rand = return (int) Math.floor(Math.random() * (max - min + 1)) + min; stack overflow solution

        int randomDni = (int) Math.floor(Math.random() * (100000000 - 10000000 + 1)) + 10000000;

        //otra solucion 
        //esto genera un numero de 8 digitos random de 0 a 99999999

       /* Random random = new Random();
        int num8digitos = random.nextInt(99999999);

        // esto convertira cualquier secuencia de numeros en 8 caracteres

        return String.format("%08d", num8digitos); -- este renglon da con error por que no va un return en un void y no se si se puede sacar */


    }

    //pide usar el metodo toString para mostrar toda la info del objeto. 
    //El método toString nos permite mostrar la información completa de un objeto, es decir, el valor de sus atributos
    /*public String toString (){
        String mensaje="El empleado se llama "+nombre+" "+apellido+" con "+edad+" años " +
                "y un salario de "+salario;
        return mensaje;
    }
    El mensaje puede ser como nosotros queramos.

Veamos un ejemplo practico: (java desde cero)
public class EmpleadoApp {
 
    public static void main(String[] args) {
 
        //Creamos dos objetos distintos
        Empleado empleado1=new Empleado("Fernando", "Ureña", 23, 600);
        Empleado empleado2=new Empleado("Antonio", "Lopez", 28, 900);
        Empleado empleado3=new Empleado("Alvaro", "Perez", 19, 800);
 
        //Mostramos la informacion del objeto
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());
    }
 
}*/






}



