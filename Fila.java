
/**
 *  Representa a una fila de la hoja de cálculo
 *  Toda fila tiene un identificador y en ella
 *  se anotan la fecha, los ingresos y los gastos correspondientes a un
 *  apunte  contable  de una empresa
 * 
 * @author - Jon García  
 *  
 */
public class Fila
{
    // Atributos
    private String id;
    private Fecha fecha;
    private double ingresos;
    private double gastos;

    // Constructores sobrecargados
    // Constructor 1
    public Fila(String id){
        this.id = id;
        this.ingresos = 0;
        this.gastos = 0;
        this.fecha = null;
    }

    // Constructor 2
    public Fila(String id, Fecha fecha, double ingresos, double gastos){
        this.id = id;
        this.fecha = null;
        this.ingresos = 0;
        this.gastos = 0;
    }
    
    // Accesor o Setter para el id de la fila
    public String getId(){
        return this.id;
    }


    // Accesor o Setter para la fecha
    public Fecha getFecha(){
        return this.fecha;
    }

    // Accesor o Setter para los ingresos
    public double getIngresos() {
        return this.ingresos;
    }

    // Accesor o Setter para los gastos
    public double getGastos() {
        return this.gastos;

    }

    // Calcula y devuelve el beneficio
    public double getBeneficio() {
        return this.ingresos - this.gastos;

    }
    
    /**
     * Obtiene una copia idéntica a la fila actual.
     * La fecha que incluye la fila duplicada también es una copia
     */
    public Fila duplicar(){
       Fila duplicar = new Fila(getId(), getFecha(), getIngresos(), getGastos());
       return duplicar;
    }

    /**
     * Representación textual de una fila
     * (leer enunciado)
     */
    public String toString(){
        String fila = this.id;
        Fecha fecha = this.fecha;
        double ingresos = this.ingresos;
        double gastos = this.gastos;
        double beneficio = this.ingresos - this.gastos;
        
        String resultado = String.format(fila,fecha,ingresos,gastos,beneficio);
        return resultado;
    }
}
