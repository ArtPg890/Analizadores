package analizadores;

/**
 *
 * @author Arturo Guzmán Ávila
 */
public class Token {

    private int linea;
    private String tipo, token, nombre;

    /**
     * Crea un nuevo token
     *
     * @param linea número de línea donde se encontró el token
     * @param token token
     * @param nombre nombre del token
     */
    public Token(int linea, String tipo, String token, String nombre) {
        this.linea = linea;
        this.tipo = tipo;
        this.token = token;
        this.nombre = nombre;
    }

    /**
     * Retorna la linea donde se encontró el token
     *
     * @return linea donde se encontró el token
     */
    public int obtenerLinea() {
        return linea;
    }

    /**
     * Retorna el token encontrado
     *
     * @return token encontrado
     */
    public String obtenerToken() {
        return token;
    }

    /**
     * Retorna el nombre del token
     * 
     * @return nombre del token
     */
    public String obtenerNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
