//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:57:14 AM CDT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoCategoriaImpuesto complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoCategoriaImpuesto">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Id" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="Nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Porcentaje" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MedidaUnidadBase" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="MontoPorUnidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoExencionImpuestos" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="RazonExencionImpuestos" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="RangoNivel" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="PorcentajeRangoNivel" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="RegimenTriburario" type="{http://www.growupit.com/gideEsquema}TipoRegimenTriburario"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoCategoriaImpuesto", propOrder = {
    "id",
    "nombre",
    "porcentaje",
    "medidaUnidadBase",
    "montoPorUnidad",
    "codigoExencionImpuestos",
    "razonExencionImpuestos",
    "rangoNivel",
    "porcentajeRangoNivel",
    "regimenTriburario"
})
public class TipoCategoriaImpuesto
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "Id")
    protected TipoIdentificador id;
    @XmlElement(name = "Nombre")
    protected String nombre;
    @XmlElement(name = "Porcentaje")
    protected BigDecimal porcentaje;
    @XmlElement(name = "MedidaUnidadBase")
    protected BigDecimal medidaUnidadBase;
    @XmlElement(name = "MontoPorUnidad")
    protected BigDecimal montoPorUnidad;
    @XmlElement(name = "CodigoExencionImpuestos")
    protected TipoCodigo codigoExencionImpuestos;
    @XmlElement(name = "RazonExencionImpuestos")
    protected TipoTexto razonExencionImpuestos;
    @XmlElement(name = "RangoNivel")
    protected TipoTexto rangoNivel;
    @XmlElement(name = "PorcentajeRangoNivel")
    protected BigDecimal porcentajeRangoNivel;
    @XmlElement(name = "RegimenTriburario", required = true)
    protected TipoRegimenTriburario regimenTriburario;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getId() {
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
    public void setId(TipoIdentificador value) {
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
     * Gets the value of the porcentaje property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentaje() {
        return porcentaje;
    }

    /**
     * Sets the value of the porcentaje property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentaje(BigDecimal value) {
        this.porcentaje = value;
    }

    /**
     * Gets the value of the medidaUnidadBase property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMedidaUnidadBase() {
        return medidaUnidadBase;
    }

    /**
     * Sets the value of the medidaUnidadBase property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMedidaUnidadBase(BigDecimal value) {
        this.medidaUnidadBase = value;
    }

    /**
     * Gets the value of the montoPorUnidad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMontoPorUnidad() {
        return montoPorUnidad;
    }

    /**
     * Sets the value of the montoPorUnidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMontoPorUnidad(BigDecimal value) {
        this.montoPorUnidad = value;
    }

    /**
     * Gets the value of the codigoExencionImpuestos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getCodigoExencionImpuestos() {
        return codigoExencionImpuestos;
    }

    /**
     * Sets the value of the codigoExencionImpuestos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setCodigoExencionImpuestos(TipoCodigo value) {
        this.codigoExencionImpuestos = value;
    }

    /**
     * Gets the value of the razonExencionImpuestos property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getRazonExencionImpuestos() {
        return razonExencionImpuestos;
    }

    /**
     * Sets the value of the razonExencionImpuestos property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setRazonExencionImpuestos(TipoTexto value) {
        this.razonExencionImpuestos = value;
    }

    /**
     * Gets the value of the rangoNivel property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getRangoNivel() {
        return rangoNivel;
    }

    /**
     * Sets the value of the rangoNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setRangoNivel(TipoTexto value) {
        this.rangoNivel = value;
    }

    /**
     * Gets the value of the porcentajeRangoNivel property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getPorcentajeRangoNivel() {
        return porcentajeRangoNivel;
    }

    /**
     * Sets the value of the porcentajeRangoNivel property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setPorcentajeRangoNivel(BigDecimal value) {
        this.porcentajeRangoNivel = value;
    }

    /**
     * Gets the value of the regimenTriburario property.
     * 
     * @return
     *     possible object is
     *     {@link TipoRegimenTriburario }
     *     
     */
    public TipoRegimenTriburario getRegimenTriburario() {
        return regimenTriburario;
    }

    /**
     * Sets the value of the regimenTriburario property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoRegimenTriburario }
     *     
     */
    public void setRegimenTriburario(TipoRegimenTriburario value) {
        this.regimenTriburario = value;
    }

}
