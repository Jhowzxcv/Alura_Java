package atividades;

public class CalculadoraSalaRetangular implements CalculoGeometrico{

    double base;
    double altura;

    public CalculadoraSalaRetangular(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return (base + altura) * 2;
    }
}


