
/**
 *  Modela una fecha
 *  @author - Jon García  
 */
public class Fecha
{
    // Atributos
    private int dia;
    private int mes;
    private int año;

    // Constructor
    public Fecha(int dia, int mes, int año){
        this.dia = dia;
        this.mes = mes;
        this.año = año;

    }   

    // Accesor o Getter para Día
    public int getDia(){
        return dia;
    }

    // Accesor o Getter para Mes
    public int getMes(){
        return mes;
    }

    // Accesor o Getter para Mes
    public int getAño(){
        return año;
    }

    // Mutador o Setter para Dia
    public void setDia(int dia){
        this.dia = dia;
    }

    // Mutador o Setter para Mes
    public void setMes(int mes){
        this.mes = mes;
    }

    // Mutador o Setter para Año
    public void setAño(int año){
        this.año = año;
    }


    // Devuelve una copia exacta al objeto actual
    public Fecha obtenerCopia() {
        Fecha copia = new Fecha(this.dia, this.mes, this.año);
        return copia;

    }

    /**
     * 
     */
    public String toString() {
        return this.dia + "/"  + this.mes+ "/" + this.año;
    }

    

}
