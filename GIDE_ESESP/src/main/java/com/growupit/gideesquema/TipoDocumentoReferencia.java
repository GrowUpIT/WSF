//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:57:14 AM CDT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3._2001.xmlschema.Adapter2;


/**
 * <p>Java class for TipoDocumentoReferencia complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoDocumentoReferencia">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador"/>
 *         &lt;element name="CopiaIndicador" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="UUID" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="FechaAsunto" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="TipoCodigoDocumento" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="TipoDocumento" type="{http://www.growupit.com/gideEsquema}TipoTexto" minOccurs="0"/>
 *         &lt;element name="XPath" type="{http://www.growupit.com/gideEsquema}TipoTexto" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ArchivoAdjunto" type="{http://www.growupit.com/gideEsquema}TipoArchivoAdjunto" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoDocumentoReferencia", propOrder = {
    "id",
    "copiaIndicador",
    "uuid",
    "fechaAsunto",
    "tipoCodigoDocumento",
    "tipoDocumento",
    "xPath",
    "archivoAdjunto"
})
public class TipoDocumentoReferencia
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "ID", required = true)
    protected TipoIdentificador id;
    @XmlElement(name = "CopiaIndicador")
    protected Boolean copiaIndicador;
    @XmlElement(name = "UUID")
    protected TipoIdentificador uuid;
    @XmlElement(name = "FechaAsunto", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    @XmlSchemaType(name = "date")
    protected Calendar fechaAsunto;
    @XmlElement(name = "TipoCodigoDocumento")
    protected TipoCodigo tipoCodigoDocumento;
    @XmlElement(name = "TipoDocumento")
    protected TipoTexto tipoDocumento;
    @XmlElement(name = "XPath")
    protected List<TipoTexto> xPath;
    @XmlElement(name = "ArchivoAdjunto")
    protected TipoArchivoAdjunto archivoAdjunto;

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
     * Gets the value of the copiaIndicador property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCopiaIndicador() {
        return copiaIndicador;
    }

    /**
     * Sets the value of the copiaIndicador property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCopiaIndicador(Boolean value) {
        this.copiaIndicador = value;
    }

    /**
     * Gets the value of the uuid property.
     * 
     * @return
     *     possible object is
     *     {@link TipoIdentificador }
     *     
     */
    public TipoIdentificador getUUID() {
        return uuid;
    }

    /**
     * Sets the value of the uuid property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoIdentificador }
     *     
     */
    public void setUUID(TipoIdentificador value) {
        this.uuid = value;
    }

    /**
     * Gets the value of the fechaAsunto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Calendar getFechaAsunto() {
        return fechaAsunto;
    }

    /**
     * Sets the value of the fechaAsunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFechaAsunto(Calendar value) {
        this.fechaAsunto = value;
    }

    /**
     * Gets the value of the tipoCodigoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoCodigo }
     *     
     */
    public TipoCodigo getTipoCodigoDocumento() {
        return tipoCodigoDocumento;
    }

    /**
     * Sets the value of the tipoCodigoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoCodigo }
     *     
     */
    public void setTipoCodigoDocumento(TipoCodigo value) {
        this.tipoCodigoDocumento = value;
    }

    /**
     * Gets the value of the tipoDocumento property.
     * 
     * @return
     *     possible object is
     *     {@link TipoTexto }
     *     
     */
    public TipoTexto getTipoDocumento() {
        return tipoDocumento;
    }

    /**
     * Sets the value of the tipoDocumento property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoTexto }
     *     
     */
    public void setTipoDocumento(TipoTexto value) {
        this.tipoDocumento = value;
    }

    /**
     * Gets the value of the xPath property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xPath property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getXPath().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoTexto }
     * 
     * 
     */
    public List<TipoTexto> getXPath() {
        if (xPath == null) {
            xPath = new ArrayList<TipoTexto>();
        }
        return this.xPath;
    }

    /**
     * Gets the value of the archivoAdjunto property.
     * 
     * @return
     *     possible object is
     *     {@link TipoArchivoAdjunto }
     *     
     */
    public TipoArchivoAdjunto getArchivoAdjunto() {
        return archivoAdjunto;
    }

    /**
     * Sets the value of the archivoAdjunto property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoArchivoAdjunto }
     *     
     */
    public void setArchivoAdjunto(TipoArchivoAdjunto value) {
        this.archivoAdjunto = value;
    }

}
