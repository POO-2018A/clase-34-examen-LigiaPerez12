package interfaces;

public class Circulo implements Figura{
    
    double radio;

    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3) {
        double resultadoPerimetro = 2*PI*lado;
        return resultadoPerimetro;
    }

    @Override
    public double calcularArea(double radio,double radio1) {
        double resultado=PI*(radio*radio);
        return resultado;
    }

   
    
}
