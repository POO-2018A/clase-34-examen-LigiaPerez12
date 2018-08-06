package interfaces;

public class Cuadrado implements Figura{
    
    private double lado;

    public double getLado() {
        return lado;
    } 

    public void setLado(double lado) {
        this.lado = lado;
    }
    
    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3){
        double resultadoPerimetro = lado*4;
        return resultadoPerimetro ;
    }
    
    @Override
    public double calcularArea(double lado, double lado1){
        double resultado=lado*lado;
        return resultado;
    }
    
}
