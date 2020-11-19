package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoClavesPrevencion;

public class ClavePrevencionesRespuesta {
	@SerializedName("nombreOtorgante")
	private String nombreOtorgante = null;
	@SerializedName("fechaReporte")
	private String fechaReporte = null;
	@SerializedName("numeroContrato")
	private String numeroContrato = null;
	@SerializedName("clavePrevencion")
	private CatalogoClavesPrevencion clavePrevencion = null;

	public ClavePrevencionesRespuesta nombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
		return this;
	}

	@ApiModelProperty(example = "ADMINISTRACION CARTERA", value = "Nombre del otorgante.")
	public String getNombreOtorgante() {
		return nombreOtorgante;
	}

	public void setNombreOtorgante(String nombreOtorgante) {
		this.nombreOtorgante = nombreOtorgante;
	}

	public ClavePrevencionesRespuesta fechaReporte(String fechaReporte) {
		this.fechaReporte = fechaReporte;
		return this;
	}

	@ApiModelProperty(example = "2016-02-19", value = "Fecha reporte, en el formato especificado (por defecto yyyy-MM-dd).")
	public String getFechaReporte() {
		return fechaReporte;
	}

	public void setFechaReporte(String fechaReporte) {
		this.fechaReporte = fechaReporte;
	}

	public ClavePrevencionesRespuesta numeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
		return this;
	}

	@ApiModelProperty(example = "9484697777", value = "Número de contrato.")
	public String getNumeroContrato() {
		return numeroContrato;
	}

	public void setNumeroContrato(String numeroContrato) {
		this.numeroContrato = numeroContrato;
	}

	public ClavePrevencionesRespuesta clavePrevencion(CatalogoClavesPrevencion clavePrevencion) {
		this.clavePrevencion = clavePrevencion;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoClavesPrevencion getClavePrevencion() {
		return clavePrevencion;
	}

	public void setClavePrevencion(CatalogoClavesPrevencion clavePrevencion) {
		this.clavePrevencion = clavePrevencion;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClavePrevencionesRespuesta clavePrevencionesRespuesta = (ClavePrevencionesRespuesta) o;
		return Objects.equals(this.nombreOtorgante, clavePrevencionesRespuesta.nombreOtorgante)
				&& Objects.equals(this.fechaReporte, clavePrevencionesRespuesta.fechaReporte)
				&& Objects.equals(this.numeroContrato, clavePrevencionesRespuesta.numeroContrato)
				&& Objects.equals(this.clavePrevencion, clavePrevencionesRespuesta.clavePrevencion);
	}

	@Override
	public int hashCode() {
		return Objects.hash(nombreOtorgante, fechaReporte, numeroContrato, clavePrevencion);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClavePrevencionesRespuesta {\n");

		sb.append("    nombreOtorgante: ").append(toIndentedString(nombreOtorgante)).append("\n");
		sb.append("    fechaReporte: ").append(toIndentedString(fechaReporte)).append("\n");
		sb.append("    numeroContrato: ").append(toIndentedString(numeroContrato)).append("\n");
		sb.append("    clavePrevencion: ").append(toIndentedString(clavePrevencion)).append("\n");
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
