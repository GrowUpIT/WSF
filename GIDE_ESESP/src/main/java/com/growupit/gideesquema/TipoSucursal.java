//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:57:14 AM CDT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoSucursal complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoSucursal">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="InstitucionFinanciera" type="{http://www.growupit.com/gideEsquema}TipoInstitucionFinanciera" minOccurs="0"/>
 *         &lt;element name="Direccion" type="{http://www.growupit.com/gideEsquema}TipoDireccion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoSucursal", propOrder = {
    "id",
    "nombre",
    "institucionFinanciera",
    "direccion"
})
public class TipoSucursal
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "ID")
    protected TipoIdentificador id;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "InstitucionFinanciera")
    protected TipoInstitucionFinanciera institucionFinanciera;
    @XmlElement(name = "Direccion")
    protected TipoDireccion direccion;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setID(TipoIdentificador value) {
        this.id = value;
    }

    /**
     * Gets the value of the nombre property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the value of the nombre property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombre(String value) {
        this.nombre = value;
    }

    /**
     * Gets the value of the institucionFinanciera property.
     * 
     * @return
     *     possible object is
     *     {@link TipoInstitucionFinanciera }
     *     
     */
    public TipoInstitucionFinanciera getInstitucionFinanciera() {
        return institucionFinanciera;
    }

    /**
     * Sets the value of the institucionFinanciera property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoInstitucionFinanciera }
     *     
     */
    public void setInstitucionFinanciera(TipoInstitucionFinanciera value) {
        this.institucionFinanciera = value;
    }

    /**
     * Gets the value of the direccion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccion }
     *     
     */
    public TipoDireccion getDireccion() {
        return direccion;
    }

    /**
     * Sets the value of the direccion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccion }
     *     
     */
    public void setDireccion(TipoDireccion value) {
        this.direccion = value;
    }

}
