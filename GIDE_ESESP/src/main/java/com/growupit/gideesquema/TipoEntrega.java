//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:57:14 AM CDT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Calendar;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;
import org.w3._2001.xmlschema.Adapter3;


/**
 * <p>Java class for TipoEntrega complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoEntrega">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="Cantidad" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CantidadMinima" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CantidadMaxima" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="FechaActualEntrega" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HoraActualEntrega" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="FechaUltimaEntrega" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="HoraUltimaEntrega" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="IDSeguimiento" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="DireccionEntrega" type="{http://www.growupit.com/gideEsquema}TipoDireccion" minOccurs="0"/>
 *         &lt;element name="UbicacionEntrega" type="{http://www.growupit.com/gideEsquema}TipoUbicacion" minOccurs="0"/>
 *         &lt;element name="PlazoEntregaSolicitado" type="{http://www.growupit.com/gideEsquema}TipoPeriodo" minOccurs="0"/>
 *         &lt;element name="PlazoEntregaPrometido" type="{http://www.growupit.com/gideEsquema}TipoPeriodo" minOccurs="0"/>
 *         &lt;element name="PlazoEntregaEstimado" type="{http://www.growupit.com/gideEsquema}TipoPeriodo" minOccurs="0"/>
 *         &lt;element name="EntregaTercero" type="{http://www.growupit.com/gideEsquema}TipoTercero" minOccurs="0"/>
 *         &lt;element name="Envio" type="{http://www.growupit.com/gideEsquema}TipoEnvio" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoEntrega", propOrder = {
    "id",
    "cantidad",
    "cantidadMinima",
    "cantidadMaxima",
    "fechaActualEntrega",
    "horaActualEntrega",
    "fechaUltimaEntrega",
    "horaUltimaEntrega",
    "idSeguimiento",
    "direccionEntrega",
    "ubicacionEntrega",
    "plazoEntregaSolicitado",
    "plazoEntregaPrometido",
    "plazoEntregaEstimado",
    "entregaTercero",
    "envio"
})
public class TipoEntrega
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "ID")
    protected TipoIdentificador id;
    @XmlElement(name = "Cantidad")
    protected BigDecimal cantidad;
    @XmlElement(name = "CantidadMinima")
    protected BigDecimal cantidadMinima;
    @XmlElement(name = "CantidadMaxima")
    protected BigDecimal cantidadMaxima;
    @XmlElement(name = "FechaActualEntrega", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaActualEntrega;
    @XmlElement(name = "HoraActualEntrega", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
    protected Calendar horaActualEntrega;
    @XmlElement(name = "FechaUltimaEntrega", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaUltimaEntrega;
    @XmlElement(name = "HoraUltimaEntrega", type = String.class)
    @XmlJavaTypeAdapter(Adapter3 .class)
    @XmlSchemaType(name = "time")
    protected Calendar horaUltimaEntrega;
    @XmlElement(name = "IDSeguimiento")
    protected TipoIdentificador idSeguimiento;
    @XmlElement(name = "DireccionEntrega")
    protected TipoDireccion direccionEntrega;
    @XmlElement(name = "UbicacionEntrega")
    protected TipoUbicacion ubicacionEntrega;
    @XmlElement(name = "PlazoEntregaSolicitado")
    protected TipoPeriodo plazoEntregaSolicitado;
    @XmlElement(name = "PlazoEntregaPrometido")
    protected TipoPeriodo plazoEntregaPrometido;
    @XmlElement(name = "PlazoEntregaEstimado")
    protected TipoPeriodo plazoEntregaEstimado;
    @XmlElement(name = "EntregaTercero")
    protected TipoTercero entregaTercero;
    @XmlElement(name = "Envio")
    protected TipoEnvio envio;

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
     * Gets the value of the cantidad property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidad() {
        return cantidad;
    }

    /**
     * Sets the value of the cantidad property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidad(BigDecimal value) {
        this.cantidad = value;
    }

    /**
     * Gets the value of the cantidadMinima property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadMinima() {
        return cantidadMinima;
    }

    /**
     * Sets the value of the cantidadMinima property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadMinima(BigDecimal value) {
        this.cantidadMinima = value;
    }

    /**
     * Gets the value of the cantidadMaxima property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCantidadMaxima() {
        return cantidadMaxima;
    }

    /**
     * Sets the value of the cantidadMaxima property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCantidadMaxima(BigDecimal value) {
        this.cantidadMaxima = value;
    }

    /**
     * Gets the value of the fechaActualEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFechaActualEntrega() {
        return fechaActualEntrega;
    }

    /**
     * Sets the value of the fechaActualEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaActualEntrega(Calendar value) {
        this.fechaActualEntrega = value;
    }

    /**
     * Gets the value of the horaActualEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getHoraActualEntrega() {
        return horaActualEntrega;
    }

    /**
     * Sets the value of the horaActualEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraActualEntrega(Calendar value) {
        this.horaActualEntrega = value;
    }

    /**
     * Gets the value of the fechaUltimaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFechaUltimaEntrega() {
        return fechaUltimaEntrega;
    }

    /**
     * Sets the value of the fechaUltimaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaUltimaEntrega(Calendar value) {
        this.fechaUltimaEntrega = value;
    }

    /**
     * Gets the value of the horaUltimaEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getHoraUltimaEntrega() {
        return horaUltimaEntrega;
    }

    /**
     * Sets the value of the horaUltimaEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHoraUltimaEntrega(Calendar value) {
        this.horaUltimaEntrega = value;
    }

    /**
     * Gets the value of the idSeguimiento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getIDSeguimiento() {
        return idSeguimiento;
    }

    /**
     * Sets the value of the idSeguimiento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setIDSeguimiento(TipoIdentificador value) {
        this.idSeguimiento = value;
    }

    /**
     * Gets the value of the direccionEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDireccion }
     *     
     */
    public TipoDireccion getDireccionEntrega() {
        return direccionEntrega;
    }

    /**
     * Sets the value of the direccionEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDireccion }
     *     
     */
    public void setDireccionEntrega(TipoDireccion value) {
        this.direccionEntrega = value;
    }

    /**
     * Gets the value of the ubicacionEntrega property.
     * 
     * @return
     *     possible object is
     *     {@link TipoUbicacion }
     *     
     */
    public TipoUbicacion getUbicacionEntrega() {
        return ubicacionEntrega;
    }

    /**
     * Sets the value of the ubicacionEntrega property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUbicacion }
     *     
     */
    public void setUbicacionEntrega(TipoUbicacion value) {
        this.ubicacionEntrega = value;
    }

    /**
     * Gets the value of the plazoEntregaSolicitado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPeriodo }
     *     
     */
    public TipoPeriodo getPlazoEntregaSolicitado() {
        return plazoEntregaSolicitado;
    }

    /**
     * Sets the value of the plazoEntregaSolicitado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPeriodo }
     *     
     */
    public void setPlazoEntregaSolicitado(TipoPeriodo value) {
        this.plazoEntregaSolicitado = value;
    }

    /**
     * Gets the value of the plazoEntregaPrometido property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPeriodo }
     *     
     */
    public TipoPeriodo getPlazoEntregaPrometido() {
        return plazoEntregaPrometido;
    }

    /**
     * Sets the value of the plazoEntregaPrometido property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPeriodo }
     *     
     */
    public void setPlazoEntregaPrometido(TipoPeriodo value) {
        this.plazoEntregaPrometido = value;
    }

    /**
     * Gets the value of the plazoEntregaEstimado property.
     * 
     * @return
     *     possible object is
     *     {@link TipoPeriodo }
     *     
     */
    public TipoPeriodo getPlazoEntregaEstimado() {
        return plazoEntregaEstimado;
    }

    /**
     * Sets the value of the plazoEntregaEstimado property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoPeriodo }
     *     
     */
    public void setPlazoEntregaEstimado(TipoPeriodo value) {
        this.plazoEntregaEstimado = value;
    }

    /**
     * Gets the value of the entregaTercero property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTercero }
     *     
     */
    public TipoTercero getEntregaTercero() {
        return entregaTercero;
    }

    /**
     * Sets the value of the entregaTercero property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTercero }
     *     
     */
    public void setEntregaTercero(TipoTercero value) {
        this.entregaTercero = value;
    }

    /**
     * Gets the value of the envio property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEnvio }
     *     
     */
    public TipoEnvio getEnvio() {
        return envio;
    }

    /**
     * Sets the value of the envio property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEnvio }
     *     
     */
    public void setEnvio(TipoEnvio value) {
        this.envio = value;
    }

}