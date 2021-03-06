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
 * <p>Java class for TipoProveedor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoProveedor">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CuentaAsignadaClienteID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="CuentaAdicionalID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="CapacidadEnvioDatos" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="Tercero" type="{http://www.growupit.com/gideEsquema}TipoTercero"/>
 *         &lt;element name="ContactoDespacho" type="{http://www.growupit.com/gideEsquema}TipoContacto" minOccurs="0"/>
 *         &lt;element name="ContactoContable" type="{http://www.growupit.com/gideEsquema}TipoContacto" minOccurs="0"/>
 *         &lt;element name="ContactoVendedor" type="{http://www.growupit.com/gideEsquema}TipoContacto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoProveedor", propOrder = {
    "cuentaAsignadaClienteID",
    "cuentaAdicionalID",
    "capacidadEnvioDatos",
    "tercero",
    "contactoDespacho",
    "contactoContable",
    "contactoVendedor"
})
public class TipoProveedor
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "CuentaAsignadaClienteID")
    protected TipoIdentificador cuentaAsignadaClienteID;
    @XmlElement(name = "CuentaAdicionalID", required = true)
    protected TipoIdentificador cuentaAdicionalID;
    @XmlElement(name = "CapacidadEnvioDatos")
    protected TipoTexto capacidadEnvioDatos;
    @XmlElement(name = "Tercero", required = true)
    protected TipoTercero tercero;
    @XmlElement(name = "ContactoDespacho")
    protected TipoContacto contactoDespacho;
    @XmlElement(name = "ContactoContable")
    protected TipoContacto contactoContable;
    @XmlElement(name = "ContactoVendedor")
    protected TipoContacto contactoVendedor;

    /**
     * Gets the value of the cuentaAsignadaClienteID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getCuentaAsignadaClienteID() {
        return cuentaAsignadaClienteID;
    }

    /**
     * Sets the value of the cuentaAsignadaClienteID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setCuentaAsignadaClienteID(TipoIdentificador value) {
        this.cuentaAsignadaClienteID = value;
    }

    /**
     * Gets the value of the cuentaAdicionalID property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getCuentaAdicionalID() {
        return cuentaAdicionalID;
    }

    /**
     * Sets the value of the cuentaAdicionalID property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setCuentaAdicionalID(TipoIdentificador value) {
        this.cuentaAdicionalID = value;
    }

    /**
     * Gets the value of the capacidadEnvioDatos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getCapacidadEnvioDatos() {
        return capacidadEnvioDatos;
    }

    /**
     * Sets the value of the capacidadEnvioDatos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setCapacidadEnvioDatos(TipoTexto value) {
        this.capacidadEnvioDatos = value;
    }

    /**
     * Gets the value of the tercero property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTercero }
     *     
     */
    public TipoTercero getTercero() {
        return tercero;
    }

    /**
     * Sets the value of the tercero property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTercero }
     *     
     */
    public void setTercero(TipoTercero value) {
        this.tercero = value;
    }

    /**
     * Gets the value of the contactoDespacho property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getContactoDespacho() {
        return contactoDespacho;
    }

    /**
     * Sets the value of the contactoDespacho property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setContactoDespacho(TipoContacto value) {
        this.contactoDespacho = value;
    }

    /**
     * Gets the value of the contactoContable property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getContactoContable() {
        return contactoContable;
    }

    /**
     * Sets the value of the contactoContable property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setContactoContable(TipoContacto value) {
        this.contactoContable = value;
    }

    /**
     * Gets the value of the contactoVendedor property.
     * 
     * @return
     *     possible object is
     *     {@link TipoContacto }
     *     
     */
    public TipoContacto getContactoVendedor() {
        return contactoVendedor;
    }

    /**
     * Sets the value of the contactoVendedor property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoContacto }
     *     
     */
    public void setContactoVendedor(TipoContacto value) {
        this.contactoVendedor = value;
    }

}
