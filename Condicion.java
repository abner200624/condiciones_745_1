import java.util.Scanner;

class Condicion {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);

    System.out.println("Reciba un cordial saludo, favor ingrese su nombre: ");    
    String nome = leer.nextLine();
    
    System.out.println("Hola "+nome);

    System.out.println("Ingrese su ano actual: ");
    int annoact = leer.nextInt();
    System.out.println("Ingrese el mes actual (Ejemplo. Enero= 1; Febrero= 2; Marzo= 3; Abril= 4.....): ");
    int mesact = leer.nextInt();
    System.out.println("Ingrese el dia actual: ");
    int diact = leer.nextInt();
    
    System.out.println("Hoy es: "+annoact+"/"+mesact+"/"+diact);

    System.out.println("Ahora, ingresa tu ano de nacimiento: ");
    int annori = leer.nextInt();
    System.out.println("Ingresa tu mes de nacimiento (Ejemplo. Enero= 1; Febrero= 2; Marzo= 3; Abril= 4.....): ");
    int mesori = leer.nextInt();
    System.out.println("Ingresa tu dia de nacimiento ");
    int diaori = leer.nextInt();

    int edad = annoact-annori;
    int mescum = mesori-mesact;
    String signo = leer.nextString();
    
//Seguir trabajando

    if(mesori == 1)
    {
     if(diaori <= 19)
      {
       signo = "Capricornio";
      }
     else
      {
       signo = "Acuario";
      }      
    }
    else
    {
     if(mesori == 2)
      {
       if(diaori <= 19)
        {
         signo = "Capricornio";
        }
       else
        {
         signo = "Acuario";
        }
      }
     else
      {
       signo = "Acuario";
      }     
    }    



    if(mescum != 0)
    {
     System.out.println("felicidades, ya tienes"+edad);      
    }
    else
    {
     System.out.println("Aun no tienes "+edad);     
    }






  }
}
