package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoPais;

public class PersonaAccionistasDomicilio {
	@SerializedName("direccion")
	private String direccion = null;
	@SerializedName("coloniaPoblacion")
	private String coloniaPoblacion = null;
	@SerializedName("delegacionMunicipio")
	private String delegacionMunicipio = null;
	@SerializedName("ciudad")
	private String ciudad = null;
	@SerializedName("estado")
	private String estado = null;
	@SerializedName("CP")
	private String CP = null;
	@SerializedName("pais")
	private CatalogoPais pais = null;
	@SerializedName("telefono")
	private String telefono = null;
	@SerializedName("extension")
	private String extension = null;
	@SerializedName("fax")
	private String fax = null;

	public PersonaAccionistasDomicilio direccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	@ApiModelProperty(example = "RIO POTOMAC 144", value = "Campo de dirección en que se ubica el domicilio.")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public PersonaAccionistasDomicilio coloniaPoblacion(String coloniaPoblacion) {
		this.coloniaPoblacion = coloniaPoblacion;
		return this;
	}

	@ApiModelProperty(example = "FLUVIAL VALLARTA", value = "Colonia o población en que se ubica el domicilio.")
	public String getColoniaPoblacion() {
		return coloniaPoblacion;
	}

	public void setColoniaPoblacion(String coloniaPoblacion) {
		this.coloniaPoblacion = coloniaPoblacion;
	}

	public PersonaAccionistasDomicilio delegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
		return this;
	}

	@ApiModelProperty(example = "PUERTO VALLARTA", value = "Delegacion o municipio en que se ubica el domicilio.")
	public String getDelegacionMunicipio() {
		return delegacionMunicipio;
	}

	public void setDelegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
	}

	public PersonaAccionistasDomicilio ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	@ApiModelProperty(example = "PUERTO VALLARTA", value = "Ciudad en que se ubica el domicilio.")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public PersonaAccionistasDomicilio estado(String estado) {
		this.estado = estado;
		return this;
	}

	@ApiModelProperty(example = "JAL", value = "Estado en que se ubica el domicilio.")
	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public PersonaAccionistasDomicilio CP(String CP) {
		this.CP = CP;
		return this;
	}

	@ApiModelProperty(example = "48312", value = "Para domicilios en México se validará la correcta correspondencia del código postal contra el estado ingresado. En el caso de domicilios en el extranjero debe reportarse un dato válido. No rellenar espacio.")
	public String getCP() {
		return CP;
	}

	public void setCP(String CP) {
		this.CP = CP;
	}

	public PersonaAccionistasDomicilio pais(CatalogoPais pais) {
		this.pais = pais;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoPais getPais() {
		return pais;
	}

	public void setPais(CatalogoPais pais) {
		this.pais = pais;
	}

	public PersonaAccionistasDomicilio telefono(String telefono) {
		this.telefono = telefono;
		return this;
	}

	@ApiModelProperty(example = "5555555555", value = "Número de Teléfono.")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public PersonaAccionistasDomicilio extension(String extension) {
		this.extension = extension;
		return this;
	}

	@ApiModelProperty(example = "555555", value = "Número de Extensión.")
	public String getExtension() {
		return extension;
	}

	public void setExtension(String extension) {
		this.extension = extension;
	}

	public PersonaAccionistasDomicilio fax(String fax) {
		this.fax = fax;
		return this;
	}

	@ApiModelProperty(example = "5555555555", value = "Número de Fax.")
	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		PersonaAccionistasDomicilio personaAccionistasDomicilio = (PersonaAccionistasDomicilio) o;
		return Objects.equals(this.direccion, personaAccionistasDomicilio.direccion)
				&& Objects.equals(this.coloniaPoblacion, personaAccionistasDomicilio.coloniaPoblacion)
				&& Objects.equals(this.delegacionMunicipio, personaAccionistasDomicilio.delegacionMunicipio)
				&& Objects.equals(this.ciudad, personaAccionistasDomicilio.ciudad)
				&& Objects.equals(this.estado, personaAccionistasDomicilio.estado)
				&& Objects.equals(this.CP, personaAccionistasDomicilio.CP)
				&& Objects.equals(this.pais, personaAccionistasDomicilio.pais)
				&& Objects.equals(this.telefono, personaAccionistasDomicilio.telefono)
				&& Objects.equals(this.extension, personaAccionistasDomicilio.extension)
				&& Objects.equals(this.fax, personaAccionistasDomicilio.fax);
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, pais, telefono,
				extension, fax);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonaAccionistasDomicilio {\n");

		sb.append("    direccion: ").append(toIndentedString(direccion)).append("\n");
		sb.append("    coloniaPoblacion: ").append(toIndentedString(coloniaPoblacion)).append("\n");
		sb.append("    delegacionMunicipio: ").append(toIndentedString(delegacionMunicipio)).append("\n");
		sb.append("    ciudad: ").append(toIndentedString(ciudad)).append("\n");
		sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
		sb.append("    CP: ").append(toIndentedString(CP)).append("\n");
		sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
		sb.append("    telefono: ").append(toIndentedString(telefono)).append("\n");
		sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
		sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
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
