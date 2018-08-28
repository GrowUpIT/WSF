//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:57:14 AM CDT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoReferenciaFactura complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoReferenciaFactura">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReferenciaDocumentoFactura" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="ReferenciaDocumentoFacturaAutoFacturada" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="ReferenciaDocumentoNotaCredito" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="ReferenciaDocumentoNotaCreditoFacturada" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="ReferenciaDocumentoNotaDebito" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="RecordatorioDocumentonameerencia" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="ReferenciaDocumentoAdicional" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" minOccurs="0"/>
 *         &lt;element name="LineanameerenciaFacturacion" type="{http://www.growupit.com/gideEsquema}TipoDocumentoReferencia" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoReferenciaFactura", propOrder = {
    "referenciaDocumentoFactura",
    "referenciaDocumentoFacturaAutoFacturada",
    "referenciaDocumentoNotaCredito",
    "referenciaDocumentoNotaCreditoFacturada",
    "referenciaDocumentoNotaDebito",
    "recordatorioDocumentonameerencia",
    "referenciaDocumentoAdicional",
    "lineanameerenciaFacturacion"
})
public class TipoReferenciaFactura
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "ReferenciaDocumentoFactura")
    protected TipoDocumentoReferencia referenciaDocumentoFactura;
    @XmlElement(name = "ReferenciaDocumentoFacturaAutoFacturada")
    protected TipoDocumentoReferencia referenciaDocumentoFacturaAutoFacturada;
    @XmlElement(name = "ReferenciaDocumentoNotaCredito")
    protected TipoDocumentoReferencia referenciaDocumentoNotaCredito;
    @XmlElement(name = "ReferenciaDocumentoNotaCreditoFacturada")
    protected TipoDocumentoReferencia referenciaDocumentoNotaCreditoFacturada;
    @XmlElement(name = "ReferenciaDocumentoNotaDebito")
    protected TipoDocumentoReferencia referenciaDocumentoNotaDebito;
    @XmlElement(name = "RecordatorioDocumentonameerencia")
    protected TipoDocumentoReferencia recordatorioDocumentonameerencia;
    @XmlElement(name = "ReferenciaDocumentoAdicional")
    protected TipoDocumentoReferencia referenciaDocumentoAdicional;
    @XmlElement(name = "LineanameerenciaFacturacion")
    protected List<TipoDocumentoReferencia> lineanameerenciaFacturacion;

    /**
     * Gets the value of the referenciaDocumentoFactura property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public TipoDocumentoReferencia getReferenciaDocumentoFactura() {
        return referenciaDocumentoFactura;
    }

    /**
     * Sets the value of the referenciaDocumentoFactura property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public void setReferenciaDocumentoFactura(TipoDocumentoReferencia value) {
        this.referenciaDocumentoFactura = value;
    }

    /**
     * Gets the value of the referenciaDocumentoFacturaAutoFacturada property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public TipoDocumentoReferencia getReferenciaDocumentoFacturaAutoFacturada() {
        return referenciaDocumentoFacturaAutoFacturada;
    }

    /**
     * Sets the value of the referenciaDocumentoFacturaAutoFacturada property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public void setReferenciaDocumentoFacturaAutoFacturada(TipoDocumentoReferencia value) {
        this.referenciaDocumentoFacturaAutoFacturada = value;
    }

    /**
     * Gets the value of the referenciaDocumentoNotaCredito property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public TipoDocumentoReferencia getReferenciaDocumentoNotaCredito() {
        return referenciaDocumentoNotaCredito;
    }

    /**
     * Sets the value of the referenciaDocumentoNotaCredito property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public void setReferenciaDocumentoNotaCredito(TipoDocumentoReferencia value) {
        this.referenciaDocumentoNotaCredito = value;
    }

    /**
     * Gets the value of the referenciaDocumentoNotaCreditoFacturada property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public TipoDocumentoReferencia getReferenciaDocumentoNotaCreditoFacturada() {
        return referenciaDocumentoNotaCreditoFacturada;
    }

    /**
     * Sets the value of the referenciaDocumentoNotaCreditoFacturada property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public void setReferenciaDocumentoNotaCreditoFacturada(TipoDocumentoReferencia value) {
        this.referenciaDocumentoNotaCreditoFacturada = value;
    }

    /**
     * Gets the value of the referenciaDocumentoNotaDebito property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public TipoDocumentoReferencia getReferenciaDocumentoNotaDebito() {
        return referenciaDocumentoNotaDebito;
    }

    /**
     * Sets the value of the referenciaDocumentoNotaDebito property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public void setReferenciaDocumentoNotaDebito(TipoDocumentoReferencia value) {
        this.referenciaDocumentoNotaDebito = value;
    }

    /**
     * Gets the value of the recordatorioDocumentonameerencia property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public TipoDocumentoReferencia getRecordatorioDocumentonameerencia() {
        return recordatorioDocumentonameerencia;
    }

    /**
     * Sets the value of the recordatorioDocumentonameerencia property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public void setRecordatorioDocumentonameerencia(TipoDocumentoReferencia value) {
        this.recordatorioDocumentonameerencia = value;
    }

    /**
     * Gets the value of the referenciaDocumentoAdicional property.
     * 
     * @return
     *     possible object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public TipoDocumentoReferencia getReferenciaDocumentoAdicional() {
        return referenciaDocumentoAdicional;
    }

    /**
     * Sets the value of the referenciaDocumentoAdicional property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoDocumentoReferencia }
     *     
     */
    public void setReferenciaDocumentoAdicional(TipoDocumentoReferencia value) {
        this.referenciaDocumentoAdicional = value;
    }

    /**
     * Gets the value of the lineanameerenciaFacturacion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lineanameerenciaFacturacion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLineanameerenciaFacturacion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoDocumentoReferencia }
     * 
     * 
     */
    public List<TipoDocumentoReferencia> getLineanameerenciaFacturacion() {
        if (lineanameerenciaFacturacion == null) {
            lineanameerenciaFacturacion = new ArrayList<TipoDocumentoReferencia>();
        }
        return this.lineanameerenciaFacturacion;
    }

}
