public class Principal {
    public static void main(String[] args)
    {
     Auto a1 = new Auto();
    Auto a2 = new Auto("hyundai", "sedan", 189999, "Azul", "Tkj", 35, "kp");
    Motocicleta a3 = new Motocicleta();
    Motocicleta a4 = new Motocicleta("Vento", "Tornado 250", 32999, "negro", "Hjk", 42, "jb");  
    Helicoptero a5 = new Helicoptero();
    Helicoptero a6 = new Helicoptero("Sikorsky Aircraft", "", 640000000, "Azul/Blanco", "121", 47, "456");
    Lancha a7 = new Lancha();
    Lancha a8 = new Lancha("Sea Ray Spx", "Mercury", 690000, "Azul", "jfh", 36, "jgu");
    System.out.println("Almacen de vehiculos transportados por un tren  \n");
        a1.vehiculo1();
         a1.pasajero();
        a1.llanta();
        a1.terreno();
        a2.vehiculo2();
        a2.pasajero();
        a2.llanta();
        a2.terreno();
   a3.Moto1();
         a3.pasajero();
        a3.llanta();
        a3.terreno();
      a4.Moto2(); 
        a4.pasajero();
        a4.llanta();
        a4.terreno();  
          a5.Heli1(); 
        a5.pasajero();
        a5.llanta();
        a5.terreno(); 
        a6.Heli2(); 
        a6.pasajero();
        a6.llanta();
        a6.terreno(); 
        a7.Lancha1();
        a7.pasajero();
        a7.llanta();
        a7.terreno();
        a8.Lancha2();
        a8.pasajero();
        a8.llanta();
        a8.terreno();    
    }
}
