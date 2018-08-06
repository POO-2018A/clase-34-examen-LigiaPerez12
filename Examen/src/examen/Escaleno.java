
package examen;


public class Escaleno implements Figura{
    
    private double lado;
    private double lado2;
    private double lado3;
    
    private double Semiperimetro = lado+lado2+lado3/2;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getLado3() {
        return lado3;
    }

    public void setLado3(double lado3) {
        this.lado3 = lado3;
    }

    public double getSemiperimetro() {
        return Semiperimetro;
    }

    public void setSemiperimetro(double Semiperimetro) {
        this.Semiperimetro = Semiperimetro;
    }
   
    @Override
    public double calcularArea(double lado, double lado2, double lado3){
        double resultado= (Math.sqrt(Semiperimetro*(Semiperimetro-lado)*(Semiperimetro-lado2)*(Semiperimetro-lado3)));
        return resultado;
    }
    
    @Override
    public double calcularPerimetro(double lado,double lado2,double lado3){
        double resultadoPerimetro = lado+lado2+lado3;
        return resultadoPerimetro;
    }
    

    
    @Override
    public double calcularAltura(double lado,double lado2,double lado3){
        double resultadoAlturaLadoA = ((2/lado) * Math.sqrt(Semiperimetro*(Semiperimetro-lado)*(Semiperimetro-lado2)*(Semiperimetro-lado3)));
        return resultadoAlturaLadoA;
    }
}
