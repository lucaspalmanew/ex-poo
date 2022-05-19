package ex01;

public class Veiculo {

    private String marca;
    private String modelo;
    private String placa;
    private String cor;
    private float km;
    private boolean isLigado;
    private int listrosCombustivel;
    private int velocidade;
    private double preco;

    public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado, int listrosCombustivel, int velocidade, double preco) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
        this.km = km;
        this.isLigado = isLigado;
        this.listrosCombustivel = listrosCombustivel;
        this.velocidade = velocidade;
        this.preco = preco;
    }

    public Veiculo(String marca2, String modelo2, String placa2, String cor2, String string, boolean isLigado2,
            int listrosCombustivel2, int velocidade2, int preco2) {
    }

    public void ligar() {
        if (!this.isLigado) {
            System.out.println("Carro ligado com sucesso!");
            this.isLigado = true;
        } else {
            System.out.println("Carro já se encontra ligado!");
        }
    }

    public void desligar() {
        if (this.isLigado) {
            if (velocidade > 0) {
                System.out.println("Não é possível desligar, o carro em movimento!");
            } else {
                System.out.println("Carro desligado com sucesso!");
                this.isLigado = false;
            }
        }
    }

    public void acelerar() {
        if (this.isLigado) {
            this.velocidade += 20;
            System.out.println("Carro acelerado com sucesso! Sua velocidade atual = " + getVelocidade() + "Km/h");
        }
    }

    public void frear() {
        if (this.isLigado && this.velocidade > 0) {
            this.velocidade -= 20;
            System.out.println("Carro freado com sucesso! Sua velocidade atual = " + getVelocidade() + "Km/h");
        } else {
            System.out.println("Não é possível frear pois o veículo está parado!");
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println("Carro pintado com sucesso! Cor atual = " + cor);
    }

    public void abastecer(int combustivel) {
        int totalLitrosAposAbastecer = this.listrosCombustivel + combustivel;
        int limiteMaximoCombustivelNoTanque = 60;
        if (totalLitrosAposAbastecer <= limiteMaximoCombustivelNoTanque) {
            System.out.println("Carro abastecido com sucesso! Você tem " + totalLitrosAposAbastecer + " Litros");
            this.listrosCombustivel += combustivel;
        } else {
            System.out.println("Não é possível abastecer mais " + combustivel + " litros, " +
                    "pois ultrapassa a capacidade do tanque, quantidade de litros no tanque: " +
                    this.listrosCombustivel);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getKm() {
        return km;
    }

    public void setKm(float km) {
        this.km = km;
    }

    public boolean isLigado() {
        return isLigado;
    }

    public void setLigado(boolean ligado) {
        isLigado = ligado;
    }

    public int getListrosCombustivel() {
        return listrosCombustivel;
    }

    public void setListrosCombustivel(int listrosCombustivel) {
        this.listrosCombustivel = listrosCombustivel;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}