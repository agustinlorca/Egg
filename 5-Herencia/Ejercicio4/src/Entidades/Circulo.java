package Entidades;

import Interfaces.calculosFormas;

public class Circulo implements calculosFormas {

    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        double area = PI * radio * radio;

        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double calcularPerimetro() {
        double per = 2 * PI * radio;
        return Math.round(per * 100.0) / 100.0;
    }

}
