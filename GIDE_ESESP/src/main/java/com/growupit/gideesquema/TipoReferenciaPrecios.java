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
 * <p>Java class for TipoReferenciaPrecios complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TipoReferenciaPrecios">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CantidadOriginalUbicacionArticulo" type="{http://www.growupit.com/gideEsquema}TipoUbicacionCantidadArticulo" minOccurs="0"/>
 *         &lt;element name="PrecioAlternativoCondicion" type="{http://www.growupit.com/gideEsquema}TipoPrecio" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoReferenciaPrecios", propOrder = {
    "cantidadOriginalUbicacionArticulo",
    "precioAlternativoCondicion"
})
public class TipoReferenciaPrecios
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "CantidadOriginalUbicacionArticulo")
    protected TipoUbicacionCantidadArticulo cantidadOriginalUbicacionArticulo;
    @XmlElement(name = "PrecioAlternativoCondicion")
    protected List<TipoPrecio> precioAlternativoCondicion;

    /**
     * Gets the value of the cantidadOriginalUbicacionArticulo property.
     * 
     * @return
     *     possible object is
     *     {@link TipoUbicacionCantidadArticulo }
     *     
     */
    public TipoUbicacionCantidadArticulo getCantidadOriginalUbicacionArticulo() {
        return cantidadOriginalUbicacionArticulo;
    }

    /**
     * Sets the value of the cantidadOriginalUbicacionArticulo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUbicacionCantidadArticulo }
     *     
     */
    public void setCantidadOriginalUbicacionArticulo(TipoUbicacionCantidadArticulo value) {
        this.cantidadOriginalUbicacionArticulo = value;
    }

    /**
     * Gets the value of the precioAlternativoCondicion property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precioAlternativoCondicion property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecioAlternativoCondicion().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TipoPrecio }
     * 
     * 
     */
    public List<TipoPrecio> getPrecioAlternativoCondicion() {
        if (precioAlternativoCondicion == null) {
            precioAlternativoCondicion = new ArrayList<TipoPrecio>();
        }
        return this.precioAlternativoCondicion;
    }

}
