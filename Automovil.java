/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package automovil;

/**
 *
 * @author mafer
 */
public class Automovil {
    private String marca;
    private int modelo;
    private int motor; 
    enum tipoCombustible
    {
        gasolina, diesel, natural;
    }
    private tipoCombustible combustible;
    enum tipoAutomovil
    {
        subcompacto, compacto, familiar, ejecutivo, SUV;
    }
    private tipoAutomovil automovil;
    private int puertas; 
    private int asientos;
    private int velocidadMáxima;
    enum tipoColor
    {
        blanco, negro, rojo, naranja, amarillo, verde, azul, violeta;
    } 
    private tipoColor color;
    private int velocidadActual =0;

    public Automovil(String marca, int modelo, int motor, tipoCombustible combustible, tipoAutomovil automovil,int puertas, int asientos, int velocidadMáxima, tipoColor color,int velocidadActual) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor = motor;
        this.combustible = combustible;
        this.automovil = automovil;
        this.puertas = puertas;
        this.asientos = asientos;
        this.velocidadMáxima = velocidadMáxima;
        this.color = color;
        this.velocidadActual = velocidadActual;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getModelo() {
        return modelo;
    }
    
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public tipoCombustible getCombustible() {
        return combustible;
    }

    public void setCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }

    public tipoAutomovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(tipoAutomovil automovil) {
        this.automovil = automovil;
    }
    
    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    public void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    public tipoColor getColor() {
        return color;
    }

    public void setColor(tipoColor color) {
        this.color = color;
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }


    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }
    
    public void acelerar(int velocidad)
    {
        for (int i = 0; i < 1; i++) 
        {
            velocidadActual += velocidad;
            if (velocidadActual >= velocidadMáxima) 
            {
                System.out.println("Limite de velocidad");
            }
        }
    }
    
    public void desacelerar(int velocidad)
    {
        for(int i =0; i<1; i++)
        {
            velocidadActual -= velocidad;
            if(velocidadActual <= -1)
            {
                System.out.println("No existe");
            }
        }
    }
   
    public void frenar()
    {
        velocidadActual = 0;
    
    }
    
    public float tiempo(float distancia)
    {
        float tiempo =distancia/velocidadActual;
        return tiempo;
    }
    
    public void mostrar()
    {
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Motor: " + motor);
        System.out.println("Tipo de combustible: "+ getCombustible());
        System.out.println("Tipo de automovil: " + getAutomovil());
        System.out.println("Numero de puertas: " + puertas);
        System.out.println("Cantidad de asientos: " + asientos);
        System.out.println("Velocidad Maxima: " + velocidadMáxima);
        System.out.println("Color: " + getColor());
        System.out.println("Velocidad Actual: " + velocidadActual);
        
    }   
        public static void main(String[] args) 
    {
        Automovil auto = new Automovil("Honda",2010,3,tipoCombustible.diesel,tipoAutomovil.SUV,4,5,150,tipoColor.rojo,100);
        auto.mostrar();  
        System.out.println(" ");
        System.out.println("Tiempo de llegada: "+auto.tiempo(12));
        System.out.println(" ");  
        auto.acelerar(20);
        System.out.println("Aceleración: " +auto.velocidadActual); 
        System.out.println(" ");  
        auto.desacelerar(50);
        System.out.println("Desaceleración: " + auto.velocidadActual);
        System.out.println(" "); 
        auto.frenar(); 
        System.out.println("Esta frenando: " + auto.velocidadActual); 
        

    }
}
