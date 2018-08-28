//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:36:21 AM CDT 
//


package co.gov.dian.contratos.facturaelectronica.v1;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType;
import oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.IDType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LossRiskResponsibilityCodeType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LossRiskType;
import oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.SpecialTermsType;


/**
 * <p>Java class for DeliveryTermsType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeliveryTermsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}ID" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}SpecialTerms" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LossRiskResponsibilityCode" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2}LossRisk" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}DeliveryLocation" minOccurs="0"/>
 *         &lt;element ref="{urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2}AllowanceCharge" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeliveryTermsType", propOrder = {
    "id",
    "specialTerms",
    "lossRiskResponsibilityCode",
    "lossRisk",
    "deliveryLocation",
    "allowanceCharge"
})
public class DeliveryTermsType
    implements Serializable
{

    private final static long serialVersionUID = 123456789012L;
    @XmlElement(name = "ID", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected IDType id;
    @XmlElement(name = "SpecialTerms", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected SpecialTermsType specialTerms;
    @XmlElement(name = "LossRiskResponsibilityCode", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LossRiskResponsibilityCodeType lossRiskResponsibilityCode;
    @XmlElement(name = "LossRisk", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonBasicComponents-2")
    protected LossRiskType lossRisk;
    @XmlElement(name = "DeliveryLocation", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected LocationType deliveryLocation;
    @XmlElement(name = "AllowanceCharge", namespace = "urn:oasis:names:specification:ubl:schema:xsd:CommonAggregateComponents-2")
    protected AllowanceChargeType allowanceCharge;

    /**
     * 
     * 						Opcional no usado por la
     * 						DIAN, las partes pueden
     * 						definir un significado o simplemente
     * 						omitirlo
     * 					
     * 
     * @return
     *     possible object is
     *     {@link IDType }
     *     
     */
    public IDType getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link IDType }
     *     
     */
    public void setID(IDType value) {
        this.id = value;
    }

    /**
     * 
     * 						Método de pago de costes de transporte: Se
     * 						utilizar
     * 						para indicar cómo se pagan los costes
     * 						del transporte (por ejemplo,
     * 						Portes Debidos,
     * 						Portes Pagados)
     * 
     * 						Puede ser un texto libre que
     * 						entiendan el
     * 						comprador y vendedor o codificarlo en una lista,
     * 						por
     * 						ejemplo
     * 						http://www.unece.org/trade/untdid/d01b/tred/tred4215.htm
     * 					
     * 
     * @return
     *     possible object is
     *     {@link SpecialTermsType }
     *     
     */
    public SpecialTermsType getSpecialTerms() {
        return specialTerms;
    }

    /**
     * Sets the value of the specialTerms property.
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialTermsType }
     *     
     */
    public void setSpecialTerms(SpecialTermsType value) {
        this.specialTerms = value;
    }

    /**
     * 
     * 						2.2.10.2 - Condiciones de Entrega: Obligatorio
     * 						cuando sea una factura internacional\u2026.Se
     * 						recomienda utilizar los
     * 						INCOTERMS (International
     * 						Commercial Terms), utilizando la
     * 						codificación
     * 						estándar de 3 letras, por ejemplo\u2026. CIF = Coste,
     * 						seguro, flete en el destino indicado CIP =
     * 						Flete, porte, seguro
     * 						hasta destino CPT = Flete,
     * 						porte pagado hasta destino DAF = Entrega
     * 						en la
     * 						frontera - lugar indicado FCA = Franco en el
     * 						transporte -
     * 						Punto indicado EXW = En la fábrica
     * 
     * 						Esta campo debería pertenecer a
     * 						una lista de
     * 						códigos. Se aconseja utilizar los incoterms
     * 						2010,
     * 						http://www.iccwbo.org/products-and-services/trade-facilitation/incoterms-2010/the-incoterms-rules/
     * 					
     * 
     * @return
     *     possible object is
     *     {@link LossRiskResponsibilityCodeType }
     *     
     */
    public LossRiskResponsibilityCodeType getLossRiskResponsibilityCode() {
        return lossRiskResponsibilityCode;
    }

    /**
     * Sets the value of the lossRiskResponsibilityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossRiskResponsibilityCodeType }
     *     
     */
    public void setLossRiskResponsibilityCode(LossRiskResponsibilityCodeType value) {
        this.lossRiskResponsibilityCode = value;
    }

    /**
     * 
     * 						Opcional no usado por la
     * 						DIAN, las partes pueden
     * 						definir un significado o simplemente
     * 						omitirlo
     * 					
     * 
     * @return
     *     possible object is
     *     {@link LossRiskType }
     *     
     */
    public LossRiskType getLossRisk() {
        return lossRisk;
    }

    /**
     * Sets the value of the lossRisk property.
     * 
     * @param value
     *     allowed object is
     *     {@link LossRiskType }
     *     
     */
    public void setLossRisk(LossRiskType value) {
        this.lossRisk = value;
    }

    /**
     * 
     * 						10.5 - Destino Expedición o
     * 						Despacho (ShipTO
     * 						party)
     * 					
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDeliveryLocation() {
        return deliveryLocation;
    }

    /**
     * Sets the value of the deliveryLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDeliveryLocation(LocationType value) {
        this.deliveryLocation = value;
    }

    /**
     * 
     * 						Opcional no usado por la
     * 						DIAN, las partes pueden
     * 						definir un significado o simplemente
     * 						omitirlo
     * 					
     * 
     * @return
     *     possible object is
     *     {@link AllowanceChargeType }
     *     
     */
    public AllowanceChargeType getAllowanceCharge() {
        return allowanceCharge;
    }

    /**
     * Sets the value of the allowanceCharge property.
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceChargeType }
     *     
     */
    public void setAllowanceCharge(AllowanceChargeType value) {
        this.allowanceCharge = value;
    }

}
