package Ferreterias;

public class Material {
    
    private String nombre;
    private double precioUnitario;
    private int stock;
    private double unidadMedida;
    
    public Material(String nombre, double precioUnitario, int stock, double unidadMedida){
        this.nombre=nombre;
        this.precioUnitario=precioUnitario;
        this.stock=stock;
        this.unidadMedida=unidadMedida;
    }
    public String getNombre(){return nombre;}
    public void setNombre(String nombre){this.nombre=nombre;}
    public double getPrecioUnitario(){return precioUnitario;}
    public void setPrecioUnitario(double precioUnitario){this.precioUnitario=precioUnitario;}
    public int getStock(){return stock;}
    public void setStock(int stock){this.stock=stock;}
    public double getUnidadMedida(){return unidadMedida;}
    public void setUnidadMedida(double unidadMedida){this.unidadMedida=unidadMedida;}
    
    public boolean VerificarStock(int cantidad){
        return this.stock>=cantidad;
    }
}
