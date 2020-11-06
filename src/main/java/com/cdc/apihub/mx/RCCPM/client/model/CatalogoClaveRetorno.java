package com.cdc.apihub.mx.RCCPM.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoClaveRetorno.Adapter.class)
public enum CatalogoClaveRetorno {

	_0("0"),

	_1("1"),

	_2("2"),

	_3("3");
	private String value;

	CatalogoClaveRetorno(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoClaveRetorno fromValue(String text) {
		for (CatalogoClaveRetorno b : CatalogoClaveRetorno.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoClaveRetorno> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoClaveRetorno enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoClaveRetorno read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoClaveRetorno.fromValue(String.valueOf(value));
		}
	}
}
