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
 * <p>Java class for TipoEntidadLegalTercero complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoEntidadLegalTercero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreRegistro" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IDEmpresa" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="DireccionRegistro" type="{http://www.growupit.com/gideEsquema}TipoDireccion" minOccurs="0"/>
 *         &lt;element name="EsquemaRegistroCorporativo" type="{http://www.growupit.com/gideEsquema}TipoEsquemaRegistroCorporativo" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoEntidadLegalTercero", propOrder = {
    "nombreRegistro",
    "idEmpresa",
    "direccionRegistro",
    "esquemaRegistroCorporativo"
})
public class TipoEntidadLegalTercero
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "NombreRegistro", required = true)
    protected String nombreRegistro;
    @XmlElement(name = "IDEmpresa")
    protected Boolean idEmpresa;
    @XmlElement(name = "DireccionRegistro")
    protected TipoDireccion direccionRegistro;
    @XmlElement(name = "EsquemaRegistroCorporativo")
    protected TipoEsquemaRegistroCorporativo esquemaRegistroCorporativo;

    /**
     * Gets the value of the nombreRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNombreRegistro() {
        return nombreRegistro;
    }

    /**
     * Sets the value of the nombreRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNombreRegistro(String value) {
        this.nombreRegistro = value;
    }

    /**
     * Gets the value of the idEmpresa property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIDEmpresa() {
        return idEmpresa;
    }

    /**
     * Sets the value of the idEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIDEmpresa(Boolean value) {
        this.idEmpresa = value;
    }

    /**
     * Gets the value of the direccionRegistro property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccion }
     *     
     */
    public TipoDireccion getDireccionRegistro() {
        return direccionRegistro;
    }

    /**
     * Sets the value of the direccionRegistro property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccion }
     *     
     */
    public void setDireccionRegistro(TipoDireccion value) {
        this.direccionRegistro = value;
    }

    /**
     * Gets the value of the esquemaRegistroCorporativo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEsquemaRegistroCorporativo }
     *     
     */
    public TipoEsquemaRegistroCorporativo getEsquemaRegistroCorporativo() {
        return esquemaRegistroCorporativo;
    }

    /**
     * Sets the value of the esquemaRegistroCorporativo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEsquemaRegistroCorporativo }
     *     
     */
    public void setEsquemaRegistroCorporativo(TipoEsquemaRegistroCorporativo value) {
        this.esquemaRegistroCorporativo = value;
    }

}
