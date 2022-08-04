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
    private int velocidadActual;

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

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the modelo
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the motor
     */
    public int getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(int motor) {
        this.motor = motor;
    }

    /**
     * @return the combustible
     */
    public tipoCombustible getCombustible() {
        return combustible;
    }

    /**
     * @param combustible the combustible to set
     */
    public void setCombustible(tipoCombustible combustible) {
        this.combustible = combustible;
    }

    /**
     * @return the automovil
     */
    public tipoAutomovil getAutomovil() {
        return automovil;
    }

    /**
     * @param automovil the automovil to set
     */
    public void setAutomovil(tipoAutomovil automovil) {
        this.automovil = automovil;
    }
    
    /**
     * @return the puertas
     */
    public int getPuertas() {
        return puertas;
    }

    /**
     * @param puertas the puertas to set
     */
    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    /**
     * @return the asientos
     */
    public int getAsientos() {
        return asientos;
    }

    /**
     * @param asientos the asientos to set
     */
    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    /**
     * @return the velocidadMáxima
     */
    public int getVelocidadMáxima() {
        return velocidadMáxima;
    }

    /**
     * @param velocidadMáxima the velocidadMáxima to set
     */
    public void setVelocidadMáxima(int velocidadMáxima) {
        this.velocidadMáxima = velocidadMáxima;
    }

    /**
     * @return the color
     */
    public tipoColor getColor() {
        return color;
    }
    /**
     * @param color the color to set
     */
    public void setColor(tipoColor color) {
        this.color = color;
    }
    
    /**
     * @return the color
     */
    public int getVelocidadActual() {
        return velocidadActual;
    }

    /**
     * @param velocidadActual the velocidadActual to set
     */
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
    
    public int tiempo(int distancia)
    {
        int tiempo = distancia/velocidadActual;
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
