package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoTipoMoneda;
import java.math.BigDecimal;

public class CuentasFinancierasRespuesta {
	@SerializedName("RFC")
	private String RFC = null;
	@SerializedName("nombreOtorgante")
	private String nombreOtorgante = null;
	@SerializedName("contrato")
	private String contrato = null;
	@SerializedName("saldoInicial")
	private Float saldoInicial = null;
	@SerializedName("saldoTotal")
	private Float saldoTotal = null;
	@SerializedName("moneda")
	private CatalogoTipoMoneda moneda = null;
	@SerializedName("fechaApertura")
	private String fechaApertura = null;
	@SerializedName("plazo")
	private Integer plazo = null;
	@SerializedName("clavesObservacion")
	private String clavesObservacion = null;
	@SerializedName("tipoCredito")
	private String tipoCredito = null;
	@SerializedName("vigente")
	private Float vigente = null;
	@SerializedName("29dias")
	private BigDecimal _29dias = null;
	@SerializedName("59dias")
	private BigDecimal _59dias = null;
	@SerializedName("89dias")
	private BigDecimal _89dias = null;
	@SerializedName("119dias")
	private BigDecimal _119dias = null;
	@SerializedName("179dias")
	private BigDecimal _179dias = null;
	@SerializedName("180MasDias")
	private BigDecimal _180MasDias = null;
	@SerializedName("actualizacion")
	private String actualizacion = null;
	@SerializedName("fechaCierre")
	private String fechaCierre = null;
	@SerializedName("pagoEfectivo")
	private Float pagoEfectivo = null;
	@SerializedName("quita")
	private Float quita = null;
	@SerializedName("dacionPago")
	private Float dacionPago = null;
	@SerializedName("quebrantoCastigo")
	private Float quebrantoCastigo = null;
	@SerializedName("historia")
	private String historia = null;
	@SerializedName("atrasoMayor")
	private Integer atrasoMayor = null;
	@SerializedName("registroImpugnado")
	private String registroImpugnado = null;

	public CuentasFinancierasRespuesta RFC(String RFC) {
		this.RFC = RFC;
		return this;
	}

	@ApiModelProperty(example = "ADS990201AN1", value = "RFC de la compañía. El dato es opcional cuando se reporta un acreditado con domicilio en el extranjero.")
	public String getRFC() {
		return RFC;
	}

	public void setRFC(String RFC) {
		this.RFC = RFC;
	}

	public CuentasFinancierasRespuesta nombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
		return this;
	}

	@ApiModelProperty(example = "BANCOS", value = "Nombre de la entidad que otorga el crédito.")
	public String getNombreOtorgante() {
		return nombreOtorgante;
	}

	public void setNombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
	}

	public CuentasFinancierasRespuesta contrato(String contrato) {
		this.contrato = contrato;
		return this;
	}

	@ApiModelProperty(example = "2500303093007", value = "Número de contrato.")
	public String getContrato() {
		return contrato;
	}

	public void setContrato(String contrato) {
		this.contrato = contrato;
	}

	public CuentasFinancierasRespuesta saldoInicial(Float saldoInicial) {
		this.saldoInicial = saldoInicial;
		return this;
	}

	@ApiModelProperty(example = "2000.5", value = "Saldo inicial del crédito.")
	public Float getSaldoInicial() {
		return saldoInicial;
	}

	public void setSaldoInicial(Float saldoInicial) {
		this.saldoInicial = saldoInicial;
	}

	public CuentasFinancierasRespuesta saldoTotal(Float saldoTotal) {
		this.saldoTotal = saldoTotal;
		return this;
	}

	@ApiModelProperty(example = "2000.5", value = "Saldo total del crédito.")
	public Float getSaldoTotal() {
		return saldoTotal;
	}

	public void setSaldoTotal(Float saldoTotal) {
		this.saldoTotal = saldoTotal;
	}

	public CuentasFinancierasRespuesta moneda(CatalogoTipoMoneda moneda) {
		this.moneda = moneda;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoTipoMoneda getMoneda() {
		return moneda;
	}

	public void setMoneda(CatalogoTipoMoneda moneda) {
		this.moneda = moneda;
	}

	public CuentasFinancierasRespuesta fechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
		return this;
	}

	@ApiModelProperty(example = "2016-02-19", value = "Fecha de apertura del crédito, en el formato especificado (por defecto yyyy-MM-dd).")
	public String getFechaApertura() {
		return fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public CuentasFinancierasRespuesta plazo(Integer plazo) {
		this.plazo = plazo;
		return this;
	}

	@ApiModelProperty(example = "90", value = "Término en el que se pactó el crédito. Deberá reportarse en días.")
	public Integer getPlazo() {
		return plazo;
	}

	public void setPlazo(Integer plazo) {
		this.plazo = plazo;
	}

	public CuentasFinancierasRespuesta clavesObservacion(String clavesObservacion) {
		this.clavesObservacion = clavesObservacion;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getClavesObservacion() {
		return clavesObservacion;
	}

	public void setClavesObservacion(String clavesObservacion) {
		this.clavesObservacion = clavesObservacion;
	}

	public CuentasFinancierasRespuesta tipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getTipoCredito() {
		return tipoCredito;
	}

	public void setTipoCredito(String tipoCredito) {
		this.tipoCredito = tipoCredito;
	}

	public CuentasFinancierasRespuesta vigente(Float vigente) {
		this.vigente = vigente;
		return this;
	}

	@ApiModelProperty(example = "546780.5", value = "Monto Vigente. Sólo con créditos abiertos.")
	public Float getVigente() {
		return vigente;
	}

	public void setVigente(Float vigente) {
		this.vigente = vigente;
	}

	public CuentasFinancierasRespuesta _29dias(BigDecimal _29dias) {
		this._29dias = _29dias;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Vencido de 1 a 29 días. Sólo con créditos abiertos.")
	public BigDecimal get29dias() {
		return _29dias;
	}

	public void set29dias(BigDecimal _29dias) {
		this._29dias = _29dias;
	}

	public CuentasFinancierasRespuesta _59dias(BigDecimal _59dias) {
		this._59dias = _59dias;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Vencido de 30 a 59 días. Sólo con créditos abiertos.")
	public BigDecimal get59dias() {
		return _59dias;
	}

	public void set59dias(BigDecimal _59dias) {
		this._59dias = _59dias;
	}

	public CuentasFinancierasRespuesta _89dias(BigDecimal _89dias) {
		this._89dias = _89dias;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Vencido de 60 a 89 días. Sólo con créditos abiertos.")
	public BigDecimal get89dias() {
		return _89dias;
	}

	public void set89dias(BigDecimal _89dias) {
		this._89dias = _89dias;
	}

	public CuentasFinancierasRespuesta _119dias(BigDecimal _119dias) {
		this._119dias = _119dias;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Vencido de 90 a 119 días. Sólo con créditos abiertos.")
	public BigDecimal get119dias() {
		return _119dias;
	}

	public void set119dias(BigDecimal _119dias) {
		this._119dias = _119dias;
	}

	public CuentasFinancierasRespuesta _179dias(BigDecimal _179dias) {
		this._179dias = _179dias;
		return this;
	}

	@ApiModelProperty(example = "0.0", value = "Vencido de 120 a 179 días. Sólo con créditos abiertos.")
	public BigDecimal get179dias() {
		return _179dias;
	}

	public void set179dias(BigDecimal _179dias) {
		this._179dias = _179dias;
	}

	public CuentasFinancierasRespuesta _180MasDias(BigDecimal _180MasDias) {
		this._180MasDias = _180MasDias;
		return this;
	}

	@ApiModelProperty(example = "1500.0", value = "Vencido 180 días a más. Sólo con créditos abiertos.")
	public BigDecimal get180MasDias() {
		return _180MasDias;
	}

	public void set180MasDias(BigDecimal _180MasDias) {
		this._180MasDias = _180MasDias;
	}

	public CuentasFinancierasRespuesta actualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
		return this;
	}

	@ApiModelProperty(example = "1982-21", value = "Último periodo de actualización (sólo con créditos abiertos), en el formato especificado (por defecto yyyy-MM).")
	public String getActualizacion() {
		return actualizacion;
	}

	public void setActualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
	}

	public CuentasFinancierasRespuesta fechaCierre(String fechaCierre) {
		this.fechaCierre = fechaCierre;
		return this;
	}

	@ApiModelProperty(example = "2001-01-01", value = "Fecha de cierre del crédito (sólo con créditos cerrados), en el formato especificado (por defecto yyyy-MM-dd).")
	public String getFechaCierre() {
		return fechaCierre;
	}

	public void setFechaCierre(String fechaCierre) {
		this.fechaCierre = fechaCierre;
	}

	public CuentasFinancierasRespuesta pagoEfectivo(Float pagoEfectivo) {
		this.pagoEfectivo = pagoEfectivo;
		return this;
	}

	@ApiModelProperty(example = "5789.5", value = "Pago efectuado al cierre del crédito. Sólo con créditos cerrados.")
	public Float getPagoEfectivo() {
		return pagoEfectivo;
	}

	public void setPagoEfectivo(Float pagoEfectivo) {
		this.pagoEfectivo = pagoEfectivo;
	}

	public CuentasFinancierasRespuesta quita(Float quita) {
		this.quita = quita;
		return this;
	}

	@ApiModelProperty(example = "5000.0", value = "Monto de la quita. Solo con créditos cerrados.")
	public Float getQuita() {
		return quita;
	}

	public void setQuita(Float quita) {
		this.quita = quita;
	}

	public CuentasFinancierasRespuesta dacionPago(Float dacionPago) {
		this.dacionPago = dacionPago;
		return this;
	}

	@ApiModelProperty(example = "3000.0", value = "Monto de la dación. Solo con créditos cerrados.")
	public Float getDacionPago() {
		return dacionPago;
	}

	public void setDacionPago(Float dacionPago) {
		this.dacionPago = dacionPago;
	}

	public CuentasFinancierasRespuesta quebrantoCastigo(Float quebrantoCastigo) {
		this.quebrantoCastigo = quebrantoCastigo;
		return this;
	}

	@ApiModelProperty(example = "4000.0", value = "Monto del quebranto efectuado. Solo con créditos cerrados.")
	public Float getQuebrantoCastigo() {
		return quebrantoCastigo;
	}

	public void setQuebrantoCastigo(Float quebrantoCastigo) {
		this.quebrantoCastigo = quebrantoCastigo;
	}

	public CuentasFinancierasRespuesta historia(String historia) {
		this.historia = historia;
		return this;
	}

	@ApiModelProperty(example = "1", value = "Patrón histórico de pagos")
	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public CuentasFinancierasRespuesta atrasoMayor(Integer atrasoMayor) {
		this.atrasoMayor = atrasoMayor;
		return this;
	}

	@ApiModelProperty(example = "10", value = "Muestra la cantidad exacta de días de atraso cuando se reportan montos con vencimiento.")
	public Integer getAtrasoMayor() {
		return atrasoMayor;
	}

	public void setAtrasoMayor(Integer atrasoMayor) {
		this.atrasoMayor = atrasoMayor;
	}

	public CuentasFinancierasRespuesta registroImpugnado(String registroImpugnado) {
		this.registroImpugnado = registroImpugnado;
		return this;
	}

	@ApiModelProperty(example = "RI", value = "Si contiene RI, el registro está impugnado.")
	public String getRegistroImpugnado() {
		return registroImpugnado;
	}

	public void setRegistroImpugnado(String registroImpugnado) {
		this.registroImpugnado = registroImpugnado;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CuentasFinancierasRespuesta cuentasFinancierasRespuesta = (CuentasFinancierasRespuesta) o;
		return Objects.equals(this.RFC, cuentasFinancierasRespuesta.RFC)
				&& Objects.equals(this.nombreOtorgante, cuentasFinancierasRespuesta.nombreOtorgante)
				&& Objects.equals(this.contrato, cuentasFinancierasRespuesta.contrato)
				&& Objects.equals(this.saldoInicial, cuentasFinancierasRespuesta.saldoInicial)
				&& Objects.equals(this.saldoTotal, cuentasFinancierasRespuesta.saldoTotal)
				&& Objects.equals(this.moneda, cuentasFinancierasRespuesta.moneda)
				&& Objects.equals(this.fechaApertura, cuentasFinancierasRespuesta.fechaApertura)
				&& Objects.equals(this.plazo, cuentasFinancierasRespuesta.plazo)
				&& Objects.equals(this.clavesObservacion, cuentasFinancierasRespuesta.clavesObservacion)
				&& Objects.equals(this.tipoCredito, cuentasFinancierasRespuesta.tipoCredito)
				&& Objects.equals(this.vigente, cuentasFinancierasRespuesta.vigente)
				&& Objects.equals(this._29dias, cuentasFinancierasRespuesta._29dias)
				&& Objects.equals(this._59dias, cuentasFinancierasRespuesta._59dias)
				&& Objects.equals(this._89dias, cuentasFinancierasRespuesta._89dias)
				&& Objects.equals(this._119dias, cuentasFinancierasRespuesta._119dias)
				&& Objects.equals(this._179dias, cuentasFinancierasRespuesta._179dias)
				&& Objects.equals(this._180MasDias, cuentasFinancierasRespuesta._180MasDias)
				&& Objects.equals(this.actualizacion, cuentasFinancierasRespuesta.actualizacion)
				&& Objects.equals(this.fechaCierre, cuentasFinancierasRespuesta.fechaCierre)
				&& Objects.equals(this.pagoEfectivo, cuentasFinancierasRespuesta.pagoEfectivo)
				&& Objects.equals(this.quita, cuentasFinancierasRespuesta.quita)
				&& Objects.equals(this.dacionPago, cuentasFinancierasRespuesta.dacionPago)
				&& Objects.equals(this.quebrantoCastigo, cuentasFinancierasRespuesta.quebrantoCastigo)
				&& Objects.equals(this.historia, cuentasFinancierasRespuesta.historia)
				&& Objects.equals(this.atrasoMayor, cuentasFinancierasRespuesta.atrasoMayor)
				&& Objects.equals(this.registroImpugnado, cuentasFinancierasRespuesta.registroImpugnado);
	}

	@Override
	public int hashCode() {
		return Objects.hash(RFC, nombreOtorgante, contrato, saldoInicial, saldoTotal, moneda, fechaApertura, plazo,
				clavesObservacion, tipoCredito, vigente, _29dias, _59dias, _89dias, _119dias, _179dias, _180MasDias,
				actualizacion, fechaCierre, pagoEfectivo, quita, dacionPago, quebrantoCastigo, historia, atrasoMayor,
				registroImpugnado);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CuentasFinancierasRespuesta {\n");

		sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
		sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
		sb.append("    contrato: ").append(toIndentedString(contrato)).append("\n");
		sb.append("    saldoInicial: ").append(toIndentedString(saldoInicial)).append("\n");
		sb.append("    saldoTotal: ").append(toIndentedString(saldoTotal)).append("\n");
		sb.append("    moneda: ").append(toIndentedString(moneda)).append("\n");
		sb.append("    fechaApertura: ").append(toIndentedString(fechaApertura)).append("\n");
		sb.append("    plazo: ").append(toIndentedString(plazo)).append("\n");
		sb.append("    clavesObservacion: ").append(toIndentedString(clavesObservacion)).append("\n");
		sb.append("    tipoCredito: ").append(toIndentedString(tipoCredito)).append("\n");
		sb.append("    vigente: ").append(toIndentedString(vigente)).append("\n");
		sb.append("    _29dias: ").append(toIndentedString(_29dias)).append("\n");
		sb.append("    _59dias: ").append(toIndentedString(_59dias)).append("\n");
		sb.append("    _89dias: ").append(toIndentedString(_89dias)).append("\n");
		sb.append("    _119dias: ").append(toIndentedString(_119dias)).append("\n");
		sb.append("    _179dias: ").append(toIndentedString(_179dias)).append("\n");
		sb.append("    _180MasDias: ").append(toIndentedString(_180MasDias)).append("\n");
		sb.append("    actualizacion: ").append(toIndentedString(actualizacion)).append("\n");
		sb.append("    fechaCierre: ").append(toIndentedString(fechaCierre)).append("\n");
		sb.append("    pagoEfectivo: ").append(toIndentedString(pagoEfectivo)).append("\n");
		sb.append("    quita: ").append(toIndentedString(quita)).append("\n");
		sb.append("    dacionPago: ").append(toIndentedString(dacionPago)).append("\n");
		sb.append("    quebrantoCastigo: ").append(toIndentedString(quebrantoCastigo)).append("\n");
		sb.append("    historia: ").append(toIndentedString(historia)).append("\n");
		sb.append("    atrasoMayor: ").append(toIndentedString(atrasoMayor)).append("\n");
		sb.append("    registroImpugnado: ").append(toIndentedString(registroImpugnado)).append("\n");
		sb.append("}");
		return sb.toString();
	}

	private String toIndentedString(java.lang.Object o) {
		if (o == null) {
			return "null";
		}
		return o.toString().replace("\n", "\n    ");
	}
}
