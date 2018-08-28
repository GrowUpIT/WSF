//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:57:14 AM CDT 
//


package com.growupit.gideesquema;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TipoTasaCambio complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoTasaCambio">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CodigoMoneda" type="{http://www.growupit.com/gideEsquema}TipoCodigo"/>
 *         &lt;element name="TasaBaseModena" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoMoneda" type="{http://www.growupit.com/gideEsquema}TipoCodigo"/>
 *         &lt;element name="TasaBaseMoneda" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="IDIntercambioMercado" type="{http://www.growupit.com/gideEsquema}TipoIdentificador" minOccurs="0"/>
 *         &lt;element name="TasaCalculada" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="CodigoOperadorMatematico" type="{http://www.growupit.com/gideEsquema}TipoCodigo" minOccurs="0"/>
 *         &lt;element name="Fecha" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *         &lt;element name="ContratoMonedaExtranjera" type="{http://www.growupit.com/gideEsquema}TipoContrato" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoTasaCambio", propOrder = {
    "content"
})
public class TipoTasaCambio
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElementRefs({
        @XmlElementRef(name = "CodigoOperadorMatematico", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class),
        @XmlElementRef(name = "TasaBaseModena", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class),
        @XmlElementRef(name = "TasaBaseMoneda", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class),
        @XmlElementRef(name = "TasaCalculada", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class),
        @XmlElementRef(name = "ContratoMonedaExtranjera", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class),
        @XmlElementRef(name = "CodigoMoneda", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class),
        @XmlElementRef(name = "IDIntercambioMercado", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class),
        @XmlElementRef(name = "Fecha", namespace = "http://www.growupit.com/gideEsquema", type = JAXBElement.class)
    })
    protected List<JAXBElement<? extends Serializable>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "CodigoMoneda" is used by two different parts of a schema. See: 
     * line 1494 of file:/C:/Users/Leonardo-calderon/Desktop/WSFE/GIDE_ESESP/src/main/xsd/gide/gideEsquema.xsd
     * line 1486 of file:/C:/Users/Leonardo-calderon/Desktop/WSFE/GIDE_ESESP/src/main/xsd/gide/gideEsquema.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link TipoCodigo }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * {@link JAXBElement }{@code <}{@link TipoContrato }{@code >}
     * {@link JAXBElement }{@code <}{@link TipoCodigo }{@code >}
     * {@link JAXBElement }{@code <}{@link TipoIdentificador }{@code >}
     * {@link JAXBElement }{@code <}{@link Calendar }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.content;
    }

}