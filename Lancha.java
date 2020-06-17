
public class Lancha {
    String marca;
    String modelo;
    int precio;
    String color;
    String letra;
    int numeros;
    String uletras;
    public Lancha(String marca, String modelo, int precio, String color, String letra, int numeros, String uletras){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.numeros= numeros;
        this.uletras = uletras;
    }
    public Lancha(){
        this.marca = "Searay Sundeck";
        this.modelo = "Mercriser";
        this.precio =800000;
        this.color = "Blanca";
        this.letra = "Hkd";
        this.numeros= 465;
        this.uletras = "Dr";
        
    }
    public void Lancha1(){
        
    Lancha a7 = new Lancha();

    
       System.out.println("Vehiculo 7  \n");
        System.out.println("Marca= "+ a7.marca +"\nModelo= "+ a7.modelo + "\nPrecio= "+ a7.precio +"\nColor= "+a7.color);
        System.out.println("Matricula= "+ a7.letra +"-"+ a7.numeros +"-"+ a7.uletras);
       System.out.println("Otras caracteristicas:  \n");

    }
    public void Lancha2(){
            Lancha a8 = new Lancha("Sea Ray Spx", "Mercury", 690000, "Azul", "jfh", 36, "jgu");
                System.out.println("Vehiculo 8  \n");   
  System.out.println("Marca= "+ a8.marca +"\nModelo= "+ a8.modelo + "\nPrecio= "+ a8.precio +"\nColor= "+a8.color);
        System.out.println("Matricula= "+ a8.letra +"-"+ a8.numeros +"-"+ a8.uletras);
    System.out.println("Otras caracteristicas:  \n");
        
    }
    public void pasajero()
        {
            System.out.println("La lancha se encuentra sin tripulacion");
        }
        public void llanta()
        {
        System.out.println("Dos Llantas para remolcar");
        }
        public void terreno()
        {                
        System.out.println("Medio de desplazamiento : Agua\n");
}
    
}
