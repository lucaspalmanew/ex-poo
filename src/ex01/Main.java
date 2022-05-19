package ex01;

public class Main {
    public static void main(String[] args) {
        Veiculo camaro = new Veiculo("Chevrolet", "Camaro", "MRX-4527", "Branco", "10.000", false, 0, 0, 25000);
        
        camaro.ligar();
        camaro.acelerar();
        camaro.abastecer(30);
        camaro.frear();
        camaro.pintar("Preto");
        camaro.desligar();
        
    }
}