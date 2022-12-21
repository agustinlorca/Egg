package Entidades;

import Interfaces.calculosFormas;

public class Rectangulo implements calculosFormas {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        double area = base * altura;
        return Math.round(area * 100.0) / 100.0;
    }

    @Override
    public double calcularPerimetro() {
        double per = (base + altura) * 2;
        return Math.round(per * 100.0) / 100.0;
    }

}
