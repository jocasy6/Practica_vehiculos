public class Helicoptero {
    String marca;
    String modelo;
    int precio;
    String color;
    String letra;
    int numeros;
    String uletras;
    public Helicoptero(String marca, String modelo, int precio, String color, String letra, int numeros, String uletras){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.numeros= numeros;
        this.uletras = uletras;
    }
    public Helicoptero(){
        this.marca = "Agusta a 109";
        this.modelo = "AW119 Koal";
        this.precio =19999999;
        this.color = "Blanco";
        this.letra = "100";
        this.numeros= 2645;
        this.uletras = "565";
        
    }
    public void Heli1(){
        
    Helicoptero a5 = new Helicoptero();

    
       System.out.println("Vehiculo 5  \n");
        System.out.println("Marca= "+ a5.marca +"\nModelo= "+ a5.modelo + "\nPrecio= "+ a5.precio +"\nColor= "+a5.color);
        System.out.println("Matricula= "+ a5.letra +"-"+ a5.numeros +"-"+ a5.uletras);
       System.out.println("Otras caracteristicas:  \n");

    }
    public void Heli2(){
            Helicoptero a6 = new Helicoptero("Sikorsky Aircraft", "Mil mII9", 640000000, "Azul/Blanco", "121", 47, "456");
                System.out.println("Vehiculo 6  \n");   
  System.out.println("Marca= "+ a6.marca +"\nModelo= "+ a6.modelo + "\nPrecio= "+ a6.precio +"\nColor= "+a6.color);
        System.out.println("Matricula= "+ a6.letra +"-"+ a6.numeros +"-"+ a6.uletras);
    System.out.println("Otras caracteristicas:  \n");
        
    }
    public void pasajero()
        {
            System.out.println("El  helicoptero se encuentra sin tripulacion");
        }
        public void llanta()
        {
        System.out.println("Notiene llantas");
        }
        public void terreno()
        {                
        System.out.println("Medio de desplazamiento : Aire\n");
}
    
}
