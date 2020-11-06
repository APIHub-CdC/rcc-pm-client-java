package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CalificacionCarteraRespuesta;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoClaveRetorno;
import com.cdc.apihub.mx.RCCPM.client.model.ClavePrevencionesRespuesta;
import com.cdc.apihub.mx.RCCPM.client.model.ClavesBanxico;
import com.cdc.apihub.mx.RCCPM.client.model.DeclarativasRespuesta;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaAccionistas;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaAvales;
import com.cdc.apihub.mx.RCCPM.client.model.PersonaRespuesta;
import com.cdc.apihub.mx.RCCPM.client.model.ReporteRespuestaConsultasInstitucionales;
import com.cdc.apihub.mx.RCCPM.client.model.ReporteRespuestaCredito;
import java.util.ArrayList;
import java.util.List;

public class ReporteRespuesta {
	@SerializedName("folioConsulta")
	private String folioConsulta = null;
	@SerializedName("folioOtorgante")
	private String folioOtorgante = null;
	@SerializedName("claveRetorno")
	private CatalogoClaveRetorno claveRetorno = null;
	@SerializedName("fechaConsulta")
	private String fechaConsulta = null;
	@SerializedName("persona")
	private PersonaRespuesta persona = null;
	@SerializedName("clavesBanxico")
	private ClavesBanxico clavesBanxico = null;
	@SerializedName("calificacionCartera")
	private List<CalificacionCarteraRespuesta> calificacionCartera = null;
	@SerializedName("clavePrevenciones")
	private List<ClavePrevencionesRespuesta> clavePrevenciones = null;
	@SerializedName("consultasInstitucionales")
	private ReporteRespuestaConsultasInstitucionales consultasInstitucionales = null;
	@SerializedName("declarativas")
	private List<DeclarativasRespuesta> declarativas = null;
	@SerializedName("accionistas")
	private List<PersonaAccionistas> accionistas = null;
	@SerializedName("avales")
	private List<PersonaAvales> avales = null;
	@SerializedName("credito")
	private ReporteRespuestaCredito credito = null;

	public ReporteRespuesta folioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
		return this;
	}

	@ApiModelProperty(example = "1984548323", value = "Número de folio de transacción asignado por Círculo de Crédito")
	public String getFolioConsulta() {
		return folioConsulta;
	}

	public void setFolioConsulta(String folioConsulta) {
		this.folioConsulta = folioConsulta;
	}

	public ReporteRespuesta folioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
		return this;
	}

	@ApiModelProperty(example = "7632", value = "Identificador de la consulta para verificaciones adicionales")
	public String getFolioOtorgante() {
		return folioOtorgante;
	}

	public void setFolioOtorgante(String folioOtorgante) {
		this.folioOtorgante = folioOtorgante;
	}

	public ReporteRespuesta claveRetorno(CatalogoClaveRetorno claveRetorno) {
		this.claveRetorno = claveRetorno;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoClaveRetorno getClaveRetorno() {
		return claveRetorno;
	}

	public void setClaveRetorno(CatalogoClaveRetorno claveRetorno) {
		this.claveRetorno = claveRetorno;
	}

	public ReporteRespuesta fechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
		return this;
	}

	@ApiModelProperty(example = "2004-09-24", value = "Fecha de la consulta")
	public String getFechaConsulta() {
		return fechaConsulta;
	}

	public void setFechaConsulta(String fechaConsulta) {
		this.fechaConsulta = fechaConsulta;
	}

	public ReporteRespuesta persona(PersonaRespuesta persona) {
		this.persona = persona;
		return this;
	}

	@ApiModelProperty(value = "")
	public PersonaRespuesta getPersona() {
		return persona;
	}

	public void setPersona(PersonaRespuesta persona) {
		this.persona = persona;
	}

	public ReporteRespuesta clavesBanxico(ClavesBanxico clavesBanxico) {
		this.clavesBanxico = clavesBanxico;
		return this;
	}

	@ApiModelProperty(value = "")
	public ClavesBanxico getClavesBanxico() {
		return clavesBanxico;
	}

	public void setClavesBanxico(ClavesBanxico clavesBanxico) {
		this.clavesBanxico = clavesBanxico;
	}

	public ReporteRespuesta calificacionCartera(List<CalificacionCarteraRespuesta> calificacionCartera) {
		this.calificacionCartera = calificacionCartera;
		return this;
	}

	public ReporteRespuesta addCalificacionCarteraItem(CalificacionCarteraRespuesta calificacionCarteraItem) {
		if (this.calificacionCartera == null) {
			this.calificacionCartera = new ArrayList<CalificacionCarteraRespuesta>();
		}
		this.calificacionCartera.add(calificacionCarteraItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<CalificacionCarteraRespuesta> getCalificacionCartera() {
		return calificacionCartera;
	}

	public void setCalificacionCartera(List<CalificacionCarteraRespuesta> calificacionCartera) {
		this.calificacionCartera = calificacionCartera;
	}

	public ReporteRespuesta clavePrevenciones(List<ClavePrevencionesRespuesta> clavePrevenciones) {
		this.clavePrevenciones = clavePrevenciones;
		return this;
	}

	public ReporteRespuesta addClavePrevencionesItem(ClavePrevencionesRespuesta clavePrevencionesItem) {
		if (this.clavePrevenciones == null) {
			this.clavePrevenciones = new ArrayList<ClavePrevencionesRespuesta>();
		}
		this.clavePrevenciones.add(clavePrevencionesItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<ClavePrevencionesRespuesta> getClavePrevenciones() {
		return clavePrevenciones;
	}

	public void setClavePrevenciones(List<ClavePrevencionesRespuesta> clavePrevenciones) {
		this.clavePrevenciones = clavePrevenciones;
	}

	public ReporteRespuesta consultasInstitucionales(
			ReporteRespuestaConsultasInstitucionales consultasInstitucionales) {
		this.consultasInstitucionales = consultasInstitucionales;
		return this;
	}

	@ApiModelProperty(value = "")
	public ReporteRespuestaConsultasInstitucionales getConsultasInstitucionales() {
		return consultasInstitucionales;
	}

	public void setConsultasInstitucionales(ReporteRespuestaConsultasInstitucionales consultasInstitucionales) {
		this.consultasInstitucionales = consultasInstitucionales;
	}

	public ReporteRespuesta declarativas(List<DeclarativasRespuesta> declarativas) {
		this.declarativas = declarativas;
		return this;
	}

	public ReporteRespuesta addDeclarativasItem(DeclarativasRespuesta declarativasItem) {
		if (this.declarativas == null) {
			this.declarativas = new ArrayList<DeclarativasRespuesta>();
		}
		this.declarativas.add(declarativasItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<DeclarativasRespuesta> getDeclarativas() {
		return declarativas;
	}

	public void setDeclarativas(List<DeclarativasRespuesta> declarativas) {
		this.declarativas = declarativas;
	}

	public ReporteRespuesta accionistas(List<PersonaAccionistas> accionistas) {
		this.accionistas = accionistas;
		return this;
	}

	public ReporteRespuesta addAccionistasItem(PersonaAccionistas accionistasItem) {
		if (this.accionistas == null) {
			this.accionistas = new ArrayList<PersonaAccionistas>();
		}
		this.accionistas.add(accionistasItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<PersonaAccionistas> getAccionistas() {
		return accionistas;
	}

	public void setAccionistas(List<PersonaAccionistas> accionistas) {
		this.accionistas = accionistas;
	}

	public ReporteRespuesta avales(List<PersonaAvales> avales) {
		this.avales = avales;
		return this;
	}

	public ReporteRespuesta addAvalesItem(PersonaAvales avalesItem) {
		if (this.avales == null) {
			this.avales = new ArrayList<PersonaAvales>();
		}
		this.avales.add(avalesItem);
		return this;
	}

	@ApiModelProperty(value = "")
	public List<PersonaAvales> getAvales() {
		return avales;
	}

	public void setAvales(List<PersonaAvales> avales) {
		this.avales = avales;
	}

	public ReporteRespuesta credito(ReporteRespuestaCredito credito) {
		this.credito = credito;
		return this;
	}

	@ApiModelProperty(value = "")
	public ReporteRespuestaCredito getCredito() {
		return credito;
	}

	public void setCredito(ReporteRespuestaCredito credito) {
		this.credito = credito;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ReporteRespuesta reporteRespuesta = (ReporteRespuesta) o;
		return Objects.equals(this.folioConsulta, reporteRespuesta.folioConsulta)
				&& Objects.equals(this.folioOtorgante, reporteRespuesta.folioOtorgante)
				&& Objects.equals(this.claveRetorno, reporteRespuesta.claveRetorno)
				&& Objects.equals(this.fechaConsulta, reporteRespuesta.fechaConsulta)
				&& Objects.equals(this.persona, reporteRespuesta.persona)
				&& Objects.equals(this.clavesBanxico, reporteRespuesta.clavesBanxico)
				&& Objects.equals(this.calificacionCartera, reporteRespuesta.calificacionCartera)
				&& Objects.equals(this.clavePrevenciones, reporteRespuesta.clavePrevenciones)
				&& Objects.equals(this.consultasInstitucionales, reporteRespuesta.consultasInstitucionales)
				&& Objects.equals(this.declarativas, reporteRespuesta.declarativas)
				&& Objects.equals(this.accionistas, reporteRespuesta.accionistas)
				&& Objects.equals(this.avales, reporteRespuesta.avales)
				&& Objects.equals(this.credito, reporteRespuesta.credito);
	}

	@Override
	public int hashCode() {
		return Objects.hash(folioConsulta, folioOtorgante, claveRetorno, fechaConsulta, persona, clavesBanxico,
				calificacionCartera, clavePrevenciones, consultasInstitucionales, declarativas, accionistas, avales,
				credito);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ReporteRespuesta {\n");

		sb.append("    folioConsulta: ").append(toIndentedString(folioConsulta)).append("\n");
		sb.append("    folioOtorgante: ").append(toIndentedString(folioOtorgante)).append("\n");
		sb.append("    claveRetorno: ").append(toIndentedString(claveRetorno)).append("\n");
		sb.append("    fechaConsulta: ").append(toIndentedString(fechaConsulta)).append("\n");
		sb.append("    persona: ").append(toIndentedString(persona)).append("\n");
		sb.append("    clavesBanxico: ").append(toIndentedString(clavesBanxico)).append("\n");
		sb.append("    calificacionCartera: ").append(toIndentedString(calificacionCartera)).append("\n");
		sb.append("    clavePrevenciones: ").append(toIndentedString(clavePrevenciones)).append("\n");
		sb.append("    consultasInstitucionales: ").append(toIndentedString(consultasInstitucionales)).append("\n");
		sb.append("    declarativas: ").append(toIndentedString(declarativas)).append("\n");
		sb.append("    accionistas: ").append(toIndentedString(accionistas)).append("\n");
		sb.append("    avales: ").append(toIndentedString(avales)).append("\n");
		sb.append("    credito: ").append(toIndentedString(credito)).append("\n");
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
