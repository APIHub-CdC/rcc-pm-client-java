package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CuentasComercialesRespuesta;
import com.cdc.apihub.mx.RCCPM.client.model.CuentasFinancierasRespuesta;
import java.util.ArrayList;
import java.util.List;

public class ReporteRespuestaCredito {
	@SerializedName("cuentasFinancieras")
	private List<CuentasFinancierasRespuesta> cuentasFinancieras = null;
	@SerializedName("cuentasComerciales")
	private List<CuentasComercialesRespuesta> cuentasComerciales = null;

	public ReporteRespuestaCredito cuentasFinancieras(List<CuentasFinancierasRespuesta> cuentasFinancieras) {
		this.cuentasFinancieras = cuentasFinancieras;
		return this;
	}

	public ReporteRespuestaCredito addCuentasFinancierasItem(CuentasFinancierasRespuesta cuentasFinancierasItem) {
		if (this.cuentasFinancieras == null) {
			this.cuentasFinancieras = new ArrayList<CuentasFinancierasRespuesta>();
		}
		this.cuentasFinancieras.add(cuentasFinancierasItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<CuentasFinancierasRespuesta> getCuentasFinancieras() {
		return cuentasFinancieras;
	}

	public void setCuentasFinancieras(List<CuentasFinancierasRespuesta> cuentasFinancieras) {
		this.cuentasFinancieras = cuentasFinancieras;
	}

	public ReporteRespuestaCredito cuentasComerciales(List<CuentasComercialesRespuesta> cuentasComerciales) {
		this.cuentasComerciales = cuentasComerciales;
		return this;
	}

	public ReporteRespuestaCredito addCuentasComercialesItem(CuentasComercialesRespuesta cuentasComercialesItem) {
		if (this.cuentasComerciales == null) {
			this.cuentasComerciales = new ArrayList<CuentasComercialesRespuesta>();
		}
		this.cuentasComerciales.add(cuentasComercialesItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<CuentasComercialesRespuesta> getCuentasComerciales() {
		return cuentasComerciales;
	}

	public void setCuentasComerciales(List<CuentasComercialesRespuesta> cuentasComerciales) {
		this.cuentasComerciales = cuentasComerciales;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReporteRespuestaCredito reporteRespuestaCredito = (ReporteRespuestaCredito) o;
		return Objects.equals(this.cuentasFinancieras, reporteRespuestaCredito.cuentasFinancieras)
				&& Objects.equals(this.cuentasComerciales, reporteRespuestaCredito.cuentasComerciales);
	}

	@Override
	public int hashCode() {
		return Objects.hash(cuentasFinancieras, cuentasComerciales);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReporteRespuestaCredito {\n");

		sb.append("    cuentasFinancieras: ").append(toIndentedString(cuentasFinancieras)).append("\n");
		sb.append("    cuentasComerciales: ").append(toIndentedString(cuentasComerciales)).append("\n");
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
