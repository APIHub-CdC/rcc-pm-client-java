package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.Consultas;
import com.cdc.apihub.mx.RCCPM.client.model.ConsultasComerciales;
import com.cdc.apihub.mx.RCCPM.client.model.ConsultasFinancieras;

public class ReporteRespuestaConsultasInstitucionales {
	@SerializedName("comerciales")
	private ConsultasComerciales comerciales = null;
	@SerializedName("financieras")
	private ConsultasFinancieras financieras = null;
	@SerializedName("consultas")
	private Consultas consultas = null;

	public ReporteRespuestaConsultasInstitucionales comerciales(ConsultasComerciales comerciales) {
		this.comerciales = comerciales;
		return this;
	}

	@ApiModelProperty(value = "")
	public ConsultasComerciales getComerciales() {
		return comerciales;
	}

	public void setComerciales(ConsultasComerciales comerciales) {
		this.comerciales = comerciales;
	}

	public ReporteRespuestaConsultasInstitucionales financieras(ConsultasFinancieras financieras) {
		this.financieras = financieras;
		return this;
	}

	@ApiModelProperty(value = "")
	public ConsultasFinancieras getFinancieras() {
		return financieras;
	}

	public void setFinancieras(ConsultasFinancieras financieras) {
		this.financieras = financieras;
	}

	public ReporteRespuestaConsultasInstitucionales consultas(Consultas consultas) {
		this.consultas = consultas;
		return this;
	}

	@ApiModelProperty(value = "")
	public Consultas getConsultas() {
		return consultas;
	}

	public void setConsultas(Consultas consultas) {
		this.consultas = consultas;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReporteRespuestaConsultasInstitucionales reporteRespuestaConsultasInstitucionales = (ReporteRespuestaConsultasInstitucionales) o;
		return Objects.equals(this.comerciales, reporteRespuestaConsultasInstitucionales.comerciales)
				&& Objects.equals(this.financieras, reporteRespuestaConsultasInstitucionales.financieras)
				&& Objects.equals(this.consultas, reporteRespuestaConsultasInstitucionales.consultas);
	}

	@Override
	public int hashCode() {
		return Objects.hash(comerciales, financieras, consultas);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReporteRespuestaConsultasInstitucionales {\n");

		sb.append("    comerciales: ").append(toIndentedString(comerciales)).append("\n");
		sb.append("    financieras: ").append(toIndentedString(financieras)).append("\n");
		sb.append("    consultas: ").append(toIndentedString(consultas)).append("\n");
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
