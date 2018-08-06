package examen;

public class Rectangulo implements Figura{
    
    private double lado;
    private double lado2;
   
    private double TeoremaPitagoras = (Math.pow(lado,2)+Math.pow(lado2,2));
    private double Resultado = Math.pow(TeoremaPitagoras, 2);
    
    
     public double getLado() {
        return lado;
    }

    public void setLado(double lado1) {
        this.lado = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    
    @Override
    public double calcularArea(double lado, double lado2, double lado3){
        double resultado=lado*lado2/2;
        return resultado;
    }

    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3){
        double resultadoPerimetro = lado+lado2+Resultado;
        return resultadoPerimetro;
    }
    
    @Override
    public double calcularAltura(double lado,double lado2,double lado3){
        double resultadoPerimetro = lado*lado2/Resultado;
        return resultadoPerimetro;
    }
}
