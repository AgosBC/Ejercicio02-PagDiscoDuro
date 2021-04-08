import java.util.Random;

public class Persona {

   
    private String nombre;
    private int edad;
    private double peso;
    private double altura;
    private int dni;
    private char sexo;
   
    //los atributos tienen un valor por defecto menos el dni
    //para ello se usa modificador de acceso(public private) +
    //la palabra "final" + tipo de variable + variable = valor asignado
    
    private final static char sexoPorDefecto = 'H'; //char comilla simple

      
    //para calcular el IMC el ejercicio recomienda usar constantes:
    public static final int pesoIdeal = 0;
    public static final int pesoBajo = -1;
    public static final int sobrepreso = 1;

    //pide constructor con 3 paramatros con nombre edada y sexo. uno por defecto, uno con todos los atributos
    //por defecto
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = "";
        this.edad = 0;
        this.sexo = sexoPorDefecto;
        this.peso = 0;
        this.altura = 0;       
    }

    //tres parametros
    public Persona(String nombre, int edad, char sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo =sexo;
        comprobarSexo();
    }
    
    //con todos los atributos (over kill much?)
    public Persona (String nombre,int edad,char sexo, double peso, double altura, int dni){
        this(nombre, edad, sexo);
        this.peso = peso;
        this.altura= altura;
        comprobarSexo(); // tuve que chequear en la pagina del ejercicio no estoy segura por que va asi
        generarDni();
        this.dni = dni;
    }
  

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
    // metodo para calcular el indice de masa corporal IMC (peso en kg/(altura^2  en m). menor que 20, la función devuelve un -1,si devuelve un número entre 20 y 25 (incluidos) 0
    //mayor que 25 significa que tiene sobrepeso 1

    public int calcularIMC(){
        double IMC = this.peso / (this.altura*this.altura);
        if (IMC < 20){
            return pesoBajo;
        } else if (IMC >= 20 && IMC <= 25){
            return pesoIdeal;
        } else 
            return sobrepreso;
    }

    //pide Setters para todo menos dni

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    public void setAltura (double altura){
        this.altura = altura;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }

    


    //pide usar el metodo toString para mostrar toda la info del objeto. 
    //El método toString nos permite mostrar la información completa de un objeto, es decir, el valor de sus atributos
    /*public String toString (){
        String mensaje="El empleado se llama "+nombre+" "+apellido+" con "+edad+" años " +
                "y un salario de "+salario;
        return mensaje;
    }
    El mensaje puede ser como nosotros queramos.

Veamos un ejemplo practico:
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

/*public String Persona.toString(){
    //hago un if para saber que me de el sexo correcto de a persona
    String sexo;
    if (this.sexo == 'H'){
        sexo= "Hombre";
    }
    else{ 
        sexo = "Mujer";
    }
    String mensaje= "Informacion de la persona" + "nombre: "+ nombre + edad + " de edad " + " dni numero "+ dni + " su peso es " + peso+ " kg " + " mide " + altura + " metros";
    return mensaje;
}

*/


}



