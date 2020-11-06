package com.cdc.apihub.mx.RCCPM.client.model;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

@JsonAdapter(CatalogoTipoMoneda.Adapter.class)
public enum CatalogoTipoMoneda {

	_001("001"),

	_002("002"),

	_003("003"),

	_004("004"),

	_005("005"),

	_006("006"),

	_007("007"),

	_008("008"),

	_009("009"),

	_010("010"),

	_011("011"),

	_013("013"),

	_014("014"),

	_016("016"),

	_020("020"),

	_022("022"),

	_023("023"),

	_024("024"),

	_025("025"),

	_027("027"),

	_029("029"),

	_030("030"),

	_033("033"),

	_034("034"),

	_035("035"),

	_037("037"),

	_039("039"),

	_040("040"),

	_043("043"),

	_044("044"),

	_045("045"),

	_048("048"),

	_049("049"),

	_053("053"),

	_054("054"),

	_055("055"),

	_056("056"),

	_058("058"),

	_059("059"),

	_061("061"),

	_062("062"),

	_063("063"),

	_065("065"),

	_066("066"),

	_068("068"),

	_070("070"),

	_073("073"),

	_074("074"),

	_075("075"),

	_084("084"),

	_085("085"),

	_086("086"),

	_087("087"),

	_088("088"),

	_090("090"),

	_091("091"),

	_092("092"),

	_093("093"),

	_095("095"),

	_096("096"),

	_097("097"),

	_098("098"),

	_100("100"),

	_102("102"),

	_103("103"),

	_104("104"),

	_105("105"),

	_106("106"),

	_107("107"),

	_108("108"),

	_109("109"),

	_110("110"),

	_112("112"),

	_113("113"),

	_114("114"),

	_115("115"),

	_116("116"),

	_118("118"),

	_120("120"),

	_121("121"),

	_122("122"),

	_123("123"),

	_124("124"),

	_125("125"),

	_126("126"),

	_127("127"),

	_128("128"),

	_129("129"),

	_130("130"),

	_131("131"),

	_132("132"),

	_133("133"),

	_134("134"),

	_135("135"),

	_136("136"),

	_138("138"),

	_140("140"),

	_141("141"),

	_142("142"),

	_143("143"),

	_145("145"),

	_147("147"),

	_149("149"),

	_151("151"),

	_152("152"),

	_153("153"),

	_154("154"),

	_155("155"),

	_156("156"),

	_157("157"),

	_158("158"),

	_160("160"),

	_161("161"),

	_162("162"),

	_165("165"),

	_166("166"),

	_167("167"),

	_168("168"),

	_171("171"),

	_174("174"),

	_175("175"),

	_177("177"),

	_179("179"),

	_180("180"),

	_182("182"),

	_183("183"),

	_184("184"),

	_185("185"),

	_186("186"),

	_187("187"),

	_188("188"),

	_190("190"),

	_191("191"),

	_192("192"),

	_193("193"),

	_194("194"),

	_195("195"),

	_196("196"),

	_198("198"),

	_201("201"),

	_206("206"),

	_207("207"),

	_208("208"),

	_210("210"),

	_211("211"),

	_212("212"),

	_213("213"),

	_215("215"),

	_216("216"),

	_217("217"),

	_218("218");
	private String value;

	CatalogoTipoMoneda(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return String.valueOf(value);
	}

	public static CatalogoTipoMoneda fromValue(String text) {
		for (CatalogoTipoMoneda b : CatalogoTipoMoneda.values()) {
			if (String.valueOf(b.value).equals(text)) {
				return b;
			}
		}
		return null;
	}

	public static class Adapter extends TypeAdapter<CatalogoTipoMoneda> {
		@Override
		public void write(final JsonWriter jsonWriter, final CatalogoTipoMoneda enumeration) throws IOException {
			jsonWriter.value(enumeration.getValue());
		}

		@Override
		public CatalogoTipoMoneda read(final JsonReader jsonReader) throws IOException {
			String value = jsonReader.nextString();
			return CatalogoTipoMoneda.fromValue(String.valueOf(value));
		}
	}
}
