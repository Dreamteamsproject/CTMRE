package controlador;
import javax.swing.JOptionPane;
import modelo.Consultas;


public class LoginC {
    
    boolean validacion = false;
    private final String usuario;
    private final String password;
    Consultas consulta = new Consultas();
    
    
    public LoginC(String usuario, String password){
    
        this.usuario  = usuario;
        this.password = password;
    
    }
      
        
    public boolean consultarUser(){
    
        System.out.println("Consulta recibida");
        System.out.println("Usuario " + usuario + " " + "contraseña " + password);
        
        
        var SQL = "SELECT usuario_nombre, usuario_clave from usuarios where(usuario_nombre='"+usuario+"' && usuario_clave='"+password+"')";
        validacion = consulta.consultas(SQL);
        if(validacion){JOptionPane.showMessageDialog(null, "Bienvenido "+usuario);}
        else{JOptionPane.showMessageDialog(null, "La contraseña que ingresaste es incorrecta");}
        
    return validacion;
    }
                
    
            
}

