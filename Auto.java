public class Auto {
    String marca;
    String modelo;
    int precio;
    String color;
    String letra;
    int numeros;
    String uletras;
    
    public Auto(String marca, String modelo, int precio, String color, String letra, int numeros, String uletras){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.color = color;
        this.letra = letra;
        this.numeros= numeros;
        this.uletras = uletras;
    }
    public Auto(){
        this.marca = "Chevrolet";
        this.modelo = "Vento";
        this.precio =190999;
        this.color = "Rojo";
        this.letra = "WlU";
        this.numeros= 98;
        this.uletras = "jp";
        
    }
    public void vehiculo1(){
        
    Auto a1 = new Auto();

    
       System.out.println("Vehiculo 1  \n");
        System.out.println("Marca= "+ a1.marca +"\nModelo= "+ a1.modelo + "\nPrecio= "+ a1.precio +"\nColor= "+a1.color);
        System.out.println("Matricula= "+ a1.letra +"-"+ a1.numeros +"-"+ a1.uletras);
       System.out.println("Otras caracteristicas:  \n");

    }
    public void vehiculo2(){
            Auto a2 = new Auto("hyundai", "sedan", 189999, "Azul", "Tkj", 35, "kp");
                System.out.println("Vehiculo 2  \n");   
  System.out.println("Marca= "+ a2.marca +"\nModelo= "+ a2.modelo + "\nPrecio= "+ a2.precio +"\nColor= "+a2.color);
        System.out.println("Matricula= "+ a2.letra +"-"+ a2.numeros +"-"+ a2.uletras);
    System.out.println("Otras caracteristicas:  \n");
        
    }
        public void pasajero()
        {
            System.out.println("El auto se encuentra sin tripulacion");
        }
        public void llanta()
        {
        System.out.println("El auto tiene 4 llantas y una de repuesto");
        }
        public void terreno()
        {                
        System.out.println("Medio de desplazamiento : Carretera\n");
}
}
