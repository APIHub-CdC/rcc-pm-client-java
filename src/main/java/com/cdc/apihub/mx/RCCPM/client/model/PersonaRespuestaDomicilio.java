package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoEstados;
import com.cdc.apihub.mx.RCCPM.client.model.CatalogoPais;

public class PersonaRespuestaDomicilio {
	@SerializedName("direccion")
	private String direccion = null;
	@SerializedName("coloniaPoblacion")
	private String coloniaPoblacion = null;
	@SerializedName("delegacionMunicipio")
	private String delegacionMunicipio = null;
	@SerializedName("ciudad")
	private String ciudad = null;
	@SerializedName("estado")
	private CatalogoEstados estado = null;
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

	public PersonaRespuestaDomicilio direccion(String direccion) {
		this.direccion = direccion;
		return this;
	}

	@ApiModelProperty(example = "CALLE INDUSTRIA ZAPATERA   66", value = "Campo de dirección en que se ubica el domicilio.")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public PersonaRespuestaDomicilio coloniaPoblacion(String coloniaPoblacion) {
		this.coloniaPoblacion = coloniaPoblacion;
		return this;
	}

	@ApiModelProperty(example = "DESARROLLO ZAPOPAN NORTE", value = "Colonia en que se ubica el domicilio.")
	public String getColoniaPoblacion() {
		return coloniaPoblacion;
	}

	public void setColoniaPoblacion(String coloniaPoblacion) {
		this.coloniaPoblacion = coloniaPoblacion;
	}

	public PersonaRespuestaDomicilio delegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
		return this;
	}

	@ApiModelProperty(example = "DEL VALLE", value = "Colonia o municipio en que se ubica el domicilio.")
	public String getDelegacionMunicipio() {
		return delegacionMunicipio;
	}

	public void setDelegacionMunicipio(String delegacionMunicipio) {
		this.delegacionMunicipio = delegacionMunicipio;
	}

	public PersonaRespuestaDomicilio ciudad(String ciudad) {
		this.ciudad = ciudad;
		return this;
	}

	@ApiModelProperty(example = "MEXICO DF", value = "Ciudad en que se ubica el domicilio.")
	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	public PersonaRespuestaDomicilio estado(CatalogoEstados estado) {
		this.estado = estado;
		return this;
	}

	@ApiModelProperty(value = "")
	public CatalogoEstados getEstado() {
		return estado;
	}

	public void setEstado(CatalogoEstados estado) {
		this.estado = estado;
	}

	public PersonaRespuestaDomicilio CP(String CP) {
		this.CP = CP;
		return this;
	}

	@ApiModelProperty(example = "03100", value = "Para domicilios en México se validará la correcta correspondencia del código postal contra el estado ingresado. En el caso de domicilios en el extranjero debe reportarse un dato válido. No rellenar espacio.")
	public String getCP() {
		return CP;
	}

	public void setCP(String CP) {
		this.CP = CP;
	}

	public PersonaRespuestaDomicilio pais(CatalogoPais pais) {
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

	public PersonaRespuestaDomicilio telefono(String telefono) {
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

	public PersonaRespuestaDomicilio extension(String extension) {
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

	public PersonaRespuestaDomicilio fax(String fax) {
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
		PersonaRespuestaDomicilio personaRespuestaDomicilio = (PersonaRespuestaDomicilio) o;
		return Objects.equals(this.direccion, personaRespuestaDomicilio.direccion)
				&& Objects.equals(this.coloniaPoblacion, personaRespuestaDomicilio.coloniaPoblacion)
				&& Objects.equals(this.delegacionMunicipio, personaRespuestaDomicilio.delegacionMunicipio)
				&& Objects.equals(this.ciudad, personaRespuestaDomicilio.ciudad)
				&& Objects.equals(this.estado, personaRespuestaDomicilio.estado)
				&& Objects.equals(this.CP, personaRespuestaDomicilio.CP)
				&& Objects.equals(this.pais, personaRespuestaDomicilio.pais)
				&& Objects.equals(this.telefono, personaRespuestaDomicilio.telefono)
				&& Objects.equals(this.extension, personaRespuestaDomicilio.extension)
				&& Objects.equals(this.fax, personaRespuestaDomicilio.fax);
	}

	@Override
	public int hashCode() {
		return Objects.hash(direccion, coloniaPoblacion, delegacionMunicipio, ciudad, estado, CP, pais, telefono,
				extension, fax);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class PersonaRespuestaDomicilio {\n");

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
