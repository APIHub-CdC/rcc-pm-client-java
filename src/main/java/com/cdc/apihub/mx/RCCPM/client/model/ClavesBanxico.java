package com.cdc.apihub.mx.RCCPM.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;

public class ClavesBanxico {
	@SerializedName("claveBanxico1")
	private String claveBanxico1 = null;
	@SerializedName("claveBanxico2")
	private String claveBanxico2 = null;
	@SerializedName("claveBanxico3")
	private String claveBanxico3 = null;

	public ClavesBanxico claveBanxico1(String claveBanxico1) {
		this.claveBanxico1 = claveBanxico1;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getClaveBanxico1() {
		return claveBanxico1;
	}

	public void setClaveBanxico1(String claveBanxico1) {
		this.claveBanxico1 = claveBanxico1;
	}

	public ClavesBanxico claveBanxico2(String claveBanxico2) {
		this.claveBanxico2 = claveBanxico2;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getClaveBanxico2() {
		return claveBanxico2;
	}

	public void setClaveBanxico2(String claveBanxico2) {
		this.claveBanxico2 = claveBanxico2;
	}

	public ClavesBanxico claveBanxico3(String claveBanxico3) {
		this.claveBanxico3 = claveBanxico3;
		return this;
	}

	@ApiModelProperty(value = "")
	public String getClaveBanxico3() {
		return claveBanxico3;
	}

	public void setClaveBanxico3(String claveBanxico3) {
		this.claveBanxico3 = claveBanxico3;
	}

	@Override
	public boolean equals(java.lang.Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		ClavesBanxico clavesBanxico = (ClavesBanxico) o;
		return Objects.equals(this.claveBanxico1, clavesBanxico.claveBanxico1)
				&& Objects.equals(this.claveBanxico2, clavesBanxico.claveBanxico2)
				&& Objects.equals(this.claveBanxico3, clavesBanxico.claveBanxico3);
	}

	@Override
	public int hashCode() {
		return Objects.hash(claveBanxico1, claveBanxico2, claveBanxico3);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("class ClavesBanxico {\n");

		sb.append("    claveBanxico1: ").append(toIndentedString(claveBanxico1)).append("\n");
		sb.append("    claveBanxico2: ").append(toIndentedString(claveBanxico2)).append("\n");
		sb.append("    claveBanxico3: ").append(toIndentedString(claveBanxico3)).append("\n");
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
