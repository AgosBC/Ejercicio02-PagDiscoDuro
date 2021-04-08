import java.util.Scanner;

public class App {
    public static Scanner Teclado = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        //crear una clase ejecutable pida ingreso por teclado de nombre, edad, sexo, peso y altura

        System.out.println("ingrese nombre");
        String nombre = Teclado.nextLine();

        System.out.println("ingrese edad");
        int edad = Teclado.nextInt();

        System.out.println("ingrese sexo, solo inicial en mayuscula");
        char sexo = Teclado.next().charAt(0);






       // Persona persona1 = new Persona();
        Persona persona2 = new Persona(nombre, edad, sexo);
       // persona persona3 = new Persona(nombre, edad, sexo, peso, altura, dni)

        persona2.setPeso(65);
        persona2.setAltura(1.65);



       

    }
    public static void MensajeSobreIMC(Persona personas){ // tuve que copiar de la respuestas como realizar este renglon y el de abajo
    int IMC = personas.calcularIMC();
        switch  (IMC) {
            case Persona.pesoIdeal:
            System.out.println("Usted esta en su peso ideal");
            break;
            case Persona.pesoBajo:
            System.out.println("Usted esta por debajo del peso ideal");
            break;
            case Persona.sobrepreso:
            System.out.println("Usted esta por encima del peso ideal");
        }
    
}


}
