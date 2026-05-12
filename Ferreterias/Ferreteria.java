package Ferreterias;
import java.util.ArrayList;
import java.util.List;

public class Ferreteria {
    
    private String nombre;
    private String direccion;
    private List <Material> listaMateriales;
    
    public Ferreteria(String nombre, String direccion, List<Material> listaMateriales){
        this.nombre=nombre;
        this.direccion=direccion;
        this.listaMateriales= new ArrayList<>();
    }
    
    public Material buscarMaterial(String nombreMaterial){
        for(Material m: this.listaMateriales){
            /*
            Comparamos nombres ignorando mayúsculas/minúsculas para evitar errores
            y si lo encontramos Devolvemos el objeto
            */
            if(m.getNombre().equalsIgnoreCase(nombreMaterial))
                return m;
        }
        return null;
    }
}
