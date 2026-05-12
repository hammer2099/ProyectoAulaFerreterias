package Usuarios;
import Abstractas.Usuario;
import Ferreterias.Material;

public class Administrador extends Usuario{
    
    public Administrador(String nombre, int id){
        super(nombre, id);
    }
    public void modificarPrecio(Material m, double nuevoPrecio){
        if(m!=null&&nuevoPrecio>=0){
            m.setPrecioUnitario(nuevoPrecio);
        }
    }
    public void agregarStock(Material m, int cantidad){
        if(m!=null&&cantidad>=0){
            int stockActual=m.getStock();
            m.setStock(stockActual+cantidad);
        }
    }

    @Override
    public void mostrarMenu() {
    }
}
