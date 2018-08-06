package examen;

/**
 *
 * @author ESFOT
 */
public class Equilatero implements Figura{
    
    private double lado;

    public double getLado() {
        return lado;
    } 

    public void setLado(double lado) {
        this.lado = lado;
    }
    @Override
    public double calcularArea(double lado, double lado1, double lado3){
        double resultadoArea= (Math.sqrt(3*lado)/2*Math.pow(lado,2));
        return resultadoArea;
    }
    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3){
        double resultadoPerimetro = 3*lado;
        return resultadoPerimetro ;
    }
    @Override
    public double calcularAltura(double lado, double lado2, double lado3){
        double resultado= (Math.sqrt(3*lado)/2);
        return resultado;
    }
    
}
