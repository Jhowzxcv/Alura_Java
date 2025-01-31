package atividades;

public class ConversorTemperaturaPadrao implements ConversorTemperatura{
    double temperaturaPadrao;
    public ConversorTemperaturaPadrao(double temperaturaPadrao) {
        this.temperaturaPadrao = temperaturaPadrao;
    }

    @Override
    public double celsiusParaFahrenheit() {
        return (temperaturaPadrao * 9 / 5) + 32;
    }

    @Override
    public double fahrenheitParaCelsius() {
        return (temperaturaPadrao - 32) * 5 / 9;
    }
}
