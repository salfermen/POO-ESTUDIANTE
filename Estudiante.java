/**
 * clase Estudiante
 */

import java.util.Date;

public class Estudiante {
    private String name;
    private Date bornDate;
    private double sig1;
    private double sig2;
    private double sig3;

    /****************************************************************************************************/
    /******************************************* CONSTRUCTORES ******************************************/
    /****************************************************************************************************/

/**
 * Método constuctor para inicializar los atributos de la clase
 * @param name Nombre del estudiante
 * @param bornDate Fecha de nacimiento ingresada por el estudiante
 * @param sig1,sig2,sig3 notas de las tres asignaturas
 *
 * Complejidad temporal: O(1) Tiempo constante
 */

public Estudiante(String name,Date bornDate,double sig1,double sig2,double sig3){
    this.name = name;
    this.bornDate = bornDate;
    this.sig1 = sig1;
    this.sig2 = sig2;
    this.sig3 = sig3;
}
    /**
     * Método que permite guardar las notas ingresadas
     * por el estudiante y mostrar si fueron superiores
     * @param notas
     *
     * Complejidad temporal: O(1) Tiempo constante
     */

    public String notaS (double notas){
        this.sig1 += 4;
        this.sig2 += 4;
        this.sig3 += 4;
        return "SU PROMEDIO DE NOTAS ES SUPERIOR AL ESTABLECIDO";
    }
/**
 * Método que permite guardar las notas ingresadas por el estudiante y mostrar si fueron superiores
 * @param notas
 *
 * Complejidad temporal: O(1) Tiempo constante
 */
public String notaB(double notas) {
    if (notas < this.sig1 && notas < this.sig2 && notas < this.sig3) {
        return "SU PROMEDIO DE NOTAS ES BAJO AL ESTABLECIDO";
    } else {
        this.sig1 -= 3;
        this.sig2 -= 3;
        this.sig3 -= 3;
        return "SU PROMEDIO DE NOTAS ES PROMEDIO";
    }
}

    /**
     * Método para obtener la fecha de nacimiento
     *
     * @return Retornar a la fecha establecida
     * Complejidad temporal: O(1) Tiempo constante
     */
    public Date bornDate() {
        return bornDate;
    }
    /**
     * Método para obtener el nombre del estudiante
     *
     * @return Retornar al nombre de usuario
     * Complejidad temporal: O(1) Tiempo constante
     */
    public String name() {
        return name;
    }

}
