package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoTipoMoneda;
import java.math.BigDecimal;

public class CuentasComercialesRespuesta {
	@SerializedName("RFC")
	private String RFC = null;
	@SerializedName("nombreOtorgante")
	private String nombreOtorgante = null;
	@SerializedName("moneda")
	private CatalogoTipoMoneda moneda = null;
	@SerializedName("vigente")
	private Float vigente = null;
	@SerializedName("saldoTotal")
	private Float saldoTotal = null;
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
	@SerializedName("historia")
	private String historia = null;
	@SerializedName("atrasoMayor")
	private Integer atrasoMayor = null;

	public CuentasComercialesRespuesta RFC(String RFC) {
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

	public CuentasComercialesRespuesta nombreOtorgante(String nombreOtorgante) {
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

	public CuentasComercialesRespuesta moneda(CatalogoTipoMoneda moneda) {
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

	public CuentasComercialesRespuesta vigente(Float vigente) {
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

	public CuentasComercialesRespuesta saldoTotal(Float saldoTotal) {
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

	public CuentasComercialesRespuesta _29dias(BigDecimal _29dias) {
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

	public CuentasComercialesRespuesta _59dias(BigDecimal _59dias) {
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

	public CuentasComercialesRespuesta _89dias(BigDecimal _89dias) {
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

	public CuentasComercialesRespuesta _119dias(BigDecimal _119dias) {
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

	public CuentasComercialesRespuesta _179dias(BigDecimal _179dias) {
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

	public CuentasComercialesRespuesta _180MasDias(BigDecimal _180MasDias) {
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

	public CuentasComercialesRespuesta actualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
		return this;
	}

	@ApiModelProperty(example = "1982-21", value = "Último periodo de actualización. Sólo con créditos abiertos), en el formato especificado (por defecto yyyy-MM).")
	public String getActualizacion() {
		return actualizacion;
	}

	public void setActualizacion(String actualizacion) {
		this.actualizacion = actualizacion;
	}

	public CuentasComercialesRespuesta historia(String historia) {
		this.historia = historia;
		return this;
	}

	@ApiModelProperty(example = "1", value = "Patrón histórico de pagos.")
	public String getHistoria() {
		return historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public CuentasComercialesRespuesta atrasoMayor(Integer atrasoMayor) {
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

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		CuentasComercialesRespuesta cuentasComercialesRespuesta = (CuentasComercialesRespuesta) o;
		return Objects.equals(this.RFC, cuentasComercialesRespuesta.RFC)
				&& Objects.equals(this.nombreOtorgante, cuentasComercialesRespuesta.nombreOtorgante)
				&& Objects.equals(this.moneda, cuentasComercialesRespuesta.moneda)
				&& Objects.equals(this.vigente, cuentasComercialesRespuesta.vigente)
				&& Objects.equals(this.saldoTotal, cuentasComercialesRespuesta.saldoTotal)
				&& Objects.equals(this._29dias, cuentasComercialesRespuesta._29dias)
				&& Objects.equals(this._59dias, cuentasComercialesRespuesta._59dias)
				&& Objects.equals(this._89dias, cuentasComercialesRespuesta._89dias)
				&& Objects.equals(this._119dias, cuentasComercialesRespuesta._119dias)
				&& Objects.equals(this._179dias, cuentasComercialesRespuesta._179dias)
				&& Objects.equals(this._180MasDias, cuentasComercialesRespuesta._180MasDias)
				&& Objects.equals(this.actualizacion, cuentasComercialesRespuesta.actualizacion)
				&& Objects.equals(this.historia, cuentasComercialesRespuesta.historia)
				&& Objects.equals(this.atrasoMayor, cuentasComercialesRespuesta.atrasoMayor);
	}

	@Override
	public int hashCode() {
		return Objects.hash(RFC, nombreOtorgante, moneda, vigente, saldoTotal, _29dias, _59dias, _89dias, _119dias,
				_179dias, _180MasDias, actualizacion, historia, atrasoMayor);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class CuentasComercialesRespuesta {\n");

		sb.append("    RFC: ").append(toIndentedString(RFC)).append("\n");
		sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
		sb.append("    moneda: ").append(toIndentedString(moneda)).append("\n");
		sb.append("    vigente: ").append(toIndentedString(vigente)).append("\n");
		sb.append("    saldoTotal: ").append(toIndentedString(saldoTotal)).append("\n");
		sb.append("    _29dias: ").append(toIndentedString(_29dias)).append("\n");
		sb.append("    _59dias: ").append(toIndentedString(_59dias)).append("\n");
		sb.append("    _89dias: ").append(toIndentedString(_89dias)).append("\n");
		sb.append("    _119dias: ").append(toIndentedString(_119dias)).append("\n");
		sb.append("    _179dias: ").append(toIndentedString(_179dias)).append("\n");
		sb.append("    _180MasDias: ").append(toIndentedString(_180MasDias)).append("\n");
		sb.append("    actualizacion: ").append(toIndentedString(actualizacion)).append("\n");
		sb.append("    historia: ").append(toIndentedString(historia)).append("\n");
		sb.append("    atrasoMayor: ").append(toIndentedString(atrasoMayor)).append("\n");
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
