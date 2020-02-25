
package org.example.escuela;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="namealumno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="idalumno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="direccionalumno" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "namealumno",
    "idalumno",
    "direccionalumno"
})
@XmlRootElement(name = "alumnoRequest")
public class AlumnoRequest {

    @XmlElement(required = true)
    protected String namealumno;
    @XmlElement(required = true)
    protected String idalumno;
    @XmlElement(required = true)
    protected String direccionalumno;

    /**
     * Obtiene el valor de la propiedad namealumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNamealumno() {
        return namealumno;
    }

    /**
     * Define el valor de la propiedad namealumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNamealumno(String value) {
        this.namealumno = value;
    }

    /**
     * Obtiene el valor de la propiedad idalumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdalumno() {
        return idalumno;
    }

    /**
     * Define el valor de la propiedad idalumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdalumno(String value) {
        this.idalumno = value;
    }

    /**
     * Obtiene el valor de la propiedad direccionalumno.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDireccionalumno() {
        return direccionalumno;
    }

    /**
     * Define el valor de la propiedad direccionalumno.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDireccionalumno(String value) {
        this.direccionalumno = value;
    }

}
