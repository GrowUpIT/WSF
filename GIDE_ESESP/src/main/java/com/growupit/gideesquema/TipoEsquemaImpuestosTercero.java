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
 * <p>Java class for TipoEsquemaImpuestosTercero complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoEsquemaImpuestosTercero">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NombreRegistro" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="IDEmpresa" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="CodigoNivelImpuestos" type="{http://www.growupit.com/gideEsquema}TipoCodigo"/>
 *         &lt;element name="CodigoRazonExencion" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="RazonExencion" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="DireccionRegistro" type="{http://www.growupit.com/gideEsquema}TipoDireccion" minOccurs="0"/>
 *         &lt;element name="EsquemaImpuestos" type="{http://www.growupit.com/gideEsquema}TipoRegimenTriburario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoEsquemaImpuestosTercero", propOrder = {
    "nombreRegistro",
    "idEmpresa",
    "codigoNivelImpuestos",
    "codigoRazonExencion",
    "razonExencion",
    "direccionRegistro",
    "esquemaImpuestos"
})
public class TipoEsquemaImpuestosTercero
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "NombreRegistro")
    protected String nombreRegistro;
    @XmlElement(name = "IDEmpresa")
    protected TipoIdentificador idEmpresa;
    @XmlElement(name = "CodigoNivelImpuestos", required = true)
    protected TipoCodigo codigoNivelImpuestos;
    @XmlElement(name = "CodigoRazonExencion")
    protected TipoCodigo codigoRazonExencion;
    @XmlElement(name = "RazonExencion")
    protected TipoTexto razonExencion;
    @XmlElement(name = "DireccionRegistro")
    protected TipoDireccion direccionRegistro;
    @XmlElement(name = "EsquemaImpuestos", required = true)
    protected TipoRegimenTriburario esquemaImpuestos;

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
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIDEmpresa() {
        return idEmpresa;
    }

    /**
     * Sets the value of the idEmpresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIDEmpresa(TipoIdentificador value) {
        this.idEmpresa = value;
    }

    /**
     * Gets the value of the codigoNivelImpuestos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoNivelImpuestos() {
        return codigoNivelImpuestos;
    }

    /**
     * Sets the value of the codigoNivelImpuestos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoNivelImpuestos(TipoCodigo value) {
        this.codigoNivelImpuestos = value;
    }

    /**
     * Gets the value of the codigoRazonExencion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoRazonExencion() {
        return codigoRazonExencion;
    }

    /**
     * Sets the value of the codigoRazonExencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoRazonExencion(TipoCodigo value) {
        this.codigoRazonExencion = value;
    }

    /**
     * Gets the value of the razonExencion property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getRazonExencion() {
        return razonExencion;
    }

    /**
     * Sets the value of the razonExencion property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setRazonExencion(TipoTexto value) {
        this.razonExencion = value;
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
     * Gets the value of the esquemaImpuestos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRegimenTriburario }
     *     
     */
    public TipoRegimenTriburario getEsquemaImpuestos() {
        return esquemaImpuestos;
    }

    /**
     * Sets the value of the esquemaImpuestos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRegimenTriburario }
     *     
     */
    public void setEsquemaImpuestos(TipoRegimenTriburario value) {
        this.esquemaImpuestos = value;
    }

}
