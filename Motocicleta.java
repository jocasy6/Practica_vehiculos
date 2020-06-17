public class Motocicleta {
    String marca;
    String modelo;
    int precio;
    String color;
    String letra;
    int numeros;
    String uletras;
    
    public Motocicleta(String marca, String modelo, int precio, String color, String letra, int numeros, String uletras){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.numeros= numeros;
        this.uletras = uletras;
    }
    public Motocicleta(){
        this.marca = "Italika";
        this.modelo = "Ft 150";
        this.precio =19999;
        this.color = "Amarillo";
        this.letra = "PUY";
        this.numeros= 68;
        this.uletras = "gp";
        
    }
    public void Moto1(){
        
    Motocicleta a3 = new Motocicleta();

    
       System.out.println("Vehiculo 3  \n");
        System.out.println("Marca= "+ a3.marca +"\nModelo= "+ a3.modelo + "\nPrecio= "+ a3.precio +"\nColor= "+a3.color);
        System.out.println("Matricula= "+ a3.letra +"-"+ a3.numeros +"-"+ a3.uletras);
       System.out.println("Otras caracteristicas:  \n");

    }
    public void Moto2(){
            Motocicleta a4 = new Motocicleta("Vento", "Tornado 250", 30999, "Negro", "Opt", 45, "hp");
                System.out.println("Vehiculo 4  \n");   
  System.out.println("Marca= "+ a4.marca +"\nModelo= "+ a4.modelo + "\nPrecio= "+ a4.precio +"\nColor= "+a4.color);
        System.out.println("Matricula= "+ a4.letra +"-"+ a4.numeros +"-"+ a4.uletras);
    System.out.println("Otras caracteristicas:  \n");
        
    }
    public void pasajero()
        {
            System.out.println("La motocilcleta se encuentra sin tripulacion");
        }
        public void llanta()
        {
        System.out.println("La moto tiene 2 llantas ");
        }
        public void terreno()
        {                
        System.out.println("Medio de desplazamiento : Carretera\n");
}
    
}
