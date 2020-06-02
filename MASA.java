package IMC;

import java.util.Scanner;

public class MASA {

    public static void main(String[] args) {
        Scanner sex = new Scanner(System.in);
        Scanner name = new Scanner(System.in);
        String nombre;
        String sexo;
        int edad;
        float imc, mas,altura, peso;
        
        System.out.println("Calcular IMC(Indice de masa corporal");
        System.out.println("Ingresa su nombre: ");
        nombre = name.nextLine();

        System.out.println("Ingrese su Edad: ");
        edad = name.nextInt();

        System.out.println("Ingrese su SEXO: ");
        sexo = sex.nextLine();
                System.out.println("Ingrese su peso (Kg)");
        peso = name.nextFloat();
        System.out.println("Ingrese su altura(cms): ");
        altura = name.nextFloat();
        
        mas = altura*altura;
        imc= peso/mas;
        float f=imc*10000;
        if(f<=18){
            System.out.println("peso bajo normal");
        }else if(f>=18 && f<= 24.9){
            System.out.println("peso normal");
        } else if(f>=25 && f<=29.9){
            System.out.println("padeces de sobrepeso");
        }else if(f>=30 && f<=39.9){
            System.out.println("Obesidad");
        }
        System.out.println("Tu: " + nombre + " " + edad + "  " + sexo + "  " +f+ " ");

    }

}
