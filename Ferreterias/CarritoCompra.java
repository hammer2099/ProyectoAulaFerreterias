package Ferreterias;
import java.util.HashMap;
import java.util.Map;
/*
Usamos HashMap en lugar de arraylist para acceder a los objetos con busquedas mas rapidas
*/
public class CarritoCompra {
    
    private Map<Material, Integer>items;
   /*
    Como la clase HashMap proporciona un constructor por defecto no ponemos la variable dentro del parentesis
    */ 
    public CarritoCompra(){
        this.items= new HashMap<>();
    }
    public void agregarItem(Material m, int cantidad){
        if(m!=null&&cantidad>=0){
            if(items.containsKey(m)){
                int cantidadActual=items.get(m);
                items.put(m, cantidadActual+cantidad);
            }else{
                items.put(m, cantidad);
            }
        }
    }
    public void eliminarItem(Material m){
        if(items.containsKey(m)){
            items.remove(m);
        }
    }
    public double calcularTotal(){
        double total=0;
        /*Map.Entry:
        Permite trabajar con la clave y el valor juntos como un solo objeto, en lugar de por separado
        esto hace que sea mas rapido obtener la llave y el valor al mismo tiempo
        */
        for(Map.Entry<Material, Integer>entry: items.entrySet()){
            Material m =entry.getKey();
            Integer cantidad= entry.getValue();
            total+= m.getPrecioUnitario()*cantidad;
        }
        return total;
    }
    public Map<Material, Integer> getItems(){
        return items;
    }
}
