package com.cdc.apihub.mx.RCCPM.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoClavesPrevencion.Adapter.class)
public enum CatalogoClavesPrevencion {

	_78("78"),

	_79("79"),

	_80("80"),

	_81("81"),

	_82("82"),

	_83("83"),

	_84("84"),

	_85("85"),

	_86("86"),

	_87("87"),

	_88("88"),

	_92("92");
	private String value;

	CatalogoClavesPrevencion(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoClavesPrevencion fromValue(String text) {
		for (CatalogoClavesPrevencion b : CatalogoClavesPrevencion.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoClavesPrevencion> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoClavesPrevencion enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoClavesPrevencion read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoClavesPrevencion.fromValue(String.valueOf(value));
		}
	}
}
