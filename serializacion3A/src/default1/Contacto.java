package default1;

import java.io.Serializable;

public class Contacto implements Serializable{
    
    private String _nombre;
    private String _apellido;

    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public String getApellido() {
        return _apellido;
    }

    public void setApellido(String _apellido) {
        this._apellido = _apellido;
    }

    public Contacto(String _nombre, String _apellido) {
        super();
        this._nombre = _nombre;
        this._apellido = _apellido;
    }
    
}
