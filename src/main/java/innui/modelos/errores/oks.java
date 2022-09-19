/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package innui.modelos.errores;

import innui.bases;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 *
 * @author emilio
 */
public class oks extends bases {
    public static int k_gravedad_minima = 0;
    public static int k_gravedad_maxima = 10;
    /**
     * Separador que se utiliza en setTxt(Exception e, ...)
     */
    public static String k_separador_inicio = "\n\n";
    /**
     * Separador que se utiliza en setTxt(Exception e, ...)
     */
    public static String k_separador_fin = "";
    /**
     * Atributo para extender la funcionalidad reemplaando la que existe
     */
    public boolean es = true;
    public String id = "";
    public String txt = "";
    public int gravedad = k_gravedad_minima;
    /**
     * Pone a valor por defecto los atributos no estáticos
     * @return true si tiene éxito;
     * @throws Exception 
     */
    public boolean iniciar() throws Exception {
        try {
            if (o_es()) {
                return ((oks)o()).iniciar();
            } else {
                es = true;
                id = "";
                txt = "";
                gravedad = k_gravedad_minima;
                return true;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Consultar si ok va bien
     * @return true si todo va bien
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean isEs() throws Exception {
        try {
            if (o_es()) {
                return ((oks)o()).isEs();
            } else {
                return es;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Indicar si ok va bien
     * @param es Valor que poner
     * @param extra_array Opción de añadir parámetros en el futuro.
     * @throws Exception Opción de notificar errores de excepción
     */
    public void setEs(boolean es, Object ... extra_array) throws Exception {
        try {
            if (o_es()) {
                ((oks)o()).setEs(es);
            } else {
                this.es = es;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Obtener el identificador del error.
     * @return El identificador del error, "" si no lo hay.
     * @throws Exception Opción de notificar errores de excepción
     */
    public String getId() throws Exception {
        try {
            if (o_es()) {
                return ((oks)o()).getId();
            } else {
                return id;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Establecer el identificador del error.
     * @param id Identificador
     * @param extra_array Opción de añadir parámetros en el futuro.
     * @throws Exception Opción de notificar errores de excepción
     */
    public void setId(String id, Object ... extra_array) throws Exception {
        try {
            if (o_es()) {
                ((oks)o()).setId(id);
            } else {
                this.id = id;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Obtener la gravedad del error.
     * @return la gravedad del error.
     * @throws Exception Opción de notificar errores de excepción
     */
    public int getGravedad() throws Exception {
        try {
            if (o_es()) {
                return ((oks)o()).getGravedad();
            } else {
                return gravedad;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Establecer la gravedad del error.
     * @param gravedad Gravedad qeu poner
     * @param extra_array Opción de añadir parámetros en el futuro.
     * @throws Exception Opción de notificar errores de excepción
     */
    public void setGravedad(int gravedad, Object ... extra_array) throws Exception {
        try {
            if (o_es()) {
                ((oks)o()).setGravedad(gravedad);
            } else {
                this.gravedad = gravedad;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Obtener el texto del error 
     * @return Texto con el error, "" si no lo hay.
     * @throws Exception Opción de notificar errores de excepción
     */
    public String getTxt() throws Exception {
        try {
            if (o_es()) {
                return ((oks)o()).getTxt();
            } else {
                return txt;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Establecer el texto del error.
     * @param txt Texto que poner
     * @param extra_array Opción de añadir parámetros en el futuro.
     * @throws Exception Opción de notificar errores de excepción
     */
    public void setTxt(String txt, Object ... extra_array) throws Exception {
        try {
            if (o_es()) {
                ((oks)o()).setTxt(txt, extra_array);
            } else {
                this.txt = txt;
            }
            if (txt != null && txt.isBlank() == false) {
                es = false;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Establecer el texto del error.
     * @param txt Texto que poner
     * @param txt_siguiente Texto adicional qeu situar detrás del txt
     * @param extra_array Opción de añadir parámetros en el futuro.
     * @throws Exception Opción de notificar errores de excepción
     */
    public void setTxt(String txt, String txt_siguiente, Object ... extra_array) throws Exception {
        try {
            if (o_es()) {
                ((oks)o()).setTxt(txt);
            } else {
                this.txt = txt;
                if (txt == null) {
                    this.txt = "";
                } else {
                    this.txt = this.txt.stripTrailing() + " ";
                }
                this.txt = this.txt + txt_siguiente;
                es = false;
            }
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Establecer el texto del error.
     * @param txt Texto que poner
     * @param e Exceptión de la que obtener parte del texto del error.
     * @param extra_array Opción de añadir parámetros en el futuro.
     */
    public void setTxt(String txt, Exception e, Object ... extra_array) {
        try {
            if (o_es()) {
                ((oks)o()).setTxt(txt, e);
            } else {
                setTxt(e);
                setTxt(txt, this.txt);
            }
        } catch (Exception ex) {
            setTxt(e);
        }
    }
    
    /**
     * Establecer el texto del error.
     * @param e Exceptión de la que obtener parte del texto del error.
     * @param extra_array Opción de añadir parámetros en el futuro.
     */
    public void setTxt(Exception e, Object ... extra_array) {
        try {
            if (o_es()) {
                ((oks)o()).setTxt(e);
            } else {
                String texto = null;
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                try (PrintStream printStream = new PrintStream(byteArrayOutputStream)) {
                    texto = e.getMessage();
                    e.printStackTrace(printStream);
                    printStream.flush();
                } finally {
                    if (texto == null) {
                        texto = "";
                    }
                    this.txt = k_separador_inicio + texto + k_separador_fin
                            + k_separador_inicio + byteArrayOutputStream.toString() + k_separador_fin;
                }
            }
        } catch (Exception ex) {
            setTxt(e);
        }
    }
    /**
     * Evalua si el parámetro no es nulo
     * @param o objeto que evaluar
     * @return true si o no es nulo, false si o es nulo
     * @param extra_array Opción de añadir parámetros en el futuro.
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean no_nul(Object o, Object ... extra_array) throws Exception {
        try {
            es = (o != null);
            return es;
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
    /**
     * Evalua si el parámetro no es nulo
     * @param o objeto que evaluar
     * @param txt Mensaje de error
     * @param extra_array Opción de añadir parámetros en el futuro.
     * @return true si o no es nulo, false si o es nulo
     * @throws Exception Opción de notificar errores de excepción
     */
    public boolean no_nul(Object o, String txt, Object ... extra_array) throws Exception {
        try {
            if (no_nul(o) == false) {
                this.txt = txt;
            }
            return es;
        } catch (Exception e) {
            throw e; // Ayuda para la depuración
        }
    }
}
