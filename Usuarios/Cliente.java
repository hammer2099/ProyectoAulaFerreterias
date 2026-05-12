package Usuarios;
import Abstractas.Usuario;

public class Cliente extends Usuario{
    
    private String direccionEnvio;
    private int estrato;
    
    public Cliente(String nombre, int id, String direccionEnvio){
        super(nombre, id);
    }
    public void realizarCompra(){
    }

    @Override
    public void mostrarMenu() {
        
    }   
}
