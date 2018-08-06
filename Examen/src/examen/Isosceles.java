
package examen;

/**
 *
 * @author bayon
 */
public class Isosceles implements Figura{
    
    double lado;
    double lado2;
    
    @Override
    public double calcularArea(double lado,double lado2, double lado3) {
        double resultado= (((lado2)*Math.sqrt(Math.pow(lado, 2)-((Math.pow(lado2,2))/4))/2));
        return resultado;
    }
    
    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3) {
        double resultadoPerimetro = 2*lado*lado2;
        return resultadoPerimetro;
    }
    
    @Override
    public double calcularAltura(double lado,double lado2, double lado3) {
        double resultadoAltura= ((Math.pow(lado2,2))/4);
        return resultadoAltura;
    }

    

   
    
}
