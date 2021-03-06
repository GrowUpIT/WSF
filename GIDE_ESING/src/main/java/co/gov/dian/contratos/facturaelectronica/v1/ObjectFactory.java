//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.05.27 at 09:36:21 AM CDT 
//


package co.gov.dian.contratos.facturaelectronica.v1;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the co.gov.dian.contratos.facturaelectronica.v1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _PhysicalLocation_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "PhysicalLocation");
    private final static QName _Despatch_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Despatch");
    private final static QName _AllowanceCharge_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "AllowanceCharge");
    private final static QName _Invoice_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Invoice");
    private final static QName _PartyTaxScheme_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "PartyTaxScheme");
    private final static QName _CreditNote_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "CreditNote");
    private final static QName _PartyLegalEntity_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "PartyLegalEntity");
    private final static QName _DeliveryLocation_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "DeliveryLocation");
    private final static QName _InvoiceLine_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "InvoiceLine");
    private final static QName _TaxTotal_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "TaxTotal");
    private final static QName _Person_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Person");
    private final static QName _DespatchAddress_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "DespatchAddress");
    private final static QName _AccountingCustomerParty_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "AccountingCustomerParty");
    private final static QName _DeliveryTerms_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "DeliveryTerms");
    private final static QName _TaxSubtotal_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "TaxSubtotal");
    private final static QName _Party_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Party");
    private final static QName _AccountingSupplierParty_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "AccountingSupplierParty");
    private final static QName _DeliveryAddress_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "DeliveryAddress");
    private final static QName _Item_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Item");
    private final static QName _PrepaidPayment_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "PrepaidPayment");
    private final static QName _DeliveryParty_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "DeliveryParty");
    private final static QName _Delivery_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Delivery");
    private final static QName _LegalMonetaryTotal_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "LegalMonetaryTotal");
    private final static QName _DespatchParty_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "DespatchParty");
    private final static QName _DebitNote_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "DebitNote");
    private final static QName _Address_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Address");
    private final static QName _Price_QNAME = new QName("http://www.dian.gov.co/contratos/facturaelectronica/v1", "Price");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: co.gov.dian.contratos.facturaelectronica.v1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DeliveryType }
     * 
     */
    public DeliveryType createDeliveryType() {
        return new DeliveryType();
    }

    /**
     * Create an instance of {@link LocationType }
     * 
     */
    public LocationType createLocationType() {
        return new LocationType();
    }

    /**
     * Create an instance of {@link PaymentType }
     * 
     */
    public PaymentType createPaymentType() {
        return new PaymentType();
    }

    /**
     * Create an instance of {@link DeliveryTermsType }
     * 
     */
    public DeliveryTermsType createDeliveryTermsType() {
        return new DeliveryTermsType();
    }

    /**
     * Create an instance of {@link PartyLegalEntityType }
     * 
     */
    public PartyLegalEntityType createPartyLegalEntityType() {
        return new PartyLegalEntityType();
    }

    /**
     * Create an instance of {@link CustomerPartyType }
     * 
     */
    public CustomerPartyType createCustomerPartyType() {
        return new CustomerPartyType();
    }

    /**
     * Create an instance of {@link AddressType }
     * 
     */
    public AddressType createAddressType() {
        return new AddressType();
    }

    /**
     * Create an instance of {@link TaxSubtotalType }
     * 
     */
    public TaxSubtotalType createTaxSubtotalType() {
        return new TaxSubtotalType();
    }

    /**
     * Create an instance of {@link InvoiceLineType }
     * 
     */
    public InvoiceLineType createInvoiceLineType() {
        return new InvoiceLineType();
    }

    /**
     * Create an instance of {@link PersonType }
     * 
     */
    public PersonType createPersonType() {
        return new PersonType();
    }

    /**
     * Create an instance of {@link InvoiceType }
     * 
     */
    public InvoiceType createInvoiceType() {
        return new InvoiceType();
    }

    /**
     * Create an instance of {@link PriceType }
     * 
     */
    public PriceType createPriceType() {
        return new PriceType();
    }

    /**
     * Create an instance of {@link PartyTaxSchemeType }
     * 
     */
    public PartyTaxSchemeType createPartyTaxSchemeType() {
        return new PartyTaxSchemeType();
    }

    /**
     * Create an instance of {@link SupplierPartyType }
     * 
     */
    public SupplierPartyType createSupplierPartyType() {
        return new SupplierPartyType();
    }

    /**
     * Create an instance of {@link ItemType }
     * 
     */
    public ItemType createItemType() {
        return new ItemType();
    }

    /**
     * Create an instance of {@link DespatchType }
     * 
     */
    public DespatchType createDespatchType() {
        return new DespatchType();
    }

    /**
     * Create an instance of {@link MonetaryTotalType }
     * 
     */
    public MonetaryTotalType createMonetaryTotalType() {
        return new MonetaryTotalType();
    }

    /**
     * Create an instance of {@link CreditNoteType }
     * 
     */
    public CreditNoteType createCreditNoteType() {
        return new CreditNoteType();
    }

    /**
     * Create an instance of {@link AllowanceChargeType }
     * 
     */
    public AllowanceChargeType createAllowanceChargeType() {
        return new AllowanceChargeType();
    }

    /**
     * Create an instance of {@link DebitNoteType }
     * 
     */
    public DebitNoteType createDebitNoteType() {
        return new DebitNoteType();
    }

    /**
     * Create an instance of {@link PartyType }
     * 
     */
    public PartyType createPartyType() {
        return new PartyType();
    }

    /**
     * Create an instance of {@link TaxTotalType }
     * 
     */
    public TaxTotalType createTaxTotalType() {
        return new TaxTotalType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "PhysicalLocation")
    public JAXBElement<LocationType> createPhysicalLocation(LocationType value) {
        return new JAXBElement<LocationType>(_PhysicalLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DespatchType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Despatch")
    public JAXBElement<DespatchType> createDespatch(DespatchType value) {
        return new JAXBElement<DespatchType>(_Despatch_QNAME, DespatchType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllowanceChargeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "AllowanceCharge")
    public JAXBElement<AllowanceChargeType> createAllowanceCharge(AllowanceChargeType value) {
        return new JAXBElement<AllowanceChargeType>(_AllowanceCharge_QNAME, AllowanceChargeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Invoice")
    public JAXBElement<InvoiceType> createInvoice(InvoiceType value) {
        return new JAXBElement<InvoiceType>(_Invoice_QNAME, InvoiceType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyTaxSchemeType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "PartyTaxScheme")
    public JAXBElement<PartyTaxSchemeType> createPartyTaxScheme(PartyTaxSchemeType value) {
        return new JAXBElement<PartyTaxSchemeType>(_PartyTaxScheme_QNAME, PartyTaxSchemeType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreditNoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "CreditNote")
    public JAXBElement<CreditNoteType> createCreditNote(CreditNoteType value) {
        return new JAXBElement<CreditNoteType>(_CreditNote_QNAME, CreditNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyLegalEntityType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "PartyLegalEntity")
    public JAXBElement<PartyLegalEntityType> createPartyLegalEntity(PartyLegalEntityType value) {
        return new JAXBElement<PartyLegalEntityType>(_PartyLegalEntity_QNAME, PartyLegalEntityType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LocationType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "DeliveryLocation")
    public JAXBElement<LocationType> createDeliveryLocation(LocationType value) {
        return new JAXBElement<LocationType>(_DeliveryLocation_QNAME, LocationType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InvoiceLineType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "InvoiceLine")
    public JAXBElement<InvoiceLineType> createInvoiceLine(InvoiceLineType value) {
        return new JAXBElement<InvoiceLineType>(_InvoiceLine_QNAME, InvoiceLineType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "TaxTotal")
    public JAXBElement<TaxTotalType> createTaxTotal(TaxTotalType value) {
        return new JAXBElement<TaxTotalType>(_TaxTotal_QNAME, TaxTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersonType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Person")
    public JAXBElement<PersonType> createPerson(PersonType value) {
        return new JAXBElement<PersonType>(_Person_QNAME, PersonType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "DespatchAddress")
    public JAXBElement<AddressType> createDespatchAddress(AddressType value) {
        return new JAXBElement<AddressType>(_DespatchAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CustomerPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "AccountingCustomerParty")
    public JAXBElement<CustomerPartyType> createAccountingCustomerParty(CustomerPartyType value) {
        return new JAXBElement<CustomerPartyType>(_AccountingCustomerParty_QNAME, CustomerPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryTermsType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "DeliveryTerms")
    public JAXBElement<DeliveryTermsType> createDeliveryTerms(DeliveryTermsType value) {
        return new JAXBElement<DeliveryTermsType>(_DeliveryTerms_QNAME, DeliveryTermsType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TaxSubtotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "TaxSubtotal")
    public JAXBElement<TaxSubtotalType> createTaxSubtotal(TaxSubtotalType value) {
        return new JAXBElement<TaxSubtotalType>(_TaxSubtotal_QNAME, TaxSubtotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Party")
    public JAXBElement<PartyType> createParty(PartyType value) {
        return new JAXBElement<PartyType>(_Party_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupplierPartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "AccountingSupplierParty")
    public JAXBElement<SupplierPartyType> createAccountingSupplierParty(SupplierPartyType value) {
        return new JAXBElement<SupplierPartyType>(_AccountingSupplierParty_QNAME, SupplierPartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "DeliveryAddress")
    public JAXBElement<AddressType> createDeliveryAddress(AddressType value) {
        return new JAXBElement<AddressType>(_DeliveryAddress_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ItemType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Item")
    public JAXBElement<ItemType> createItem(ItemType value) {
        return new JAXBElement<ItemType>(_Item_QNAME, ItemType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PaymentType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "PrepaidPayment")
    public JAXBElement<PaymentType> createPrepaidPayment(PaymentType value) {
        return new JAXBElement<PaymentType>(_PrepaidPayment_QNAME, PaymentType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "DeliveryParty")
    public JAXBElement<PartyType> createDeliveryParty(PartyType value) {
        return new JAXBElement<PartyType>(_DeliveryParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeliveryType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Delivery")
    public JAXBElement<DeliveryType> createDelivery(DeliveryType value) {
        return new JAXBElement<DeliveryType>(_Delivery_QNAME, DeliveryType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MonetaryTotalType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "LegalMonetaryTotal")
    public JAXBElement<MonetaryTotalType> createLegalMonetaryTotal(MonetaryTotalType value) {
        return new JAXBElement<MonetaryTotalType>(_LegalMonetaryTotal_QNAME, MonetaryTotalType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PartyType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "DespatchParty")
    public JAXBElement<PartyType> createDespatchParty(PartyType value) {
        return new JAXBElement<PartyType>(_DespatchParty_QNAME, PartyType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DebitNoteType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "DebitNote")
    public JAXBElement<DebitNoteType> createDebitNote(DebitNoteType value) {
        return new JAXBElement<DebitNoteType>(_DebitNote_QNAME, DebitNoteType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddressType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Address")
    public JAXBElement<AddressType> createAddress(AddressType value) {
        return new JAXBElement<AddressType>(_Address_QNAME, AddressType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PriceType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.dian.gov.co/contratos/facturaelectronica/v1", name = "Price")
    public JAXBElement<PriceType> createPrice(PriceType value) {
        return new JAXBElement<PriceType>(_Price_QNAME, PriceType.class, null, value);
    }

}
