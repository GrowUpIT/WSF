package co.gide.traslate;

import java.util.ArrayList;
import java.util.List;

import co.gov.dian.contratos.facturaelectronica.v1.InvoiceLineType;





 


public class traslate {

	// Localizacion

	// Retorna la direccion fisica de un tercero o empresa. LLCALDERON

	// LLCALDERON
	
	
	
	public co.gov.dian.contratos.facturaelectronica.v1.LocationType getLocation1() {

		LocationType lt = new LocationType();
		lt.setID();
		lt.setDescription();
		lt.setConditions();
		lt.setCountrySubentity();
		lt.setCountrySubentityCode();
		lt.getValidityPeriod().add();
		lt.setAddress();
		return lt;
	}
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LocationType getLocation2() {

		LocationType lt = new LocationType();
		lt.setID();
		lt.setDescription();
		lt.setConditions();
		lt.setCountrySubentity();
		lt.setCountrySubentityCode();
		lt.getValidityPeriod().add();
		lt.setAddress();
		return lt;
	}
	public oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.LocationType getLocation3() {

		LocationType lt = new LocationType();
		lt.setID();
		lt.setDescription();
		lt.setConditions();
		lt.setCountrySubentity();
		lt.setCountrySubentityCode();
		lt.getValidityPeriod().add();
		lt.setAddress();
		return lt;
	}

	
	public InvoiceLineType getInvoiceLine() {

	
			InvoiceLineType il = new InvoiceLineType();
			il.setID((IDType));
			il.setUUID((UUIDType));
			il.setNote((NoteType) eb.getTexto(l.getNota()));
			il.setInvoicedQuantity((InvoicedQuantityType) eb.getQuantityType(l.getCantidad()));
			il.setLineExtensionAmount((LineExtensionAmountType) eb.getAmountType(l.getValorNeto()));
			String fecha = new SimpleDateFormat("yyyy-MM-dd").format(l.getFechaVigenciaImpuesto());
			TaxPointDateType tpd = new TaxPointDateType();
			tpd.setValue(fecha);
			il.setTaxPointDate(tpd);
			il.setAccountingCostCode((AccountingCostCodeType) eb.getCodigos(l.getCentroDeCostoCodigo()));
			il.setAccountingCost((AccountingCostType) eb.getTexto(l.getCentroDeCostoNombre()));
			FreeOfChargeIndicatorType foc = new FreeOfChargeIndicatorType();
			foc.setValue(l.isIndicaEsGratis());
			il.setFreeOfChargeIndicator(foc);
			for (OrderLineReferenceType lor : getOrderLineReferenceType(l.getReferenciaLineaDocPedido())) {
				il.getOrderLineReference().add(lor);
			}
			for (ReferenciaLineaDocType lrd : l.getReferenciaLineaDocDespacho()) {
				il.getDespatchLineReference().add(getLineReferenceType(lrd));
			}
			for (ReferenciaLineaDocType i : l.getReferenciaLineaDocRecepcion()) {
				il.getReceiptLineReference().add(getLineReferenceType(i));
			}
			for (BillingReferenceType j : getBillingReference(l.getReferenciaDocFactura())) {
				il.getBillingReference().add(j);
			}
			for (ReferenciaADocumentoType k : l.getReferenciaADocumento()) {
				il.getDocumentReference().add(getDocumentoDeReferencia(k));
			}
			il.setPricingReference(getPricingReferenceType(l.getReferenciaPrecios()));
			il.setOriginatorParty(getParty2(l.getTerceroOrigen()));
			for (EntregaType m : l.getEntrega()) {
				il.getDelivery().add(getDeliveryType2(m));
			}
			for (PaymentTermsType pt : getPaymentTerms(l.getTerminosDePago())) {
				il.getPaymentTerms().add(pt);
			}

			for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType cd : eb
					.getAllowanceCharge(l.getCargoDescuento())) {
				// il.getAllowanceCharge.add(cd);
				il.getAllowanceCharge().add(cd);
			}

			for (TotalImpuestoType tim : l.getTotalImpuesto()) {
				il.getTaxTotal().add(eb.getTaxTotal(tim));
			}

			il.setItem(getItem(l.getItem()));

			il.setPrice(eb.getPrice(l.getPrecio()));
			il.setDeliveryTerms(getDeliveryTerms2(l.getCondicionesDeEntrega()));
	
		return il;
	}

	public  DebitNoteLineType  getDebitNoteLine() {

		List<DebitNoteLineType> lista = new ArrayList<DebitNoteLineType>();

		for (LineaDocumentoType l : list) {

			DebitNoteLineType il = new DebitNoteLineType();
			il.setID((IDType) eb.getidentificador(l.getId()));
			il.setUUID((UUIDType) eb.getidentificador(l.getUID()));
			il.setNote((NoteType) eb.getTexto(l.getNota()));
			il.setDebitedQuantity((DebitedQuantityType) eb.getQuantityType(l.getCantidad()));
			il.setLineExtensionAmount((LineExtensionAmountType) eb.getAmountType(l.getValorNeto()));
			String fecha = new SimpleDateFormat("yyyy-MM-dd").format(l.getFechaVigenciaImpuesto());
			TaxPointDateType tpd = new TaxPointDateType();
			tpd.setValue(fecha);
			il.setTaxPointDate(tpd);
			il.setAccountingCostCode((AccountingCostCodeType) eb.getCodigos(l.getCentroDeCostoCodigo()));
			il.setAccountingCost((AccountingCostType) eb.getTexto(l.getCentroDeCostoNombre()));
			for (RespuestaType dr : l.getRespuestaDiscrepancia()) {
				il.getDiscrepancyResponse().add(eb.DiscrepancyResponse(dr));
			}

			for (ReferenciaLineaDocType lrd : l.getReferenciaLineaDocDespacho()) {
				il.getDespatchLineReference().add(getLineReferenceType(lrd));
			}
			for (ReferenciaLineaDocType i : l.getReferenciaLineaDocRecepcion()) {
				il.getReceiptLineReference().add(getLineReferenceType(i));
			}
			for (BillingReferenceType j : getBillingReference(l.getReferenciaDocFactura())) {
				il.getBillingReference().add(j);
			}
			for (ReferenciaADocumentoType k : l.getReferenciaADocumento()) {
				il.getDocumentReference().add(getDocumentoDeReferencia(k));
			}
			il.setPricingReference(getPricingReferenceType(l.getReferenciaPrecios()));
			for (EntregaType m : l.getEntrega()) {
				il.getDelivery().add(getDeliveryType2(m));
			}
			for (TotalImpuestoType tim : l.getTotalImpuesto()) {
				il.getTaxTotal().add(eb.getTaxTotal(tim));
			}

			il.setItem(getItem2(l.getItem()));
			il.setPrice(eb.getPrice2(l.getPrecio()));
			lista.add(il);

		}
		return lista;
	}

	public List<CreditNoteLineType> getCreditNoteLine(List<LineaDocumentoType> list) {
		List<CreditNoteLineType> lista = new ArrayList<CreditNoteLineType>();

		for (LineaDocumentoType l : list) {

			CreditNoteLineType il = new CreditNoteLineType();
			il.setID((IDType) eb.getidentificador(l.getId()));
			il.setUUID((UUIDType) eb.getidentificador(l.getUID()));
			il.setNote((NoteType) eb.getTexto(l.getNota()));
			il.setCreditedQuantity((CreditedQuantityType) eb.getQuantityType(l.getCantidad()));
			il.setLineExtensionAmount((LineExtensionAmountType) eb.getAmountType(l.getValorNeto()));
			String fecha = new SimpleDateFormat("yyyy-MM-dd").format(l.getFechaVigenciaImpuesto());
			TaxPointDateType tpd = new TaxPointDateType();
			tpd.setValue(fecha);
			il.setTaxPointDate(tpd);
			il.setAccountingCostCode((AccountingCostCodeType) eb.getCodigos(l.getCentroDeCostoCodigo()));
			il.setAccountingCost((AccountingCostType) eb.getTexto(l.getCentroDeCostoNombre()));
			for (RespuestaType dr : l.getRespuestaDiscrepancia()) {
				il.getDiscrepancyResponse().add(eb.DiscrepancyResponse(dr));
			}

			for (ReferenciaLineaDocType lrd : l.getReferenciaLineaDocDespacho()) {
				il.getDespatchLineReference().add(getLineReferenceType(lrd));
			}
			for (ReferenciaLineaDocType i : l.getReferenciaLineaDocRecepcion()) {
				il.getReceiptLineReference().add(getLineReferenceType(i));
			}
			for (BillingReferenceType j : getBillingReference(l.getReferenciaDocFactura())) {
				il.getBillingReference().add(j);
			}
			for (ReferenciaADocumentoType k : l.getReferenciaADocumento()) {
				il.getDocumentReference().add(getDocumentoDeReferencia(k));
			}
			il.setPricingReference(getPricingReferenceType(l.getReferenciaPrecios()));
			for (EntregaType m : l.getEntrega()) {
				il.getDelivery().add(getDeliveryType2(m));
			}
			for (TotalImpuestoType tim : l.getTotalImpuesto()) {
				il.getTaxTotal().add(eb.getTaxTotal(tim));
			}

			il.setItem(getItem2(l.getItem()));
			il.setPrice(eb.getPrice2(l.getPrecio()));
			lista.add(il);

		}
		return lista;
	}

	// Condiciones de entrega LLCALDERON

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType getDeliveryTerms2(
			CondicionesDeEntregaType condiciones) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType dt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryTermsType();

		dt.setID((IDType) eb.getidentificador(condiciones.getId()));
		dt.setSpecialTerms((SpecialTermsType) eb.getTexto(condiciones.getCondicionesEspeciales()));
		dt.setLossRiskResponsibilityCode(
				(LossRiskResponsibilityCodeType) eb.getCodigos(condiciones.getCodResponsabPerdida()));
		dt.setLossRisk((LossRiskType) eb.getTexto(condiciones.getRiesgoDePerdida()));
		dt.setDeliveryLocation(getLocation2(condiciones.getUbicacionEntrega()));
		dt.setAllowanceCharge(eb.getAllowanceCharge2(condiciones.getCargoDescuentoType()));
		return dt;

	}

	// LLCALDERON Refrencia a precio

	public PricingReferenceType getPricingReferenceType(ReferenciaPreciosType Precios) {
		PricingReferenceType pr = new PricingReferenceType();
		pr.setOriginalItemLocationQuantity(getItemLocationQuantityType(Precios.getItemUbicacionCantidadOriginal()));
		for (PrecioType p : Precios.getPrecioAlternativo()) {
			pr.getAlternativeConditionPrice().add(eb.getPriceType(p));
		}
		return pr;
	}

	// LLCALDERON CAntidad del item

	public ItemLocationQuantityType getItemLocationQuantityType(ItemUbicacionCantidadType item) {
		ItemLocationQuantityType il = new ItemLocationQuantityType();
		il.setLeadTimeMeasure((LeadTimeMeasureType) eb.getMeasure(item.getPlazoDeEntrega()));
		il.setMinimumQuantity((MinimumQuantityType) eb.getQuantityType(item.getCantidadMinima()));
		il.setMaximumQuantity((MaximumQuantityType) eb.getQuantityType(item.getCantidadMaxima()));
		HazardousRiskIndicatorType hri = new HazardousRiskIndicatorType();
		hri.setValue(item.isIndicaRiesgoPeligro());
		il.setHazardousRiskIndicator(hri);
		for (TextoType t : item.getRestriccionesComerciales()) {
			il.getTradingRestrictions().add((TradingRestrictionsType) eb.getTexto(t));
		}

		for (DireccionType a : item.getDireccionTerritorioAplicable()) {
			il.getApplicableTerritoryAddress().add(getAddress(a));
		}

		il.setPrice(eb.getPriceType(item.getPrecio()));

		for (UnidadDeEntregaType u : item.getUnidadEntrega()) {
			il.getDeliveryUnit().add(getDeliveryUnit(u));
		}

		for (TaxCategoryType c : eb.getTaxCategoryType(item.getCategoriaImpuestoAplicable())) {
			il.getApplicableTaxCategory().add(c);
		}

		return il;
	}

	// LLCALDERON Linea de refenrecnia a despacho
	/// <!-- cac:DeliveryUnitType -->
	// <!-- Information about a Delivery Unit -->
	private DeliveryUnitType getDeliveryUnit(UnidadDeEntregaType u) {
		DeliveryUnitType du = new DeliveryUnitType();
		du.setBatchQuantity(eb.BatchQuantity(u.getCantidadLote()));
		du.setConsumerUnitQuantity(eb.getConsumerUnitQuantity(u.getCantidadConsumidor()));
		HazardousRiskIndicatorType hri = new HazardousRiskIndicatorType();
		hri.setValue(u.isIndicadorRiesgoPeligroso());
		du.setHazardousRiskIndicator(hri);
		return du;
	}

	// LLCALDERON
	public LineReferenceType getLineReferenceType(ReferenciaLineaDocType l) {
		LineReferenceType lr = new LineReferenceType();
		lr.setLineID((LineIDType) eb.getidentificador(l.getIdLinea()));
		lr.setUUID((UUIDType) eb.getidentificador(l.getUID()));
		lr.setLineStatusCode((LineStatusCodeType) eb.getCodigos(l.getCodigoEstadoLinea()));
		lr.setDocumentReference(getDocumentoDeReferencia(l.getReferenciaADocumento()));
		return lr;
	}

	// LLCALDERON ReferenciaLineaDocPedido

	public List<OrderLineReferenceType> getOrderLineReferenceType(List<ReferenciaLineaDocPedidoType> list) {
		List<OrderLineReferenceType> lista = new ArrayList<OrderLineReferenceType>();
		for (ReferenciaLineaDocPedidoType r : list) {
			OrderLineReferenceType ol = new OrderLineReferenceType();
			ol.setLineID((LineIDType) eb.getidentificador(r.getIdItemComprador()));
			ol.setSalesOrderLineID((SalesOrderLineIDType) eb.getidentificador(r.getIdItemVendedor()));
			ol.setUUID((UUIDType) eb.getidentificador(r.getUID()));
			ol.setLineStatusCode((LineStatusCodeType) eb.getCodigos(r.getCodigoEstadoLinea()));
			List<ReferenciaDocOrdenType> listareferencia = new ArrayList<ReferenciaDocOrdenType>();
			listareferencia.add(r.getReferenciaDocOrden());
			for (OrderReferenceType l : getOrderReference(listareferencia)) {
				ol.setOrderReference(l);
			}
			lista.add(ol);
		}
		return lista;

	}

	// LLCALDERON

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemType getItem2(
			co.simba.documentoelectronico.ItemType i) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemType it = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemType();
		for (TextoType d : i.getDescripcion()) {
			it.getDescription().add((DescriptionType) eb.getTexto(d));
		}
		it.setPackQuantity((PackQuantityType) eb.getQuantityType(i.getCantidadEmpaque()));
		PackSizeNumericType psn = new PackSizeNumericType();
		psn.setValue(i.getItemsPorEmpaque());
		it.setPackSizeNumeric(psn);
		CatalogueIndicatorType cit = new CatalogueIndicatorType();
		cit.setValue(i.isIndicaDesdeCalogo());
		it.setCatalogueIndicator(cit);
		it.setName(eb.getName(i.getNombre()));
		HazardousRiskIndicatorType hri = new HazardousRiskIndicatorType();
		hri.setValue(i.isIndicadorRiesgoPeligroso());
		it.setHazardousRiskIndicator(hri);
		it.setAdditionalInformation((AdditionalInformationType) eb.getTexto(i.getInformacionAdicional()));
		for (TextoType pc : i.getPalabraClave()) {
			it.getKeyword().add((KeywordType) eb.getTexto(pc));
		}
		for (NombreType bn : i.getMarca()) {
			it.getBrandName().add((BrandNameType) eb.getNameType(bn));
		}
		for (NombreType m : i.getModelo()) {
			it.getModelName().add((ModelNameType) eb.getNameType(m));
		}
		it.setBuyersItemIdentification(getItemIdentificationType(i.getIdItemComprador()));
		it.setSellersItemIdentification(getItemIdentificationType(i.getIdItemVendedor()));
		for (IdentificacionItemType iv : i.getIdItemFabricante()) {
			it.getManufacturersItemIdentification().add(getItemIdentificationType(iv));
		}
		it.setStandardItemIdentification(getItemIdentificationType(i.getIdItemEstandar()));
		it.setCatalogueItemIdentification(getItemIdentificationType(i.getIdItemCatalogo()));
		for (IdentificacionItemType ii : i.getIdItemAdicional()) {
			it.getAdditionalItemIdentification().add(getItemIdentificationType(ii));
		}
		it.setCatalogueDocumentReference(getDocumentoDeReferencia(i.getReferenciaDocCatalogo()));
		for (ReferenciaADocumentoType ft : i.getReferenciaDocFichaTec()) {
			it.getItemSpecificationDocumentReference().add(getDocumentoDeReferencia(ft));
		}
		it.setOriginCountry(eb.getCountryType(i.getPaisDeOrigen()));
		for (ClasificacionArticuloType ca : i.getClasificacionArticulo()) {
			it.getCommodityClassification().add(getCommodityClassificationType(ca));
		}
		for (CondicionesTransaccionalesType ct : i.getCondicionesTransaccionales()) {
			it.getTransactionConditions().add(getTransactionConditionsType(ct));
		}
		for (ItemPeligrosoType ip : i.getItemPeligroso()) {
			it.getHazardousItem().add(getHazardousItemType(ip));
		}
		for (TaxCategoryType ci : eb.getTaxCategoryType(i.getCategoriasImpuestos())) {
			it.getClassifiedTaxCategory().add(ci);
		}

		for (PropiedadItemType ips : i.getPropiedadesAdicionalesItem()) {
			it.getAdditionalItemProperty().add(getItemPropertyType(ips));
		}

		for (TerceroType tf : i.getTerceroFabricante()) {
			it.getManufacturerParty().add(getParty2(tf));
		}
		it.setInformationContentProviderParty(getParty2(i.getTerceroProveedorContenido()));
		for (DireccionType a : i.getDireccionDeOrigen()) {
			it.getOriginAddress().add(getAddress(a));
		}
		for (InstanciaItemType inst : i.getInstanciasItem()) {
			it.getItemInstance().add(getItemInstanceType(inst));

		}
		return it;
	}

	public co.gov.dian.contratos.facturaelectronica.v1.ItemType getItem(co.simba.documentoelectronico.ItemType i) {
		co.gov.dian.contratos.facturaelectronica.v1.ItemType it = new co.gov.dian.contratos.facturaelectronica.v1.ItemType();
		for (TextoType d : i.getDescripcion()) {
			it.getDescription().add((DescriptionType) eb.getTexto(d));
		}
		it.setPackQuantity((PackQuantityType) eb.getQuantityType(i.getCantidadEmpaque()));
		PackSizeNumericType psn = new PackSizeNumericType();
		psn.setValue(i.getItemsPorEmpaque());
		it.setPackSizeNumeric(psn);
		CatalogueIndicatorType cit = new CatalogueIndicatorType();
		cit.setValue(i.isIndicaDesdeCalogo());
		it.setCatalogueIndicator(cit);
		it.setName(eb.getName(i.getNombre()));
		HazardousRiskIndicatorType hri = new HazardousRiskIndicatorType();
		hri.setValue(i.isIndicadorRiesgoPeligroso());
		it.setHazardousRiskIndicator(hri);
		it.setAdditionalInformation((AdditionalInformationType) eb.getTexto(i.getInformacionAdicional()));
		for (TextoType pc : i.getPalabraClave()) {
			it.getKeyword().add((KeywordType) eb.getTexto(pc));
		}
		for (NombreType bn : i.getMarca()) {
			it.getBrandName().add((BrandNameType) eb.getNameType(bn));
		}
		for (NombreType m : i.getModelo()) {
			it.getModelName().add((ModelNameType) eb.getNameType(m));
		}
		it.setBuyersItemIdentification(getItemIdentificationType(i.getIdItemComprador()));
		it.setSellersItemIdentification(getItemIdentificationType(i.getIdItemVendedor()));
		for (IdentificacionItemType iv : i.getIdItemFabricante()) {
			it.getManufacturersItemIdentification().add(getItemIdentificationType(iv));
		}
		it.setStandardItemIdentification(getItemIdentificationType(i.getIdItemEstandar()));
		it.setCatalogueItemIdentification(getItemIdentificationType(i.getIdItemCatalogo()));
		for (IdentificacionItemType ii : i.getIdItemAdicional()) {
			it.getAdditionalItemIdentification().add(getItemIdentificationType(ii));
		}
		it.setCatalogueDocumentReference(getDocumentoDeReferencia(i.getReferenciaDocCatalogo()));
		for (ReferenciaADocumentoType ft : i.getReferenciaDocFichaTec()) {
			it.getItemSpecificationDocumentReference().add(getDocumentoDeReferencia(ft));
		}
		it.setOriginCountry(eb.getCountryType(i.getPaisDeOrigen()));
		for (ClasificacionArticuloType ca : i.getClasificacionArticulo()) {
			it.getCommodityClassification().add(getCommodityClassificationType(ca));
		}
		for (CondicionesTransaccionalesType ct : i.getCondicionesTransaccionales()) {
			it.getTransactionConditions().add(getTransactionConditionsType(ct));
		}
		for (ItemPeligrosoType ip : i.getItemPeligroso()) {
			it.getHazardousItem().add(getHazardousItemType(ip));
		}
		for (TaxCategoryType ci : eb.getTaxCategoryType(i.getCategoriasImpuestos())) {
			it.getClassifiedTaxCategory().add(ci);
		}

		for (PropiedadItemType ips : i.getPropiedadesAdicionalesItem()) {
			it.getAdditionalItemProperty().add(getItemPropertyType(ips));
		}

		for (TerceroType tf : i.getTerceroFabricante()) {
			it.getManufacturerParty().add(getParty2(tf));
		}
		it.setInformationContentProviderParty(getParty2(i.getTerceroProveedorContenido()));
		for (DireccionType a : i.getDireccionDeOrigen()) {
			it.getOriginAddress().add(getAddress(a));
		}
		for (InstanciaItemType inst : i.getInstanciasItem()) {
			it.getItemInstance().add(getItemInstanceType(inst));

		}
		return it;
	}

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemInstanceType getItemInstanceType(
			InstanciaItemType i) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemInstanceType ii = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemInstanceType();
		ii.setProductTraceID((ProductTraceIDType) eb.getidentificador(i.getIdRastreoProducto()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(i.getFechaFabricacion());
		ManufactureDateType mst = new ManufactureDateType();
		mst.setValue(fecha);
		ii.setManufactureDate(mst);
		String hora = new SimpleDateFormat("HH:MM:ss").format(i.getHoraFabricacion());
		ManufactureTimeType mt = new ManufactureTimeType();
		mt.setValue(hora);
		ii.setManufactureTime(mt);
		ii.setRegistrationID((RegistrationIDType) eb.getidentificador(i.getIdRegistro()));
		ii.setSerialID((SerialIDType) eb.getidentificador(i.getIdSerial()));
		for (PropiedadItemType ips : i.getPropiedadesAdicionalesItem()) {
			ii.getAdditionalItemProperty().add(getItemPropertyType(ips));
		}
		ii.setLotIdentification(getLotIdentificationType(i.getIdentificacionLote()));
		return ii;
	}

	// LLCALDERON

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LotIdentificationType getLotIdentificationType(
			IdentificacionLoteType i) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LotIdentificationType li = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.LotIdentificationType();
		li.setLotNumberID((LotNumberIDType) eb.getidentificador(i.getIdNumeroLote()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(i.getFechaExpiracion());
		ExpiryDateType ed = new ExpiryDateType();
		ed.setValue(fecha);
		li.setExpiryDate(ed);
		for (PropiedadItemType pa : i.getPropiedadesAdicionalesItem()) {
			li.getAdditionalItemProperty().add(getItemPropertyType(pa));
		}

		return li;
	}

	// LLCALDERON CategoriasImpuestos

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyType getItemPropertyType(
			PropiedadItemType ips) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyType ip = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyType();

		ip.setName(eb.getName(ips.getNombre()));
		ip.setValue((ValueType) eb.getTexto(ips.getValor()));
		ip.setUsabilityPeriod(eb.getPeriodo(ips.getPeriodoDeUso()));
		for (GrupoPropiedadesItemType ipg : ips.getGrupoPropiedadesItem()) {
			ip.getItemPropertyGroup().add(getItemPropertyGroupType(ipg));
		}

		return ip;
	}

	// LLCALDERON
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyGroupType getItemPropertyGroupType(
			GrupoPropiedadesItemType ipg) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyGroupType ip = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.ItemPropertyGroupType();
		ip.setID((IDType) eb.getidentificador(ipg.getId()));
		ip.setName(eb.getName(ipg.getNombre()));
		return ip;

	}

	// LLCALDERON
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousItemType getHazardousItemType(
			ItemPeligrosoType ip) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousItemType hi = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousItemType();

		hi.setID((IDType) eb.getidentificador(ip.getId()));
		hi.setPlacardNotation((PlacardNotationType) eb.getTexto(ip.getRotuloNota()));
		hi.setPlacardEndorsement((PlacardEndorsementType) eb.getTexto(ip.getRotuloEndoso()));
		hi.setAdditionalInformation((AdditionalInformationType) eb.getTexto(ip.getInformacionAdicional()));
		hi.setUNDGCode((UNDGCodeType) eb.getCodigos(ip.getCodigoNacionesUnidas()));
		hi.setEmergencyProceduresCode((EmergencyProceduresCodeType) eb.getCodigos(ip.getCodigoProcedEmergencia()));
		hi.setMedicalFirstAidGuideCode((MedicalFirstAidGuideCodeType) eb.getCodigos(ip.getCodigoMedicoPrimAuxilios()));
		// hi.setTechnicalName((TechnicalNameType) eb.getNameType(ip.set));
		hi.setCategoryName((CategoryNameType) eb.getNameType(ip.getNombreCategoria()));
		hi.setHazardousCategoryCode((HazardousCategoryCodeType) eb.getCodigos(ip.getCodigoCategoriaPeligro()));
		hi.setUpperOrangeHazardPlacardID(
				(UpperOrangeHazardPlacardIDType) eb.getidentificador(ip.getNumeroSuperiorRotuloNaranja()));
		hi.setLowerOrangeHazardPlacardID(
				(LowerOrangeHazardPlacardIDType) eb.getidentificador(ip.getNumeroInferiorRotuloNaranja()));
		hi.setMarkingID((MarkingIDType) eb.getidentificador(ip.getIdMarcado()));
		hi.setHazardClassID((HazardClassIDType) eb.getidentificador(ip.getIdClasePeligro()));
		hi.setNetWeightMeasure((NetWeightMeasureType) eb.getMeasure2(ip.getPesoNeto()));
		hi.setNetVolumeMeasure((NetVolumeMeasureType) eb.getMeasure(ip.getVolumenNeto()));
		hi.setQuantity(eb.getQuantity(ip.getCantidad()));
		hi.setContactParty(getParty2(ip.getTerceroDeContacto()));
		for (PeligroSecundarioType sh : ip.getPeligrosSecundarios()) {
			hi.getSecondaryHazard().add(getSecondaryHazard(sh));
		}
		for (TransitoMercanciaPeligrosaType hg : ip.getTransitoMercanciasPeligrosas()) {
			hi.getHazardousGoodsTransit().add(getHazardousGoodsTransitType(hg));
		}

		hi.setEmergencyTemperature(getTemperatureType(ip.getTemperaturaParaEmergencia()));
		hi.setFlashpointTemperature(getTemperatureType(ip.getTemperaturaPuntoInflamacion()));
		for (TemperaturaType temp : ip.getTemperaturaAdicional()) {
			hi.getAdditionalTemperature().add(getTemperatureType(temp));
		}
		return hi;

	}

	// LLCALDERON TransitoMercanciasPeligrosas
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousGoodsTransitType getHazardousGoodsTransitType(
			TransitoMercanciaPeligrosaType hg2) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousGoodsTransitType hg = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.HazardousGoodsTransitType();

		hg.setTransportEmergencyCardCode(
				(TransportEmergencyCardCodeType) eb.getCodigos(hg2.getIdTarjetaEmergenciaTransporte()));
		hg.setPackingCriteriaCode((PackingCriteriaCodeType) eb.getCodigos(hg2.getCodigoCriteriosEmbalaje()));
		hg.setHazardousRegulationCode((HazardousRegulationCodeType) eb.getCodigos(hg2.getCodigoNormativoPeligro()));
		hg.setInhalationToxicityZoneCode(
				(InhalationToxicityZoneCodeType) eb.getCodigos(hg2.getCodZonaPeligroToxicidadInhalac()));
		hg.setTransportAuthorizationCode(
				(TransportAuthorizationCodeType) eb.getCodigos(hg2.getCodigoAutorizacionTransporte()));
		hg.setMaximumTemperature(getTemperatureType(hg2.getTemperaturaMaxima()));
		hg.setMinimumTemperature(getTemperatureType(hg2.getTemperaturaMinima()));

		return hg;
	}

	// CODIGOS DE TEMEPRATURA
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TemperatureType getTemperatureType(
			TemperaturaType tem) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TemperatureType t = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TemperatureType();
		t.setAttributeID((AttributeIDType) eb.getidentificador(tem.getIdAtributo()));
		t.setMeasure((MeasureType) eb.getMeasure2(tem.getMedida()));
		for (DescriptionType desc : eb.getDescripcion2(tem.getDescripcion())) {
			t.getDescription().add(desc);
		}

		return t;

	}

	// LLCALDERON PELIGRO SEGUNDARIO
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SecondaryHazardType getSecondaryHazard(
			PeligroSecundarioType sh2) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SecondaryHazardType sh = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SecondaryHazardType();
		sh.setID((IDType) eb.getidentificador(sh2.getId()));
		sh.setPlacardNotation((PlacardNotationType) eb.getTexto(sh2.getRotuloNota()));
		sh.setPlacardEndorsement((PlacardEndorsementType) eb.getTexto(sh2.getRotuloEndoso()));
		sh.setEmergencyProceduresCode((EmergencyProceduresCodeType) eb.getCodigos(sh2.getCodigoProcedEmergencia()));
		sh.setExtension((ExtensionType) eb.getTexto(sh2.getExtension()));
		return sh;
	}

	// LLCALDERON
	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransactionConditionsType getTransactionConditionsType(
			CondicionesTransaccionalesType ct) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransactionConditionsType tc = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TransactionConditionsType();
		tc.setID((IDType) eb.getidentificador(ct.getId()));
		tc.setActionCode((ActionCodeType) eb.getCodigos(ct.getCodigoAccion()));
		for (TextoType dc : ct.getDescripcion()) {
			tc.getDescription().add((DescriptionType) eb.getTexto(dc));
		}
		for (ReferenciaADocumentoType cr : ct.getReferenciaADocumento()) {
			tc.getDocumentReference().add(getDocumentoDeReferencia(cr));
		}
		return tc;
	}

	// LLCALDERON
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommodityClassificationType getCommodityClassificationType(
			ClasificacionArticuloType ca) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommodityClassificationType cc = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CommodityClassificationType();
		cc.setNatureCode((NatureCodeType) eb.getCodigos(ca.getCodigoDeNaturaleza()));
		cc.setCargoTypeCode((CargoTypeCodeType) eb.getCodigos(ca.getCodigoTipoMercancia()));
		cc.setCommodityCode((CommodityCodeType) eb.getCodigos(ca.getCodigoArticulo()));
		cc.setItemClassificationCode((ItemClassificationCodeType) eb.getCodigos(ca.getCodigoClasificacionItem()));
		return cc;

	}

	public ItemIdentificationType getItemIdentificationType(IdentificacionItemType i) {
		ItemIdentificationType id = new ItemIdentificationType();
		id.setID((IDType) eb.getidentificador(i.getId()));
		id.setExtendedID((ExtendedIDType) eb.getidentificador(i.getIdExtendida()));
		for (CaracteristicaFisicaType f : i.getCaracteristicaFisica()) {
			id.getPhysicalAttribute().add(getPhysicalAttribute(f));
		}
		for (co.simba.documentoelectronico.DimensionType di : i.getMedidaDimensiones()) {
			id.getMeasurementDimension().add(getDimensionType(di));
		}
		id.setIssuerParty(getParty2(i.getTerceroEmisor()));
		return id;
	}

	// LLCALDERON
	private DimensionType getDimensionType(co.simba.documentoelectronico.DimensionType di) {

		DimensionType dt = new DimensionType();
		dt.setAttributeID((AttributeIDType) eb.getidentificador(di.getIdAtributo()));
		dt.setMeasure((MeasureType) eb.getMeasure2(di.getMedida()));
		for (TextoType d : di.getDescripcion()) {
			dt.getDescription().add((DescriptionType) eb.getTexto(d));
		}
		dt.setMinimumMeasure((MinimumMeasureType) eb.getMeasure(di.getMedidaMinima()));
		dt.setMaximumMeasure((MaximumMeasureType) eb.getMeasure(di.getMedidaMaxima()));
		return dt;
	}

	// LLCALDERON
	private PhysicalAttributeType getPhysicalAttribute(CaracteristicaFisicaType f) {
		PhysicalAttributeType pa = new PhysicalAttributeType();
		pa.setAttributeID((AttributeIDType) eb.getidentificador(f.getIdAtributo()));
		pa.setPositionCode((PositionCodeType) eb.getCodigos(f.getCodigoPosicion()));
		pa.setDescriptionCode((DescriptionCodeType) eb.getCodigos(f.getDescripcionCodigo()));
		for (TextoType d : f.getDescripcionTexto()) {
			pa.getDescription().add((DescriptionType) eb.getTexto(d));

		}
		return pa;
	}

	/*****
	 * * *Estoy por aca, desde este sitio debo continuar maÃ±ana * * *
	 * 
	 * * *LEONARDO LUIS TERMINE INVOICE LINE *
	 */

	public ItemType getItems() {
		return null;

	}

	// Impuestos y valores
	// <!-- cac:MonetaryTotalType -->
	// <!-- Information about Monetary Totals. -->
	public MonetaryTotalType getMonetaryTotal(TotalesType totales) {
		MonetaryTotalType mt = new MonetaryTotalType();
		mt.setLineExtensionAmount(
				(LineExtensionAmountType) eb.getAmountType(totales.getTotalMonetario().getValorBruto()));
		mt.setTaxExclusiveAmount(
				(TaxExclusiveAmountType) eb.getAmountType(totales.getTotalMonetario().getValorBaseImpuestos()));
		mt.setTaxInclusiveAmount(
				(TaxInclusiveAmountType) eb.getAmountType(totales.getTotalMonetario().getTotalMasImpuestos()));
		mt.setAllowanceTotalAmount(
				(AllowanceTotalAmountType) eb.getAmountType(totales.getTotalMonetario().getTotalDescuentos()));
		mt.setChargeTotalAmount((ChargeTotalAmountType) eb.getAmountType(totales.getTotalMonetario().getTotalCargos()));
		mt.setPrepaidAmount((PrepaidAmountType) eb.getAmountType(totales.getTotalMonetario().getValorAnticipo()));
		mt.setPayableRoundingAmount(
				(PayableRoundingAmountType) eb.getAmountType(totales.getTotalMonetario().getValorAjusteRedondeo()));
		mt.setPayableAmount((PayableAmountType) eb.getAmountType(totales.getTotalMonetario().getValorAPagar()));
		return mt;
	}

	// LLCALDERN
	public List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType> getTaxTotalLista(
			List<TotalImpuestoType> Impuestos) {

		List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType> lista = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType>();
		for (TotalImpuestoType i : Impuestos) {
			oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType tt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType();
			tt.setTaxAmount(getTaxAmountType(i.getValorImpuesto()));
			tt.setRoundingAmount(eb.geRoundingAmount(i.getValorAjusteRedondeo()));
			TaxEvidenceIndicatorType te = new TaxEvidenceIndicatorType();
			te.setValue(i.isIndicaEsSoloEvidencia());
			tt.setTaxEvidenceIndicator(te);
			List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType> Subtotal = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType>();
			Subtotal = eb.getTaxSubtotal(i.getSubTotalImpuesto());
			for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType ts : Subtotal) {
				tt.getTaxSubtotal().add(ts);
			}

			lista.add(tt);
		}
		return lista;

	}

	// LLCALDERN

	private TaxAmountType getTaxAmountType(MontoType monto) {

		TaxAmountType ta = new TaxAmountType();
		CurrencyCodeContentType codigo = null;
		// solo adminte un valor de tres caracteres ej: AED que corresponden al
		// tipo de koneda
		ta.setCurrencyID(codigo.fromValue(monto.getIdMoneda()));
		ta.setValue(monto.getValue());
		return ta;
	}

	// LLCALDERON Tasa DE Cambio
	// <!-- cac:ExchangeRateType -->
	// <!-- Information about Exchange Rate -->
	public ExchangeRateType getExchangeRate(TasaDeCambioType tasaDeCambio) {
		ExchangeRateType er = new ExchangeRateType();
		er.setSourceCurrencyCode((SourceCurrencyCodeType) eb.getCodigos(tasaDeCambio.getOrigenCodigoMoneda()));
		SourceCurrencyBaseRateType acb = new SourceCurrencyBaseRateType();
		acb.setValue(tasaDeCambio.getOrigenFactorBase());
		er.setSourceCurrencyBaseRate(acb);
		er.setTargetCurrencyCode((TargetCurrencyCodeType) eb.getCodigos(tasaDeCambio.getDestinoCodigoMoneda()));
		TargetCurrencyBaseRateType tcb = new TargetCurrencyBaseRateType();
		tcb.setValue(tasaDeCambio.getDestinoFactorBase());
		er.setTargetCurrencyBaseRate(tcb);
		er.setExchangeMarketID((ExchangeMarketIDType) eb.getidentificador(tasaDeCambio.getIdMercadoDivisas()));
		CalculationRateType crt = new CalculationRateType();
		crt.setValue(tasaDeCambio.getFactorDeCalculo());
		er.setCalculationRate(crt);
		er.setMathematicOperatorCode(
				(MathematicOperatorCodeType) eb.getCodigos(tasaDeCambio.getCodigoOperadorMatematico()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(tasaDeCambio.getFecha());
		DateType dt = new DateType();
		dt.setValue(fecha);
		er.setDate(dt);
		er.setForeignExchangeContract(getContractType(tasaDeCambio.getContratoCambiario()));
		return er;
	}

	// LLCALDERON CONTRATO CAMBIARIO
	private ContractType getContractType(ContratoType contrato) {
		ContractType ct = new ContractType();
		ct.setID((IDType) eb.getidentificador(contrato.getId()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(contrato.getFechaEmision());
		IssueDateType id = new IssueDateType();
		id.setValue(fecha);
		ct.setIssueDate(id);
		IssueTimeType it = new IssueTimeType();
		String hora = new SimpleDateFormat("HH:MM:ss").format(contrato.getHoraEmision());
		it.setValue(hora);
		ct.setIssueTime(it);
		ct.setContractTypeCode((ContractTypeCodeType) eb.getCodigos(contrato.getTipoContratoCodigo()));
		ct.setContractType((ContractTypeType) eb.getTexto(contrato.getTipoContratoTexto()));
		ct.setValidityPeriod(eb.getPeriodo(contrato.getPeriodoValidez()));
		for (ReferenciaADocumentoType doc : contrato.getReferenciaADocumento()) {
			ct.getContractDocumentReference().add(getDocumentoDeReferencia(doc));
		}
		return ct;
	}

	// Terceros

	// LLCALDERON Tercero descrito
	public PartyType getParty(TerceroType p) {

		PartyType pt = new PartyType();
		MarkCareIndicatorType mc = new MarkCareIndicatorType();
		mc.setValue(p.isMarcaDeCuidado());
		pt.setMarkCareIndicator(mc);
		MarkAttentionIndicatorType mci = new MarkAttentionIndicatorType();
		mci.setValue(p.isMarcaDeAtencion());
		pt.setMarkAttentionIndicator(mci);
		pt.setWebsiteURI((WebsiteURIType) eb.getidentificador(p.getSitioWeb()));
		pt.setLogoReferenceID((LogoReferenceIDType) eb.getidentificador(p.getReferenciaIdLogo()));
		pt.setEndpointID((EndpointIDType) eb.getidentificador(p.getIdEndpoint()));
		pt.getPartyIdentification().add(eb.getidterceros(p.getIdTercero()));
		for (NombreTerceroType n : p.getNombreTercero()) {
			PartyNameType pn = new PartyNameType();
			pn.setName(eb.getName(n.getNombreTercero()));
			pt.getPartyName().add(pn);
		}
		for (IdiomaType s : p.getIdioma()) {
			pt.setLanguage(eb.getLanguage(s));
		}
		List<DireccionType> list = new ArrayList<DireccionType>();
		list.add(p.getDireccionPostal());
		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType s : getAddress(list)) {
			pt.setPostalAddress(s);
		}
		pt.setPhysicalLocation(getLocation(p.getUbicacionFisica()));
		for (EsquemaTributarioTerceroType s : p.getEsquemaTributarioTercero()) {
			pt.getPartyTaxScheme().add(getPartyTaxSchemeType(s));
		}
		//
		for (EntidadLegalTerceroType plegal : p.getEntidadLegalTercero()) {
			pt.getPartyLegalEntity().add(getPartyLegalEntity(plegal));
		}
		pt.setContact(eb.getContact(p.getContacto()));

		for (PersonaType persona : p.getPersonas()) {
			pt.getPerson().add(getPersonType(persona));
		}

		pt.setAgentParty(getParty2(p.getTerceroAgente()));

		return pt;

	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType getParty2(TerceroType p) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType pt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType();
		MarkCareIndicatorType mc = new MarkCareIndicatorType();
		mc.setValue(p.isMarcaDeCuidado());
		pt.setMarkCareIndicator(mc);
		MarkAttentionIndicatorType mci = new MarkAttentionIndicatorType();
		mci.setValue(p.isMarcaDeAtencion());
		pt.setMarkAttentionIndicator(mci);
		pt.setWebsiteURI((WebsiteURIType) eb.getidentificador(p.getSitioWeb()));
		pt.setLogoReferenceID((LogoReferenceIDType) eb.getidentificador(p.getReferenciaIdLogo()));
		pt.setEndpointID((EndpointIDType) eb.getidentificador(p.getIdEndpoint()));
		pt.getPartyIdentification().add(eb.getidterceros(p.getIdTercero()));
		for (NombreTerceroType n : p.getNombreTercero()) {
			PartyNameType pn = new PartyNameType();
			pn.setName(eb.getName(n.getNombreTercero()));
			pt.getPartyName().add(pn);
		}
		for (IdiomaType s : p.getIdioma()) {
			pt.setLanguage(eb.getLanguage(s));
		}
		List<DireccionType> list = new ArrayList<DireccionType>();
		list.add(p.getDireccionPostal());
		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType s : getAddress(list)) {
			pt.setPostalAddress(s);
		}
		pt.setPhysicalLocation(getLocation2(p.getUbicacionFisica()));

		for (EsquemaTributarioTerceroType s : p.getEsquemaTributarioTercero()) {
			pt.getPartyTaxScheme().add(getPartyTaxSchemeType2(s));
		}
		//

		for (EntidadLegalTerceroType plegal : p.getEntidadLegalTercero()) {
			pt.getPartyLegalEntity().add(getPartyLegalEntity2(plegal));
		}
		pt.setContact(eb.getContact(p.getContacto()));

		for (PersonaType persona : p.getPersonas()) {
			pt.setPerson(getPersonType2(persona));
		}
		pt.setAgentParty(getParty2(p.getTerceroAgente()));

		return pt;

	}

	private PersonType getPersonType2(PersonaType p) {
		PersonType pt = new PersonType();
		pt.setFirstName((FirstNameType) eb.getNameType(p.getPrimerNombre()));
		pt.setFamilyName((FamilyNameType) eb.getNameType(p.getApellidos()));
		pt.setTitle((TitleType) eb.getTexto(p.getTituloSaludo()));
		pt.setMiddleName((MiddleNameType) eb.getNameType(p.getSegundoNombre()));
		pt.setJobTitle((JobTitleType) eb.getTexto(p.getTituloOcupacion()));
		pt.setOrganizationDepartment((OrganizationDepartmentType) eb.getTexto(p.getOrganizacionDepartamento()));
		return pt;
	}

	// Persona LLCALDERON
	public co.gov.dian.contratos.facturaelectronica.v1.PersonType getPersonType(PersonaType p) {
		co.gov.dian.contratos.facturaelectronica.v1.PersonType pt = new co.gov.dian.contratos.facturaelectronica.v1.PersonType();
		pt.setFirstName((FirstNameType) eb.getNameType(p.getPrimerNombre()));
		pt.setFamilyName((FamilyNameType) eb.getNameType(p.getApellidos()));
		pt.setTitle((TitleType) eb.getTexto(p.getTituloSaludo()));
		pt.setMiddleName((MiddleNameType) eb.getNameType(p.getSegundoNombre()));
		pt.setJobTitle((JobTitleType) eb.getTexto(p.getTituloOcupacion()));
		pt.setOrganizationDepartment((OrganizationDepartmentType) eb.getTexto(p.getOrganizacionDepartamento()));
		return pt;

	}

	// LLCALDERON Medios de Pagos.
	// cac:PaymentMeans
	// Information about Payment Means.
	public List<PaymentMeansType> getPaymentMeanst(List<MedioDePagoType> list) {

		List<PaymentMeansType> plist = new ArrayList<PaymentMeansType>();

		for (MedioDePagoType m : list) {
			PaymentMeansType pm = new PaymentMeansType();
			pm.setPaymentMeansCode((PaymentMeansCodeType) eb.getCodigos(m.getCodigoMedioDePago()));
			pm.setID((IDType) eb.getidentificador(m.getId()));
			String fecha = new SimpleDateFormat("yyyy-MM-dd").format(m.getFechaLimitePago());
			PaymentDueDateType pd = new PaymentDueDateType();
			pd.setValue(fecha);
			pm.setPaymentDueDate(pd);
			pm.setPaymentChannelCode((PaymentChannelCodeType) eb.getCodigos(m.getCodigoCanalDePago()));
			pm.setInstructionID((InstructionIDType) eb.getidentificador(m.getInstruccionId()));
			pm.setCardAccount(eb.getCardAccount(m.getInfoCuentaTarjeta()));
			List<InstructionNoteType> InsNote = new ArrayList<InstructionNoteType>();
			InsNote = eb.getTextoLista(m.getInstruccionNota());
			for (InstructionNoteType i : InsNote) {
				pm.getInstructionNote().add(i);
			}
			pm.setCreditAccount(eb.getCreditAccount(m.getCuentaDeCredito()));
			for (IdentificadorType m1 : m.getIdPago()) {
				pm.getPaymentID().add((PaymentIDType) eb.getidentificador(m1));
			}
			pm.setPayeeFinancialAccount(eb.getFinancialAccount(m.getCuentaFinancieraBeneficiario()));
			pm.setPayerFinancialAccount(eb.getFinancialAccount(m.getCuentaFinancieraPagador()));
			pm.setPaymentMeansCode((PaymentMeansCodeType) eb.getCodigos(m.getCodigoMedioDePago()));
			plist.add(pm);

		}
		return plist;

	}

	public List<PaymentTermsType> getPaymentTerms(List<TerminoDePagoType> list) {

		List<PaymentTermsType> lista = new ArrayList<PaymentTermsType>();
		for (TerminoDePagoType t : list) {
			PaymentTermsType pt = new PaymentTermsType();
			pt.setID((IDType) eb.getidentificador(t.getId()));
			pt.setPaymentMeansID((PaymentMeansIDType) eb.getidentificador(t.getIdMedioDePago()));
			pt.setPrepaidPaymentReferenceID(
					(PrepaidPaymentReferenceIDType) eb.getidentificador(t.getIdRefPagoAnticipado()));
			for (TextoType nota : t.getNota()) {
				pt.getNote().add((NoteType) eb.getTexto(nota));
			}
			pt.setReferenceEventCode((ReferenceEventCodeType) eb.getCodigos(t.getCodigoReferenciaEvento()));
			SettlementDiscountPercentType sdp = new SettlementDiscountPercentType();
			sdp.setValue(t.getPorcentajeDescLiquidacion());
			pt.setSettlementDiscountPercent(sdp);
			PenaltySurchargePercentType psp = new PenaltySurchargePercentType();
			psp.setValue(t.getPorcentajeCargoPorMora());
			pt.setPenaltySurchargePercent(psp);
			pt.setAmount(eb.getAmountType2(t.getValor()));
			pt.setSettlementPeriod(eb.getPeriodo(t.getPeriodoLiquidacion()));
			pt.setPenaltyPeriod(eb.getPeriodo(t.getPenaltyPeriod()));
			lista.add(pt);

		}

		return lista;

	}

	/**********************************************
	 * * TERCEROS ** * LLCALDERON **
	 ** 
	 * @param terceroProveedorType
	 *            **
	 ** @return **
	 **********************************************/

	// TerceroProveedor LLCALDERON
	public SupplierPartyType getSupplireParty(TerceroProveedorType tercero) {
		SupplierPartyType sp = new SupplierPartyType();
		sp.setCustomerAssignedAccountID(
				(CustomerAssignedAccountIDType) eb.getidentificador(tercero.getIdCuentaCliente()));
		sp.setAdditionalAccountID((AdditionalAccountIDType) eb.getidentificador(tercero.getIdAdicionalCuenta()));
		sp.setDataSendingCapability((DataSendingCapabilityType) eb.getTexto(tercero.getCapacidadTransferenciaDatos()));
		sp.setParty(getParty(tercero.getTercero()));
		sp.setDespatchContact(eb.getContact(tercero.getContactoDespacho()));
		sp.setAccountingContact(eb.getContact(tercero.getContactoContabilidad()));
		sp.setSellerContact(eb.getContact(tercero.getContactoVendedor()));

		return sp;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType getSupplireParty2(
			TerceroProveedorType tercero) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType sp = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.SupplierPartyType();
		sp.setCustomerAssignedAccountID(
				(CustomerAssignedAccountIDType) eb.getidentificador(tercero.getIdCuentaCliente()));
		sp.getAdditionalAccountID().add((AdditionalAccountIDType) eb.getidentificador(tercero.getIdAdicionalCuenta()));
		sp.setDataSendingCapability((DataSendingCapabilityType) eb.getTexto(tercero.getCapacidadTransferenciaDatos()));
		sp.setParty(getParty2(tercero.getTercero()));
		sp.setDespatchContact(eb.getContact(tercero.getContactoDespacho()));
		sp.setAccountingContact(eb.getContact(tercero.getContactoContabilidad()));
		sp.setSellerContact(eb.getContact(tercero.getContactoVendedor()));
		return sp;
	}

	// LLCALDERON
	// <!-- cac:CustomerPartyType -->
	// <!-- Information about the Customer Party. -->
	public CustomerPartyType getCustomerParty(TerceroClienteType tercero) {
		CustomerPartyType cp = new CustomerPartyType();
		cp.setCustomerAssignedAccountID(
				(CustomerAssignedAccountIDType) eb.getidentificador(tercero.getIdCuentaCliente()));
		cp.setSupplierAssignedAccountID(
				(SupplierAssignedAccountIDType) eb.getidentificador(tercero.getIdCuentaProveedor()));
		cp.setAdditionalAccountID((AdditionalAccountIDType) eb.getidentificador(tercero.getIdAdicionalCuenta()));
		cp.setParty(getParty(tercero.getTercero()));
		cp.setDeliveryContact(eb.getContact(tercero.getContactoEntrega()));
		cp.setAccountingContact(eb.getContact(tercero.getContactoContabilidad()));
		cp.setBuyerContact(eb.getContact(tercero.getContactoComprador()));
		return cp;

	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType getCustomerParty2(
			TerceroClienteType tercero) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType cp = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.CustomerPartyType();
		cp.setCustomerAssignedAccountID(
				(CustomerAssignedAccountIDType) eb.getidentificador(tercero.getIdCuentaCliente()));
		cp.setSupplierAssignedAccountID(
				(SupplierAssignedAccountIDType) eb.getidentificador(tercero.getIdCuentaProveedor()));
		cp.getAdditionalAccountID().add((AdditionalAccountIDType) eb.getidentificador(tercero.getIdAdicionalCuenta()));
		cp.setParty(getParty2(tercero.getTercero()));
		cp.setDeliveryContact(eb.getContact(tercero.getContactoEntrega()));
		cp.setAccountingContact(eb.getContact(tercero.getContactoContabilidad()));
		cp.setBuyerContact(eb.getContact(tercero.getContactoComprador()));
		return cp;

	}

	// LLCALDERON
	// <!-- cac:PartyTaxSchemeType -->
	// <!-- Information about a party's Tax Scheme -->

	public PartyTaxSchemeType getPartyTaxSchemeType(EsquemaTributarioTerceroType s) {

		PartyTaxSchemeType pt = new PartyTaxSchemeType();

		pt.setRegistrationName((RegistrationNameType) eb.getNameType(s.getNombreRegistro()));
		pt.setCompanyID((CompanyIDType) eb.getidentificador(s.getIdImpuestosEmpresa()));
		pt.setTaxLevelCode((TaxLevelCodeType) eb.getCodigos(s.getCodigoClasifImpositiva()));
		pt.setExemptionReasonCode((ExemptionReasonCodeType) eb.getCodigos(s.getExencionCodigo()));
		pt.setExemptionReason((ExemptionReasonType) eb.getTexto(s.getExencionRazon()));

		pt.setRegistrationAddress(getAddress(s.getDireccionParaImpuestos()));
		pt.setTaxScheme(getPartyTaxSchema(s.getEsquemaTributario()));

		return pt;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType getPartyTaxSchemeType2(
			EsquemaTributarioTerceroType s) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType pt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyTaxSchemeType();

		pt.setRegistrationName((RegistrationNameType) eb.getNameType(s.getNombreRegistro()));
		pt.setCompanyID((CompanyIDType) eb.getidentificador(s.getIdImpuestosEmpresa()));
		pt.setTaxLevelCode((TaxLevelCodeType) eb.getCodigos(s.getCodigoClasifImpositiva()));
		pt.setExemptionReasonCode((ExemptionReasonCodeType) eb.getCodigos(s.getExencionCodigo()));
		pt.setExemptionReason((ExemptionReasonType) eb.getTexto(s.getExencionRazon()));

		pt.setRegistrationAddress(getAddress(s.getDireccionParaImpuestos()));
		pt.setTaxScheme(getPartyTaxSchema(s.getEsquemaTributario()));

		return pt;
	}

	// LLCALDERON
	private TaxSchemeType getPartyTaxSchema(EsquemaTributarioType e) {

		TaxSchemeType te = new TaxSchemeType();

		te.setID((IDType) eb.getidentificador(e.getId()));
		te.setName((oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType) eb
				.getNameType(e.getNombre()));
		te.setCurrencyCode((CurrencyCodeType) eb.getCodigos(e.getCodigoMoneda()));

		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType j : getAddress(
				e.getDireccionRegionJurisdiccion())) {

			te.getJurisdictionRegionAddress().add(j);
		}
		te.setTaxTypeCode((TaxTypeCodeType) eb.getCodigos(e.getCodigoTipo()));
		return te;
	}

	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType getAddress(
			DireccionType a) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType at = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType();

		at.setID((IDType) eb.getidentificador(a.getId()));
		at.setAddressTypeCode((AddressTypeCodeType) eb.getCodigos(a.getCodigoTipo()));
		at.setAddressFormatCode((AddressFormatCodeType) eb.getCodigos(a.getCodigoFormato()));
		at.setPostbox((PostboxType) eb.getTexto(a.getCodigoPostal()));
		at.setFloor((FloorType) eb.getTexto(a.getPiso()));
		at.setRoom((RoomType) eb.getTexto(a.getApartamento()));
		at.setStreetName((StreetNameType) eb.getNameType(a.getTextoDireccion()));
		at.setAdditionalStreetName((AdditionalStreetNameType) eb.getNameType(a.getTextoDireccionAdicional()));
		at.setBlockName((BlockNameType) eb.getNameType(a.getNombreCuadraManzana()));
		at.setBuildingName((BuildingNameType) eb.getNameType(a.getEdificioNombre()));
		at.setBuildingNumber((BuildingNumberType) eb.getTexto(a.getEdificioNumero()));
		at.setInhouseMail((InhouseMailType) eb.getTexto(a.getUbicacionInterna()));
		at.setDepartment((DepartmentType) eb.getTexto(a.getDepartamento()));
		at.setMarkAttention((MarkAttentionType) eb.getTexto(a.getPersonaOrgDptMarcadoATT()));
		at.setMarkCare((MarkCareType) eb.getTexto(a.getPersonaOrgDptMarcadoCareOf()));

		at.setPlotIdentification((PlotIdentificationType) eb.getTexto(a.getNumeroParcelaLote()));
		at.setCitySubdivisionName((CitySubdivisionNameType) eb.getNameType(a.getNombreSubdivisionCiudad()));
		at.setCityName((CityNameType) eb.getNameType(a.getCiudad()));

		at.setPostalZone((PostalZoneType) eb.getTexto(a.getZonaPostal()));
		at.setCountrySubentity((CountrySubentityType) eb.getTexto(a.getSubdivisionPais()));
		at.setCountrySubentityCode((CountrySubentityCodeType) eb.getCodigos(a.getSubdivisionPaisCodigo()));
		at.setRegion((RegionType) eb.getTexto(a.getRegion()));
		at.setDistrict((DistrictType) eb.getTexto(a.getDistrito()));
		at.setTimezoneOffset((TimezoneOffsetType) eb.getTexto(a.getDiferenciaHorariaUTC()));

		List<AddressLineType> adress = new ArrayList<AddressLineType>();
		adress = eb.getLineType(a.getLineasDireccion());

		for (AddressLineType ad : adress) {
			at.getAddressLine().add(ad);
		}

		at.setCountry(eb.getCountryType(a.getCountry()));

		at.setLocationCoordinate(eb.getLocationCoordinate(a.getCoordenadasUbicacion()));
		// TODO Auto-generated method stub
		return at;
	}

	// LLCALDERON
	public PartyLegalEntityType getPartyLegalEntity(EntidadLegalTerceroType p) {
		PartyLegalEntityType ple = new PartyLegalEntityType();
		ple.setCompanyID((CompanyIDType) eb.getidentificador(p.getIdEmpresa()));
		ple.setCorporateRegistrationScheme(getCorporateRegistration(p.getEsquemaRegistroCorporativo()));
		ple.setRegistrationAddress(getAddress(p.getDireccionRegistrada()));
		ple.setRegistrationName((RegistrationNameType) eb.getNameType(p.getNombreRegistrado()));

		return ple;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType getPartyLegalEntity2(
			EntidadLegalTerceroType p) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType ple = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyLegalEntityType();
		ple.setCompanyID((CompanyIDType) eb.getidentificador(p.getIdEmpresa()));
		ple.setCorporateRegistrationScheme(getCorporateRegistration(p.getEsquemaRegistroCorporativo()));
		ple.setRegistrationAddress(getAddress(p.getDireccionRegistrada()));
		ple.setRegistrationName((RegistrationNameType) eb.getNameType(p.getNombreRegistrado()));

		return ple;
	}

	// LLCADERON
	// <!-- cac:CorporateRegistrationSchemeType -->
	// <!-- Information directly relating a scheme for corporate registration of
	// businesses. -->
	private CorporateRegistrationSchemeType getCorporateRegistration(EsquemaRegistroCorporativoType i) {
		CorporateRegistrationSchemeType cr = new CorporateRegistrationSchemeType();
		cr.setID((IDType) eb.getidentificador(i.getId()));
		cr.setName((oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.NameType) eb
				.getNameType(i.getNombre()));
		for (DireccionType d : i.getDireccionRegionJurisdiccion()) {
			cr.getJurisdictionRegionAddress().add(getAddress(d));
		}

		cr.setCorporateRegistrationTypeCode(
				(CorporateRegistrationTypeCodeType) eb.getCodigos(i.getTipoRegistroCorporativo()));
		return cr;
	}

	// LLCALDERON Ubiccion
	public List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType> getAddress(
			List<DireccionType> list) {
		List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType> lista = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType>();

		for (DireccionType a : list) {
			oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType at = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType();

			at.setID((IDType) eb.getidentificador(a.getId()));
			at.setAddressTypeCode((AddressTypeCodeType) eb.getCodigos(a.getCodigoTipo()));
			at.setAddressFormatCode((AddressFormatCodeType) eb.getCodigos(a.getCodigoFormato()));
			at.setPostbox((PostboxType) eb.getTexto(a.getCodigoPostal()));
			at.setFloor((FloorType) eb.getTexto(a.getPiso()));
			at.setRoom((RoomType) eb.getTexto(a.getApartamento()));
			at.setStreetName((StreetNameType) eb.getNameType(a.getTextoDireccion()));
			at.setAdditionalStreetName((AdditionalStreetNameType) eb.getNameType(a.getTextoDireccionAdicional()));
			at.setBlockName((BlockNameType) eb.getNameType(a.getNombreCuadraManzana()));
			at.setBuildingName((BuildingNameType) eb.getNameType(a.getEdificioNombre()));
			at.setBuildingNumber((BuildingNumberType) eb.getTexto(a.getEdificioNumero()));
			at.setInhouseMail((InhouseMailType) eb.getTexto(a.getUbicacionInterna()));
			at.setDepartment((DepartmentType) eb.getTexto(a.getDepartamento()));
			at.setMarkAttention((MarkAttentionType) eb.getTexto(a.getPersonaOrgDptMarcadoATT()));
			at.setMarkCare((MarkCareType) eb.getTexto(a.getPersonaOrgDptMarcadoCareOf()));

			at.setPlotIdentification((PlotIdentificationType) eb.getTexto(a.getNumeroParcelaLote()));
			at.setCitySubdivisionName((CitySubdivisionNameType) eb.getNameType(a.getNombreSubdivisionCiudad()));
			at.setCityName((CityNameType) eb.getNameType(a.getCiudad()));

			at.setPostalZone((PostalZoneType) eb.getTexto(a.getZonaPostal()));
			at.setCountrySubentity((CountrySubentityType) eb.getTexto(a.getSubdivisionPais()));
			at.setCountrySubentityCode((CountrySubentityCodeType) eb.getCodigos(a.getSubdivisionPaisCodigo()));
			at.setRegion((RegionType) eb.getTexto(a.getRegion()));
			at.setDistrict((DistrictType) eb.getTexto(a.getDistrito()));
			at.setTimezoneOffset((TimezoneOffsetType) eb.getTexto(a.getDiferenciaHorariaUTC()));

			List<AddressLineType> adress = new ArrayList<AddressLineType>();
			adress = eb.getLineType(a.getLineasDireccion());

			for (AddressLineType ad : adress) {
				at.getAddressLine().add(ad);
			}

			at.setCountry(eb.getCountryType(a.getCountry()));

			at.setLocationCoordinate(eb.getLocationCoordinate(a.getCoordenadasUbicacion()));

		}

		return lista;

	}

	public AddressType getAddressType(DireccionType a) {

		AddressType at = new AddressType();

		at.setID((IDType) eb.getidentificador(a.getId()));
		at.setAddressTypeCode((AddressTypeCodeType) eb.getCodigos(a.getCodigoTipo()));
		at.setAddressFormatCode((AddressFormatCodeType) eb.getCodigos(a.getCodigoFormato()));
		at.setPostbox((PostboxType) eb.getTexto(a.getCodigoPostal()));
		at.setFloor((FloorType) eb.getTexto(a.getPiso()));
		at.setRoom((RoomType) eb.getTexto(a.getApartamento()));
		at.setStreetName((StreetNameType) eb.getNameType(a.getTextoDireccion()));
		at.setAdditionalStreetName((AdditionalStreetNameType) eb.getNameType(a.getTextoDireccionAdicional()));
		at.setBlockName((BlockNameType) eb.getNameType(a.getNombreCuadraManzana()));
		at.setBuildingName((BuildingNameType) eb.getNameType(a.getEdificioNombre()));
		at.setBuildingNumber((BuildingNumberType) eb.getTexto(a.getEdificioNumero()));
		at.setInhouseMail((InhouseMailType) eb.getTexto(a.getUbicacionInterna()));
		at.setDepartment((DepartmentType) eb.getTexto(a.getDepartamento()));
		at.setMarkAttention((MarkAttentionType) eb.getTexto(a.getPersonaOrgDptMarcadoATT()));
		at.setMarkCare((MarkCareType) eb.getTexto(a.getPersonaOrgDptMarcadoCareOf()));

		at.setPlotIdentification((PlotIdentificationType) eb.getTexto(a.getNumeroParcelaLote()));
		at.setCitySubdivisionName((CitySubdivisionNameType) eb.getNameType(a.getNombreSubdivisionCiudad()));
		at.setCityName((CityNameType) eb.getNameType(a.getCiudad()));

		at.setPostalZone((PostalZoneType) eb.getTexto(a.getZonaPostal()));
		at.setCountrySubentity((CountrySubentityType) eb.getTexto(a.getSubdivisionPais()));
		at.setCountrySubentityCode((CountrySubentityCodeType) eb.getCodigos(a.getSubdivisionPaisCodigo()));
		at.setRegion((RegionType) eb.getTexto(a.getRegion()));
		at.setDistrict((DistrictType) eb.getTexto(a.getDistrito()));
		at.setTimezoneOffset((TimezoneOffsetType) eb.getTexto(a.getDiferenciaHorariaUTC()));

		List<AddressLineType> adress = new ArrayList<AddressLineType>();
		adress = eb.getLineType(a.getLineasDireccion());

		for (AddressLineType ad : adress) {
			at.getAddressLine().add(ad);
		}

		at.setCountry(eb.getCountryType(a.getCountry()));

		at.setLocationCoordinate(eb.getLocationCoordinate(a.getCoordenadasUbicacion()));

		return at;

	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType getAddressType2(
			DireccionType a) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType at = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType();

		at.setID((IDType) eb.getidentificador(a.getId()));
		at.setAddressTypeCode((AddressTypeCodeType) eb.getCodigos(a.getCodigoTipo()));
		at.setAddressFormatCode((AddressFormatCodeType) eb.getCodigos(a.getCodigoFormato()));
		at.setPostbox((PostboxType) eb.getTexto(a.getCodigoPostal()));
		at.setFloor((FloorType) eb.getTexto(a.getPiso()));
		at.setRoom((RoomType) eb.getTexto(a.getApartamento()));
		at.setStreetName((StreetNameType) eb.getNameType(a.getTextoDireccion()));
		at.setAdditionalStreetName((AdditionalStreetNameType) eb.getNameType(a.getTextoDireccionAdicional()));
		at.setBlockName((BlockNameType) eb.getNameType(a.getNombreCuadraManzana()));
		at.setBuildingName((BuildingNameType) eb.getNameType(a.getEdificioNombre()));
		at.setBuildingNumber((BuildingNumberType) eb.getTexto(a.getEdificioNumero()));
		at.setInhouseMail((InhouseMailType) eb.getTexto(a.getUbicacionInterna()));
		at.setDepartment((DepartmentType) eb.getTexto(a.getDepartamento()));
		at.setMarkAttention((MarkAttentionType) eb.getTexto(a.getPersonaOrgDptMarcadoATT()));
		at.setMarkCare((MarkCareType) eb.getTexto(a.getPersonaOrgDptMarcadoCareOf()));

		at.setPlotIdentification((PlotIdentificationType) eb.getTexto(a.getNumeroParcelaLote()));
		at.setCitySubdivisionName((CitySubdivisionNameType) eb.getNameType(a.getNombreSubdivisionCiudad()));
		at.setCityName((CityNameType) eb.getNameType(a.getCiudad()));

		at.setPostalZone((PostalZoneType) eb.getTexto(a.getZonaPostal()));
		at.setCountrySubentity((CountrySubentityType) eb.getTexto(a.getSubdivisionPais()));
		at.setCountrySubentityCode((CountrySubentityCodeType) eb.getCodigos(a.getSubdivisionPaisCodigo()));
		at.setRegion((RegionType) eb.getTexto(a.getRegion()));
		at.setDistrict((DistrictType) eb.getTexto(a.getDistrito()));
		at.setTimezoneOffset((TimezoneOffsetType) eb.getTexto(a.getDiferenciaHorariaUTC()));

		List<AddressLineType> adress = new ArrayList<AddressLineType>();
		adress = eb.getLineType(a.getLineasDireccion());

		for (AddressLineType ad : adress) {
			at.getAddressLine().add(ad);
		}

		at.setCountry(eb.getCountryType(a.getCountry()));

		at.setLocationCoordinate(eb.getLocationCoordinate(a.getCoordenadasUbicacion()));

		return at;

	}

	// LLCALDERON
	// tns, cac:AllowanceCharge
	// Cargo o Descuento sirve para las dos estructuras
	// oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType getallowanceCharget2(
			CargoDescuentoType t) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType ac = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType();

		ac.setID((IDType) eb.getidentificador(t.getId()));
		ChargeIndicatorType cit = new ChargeIndicatorType();
		cit.setValue(t.isIndicaCargoODescuento());
		ac.setChargeIndicator(cit);
		ac.setAllowanceChargeReasonCode((AllowanceChargeReasonCodeType) eb.getCodigos(t.getCodRazonCargoDescuento()));
		ac.setAllowanceChargeReason((AllowanceChargeReasonType) eb.getTexto(t.getRazonCargoDescuento()));
		MultiplierFactorNumericType mfn = new MultiplierFactorNumericType();
		mfn.setValue(t.getFactorMultiplicador());
		ac.setMultiplierFactorNumeric(mfn);
		PrepaidIndicatorType pit = new PrepaidIndicatorType();
		pit.setValue(t.isIndicaPagoAdelantado());
		ac.setPrepaidIndicator(pit);
		SequenceNumericType snt = new SequenceNumericType();
		snt.setValue(t.getSecuenciaNumerica());
		ac.setSequenceNumeric(snt);
		ac.setAmount((AmountType) eb.getAmountType(t.getMonto()));
		ac.setBaseAmount((BaseAmountType) eb.getAmountType(t.getBase()));
		ac.setAccountingCostCode((AccountingCostCodeType) eb.getCodigos(t.getCentroDeCostoCodigo()));
		ac.setAccountingCost((AccountingCostType) eb.getTexto(t.getCentroDeCostoNombre()));
		for (TaxCategoryType tc : eb.getTaxCategoryType(t.getCategoriaImpuesto())) {
			ac.getTaxCategory().add(tc);
		}
		ac.setTaxTotal(eb.getTaxTotal(t.getTotalImpuesto()));
		for (PaymentMeansType m : getPaymentMeanst(t.getMediosDePago())) {
			ac.getPaymentMeans().add(m);

		}
		return ac;
	}

	public List<AllowanceChargeType> getallowanceCharget(List<CargoDescuentoType> list) {
		List<AllowanceChargeType> lista = new ArrayList<AllowanceChargeType>();
		for (CargoDescuentoType t : list) {
			AllowanceChargeType ac = new AllowanceChargeType();
			ac.setID((IDType) eb.getidentificador(t.getId()));
			ChargeIndicatorType cit = new ChargeIndicatorType();
			cit.setValue(t.isIndicaCargoODescuento());
			ac.setChargeIndicator(cit);
			ac.setAllowanceChargeReasonCode(
					(AllowanceChargeReasonCodeType) eb.getCodigos(t.getCodRazonCargoDescuento()));
			ac.setAllowanceChargeReason((AllowanceChargeReasonType) eb.getTexto(t.getRazonCargoDescuento()));
			MultiplierFactorNumericType mfn = new MultiplierFactorNumericType();
			mfn.setValue(t.getFactorMultiplicador());
			ac.setMultiplierFactorNumeric(mfn);
			PrepaidIndicatorType pit = new PrepaidIndicatorType();
			pit.setValue(t.isIndicaPagoAdelantado());
			ac.setPrepaidIndicator(pit);
			SequenceNumericType snt = new SequenceNumericType();
			snt.setValue(t.getSecuenciaNumerica());
			ac.setSequenceNumeric(snt);
			ac.setAmount((AmountType) eb.getAmountType(t.getMonto()));
			ac.setBaseAmount((BaseAmountType) eb.getAmountType(t.getBase()));
			ac.setAccountingCostCode((AccountingCostCodeType) eb.getCodigos(t.getCentroDeCostoCodigo()));
			ac.setAccountingCost((AccountingCostType) eb.getTexto(t.getCentroDeCostoNombre()));
			for (TaxCategoryType tc : eb.getTaxCategoryType(t.getCategoriaImpuesto())) {
				ac.getTaxCategory().add(tc);
			}
			ac.setTaxTotal(eb.getTaxTotal(t.getTotalImpuesto()));
			for (PaymentMeansType m : getPaymentMeanst(t.getMediosDePago())) {
				ac.getPaymentMeans().add(m);
			}
			lista.add(ac);
		}
		return lista;
	}

	// LLCALDERON
	public DeliveryTermsType getDeliveryTerms(CondicionesDeEntregaType condiciones) {

		DeliveryTermsType dt = new DeliveryTermsType();
		dt.setID((IDType) eb.getidentificador(condiciones.getId()));
		dt.setSpecialTerms((SpecialTermsType) eb.getTexto(condiciones.getCondicionesEspeciales()));
		dt.setLossRiskResponsibilityCode(
				(LossRiskResponsibilityCodeType) eb.getCodigos(condiciones.getCodResponsabPerdida()));
		dt.setLossRisk((LossRiskType) eb.getTexto(condiciones.getRiesgoDePerdida()));
		dt.setDeliveryLocation(getLocation2(condiciones.getUbicacionEntrega()));
		dt.setAllowanceCharge(eb.getAllowanceCharge2(condiciones.getCargoDescuentoType()));
		return dt;

	}

	// LLCALDERON Condiciones de entrega
	public DeliveryType getDeliveryType(EntregaType entrega) {

		DeliveryType dt = new DeliveryType();

		dt.setID((IDType) eb.getidentificador(entrega.getId()));
		dt.setQuantity(eb.getQuantity(entrega.getCantidad()));
		dt.setMinimumQuantity((MinimumQuantityType) eb.getQuantityType(entrega.getCantidadMinima()));
		dt.setMaximumQuantity((MaximumQuantityType) eb.getQuantityType(entrega.getCantidadMaxima()));
		// String
		String fecha = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(entrega.getFechaEntregaEfectiva());
		ActualDeliveryDateType add = new ActualDeliveryDateType();
		add.setValue(fecha);
		dt.setActualDeliveryDate(add);

		String fecha2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(entrega.getFechaEntregaLimite());
		LatestDeliveryDateType ldd = new LatestDeliveryDateType();
		ldd.setValue(fecha2);
		dt.setLatestDeliveryDate(ldd);

		dt.setTrackingID((TrackingIDType) eb.getidentificador(entrega.getCodigoDeRastreo()));
		dt.setDeliveryAddress(getAddressType(entrega.getDireccionDeEntrega()));
		dt.setDeliveryLocation(getLocation(entrega.getUbicacionEntrega()));
		dt.setRequestedDeliveryPeriod(eb.getPeriodo(entrega.getPeriodoEntregaSolicitado()));
		dt.setPromisedDeliveryPeriod(eb.getPeriodo(entrega.getPeriodoEntregaPrometido()));
		dt.setEstimatedDeliveryPeriod(eb.getPeriodo(entrega.getPeriodoEntregaEstimado()));
		dt.setDeliveryParty(getParty(entrega.getTerceroParaEnvio()));
		dt.setDespatch(getDespatchType(entrega.getDespacho()));

		return dt;

	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType getDeliveryType2(
			EntregaType entrega) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType dt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DeliveryType();

		dt.setID((IDType) eb.getidentificador(entrega.getId()));
		dt.setQuantity(eb.getQuantity(entrega.getCantidad()));
		dt.setMinimumQuantity((MinimumQuantityType) eb.getQuantityType(entrega.getCantidadMinima()));
		dt.setMaximumQuantity((MaximumQuantityType) eb.getQuantityType(entrega.getCantidadMaxima()));
		// String
		String fecha = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(entrega.getFechaEntregaEfectiva());
		ActualDeliveryDateType add = new ActualDeliveryDateType();
		add.setValue(fecha);
		dt.setActualDeliveryDate(add);

		String fecha2 = new SimpleDateFormat("yyyy-MM-dd HH:MM:ss").format(entrega.getFechaEntregaLimite());
		LatestDeliveryDateType ldd = new LatestDeliveryDateType();
		ldd.setValue(fecha2);
		dt.setLatestDeliveryDate(ldd);

		dt.setTrackingID((TrackingIDType) eb.getidentificador(entrega.getCodigoDeRastreo()));
		dt.setDeliveryAddress(getAddress(entrega.getDireccionDeEntrega()));
		dt.setDeliveryLocation(getLocation2(entrega.getUbicacionEntrega()));
		dt.setRequestedDeliveryPeriod(eb.getPeriodo(entrega.getPeriodoEntregaSolicitado()));
		dt.setPromisedDeliveryPeriod(eb.getPeriodo(entrega.getPeriodoEntregaPrometido()));
		dt.setEstimatedDeliveryPeriod(eb.getPeriodo(entrega.getPeriodoEntregaEstimado()));
		dt.setDeliveryParty(getParty2(entrega.getTerceroParaEnvio()));
		dt.setDespatch(getDespatchType2(entrega.getDespacho()));

		return dt;

	}

	// LLCALDERON
	public DespatchType getDespatchType(DespachoType despacho) {

		DespatchType dt = new DespatchType();
		dt.setID((IDType) eb.getidentificador(despacho.getIdDespacho()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(despacho.getFechaDespachoSolicitada());
		RequestedDespatchDateType rdd = new RequestedDespatchDateType();
		rdd.setValue(fecha);
		dt.setRequestedDespatchDate(rdd);
		String hora = new SimpleDateFormat("HH:MM:ss").format(despacho.getHoraDespachoSolicitada());
		RequestedDespatchTimeType rdt = new RequestedDespatchTimeType();
		rdt.setValue(hora);
		dt.setRequestedDespatchTime(rdt);
		String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(despacho.getFechaDespachoEstimada());
		EstimatedDespatchDateType edd = new EstimatedDespatchDateType();
		edd.setValue(fecha2);
		dt.setEstimatedDespatchDate(edd);
		String hora2 = new SimpleDateFormat("HH:MM:ss").format(despacho.getHoraDespachoEstimada());
		EstimatedDespatchTimeType edts = new EstimatedDespatchTimeType();
		edts.setValue(hora2);
		dt.setEstimatedDespatchTime(edts);
		String fecha3 = new SimpleDateFormat("yyyy-MM-dd").format(despacho.getFechaDespachoEfectiva());
		ActualDespatchDateType add = new ActualDespatchDateType();
		add.setValue(fecha3);
		dt.setActualDespatchDate(add);
		String hora3 = new SimpleDateFormat("HH:MM:ss").format(despacho.getHoraDespachoEfectiva());
		ActualDespatchTimeType adt = new ActualDespatchTimeType();
		adt.setValue(hora3);
		dt.setActualDespatchTime(adt);
		dt.setDespatchAddress(getAddressType(despacho.getDireccionDespacho()));
		dt.setDespatchParty(getParty(despacho.getTerceroDespacho()));
		dt.setContact(eb.getContact(despacho.getContacto()));
		return dt;
	}

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DespatchType getDespatchType2(
			DespachoType despacho) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DespatchType dt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.DespatchType();
		dt.setID((IDType) eb.getidentificador(despacho.getIdDespacho()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(despacho.getFechaDespachoSolicitada());
		RequestedDespatchDateType rdd = new RequestedDespatchDateType();
		rdd.setValue(fecha);
		dt.setRequestedDespatchDate(rdd);
		String hora = new SimpleDateFormat("HH:MM:ss").format(despacho.getHoraDespachoSolicitada());
		RequestedDespatchTimeType rdt = new RequestedDespatchTimeType();
		rdt.setValue(hora);
		dt.setRequestedDespatchTime(rdt);
		String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(despacho.getFechaDespachoEstimada());
		EstimatedDespatchDateType edd = new EstimatedDespatchDateType();
		edd.setValue(fecha2);
		dt.setEstimatedDespatchDate(edd);
		String hora2 = new SimpleDateFormat("HH:MM:ss").format(despacho.getHoraDespachoEstimada());
		EstimatedDespatchTimeType edts = new EstimatedDespatchTimeType();
		edts.setValue(hora2);
		dt.setEstimatedDespatchTime(edts);
		String fecha3 = new SimpleDateFormat("yyyy-MM-dd").format(despacho.getFechaDespachoEfectiva());
		ActualDespatchDateType add = new ActualDespatchDateType();
		add.setValue(fecha3);
		dt.setActualDespatchDate(add);
		String hora3 = new SimpleDateFormat("HH:MM:ss").format(despacho.getHoraDespachoEfectiva());
		ActualDespatchTimeType adt = new ActualDespatchTimeType();
		adt.setValue(hora3);
		dt.setActualDespatchTime(adt);
		dt.setDespatchAddress(getAddressType2(despacho.getDireccionDespacho()));
		dt.setDespatchParty(getParty2(despacho.getTerceroDespacho()));
		dt.setContact(eb.getContact(despacho.getContacto()));
		return dt;
	}

	/****************************
	 * REFERENCIAS
	 * 
	 * @param list
	 **************************************/

	public List<OrderReferenceType> getOrderReference(List<ReferenciaDocOrdenType> list) {

		List<OrderReferenceType> ReferenciaDocOrden = new ArrayList<OrderReferenceType>();

		for (ReferenciaDocOrdenType l : list) {
			OrderReferenceType or = new OrderReferenceType();
			// IDentificador
			or.setID((IDType) eb.getidentificador(l.getId()));
			// Identificador de pedido
			or.setSalesOrderID((SalesOrderIDType) eb.getidentificador(l.getIdPedido()));

			// es un Boolean true o false
			// IndicadorCopia
			CopyIndicatorType ci = new CopyIndicatorType();
			ci.setValue(l.isIndicadorCopia());
			or.setCopyIndicator(ci);

			// identificador unico
			or.setUUID(eb.getUUIDType(l.getUID()));

			// fecha de tranassaccion
			String fecha = new SimpleDateFormat("yyyy-MM-dd").format(l.getFechaHoraOrden());
			IssueDateType id = new IssueDateType();
			id.setValue(fecha);
			or.setIssueDate(id);

			// Hora de transaccion

			String horaString = new SimpleDateFormat("HH:MM:ss").format(l.getFechaHoraOrden());
			IssueTimeType it = new IssueTimeType();
			it.setValue(horaString);
			or.setIssueTime(it);

			// ReferenciaCliente
			CustomerReferenceType cr = new CustomerReferenceType();
			cr = (CustomerReferenceType) eb.getTexto(l.getReferenciaCliente());
			or.setCustomerReference(cr);

			// ReferenciaADocumento

			or.setDocumentReference(getDocumentoDeReferencia(l.getReferenciaADocumento()));

			ReferenciaDocOrden.add(or);
		}

		return ReferenciaDocOrden;
	}

	// ReferenciaDocOrden
	public List<BillingReferenceType> getBillingReference(List<ReferenciaDocFacturaType> list) {

		List<BillingReferenceType> br = new ArrayList<BillingReferenceType>();
		for (ReferenciaDocFacturaType ref : list) {

			BillingReferenceType brt = new BillingReferenceType();

			brt.setAdditionalDocumentReference(getDocumentoDeReferencia(ref.getReferenciaDocAdicional()));
			brt.setCreditNoteDocumentReference(getDocumentoDeReferencia(ref.getReferenciaDocNotaCredito()));
			brt.setDebitNoteDocumentReference(getDocumentoDeReferencia(ref.getReferenciaDocNotaDedito()));
			brt.setInvoiceDocumentReference(getDocumentoDeReferencia(ref.getReferenciaDocFactura()));
			brt.setReminderDocumentReference(getDocumentoDeReferencia(ref.getReferenciaDocRecordatorio()));
			brt.setSelfBilledCreditNoteDocumentReference(
					getDocumentoDeReferencia(ref.getReferenciaDocAutoNotaCredito()));
			brt.setSelfBilledInvoiceDocumentReference(getDocumentoDeReferencia(ref.getReferenciaDocAutoFactura()));
			// No esta el get

			List<BillingReferenceLineType> bref = new ArrayList<BillingReferenceLineType>();

			bref = getBillingReferenceLine(ref.getReferenciaLineaFactura());

			for (BillingReferenceLineType b : bref) {

				brt.getBillingReferenceLine().add(b);
			}

		}

		return br;

	}

	public List<BillingReferenceLineType> getBillingReferenceLine(List<ReferenciaLineaDocFactura> list) {

		List<BillingReferenceLineType> br = new ArrayList<BillingReferenceLineType>();

		for (ReferenciaLineaDocFactura t : list) {
			BillingReferenceLineType b = new BillingReferenceLineType();

			b.setAmount(eb.getAmountType2(t.getValor()));
			b.setID((IDType) eb.getidentificador(t.getId()));

			List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType> al = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType>();

			al = eb.getAllowanceCharge(t.getCargoDescuento());

			for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType ac : al) {

				b.getAllowanceCharge().add(ac);
			}

			br.add(b);

		}

		return br;

	}

	// Referencias generales LLCALDERON

	public DocumentReferenceType getDocumentoDeReferencia(ReferenciaADocumentoType refDoc) {
		DocumentReferenceType dr = new DocumentReferenceType();
		// es un objeto compuesto por definir.

		// Documento Adjunto. Aun por definir
		dr.setAttachment(eb.getAttachmentType(refDoc.getAdjunto()));
		// es un bolean true o false
		CopyIndicatorType ci = new CopyIndicatorType();
		ci.setValue(refDoc.isEsCopia());
		dr.setCopyIndicator(ci);
		DocumentTypeType doc = new DocumentTypeType();
		doc = (DocumentTypeType) eb.getTexto(refDoc.getNombreTipoDoc());
		dr.setDocumentType(doc);
		DocumentTypeCodeType dt = new DocumentTypeCodeType();
		dt = (DocumentTypeCodeType) eb.getCodigos(refDoc.getCodigoTipoDoc());
		dr.setDocumentTypeCode(dt);
		dr.setID((IDType) eb.getidentificador(refDoc.getId()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(refDoc.getFecha());
		IssueDateType id = new IssueDateType();
		id.setValue(fecha);
		dr.setIssueDate(id);
		dr.setUUID(eb.getUUIDType(refDoc.getUID()));
		XPathType xp = new XPathType();
		xp = (XPathType) eb.getTexto(refDoc.getXPath());
		dr.getXPath().add(xp);

		return dr;
	}

	// Referencia a despacho LLCALDERON
	public List<DocumentReferenceType> getDespacho(List<ReferenciaADocumentoType> referencia) {

		List<DocumentReferenceType> lista = new ArrayList<DocumentReferenceType>();
		for (ReferenciaADocumentoType ref : referencia) {
			DocumentReferenceType l = new DocumentReferenceType();
			l = getDocumentoDeReferencia(ref);
			lista.add(l);
		}
		return lista;
	}

	// ReferenciaDocRecibo LLCALDERON
	public List<DocumentReferenceType> getReferenciaDocRecibo(List<ReferenciaADocumentoType> referencia) {
		List<DocumentReferenceType> lista = new ArrayList<DocumentReferenceType>();
		for (ReferenciaADocumentoType ref : referencia) {
			DocumentReferenceType l = new DocumentReferenceType();
			l = getDocumentoDeReferencia(ref);
			lista.add(l);
		}
		return lista;
	}

	// ReferenciaDocOriginador
	public List<DocumentReferenceType> getReferenciaDocOriginador(List<ReferenciaADocumentoType> referencia) {
		List<DocumentReferenceType> lista = new ArrayList<DocumentReferenceType>();
		for (ReferenciaADocumentoType ref : referencia) {
			DocumentReferenceType l = new DocumentReferenceType();
			l = getDocumentoDeReferencia(ref);
			lista.add(l);
		}
		return lista;
	}

	// ReferenciaDocContrato LLCALDERON
	public List<DocumentReferenceType> getReferenciaDocContrato(List<ReferenciaADocumentoType> referencia) {
		List<DocumentReferenceType> lista = new ArrayList<DocumentReferenceType>();
		for (ReferenciaADocumentoType ref : referencia) {
			DocumentReferenceType l = new DocumentReferenceType();
			l = getDocumentoDeReferencia(ref);
			lista.add(l);
		}
		return lista;
	}

	// ReferenciaDocAdicional LLCALDERON
	public List<DocumentReferenceType> getReferenciaDocAdicional(List<ReferenciaADocumentoType> referencia) {
		List<DocumentReferenceType> lista = new ArrayList<DocumentReferenceType>();
		for (ReferenciaADocumentoType ref : referencia) {
			DocumentReferenceType l = new DocumentReferenceType();
			l = getDocumentoDeReferencia(ref);
			lista.add(l);
		}
		return lista;
	}

	// LLCALDERON
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType getsetPayeeParty(
			TerceroType terceroBeneficiarioPago) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType pp = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PartyType();

		pp = getParty2(terceroBeneficiarioPago);
		return null;
	}

	// PAGO LLCALDERON
	public List<PaymentType> getPayment(List<PagoType> pago) {

		List<PaymentType> lista = new ArrayList<PaymentType>();

		for (PagoType p : pago) {
			PaymentType pt = new PaymentType();
			pt.setID((IDType) eb.getidentificador(p.getId()));
			pt.setPaidAmount((PaidAmountType) eb.getAmountType(p.getValor()));
			String fecha = new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaRecibido());
			ReceivedDateType rdt = new ReceivedDateType();
			rdt.setValue(fecha);
			pt.setReceivedDate(rdt);
			String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(p.getFechaDePago());
			PaidDateType pdt = new PaidDateType();
			pdt.setValue(fecha2);
			pt.setPaidDate(pdt);
			String hora = new SimpleDateFormat("HH:MM:ss").format(p.getHoraDePago());
			PaidTimeType ptt = new PaidTimeType();
			ptt.setValue(hora);
			pt.setPaidTime(ptt);
			pt.setInstructionID((InstructionIDType) eb.getidentificador(p.getId()));
			lista.add(pt);
		}

		return lista;
	}

	// notas y textos

	// LLCALDERON
	public ContactType getContact(ContactoType contactoType) {
		ContactType ct = new ContactType();
		ct.setID((IDType) getidentificador(contactoType.getId()));
		ct.setName(getName(contactoType.getNombre()));
		ct.setTelephone((TelephoneType) getTexto(contactoType.getTelefono()));
		ct.setElectronicMail((ElectronicMailType) getTexto(contactoType.getEmail()));
		ct.setNote((NoteType) getTexto(contactoType.getNota()));
		ct.getOtherCommunication().add(getCommunicationType(contactoType.getOtroMedioContacto()));
		return ct;
	}

	// LLCALDERON
	public CommunicationType getCommunicationType(MedioComunicacionType mc) {
		CommunicationType ct = new CommunicationType();
		ct.setChannel((ChannelType) getTexto(mc.getCanal()));
		ct.setChannelCode((ChannelCodeType) getCodigos(mc.getCodigoCanal()));
		ct.setValue((ValueType) getTexto(mc.getValor()));
		return ct;
	}

	public CodeType getCodigos(CodigoType cod) {
		CodeType c = new CodeType();
		c.setListID(cod.getListaId());
		c.setListAgencyID(cod.getListaOrgEmisorId());
		c.setListAgencyName(cod.getListaOrgEmisorNombre());
		c.setListName(cod.getListaNombre());
		c.setListVersionID(cod.getListaVersion());
		// c.setName(cod.getListaNombre());
		c.setLanguageID(cod.getCodigoLenguaje());
		c.setListURI(cod.getListaURI());
		c.setListSchemeURI(cod.getListaURIEsquema());
		c.setValue(cod.getValue());
		// c.setValue();
		return c;

	}

	// retorna un tipo TextType LLCALDERON
	public TextType getTexto(TextoType txt) {
		TextType t = new TextType();
		t.setLanguageID(txt.getIdLenguaje());
		t.setValue(txt.getValue());
		return t;
	}

	// retorna una lista del tipo TextType LLCALDERON
	public List<InstructionNoteType> getTextoLista(List<TextoType> listado) {
		List<InstructionNoteType> l = new ArrayList<InstructionNoteType>();
		for (TextoType txt : listado) {
			InstructionNoteType t = new InstructionNoteType();
			t.setLanguageID(txt.getIdLenguaje());
			t.setValue(txt.getValue());
			l.add(t);
		}
		return l;
	}

	// retorna una lista con el tipo TextType LLCALDERON
	public List<AddressLineType> getLineType(List<LineaDireccionType> list) {

		List<AddressLineType> lista = new ArrayList<AddressLineType>();
		for (LineaDireccionType dir : list) {
			AddressLineType t = new AddressLineType();
			LineType l = new LineType();
			l.setLanguageID(dir.getTextoLinea().getIdLenguaje());
			l.setValue(dir.getTextoLinea().getValue());
			t.setLine(l);
			lista.add(t);
		}

		return lista;

	}

	// Identificador LLCALDERON

	public un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.IdentifierType getidentificador2(
			IdentificadorType identificadorType) {

		un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.IdentifierType it = new un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.IdentifierType();
		it.setSchemeAgencyID(identificadorType.getSmaIdOrgEmisorID());
		it.setSchemeAgencyName(identificadorType.getSmaIdOrgEmisorNombre());
		it.setSchemeDataURI(identificadorType.getSmaIdURIDatos());
		it.setSchemeID(identificadorType.getSmaIdCodigo());
		it.setSchemeName(identificadorType.getSmaIdNombre());
		it.setSchemeURI(identificadorType.getSmaIdURI());
		it.setSchemeVersionID(identificadorType.getSmaIdVersion());
		it.setValue(identificadorType.getValue());
		return it;

	}

	public IdentifierType getidentificador(IdentificadorType identificadorType) {

		IdentifierType it = new IdentifierType();
		it.setSchemeAgencyID(identificadorType.getSmaIdOrgEmisorID());
		it.setSchemeAgencyName(identificadorType.getSmaIdOrgEmisorNombre());
		it.setSchemeDataURI(identificadorType.getSmaIdURIDatos());
		it.setSchemeID(identificadorType.getSmaIdCodigo());
		it.setSchemeName(identificadorType.getSmaIdNombre());
		it.setSchemeURI(identificadorType.getSmaIdURI());
		it.setSchemeVersionID(identificadorType.getSmaIdVersion());
		it.setValue(identificadorType.getValue());
		return it;

	}

	// Cuenta de credito LLCALDERON
	public CreditAccountType getCreditAccount(CuentaDeCreditoType identificadorType) {

		CreditAccountType ca = new CreditAccountType();
		AccountIDType it = new AccountIDType();
		it.setSchemeAgencyID(identificadorType.getIdCuenta().getSmaIdOrgEmisorID());
		it.setSchemeAgencyName(identificadorType.getIdCuenta().getSmaIdOrgEmisorNombre());
		it.setSchemeDataURI(identificadorType.getIdCuenta().getSmaIdURIDatos());
		it.setSchemeID(identificadorType.getIdCuenta().getSmaIdCodigo());
		it.setSchemeName(identificadorType.getIdCuenta().getSmaIdNombre());
		it.setSchemeURI(identificadorType.getIdCuenta().getSmaIdURI());
		it.setSchemeVersionID(identificadorType.getIdCuenta().getSmaIdVersion());
		it.setValue(identificadorType.getIdCuenta().getValue());
		ca.setAccountID(it);
		return ca;
	}

	public AttachmentType getAttachmentType(AdjuntoType adjuntoType) {
		AttachmentType at = new AttachmentType();

		at.setEmbeddedDocumentBinaryObject(getEmbeddedDocumentBinaryObjectType(adjuntoType.getDocBinarioIncluido()));

		at.setExternalReference(getExternalReferenceType(adjuntoType.getReferenciaExterna()));

		return at;

	}

	public EmbeddedDocumentBinaryObjectType getEmbeddedDocumentBinaryObjectType(ObjetoBinarioType ob) {

		EmbeddedDocumentBinaryObjectType db = new EmbeddedDocumentBinaryObjectType();
		db.setCharacterSetCode(ob.getCharSet());
		db.setEncodingCode(ob.getEncoding());
		db.setFilename(ob.getNombreArchivo());
		db.setFormat(ob.getFomato());
		BinaryObjectMimeCodeContentType bo = null;
		db.setMimeCode(bo.fromValue(ob.getCodigoMime()));
		db.setUri(ob.getURI());
		db.setValue(ob.getValue());
		// db.getCharacterSetCode().add(ob.getCharSet())

		return db;

	}

	public ExternalReferenceType getExternalReferenceType(ReferenciaExternaType re) {

		ExternalReferenceType er = new ExternalReferenceType();

		DocumentHashType dh = new DocumentHashType();
		dh = (DocumentHashType) getTexto(re.getHashDocumento());
		er.setDocumentHash(dh);

		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(re.getFechaExpiracion());
		ExpiryDateType ed = new ExpiryDateType();
		ed.setValue(fecha);
		er.setExpiryDate(ed);

		String horaString = new SimpleDateFormat("HH:MM:ss").format(re.getHoraExpiracion());
		ExpiryTimeType eh = new ExpiryTimeType();
		er.setExpiryTime(eh);

		URIType ur = new URIType();
		ur = (URIType) getidentificador(re.getURL());
		er.setURI(ur);

		return er;
	}

	public UUIDType getUUIDType(IdentificadorType identificadorType) {

		UUIDType it = new UUIDType();
		it.setSchemeAgencyID(identificadorType.getSmaIdOrgEmisorID());
		it.setSchemeAgencyName(identificadorType.getSmaIdOrgEmisorNombre());
		it.setSchemeDataURI(identificadorType.getSmaIdURIDatos());
		it.setSchemeID(identificadorType.getSmaIdCodigo());
		it.setSchemeName(identificadorType.getSmaIdNombre());
		it.setSchemeURI(identificadorType.getSmaIdURI());
		it.setSchemeVersionID(identificadorType.getSmaIdVersion());
		it.setValue(identificadorType.getValue());
		return it;

	}

	public ResponseType getResponse(int tipoDocumento) {
		ResponseType objResponseType = new ResponseType();
		ResponseCodeType objResponseCodeType = new ResponseCodeType();
		objResponseCodeType.setListURI(
				"http://www.dian.gov.co/micrositios/fac_electronica/documentos/Anexo_Tecnico_001_Formatos_de_los_Documentos_XML_de_Facturacion_Electron.pdf");
		if (tipoDocumento == 2) {
			objResponseCodeType.setListName("concepto de notas debitos");
			objResponseCodeType.setName("2:= incremento de la factura electrÃ³nica");
		}
		if (tipoDocumento == 3) {
			objResponseCodeType.setListName("concepto de notas crÃ©dito");
			objResponseCodeType.setName("2:= anulaciÃ³n de la factura electrÃ³nica");
		}
		objResponseCodeType.setValue("2");
		objResponseType.setResponseCode(objResponseCodeType);
		ReferenceIDType objReferenceID = new ReferenceIDType();
		objResponseType.setReferenceID(objReferenceID);
		return objResponseType;
	}

	// encabezado de la factura LLCALDERON
	// Codigo del tipo de documentos 1 FEL ,2 NotDEB ,3 NotCred
	public InvoiceTypeCodeType getInvoiceTypeCodeType() {

		InvoiceTypeCodeType objInvoiceTypeCodeType = new InvoiceTypeCodeType();
		objInvoiceTypeCodeType.setListAgencyID("195");
		objInvoiceTypeCodeType.setListAgencyName("CO, DIAN (Direccion de Impuestos y Aduanas Nacionales)");
		objInvoiceTypeCodeType.setListSchemeURI("http://www.dian.gov.co/contratos/facturaelectronica/v1/InvoiceType");
		// codigo del tipo de documento electronico factura, nota debito o
		// credito
		objInvoiceTypeCodeType.setValue(doc.getEncabezado().getTipoDocElectronico());
		return objInvoiceTypeCodeType;

	}

	// Descricion : Recibe una lista de descripciones las procesa y las devuelve
	// como una lista del tipo DescriptionType
	public List<DescriptionType> getDescripcion(List<DescriptionType> dt) {
		List<DescriptionType> dts = new ArrayList<DescriptionType>();
		for (DescriptionType a : dt) {
			dts.add(a);
		}
		return dts;
	}

	public List<DescriptionType> getDescripcion2(List<TextoType> list) {

		List<DescriptionType> dts = new ArrayList<DescriptionType>();
		for (TextoType a : list) {

			DescriptionType d = new DescriptionType();
			d.setLanguageID(a.getIdLenguaje());
			d.setValue(a.getValue());
			dts.add(d);
		}
		return dts;
	}

	// LLCALDERON cantidad
	public QuantityType getQuantityType(CantidadType cantidad) {
		QuantityType qt = new QuantityType();
		qt.setUnitCode(cantidad.getCodUnidad());
		qt.setValue(cantidad.getValue());
		return qt;
	}

	// LLCALDERON cantidad

	public oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType getQuantity(
			CantidadType cantidad) {
		oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType qt = new oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.QuantityType();
		qt.setUnitCode(cantidad.getCodUnidad());
		qt.setValue(cantidad.getValue());
		return qt;
	}

	// Describe un periodo LLCALDERON
	@SuppressWarnings("unchecked")
	public PeriodType getPeriodo(PeriodoType periodoType) {
		PeriodType pt = new PeriodType();

		// Fecha inicial
		StartDateType sd = new StartDateType();
		sd.setValue(periodoType.getFechaInicial().toString());
		pt.setStartDate(sd);

		// Fecha final
		EndDateType ed = new EndDateType();
		ed.setValue(periodoType.getFechaInicial().toString());
		pt.setEndDate(ed);

		// Hora inicial
		StartTimeType hi = new StartTimeType();
		hi.setValue(periodoType.getHoraInicial().toString());
		pt.setStartTime(hi);

		// Hora Final
		EndTimeType hf = new EndTimeType();
		hf.setValue(periodoType.getHoraFinal().toString());
		pt.setEndTime(hf);

		// Duracion del perido
		DurationMeasureType dm = new DurationMeasureType();
		dm.setValue(periodoType.getDuracion().getValue());
		pt.setDurationMeasure(dm);

		// COdigos de los periodos
		List<CodeType> lista = new ArrayList<CodeType>();
		lista = getCodeType(periodoType.getDescripcionCodigo());

		for (CodeType dc : lista) {
			DescriptionCodeType dt = new DescriptionCodeType();
			dt = (DescriptionCodeType) dc;
			pt.getDescriptionCode().add(dt);
		}

		// Descripcion del periodo

		List<TextType> lista2 = new ArrayList<TextType>();
		lista2 = getTextType(periodoType.getDescripcion());

		for (TextType dc : lista2) {
			DescriptionType dt = new DescriptionType();
			dt = (DescriptionType) dc;
			pt.getDescription().add(dt);
		}

		return pt;
	}

	// Retorna una lista de txtos LLCALDERON
	private List<TextType> getTextType(List<TextoType> descripcion) {
		List<TextType> lista = new ArrayList<TextType>();
		for (TextoType tx : descripcion) {
			TextType t = new TextType();
			t.setLanguageID(tx.getIdLenguaje());
			t.setValue(tx.getValue());
			lista.add(t);
		}
		return lista;

	}

	// Devuelve el listados de codigos en forma generica. LLCALDERON
	private List<CodeType> getCodeType(List<CodigoType> Codigo) {

		List<CodeType> lista = new ArrayList<CodeType>();

		for (CodigoType cod : Codigo) {

			CodeType c = new CodeType();
			c.setListID(cod.getListaId());
			c.setListAgencyID(cod.getListaOrgEmisorId());
			c.setListAgencyName(cod.getListaOrgEmisorNombre());
			c.setListName(cod.getListaNombre());
			c.setListVersionID(cod.getListaVersion());
			// c.setName(cod.getno);
			c.setLanguageID(cod.getCodigoLenguaje());
			c.setListURI(cod.getListaURI());
			c.setListSchemeURI(cod.getListaURIEsquema());
			c.setValue(cod.getValue());
			// c.setValue();

			lista.add(c);
		}
		return lista;
	}

	// LLCALDERON
	public List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType> getAllowanceCharge(
			List<CargoDescuentoType> list) {

		List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType> all = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType>();
		for (CargoDescuentoType b : list) {
			oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType ac = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType();
			ac.setID((IDType) getidentificador(b.getId()));
			ChargeIndicatorType ci = new ChargeIndicatorType();
			ci.setValue(b.isIndicaCargoODescuento());
			ac.setChargeIndicator(ci);
			ac.setAllowanceChargeReasonCode((AllowanceChargeReasonCodeType) getCodigos(b.getCodRazonCargoDescuento()));
			ac.setAllowanceChargeReason((AllowanceChargeReasonType) getTexto(b.getRazonCargoDescuento()));
			// factor multiplicador
			MultiplierFactorNumericType mf = new MultiplierFactorNumericType();
			mf.setValue(b.getFactorMultiplicador());
			ac.setMultiplierFactorNumeric(mf);
			PrepaidIndicatorType pi = new PrepaidIndicatorType();
			pi.setValue(b.isIndicaPagoAdelantado());
			ac.setPrepaidIndicator(pi);
			SequenceNumericType sn = new SequenceNumericType();
			sn.setValue(b.getSecuenciaNumerica());
			ac.setSequenceNumeric(sn);
			ac.setAmount(getAmountType2(b.getMonto()));
			CurrencyCodeContentType codigo = null;
			BaseAmountType ba = new BaseAmountType();
			ba.setCurrencyID(codigo.fromValue(b.getBase().getIdMoneda()));
			ba.setValue(b.getBase().getValue());
			ac.setBaseAmount(ba);
			AccountingCostCodeType acc = new AccountingCostCodeType();
			acc = (AccountingCostCodeType) getCodigos(b.getCentroDeCostoCodigo());
			ac.setAccountingCostCode(acc);
			AccountingCostType acct = new AccountingCostType();
			acct = (AccountingCostType) getTexto(b.getCentroDeCostoNombre());
			ac.setAccountingCost(acct);
			List<TaxCategoryType> tc = new ArrayList<TaxCategoryType>();
			tc = getTaxCategoryType(b.getCategoriaImpuesto());
			for (TaxCategoryType tct : tc) {
				ac.getTaxCategory().add(tct);
			}

			List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType> tt = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType>();
			List<TotalImpuestoType> ti = new ArrayList<TotalImpuestoType>();
			ti.add(b.getTotalImpuesto());
			tt = ec.getTaxTotalLista(ti);
			for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType t : tt) {
				ac.setTaxTotal(t);
			}

			List<PaymentMeansType> PaymentMeans = new ArrayList<PaymentMeansType>();
			PaymentMeans = ec.getPaymentMeanst(b.getMediosDePago());
			for (PaymentMeansType s : PaymentMeans) {
				ac.getPaymentMeans().add(s);
			}

			all.add(ac);

		}

		return all;

	}

	// LLCALDERON
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType getAllowanceCharge2(
			CargoDescuentoType b) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType ac = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AllowanceChargeType();
		ac.setID((IDType) getidentificador(b.getId()));
		ChargeIndicatorType ci = new ChargeIndicatorType();
		ci.setValue(b.isIndicaCargoODescuento());
		ac.setChargeIndicator(ci);
		ac.setAllowanceChargeReasonCode((AllowanceChargeReasonCodeType) getCodigos(b.getCodRazonCargoDescuento()));
		ac.setAllowanceChargeReason((AllowanceChargeReasonType) getTexto(b.getRazonCargoDescuento()));
		// factor multiplicador
		MultiplierFactorNumericType mf = new MultiplierFactorNumericType();
		mf.setValue(b.getFactorMultiplicador());
		ac.setMultiplierFactorNumeric(mf);
		PrepaidIndicatorType pi = new PrepaidIndicatorType();
		pi.setValue(b.isIndicaPagoAdelantado());
		ac.setPrepaidIndicator(pi);
		SequenceNumericType sn = new SequenceNumericType();
		sn.setValue(b.getSecuenciaNumerica());
		ac.setSequenceNumeric(sn);
		ac.setAmount(getAmountType2(b.getMonto()));
		CurrencyCodeContentType codigo = null;
		BaseAmountType ba = new BaseAmountType();
		ba.setCurrencyID(codigo.fromValue(b.getBase().getIdMoneda()));
		ba.setValue(b.getBase().getValue());
		ac.setBaseAmount(ba);
		AccountingCostCodeType acc = new AccountingCostCodeType();
		acc = (AccountingCostCodeType) getCodigos(b.getCentroDeCostoCodigo());
		ac.setAccountingCostCode(acc);
		AccountingCostType acct = new AccountingCostType();
		acct = (AccountingCostType) getTexto(b.getCentroDeCostoNombre());
		ac.setAccountingCost(acct);
		List<TaxCategoryType> tc = new ArrayList<TaxCategoryType>();
		tc = getTaxCategoryType(b.getCategoriaImpuesto());
		for (TaxCategoryType tct : tc) {
			ac.getTaxCategory().add(tct);
		}
		List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType> tt = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType>();
		List<TotalImpuestoType> ti = new ArrayList<TotalImpuestoType>();
		ti.add(b.getTotalImpuesto());
		tt = ec.getTaxTotalLista(ti);
		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType t : tt) {
			ac.setTaxTotal(t);
		}
		List<PaymentMeansType> PaymentMeans = new ArrayList<PaymentMeansType>();
		PaymentMeans = ec.getPaymentMeanst(b.getMediosDePago());
		for (PaymentMeansType s : PaymentMeans) {
			ac.getPaymentMeans().add(s);
		}

		return ac;

	}

	// LLCALDERON
	public List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType> getTaxCategoryType(
			List<CategoriaImpuestoType> ci) {

		List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType> lista = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType>();
		for (CategoriaImpuestoType ca : ci) {

			oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType tc = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType();
			tc.setID((IDType) getidentificador(ca.getId()));
			tc.setName((NameType) getName(ca.getNombre()));

			PercentType pt = new PercentType();
			pt.setValue(ca.getPorcentaje());
			tc.setPercent(pt);

			BaseUnitMeasureType bm = new BaseUnitMeasureType();
			bm.setUnitCode(ca.getUnidadMedidaBase().getUnitCode().toString());
			bm.setValue(ca.getUnidadMedidaBase().getValue());
			tc.setBaseUnitMeasure(bm);

			PerUnitAmountType pu = new PerUnitAmountType();
			CurrencyCodeContentType codigo = null;
			pu.setCurrencyID(codigo.fromValue(ca.getMontoPorUnidad().getIdMoneda()));
			pu.setValue(ca.getMontoPorUnidad().getValue());
			tc.setPerUnitAmount(pu);

			// tc.setPercent(value);
			tc.setTaxExemptionReasonCode((TaxExemptionReasonCodeType) getCodigos(ca.getExencionCodigo()));
			tc.setTaxExemptionReason((TaxExemptionReasonType) getTexto(ca.getExencionRazon()));
			tc.setTierRange((TierRangeType) getTexto(ca.getRango()));

			TierRatePercentType tr = new TierRatePercentType();
			tr.setValue(ca.getPorcentaje());
			tc.setTierRatePercent(tr);

			tc.setTaxScheme(getTaxSchemaType(ca.getEsquemaTributario()));
			lista.add(tc);

		}

		return lista;
	}

	// LLCALDERON Subtotales
	public List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType> getTaxSubtotal(
			List<SubTotalImpuestoType> list) {

		List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType> tslista = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType>();

		for (SubTotalImpuestoType s : list) {
			TaxSubtotalType ts = new TaxSubtotalType();

			ts.setTaxableAmount(getTaxableAmount(s.getMontoImponible()));
			ts.setTaxAmount(getTaxAmount(s.getValorImpuesto()));
			// BigDecimal

			CalculationSequenceNumericType cs = new CalculationSequenceNumericType();

			cs.setValue(s.getSecuenciaNumerica());
			ts.setCalculationSequenceNumeric(cs);

			ts.setTransactionCurrencyTaxAmount(
					getTransactionCurrencyTaxAmountType(s.getValorImpuestoMonedaTransaccion()));
			// BigDecimal

			PercentType per = new PercentType();
			per.setValue(s.getPorcentaje());
			ts.setPercent(per);

			ts.setBaseUnitMeasure(getBaseUnitMeasure(s.getUnidadMedidaBase()));

			ts.setPerUnitAmount(getPerUnitAmount(s.getValorPorUnidad()));

			ts.setTierRange((TierRangeType) getTexto(s.getRango()));
			// BigDecimal

			TierRatePercentType pr = new TierRatePercentType();
			pr.setValue(s.getPorcentajeRango());
			ts.setTierRatePercent(pr);

			ts.setTaxCategory(getTaxCategory(s.getCategoriaImpuesto()));

		}

		return tslista;

	}

	// LLCALDERON Subtotales
	public List<TaxSubtotalType> getTaxSubtotal2(List<SubTotalImpuestoType> list) {

		List<TaxSubtotalType> tslista = new ArrayList<TaxSubtotalType>();

		for (SubTotalImpuestoType s : list) {
			TaxSubtotalType ts = new TaxSubtotalType();

			ts.setTaxableAmount(getTaxableAmount(s.getMontoImponible()));
			ts.setTaxAmount(getTaxAmount(s.getValorImpuesto()));
			// BigDecimal

			CalculationSequenceNumericType cs = new CalculationSequenceNumericType();

			cs.setValue(s.getSecuenciaNumerica());
			ts.setCalculationSequenceNumeric(cs);

			ts.setTransactionCurrencyTaxAmount(
					getTransactionCurrencyTaxAmountType(s.getValorImpuestoMonedaTransaccion()));
			// BigDecimal

			PercentType per = new PercentType();
			per.setValue(s.getPorcentaje());
			ts.setPercent(per);

			ts.setBaseUnitMeasure(getBaseUnitMeasure(s.getUnidadMedidaBase()));

			ts.setPerUnitAmount(getPerUnitAmount(s.getValorPorUnidad()));

			ts.setTierRange((TierRangeType) getTexto(s.getRango()));
			// BigDecimal

			TierRatePercentType pr = new TierRatePercentType();
			pr.setValue(s.getPorcentajeRango());
			ts.setTierRatePercent(pr);

			ts.setTaxCategory(getTaxCategory(s.getCategoriaImpuesto()));

		}

		return tslista;

	}

	// LLCALDERON
	private oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType getTaxCategory(
			CategoriaImpuestoType ca) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType tc = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxCategoryType();
		tc.setID((IDType) getidentificador(ca.getId()));
		tc.setName((NameType) getName(ca.getNombre()));

		PercentType pt = new PercentType();
		pt.setValue(ca.getPorcentaje());
		tc.setPercent(pt);

		BaseUnitMeasureType bm = new BaseUnitMeasureType();
		bm.setUnitCode(ca.getUnidadMedidaBase().getUnitCode().toString());
		bm.setValue(ca.getUnidadMedidaBase().getValue());
		tc.setBaseUnitMeasure(bm);

		PerUnitAmountType pu = new PerUnitAmountType();
		CurrencyCodeContentType codigo = null;
		pu.setCurrencyID(codigo.fromValue(ca.getMontoPorUnidad().getIdMoneda()));
		pu.setValue(ca.getMontoPorUnidad().getValue());
		tc.setPerUnitAmount(pu);

		// tc.setPercent(value);
		tc.setTaxExemptionReasonCode((TaxExemptionReasonCodeType) getCodigos(ca.getExencionCodigo()));
		tc.setTaxExemptionReason((TaxExemptionReasonType) getTexto(ca.getExencionRazon()));
		tc.setTierRange((TierRangeType) getTexto(ca.getRango()));

		TierRatePercentType tr = new TierRatePercentType();
		tr.setValue(ca.getPorcentaje());
		tc.setTierRatePercent(tr);

		tc.setTaxScheme(getTaxSchemaType(ca.getEsquemaTributario()));

		return tc;
	}

	// LLCALDERON
	private PerUnitAmountType getPerUnitAmount(MontoType valorPorUnidad) {

		PerUnitAmountType pu = new PerUnitAmountType();
		CurrencyCodeContentType codigo = null;
		pu.setCurrencyID(codigo.fromValue(valorPorUnidad.getIdMoneda()));
		pu.setValue(valorPorUnidad.getValue());
		return pu;

	}

	// LLCALDERON
	private BaseUnitMeasureType getBaseUnitMeasure(MedidaType unidadMedidaBase) {
		BaseUnitMeasureType bm = new BaseUnitMeasureType();
		bm.setUnitCode(unidadMedidaBase.getUnitCode());
		bm.setValue(unidadMedidaBase.getValue());

		return bm;
	}

	// LLCALDERON
	private TransactionCurrencyTaxAmountType getTransactionCurrencyTaxAmountType(MontoType valorImpuestoMoneda) {

		TransactionCurrencyTaxAmountType tc = new TransactionCurrencyTaxAmountType();
		CurrencyCodeContentType codigo = null;
		tc.setCurrencyID(codigo.fromValue(valorImpuestoMoneda.getIdMoneda()));
		tc.setValue(valorImpuestoMoneda.getValue());
		return tc;
	}

	// LLCALDERON
	@SuppressWarnings("static-access")
	public TaxAmountType getTaxAmount(MontoType monto) {

		TaxAmountType ta = new TaxAmountType();
		CurrencyCodeContentType codigo = null;
		ta.setCurrencyID(codigo.fromValue(monto.getIdMoneda()));
		ta.setValue(monto.getValue());
		return ta;

	}

	// LLCALDERON
	@SuppressWarnings("static-access")
	public TaxableAmountType getTaxableAmount(MontoType monto) {

		TaxableAmountType ta = new TaxableAmountType();
		CurrencyCodeContentType codigo = null;
		ta.setCurrencyID(codigo.fromValue(monto.getIdMoneda()));
		ta.setValue(monto.getValue());
		return ta;

	}

	// LLCALDERON
	public un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.NameType getNameType(
			NombreType nombre) {

		un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.NameType nt = new un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.NameType();

		nt.setLanguageID(nombre.getIdLenguaje());
		nt.setValue(nombre.getValue());
		return nt;
	}

	// AccountingCostCode LLCALDERON
	public oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostCodeType getAccountingCostCode() {
		oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostCodeType acc = new oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AccountingCostCodeType();
		acc.setValue(doc.getEncabezado().getCentroDeCostoCodigo().toString());
		return acc;
	}

	// Nombre del centro de costo LLCALDERON
	public AccountingCostType getAccountingCost() {
		AccountingCostType ac = new AccountingCostType();
		ac.setValue(doc.getEncabezado().getCentroDeCostoNombre().toString());
		return ac;

	}

	// LLCALDERON
	public TaxSchemeType getTaxSchemaType(EsquemaTributarioType esquema) {

		TaxSchemeType ts = new TaxSchemeType();

		ts.setID((IDType) getidentificador(esquema.getId()));
		ts.setName(getName(esquema.getNombre()));
		ts.setTaxTypeCode((TaxTypeCodeType) getCodigos(esquema.getCodigoTipo()));
		ts.setCurrencyCode((CurrencyCodeType) getCodigos(esquema.getCodigoMoneda()));

		List<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType> ad = new ArrayList<oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType>();
		ad = ec.getAddress(esquema.getDireccionRegionJurisdiccion());
		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType at : ad) {
			ts.getJurisdictionRegionAddress().add(at);
		}
		return ts;
	}

	// LLCALDERON
	public NameType getName(NombreType nombre) {
		NameType nt = new NameType();
		nt.setLanguageID(nombre.getIdLenguaje());
		nt.setValue(nombre.getValue());
		return nt;
	}

	public LocationCoordinateType getLocationCoordinate(CoordenadasUbicacionType c) {
		LocationCoordinateType lc = new LocationCoordinateType();
		lc.setCoordinateSystemCode((CoordinateSystemCodeType) getCodigos(c.getCodigoSistemaCoordendas()));
		// decimal
		LatitudeDegreesMeasureType l = new LatitudeDegreesMeasureType();
		l.setUnitCode(c.getLatitudMedidaGrados().getUnitCode());
		l.setValue(c.getLatitudMedidaGrados().getValue());
		lc.setLatitudeDegreesMeasure(l);
		lc.setLatitudeDirectionCode((LatitudeDirectionCodeType) getCodigos(c.getLatitudCodigoDireccion()));
		// decimal
		lc.setLatitudeMinutesMeasure((LatitudeMinutesMeasureType) getMeasure(c.getLatitudMedidaMinutos()));
		// decimal
		lc.setLongitudeDegreesMeasure((LongitudeDegreesMeasureType) getMeasure(c.getLongitudMedidaGrados()));
		lc.setLongitudeDirectionCode((LongitudeDirectionCodeType) getCodigos(c.getLongitudCodigoDireccion()));
		// decimal
		lc.setLongitudeMinutesMeasure((LongitudeMinutesMeasureType) getMeasure(c.getLongitudMedidaMinutos()));
		return lc;
	}

	// LLCALDERON
	public MeasureType getMeasure(MedidaType medidaType) {
		MeasureType bu = new MeasureType();
		bu.setUnitCode(medidaType.getUnitCode());
		bu.setValue(medidaType.getValue());
		return bu;
	}

	public un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.MeasureType getMeasure2(
			MedidaType medidaType) {
		un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.MeasureType bu = new un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.MeasureType();
		bu.setUnitCode(medidaType.getUnitCode());
		bu.setValue(medidaType.getValue());
		return bu;
	}

	// LLCALDERON
	public CountryType getCountryType(PaisType paisType) {
		CountryType ct = new CountryType();
		ct.setIdentificationCode((IdentificationCodeType) getCodigos(paisType.getCodigo()));
		ct.setName(getName(paisType.getNombre()));
		return ct;
	}

	/*
	 * public CurrencyCodeType getCurrencyCode() {
	 * 
	 * CurrencyCodeType cc = new CurrencyCodeType();
	 * 
	 * cc.setLanguageID(value); cc.setListAgencyID(value);
	 * cc.setListAgencyName(value); cc.setListID(value); cc.setListName(value);
	 * cc.setListSchemeURI(value); cc.setListURI(value);
	 * cc.setListVersionID(value); cc.setName(value); cc.setValue(value);
	 * 
	 * return cc; }
	 */

	// LLCALDERON Codigo de la Moneda
	public AmountType getAmountType(MontoType valor) {

		AmountType at = new AmountType();

		CurrencyCodeContentType codigo = null;
		at.setCurrencyID(codigo.fromValue(valor.getIdMoneda()));
		at.setValue(valor.getValue());
		return at;
	}

	// LLCALDERON
	public oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType getAmountType2(MontoType valor) {

		oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType at = new oasis.names.specification.ubl.schema.xsd.commonbasiccomponents_2.AmountType();
		CurrencyCodeContentType codigo = null;
		at.setCurrencyID(codigo.fromValue(valor.getIdMoneda()));
		// solo adminte un valor de tres caracteres ej: AED que corresponden al
		// tipo de koneda
		at.setValue(valor.getValue());

		return at;

	}

	// LLCALDERON
	@SuppressWarnings("static-access")
	public RoundingAmountType geRoundingAmount(MontoType monto) {

		RoundingAmountType ra = new RoundingAmountType();
		CurrencyCodeContentType codigo = null;
		ra.setCurrencyID(codigo.fromValue(monto.getIdMoneda()));
		ra.setValue(monto.getValue());

		return null;
	}

	/*
	 * public
	 * un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.
	 * MeasureType getMeasureType() {
	 * un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.
	 * MeasureType bu = new
	 * un.unece.uncefact.data.specification.unqualifieddatatypesschemamodule._2.
	 * MeasureType(); bu.setUnitCode(value); bu.setValue(value); return bu; }
	 */

	// LLCALDERON
	public LanguageType getLanguage(IdiomaType idioma) {
		LanguageType lt = new LanguageType();
		lt.setID((IDType) getidentificador(idioma.getId()));
		lt.setLocaleCode((LocaleCodeType) getCodigos(idioma.getLocaleCode()));
		lt.setName((NameType) getNameType(idioma.getNombre()));
		return lt;
	}

	// LLCALDERON Cuenta Tarjeta de crdito

	public CardAccountType getCardAccount(CuentaTarjetaType cuenta) {

		CardAccountType ca = new CardAccountType();
		ca.setCardChipCode((CardChipCodeType) getCodigos(cuenta.getCodigoChip()));
		ca.setCardTypeCode((CardTypeCodeType) getCodigos(cuenta.getTipoDeTarjeta()));
		ca.setChipApplicationID((ChipApplicationIDType) getidentificador(cuenta.getIdAplicacionChip()));
		String fecha = new SimpleDateFormat("yyyy-MM-dd").format(cuenta.getValidezFechaExpiracion());
		ExpiryDateType ed = new ExpiryDateType();
		ed.setValue(fecha);
		ca.setExpiryDate(ed);
		ca.setCV2ID((CV2IDType) getidentificador(cuenta.getIdVerificacion()));
		// ca.setHolderName(getNameType(cuenta.get));
		ca.setIssueNumberID((IssueNumberIDType) getidentificador(cuenta.getNumeroEmision()));
		ca.setIssuerID((IssuerIDType) getidentificador(cuenta.getIdEmisor()));
		ca.setNetworkID((NetworkIDType) getidentificador(cuenta.getIdRedTarjeta()));
		ca.setPrimaryAccountNumberID((PrimaryAccountNumberIDType) getidentificador(cuenta.getNumeroDeCuenta()));
		ValidityStartDateType vd = new ValidityStartDateType();
		String fecha2 = new SimpleDateFormat("yyyy-MM-dd").format(cuenta.getValidezFechaInicio());
		vd.setValue(fecha2);
		ca.setValidityStartDate(vd);

		return ca;
	}

	// LLCALDERON
	public FinancialAccountType getFinancialAccount(CuentaFinancieraType cuenta) {

		FinancialAccountType fa = new FinancialAccountType();
		fa.setID((IDType) getidentificador(cuenta.getId()));
		fa.setName((NameType) getNameType(cuenta.getNombre()));
		fa.setAccountTypeCode((AccountTypeCodeType) getCodigos(cuenta.getTipoDeCuenta()));
		fa.setCurrencyCode((CurrencyCodeType) getCodigos(cuenta.getTipoDeCuenta()));
		fa.setCountry(getCountryType(cuenta.getPais()));
		fa.setFinancialInstitutionBranch(getBranch(cuenta.getOficinaEntidadFinanciera()));
		for (TextoType n : cuenta.getNota()) {
			fa.getPaymentNote().add((PaymentNoteType) getTexto(n));
		}
		return fa;
	}

	// LLCALDERON
	private BranchType getBranch(OficinaType oficina) {

		BranchType bt = new BranchType();
		bt.setID((IDType) getidentificador(oficina.getId()));
		bt.setName((NameType) getNameType(oficina.getNombre()));

		List<DireccionType> direcciones = new ArrayList<DireccionType>();
		direcciones.add(oficina.getDireccion());

		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType dir : ec
				.getAddress(direcciones)) {
			bt.setAddress(dir);
		}

		bt.setFinancialInstitution(getFinancialInstitution(oficina.getEntidadFinanciera()));

		return bt;
	}

	// LLCALDERON
	private FinancialInstitutionType getFinancialInstitution(EntidadFinancieraType entidad) {

		FinancialInstitutionType fi = new FinancialInstitutionType();

		fi.setID((IDType) getidentificador(entidad.getId()));
		fi.setName((NameType) getNameType(entidad.getNombre()));

		List<DireccionType> direcciones = new ArrayList<DireccionType>();
		direcciones.add(entidad.getDireccion());

		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.AddressType dir : ec
				.getAddress(direcciones)) {
			fi.setAddress(dir);
		}
		return null;
	}

	// LLCALDERON
	public PartyIdentificationType getidterceros(IdTerceroType idTercero) {
		PartyIdentificationType pi = new PartyIdentificationType();
		pi.setID((IDType) getidentificador(idTercero.getId()));
		return pi;
	}

	// LLCALDERON TOTAL IMPUESTOS
	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType getTaxTotal(
			TotalImpuestoType totalImpuesto) {

		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType tt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxTotalType();
		tt.setTaxAmount(getTaxAmount(totalImpuesto.getValorImpuesto()));
		tt.setRoundingAmount((RoundingAmountType) getAmountType(totalImpuesto.getValorAjusteRedondeo()));
		TaxEvidenceIndicatorType tei = new TaxEvidenceIndicatorType();
		tei.setValue(totalImpuesto.isIndicaEsSoloEvidencia());
		tt.setTaxEvidenceIndicator(tei);
		for (oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.TaxSubtotalType t : getTaxSubtotal(
				totalImpuesto.getSubTotalImpuesto())) {
			tt.getTaxSubtotal().add(t);
		}

		return tt;
	}

	// LLCALDERON TOTAL IMPUESTOS
	public TaxTotalType getTaxTotal2(TotalImpuestoType totalImpuesto) {

		TaxTotalType tt = new TaxTotalType();
		tt.setTaxAmount(getTaxAmount(totalImpuesto.getValorImpuesto()));
		tt.setRoundingAmount((RoundingAmountType) getAmountType(totalImpuesto.getValorAjusteRedondeo()));
		TaxEvidenceIndicatorType tei = new TaxEvidenceIndicatorType();
		tei.setValue(totalImpuesto.isIndicaEsSoloEvidencia());
		tt.setTaxEvidenceIndicator(tei);
		for (TaxSubtotalType t : getTaxSubtotal2(totalImpuesto.getSubTotalImpuesto())) {
			tt.getTaxSubtotal().add(t);
		}

		return tt;
	}

	public PriceType getPriceType(PrecioType p) {

		PriceType pt = new PriceType();

		pt.setPriceAmount((PriceAmountType) getAmountType(p.getValorPrecio()));
		pt.setBaseQuantity((BaseQuantityType) getQuantityType(p.getCantidadBase()));
		for (TextoType pcr : p.getRazonCambioDePrecio()) {
			pt.getPriceChangeReason().add((PriceChangeReasonType) getTexto(pcr));
		}

		pt.setPriceTypeCode((PriceTypeCodeType) getCodigos(p.getTipoPrecioCodigo()));
		pt.setPriceType((PriceTypeType) getTexto(p.getTipoPrecioTexto()));
		// BigDecimal
		OrderableUnitFactorRateType our = new OrderableUnitFactorRateType();
		our.setValue(p.getFactorConvAUnidadOrden());
		pt.setOrderableUnitFactorRate(our);

		for (PeriodoType pv : p.getPeriodoValidez()) {
			pt.getValidityPeriod().add(getPeriodo(pv));
		}

		pt.setPriceList(getPriceListType(p.getListaPrecios()));

		for (CargoDescuentoType cd : p.getCargoDescuento()) {
			pt.getAllowanceCharge().add(ec.getallowanceCharget2(cd));
		}

		return pt;
	}

	// LLCALDERON
	// <!-- cac:PriceType -->
	// <!-- Information about the price. -->

	public oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PriceType getPrice2(PrecioType p) {
		oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PriceType pt = new oasis.names.specification.ubl.schema.xsd.commonaggregatecomponents_2.PriceType();
		pt.setPriceAmount((PriceAmountType) getAmountType(p.getValorPrecio()));
		pt.setBaseQuantity((BaseQuantityType) getQuantityType(p.getCantidadBase()));
		for (TextoType pcr : p.getRazonCambioDePrecio()) {
			pt.getPriceChangeReason().add((PriceChangeReasonType) getTexto(pcr));
		}
		pt.setPriceTypeCode((PriceTypeCodeType) getCodigos(p.getTipoPrecioCodigo()));
		pt.setPriceType((PriceTypeType) getTexto(p.getTipoPrecioTexto()));
		// BigDecimal
		OrderableUnitFactorRateType our = new OrderableUnitFactorRateType();
		our.setValue(p.getFactorConvAUnidadOrden());
		pt.setOrderableUnitFactorRate(our);
		for (PeriodoType pv : p.getPeriodoValidez()) {
			pt.getValidityPeriod().add(getPeriodo(pv));
		}
		pt.setPriceList(getPriceListType(p.getListaPrecios()));
		for (CargoDescuentoType cd : p.getCargoDescuento()) {
			pt.getAllowanceCharge().add(ec.getallowanceCharget2(cd));
		}
		return pt;
	}

	public co.gov.dian.contratos.facturaelectronica.v1.PriceType getPrice(PrecioType p) {
		co.gov.dian.contratos.facturaelectronica.v1.PriceType pt = new co.gov.dian.contratos.facturaelectronica.v1.PriceType();
		pt.setPriceAmount((PriceAmountType) getAmountType(p.getValorPrecio()));
		pt.setBaseQuantity((BaseQuantityType) getQuantityType(p.getCantidadBase()));
		for (TextoType pcr : p.getRazonCambioDePrecio()) {
			pt.getPriceChangeReason().add((PriceChangeReasonType) getTexto(pcr));
		}

		pt.setPriceTypeCode((PriceTypeCodeType) getCodigos(p.getTipoPrecioCodigo()));
		pt.setPriceType((PriceTypeType) getTexto(p.getTipoPrecioTexto()));
		// BigDecimal
		OrderableUnitFactorRateType our = new OrderableUnitFactorRateType();
		our.setValue(p.getFactorConvAUnidadOrden());
		pt.setOrderableUnitFactorRate(our);

		for (PeriodoType pv : p.getPeriodoValidez()) {
			pt.getValidityPeriod().add(getPeriodo(pv));
		}

		pt.setPriceList(getPriceListType(p.getListaPrecios()));

		for (CargoDescuentoType cd : p.getCargoDescuento()) {
			pt.getAllowanceCharge().add(ec.getallowanceCharget2(cd));
		}

		return pt;

	}

	// LLCALDERON
	public PriceListType getPriceListType(ListaPreciosType l) {

		PriceListType pl = new PriceListType();
		pl.setID((IDType) getidentificador(l.getId()));
		pl.setStatusCode((StatusCodeType) getCodigos(l.getCodigoEstado()));
		for (PeriodoType pv : l.getPeriodoValidez()) {
			pl.getValidityPeriod().add(getPeriodo(pv));
		}
		pl.setPreviousPriceList(getPriceListType(l.getListaPreciosPrevia()));
		return pl;
	}

	public BatchQuantityType BatchQuantity(CantidadType cantidad) {
		BatchQuantityType qt = new BatchQuantityType();
		qt.setUnitCode(cantidad.getCodUnidad());
		qt.setValue(cantidad.getValue());
		return qt;
	}

	public ConsumerUnitQuantityType getConsumerUnitQuantity(CantidadType cantidad) {
		ConsumerUnitQuantityType qt = new ConsumerUnitQuantityType();
		qt.setUnitCode(cantidad.getCodUnidad());
		qt.setValue(cantidad.getValue());
		return qt;

	}

	// LLCALDERON
	public ResponseType DiscrepancyResponse(RespuestaType dr) {
		ResponseType rt = new ResponseType();
		rt.setReferenceID((ReferenceIDType) getidentificador(dr.getIdReferencia()));
		rt.setResponseCode((ResponseCodeType) getCodigos(dr.getCodRespuesta()));
		// Se crea un objeto del tipo descripcion
		for (DescriptionType desc : getDescripcion2(dr.getDescripcion())) {
			rt.getDescription().add(desc);
		}
		return rt;
	}

}
