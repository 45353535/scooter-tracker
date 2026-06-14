package net.pubnative.lite.sdk.utils.svgparser.utils;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class CSSFontVariationSettings {
    private static final String NORMAL = "normal";
    static final String VARIATION_ITALIC = "ital";
    static final String VARIATION_OBLIQUE = "slnt";
    static final String VARIATION_WEIGHT = "wght";
    static final String VARIATION_WIDTH = "wdth";
    private final HashMap<String, Float> settings;
    static final Float VARIATION_ITALIC_VALUE_ON = Float.valueOf(1.0f);
    static final Float VARIATION_OBLIQUE_VALUE_ON = Float.valueOf(-14.0f);

    private static class FontVariationEntry {
        String name;
        Float val;

        public FontVariationEntry(String str, Float f10) {
            this.name = str;
            this.val = f10;
        }
    }

    public CSSFontVariationSettings() {
        this.settings = new HashMap<>();
    }

    private static FontVariationEntry nextFeatureEntry(TextScanner textScanner) {
        textScanner.skipWhitespace();
        String strNextQuotedString = textScanner.nextQuotedString();
        if (strNextQuotedString == null || strNextQuotedString.length() != 4) {
            return null;
        }
        textScanner.skipWhitespace();
        if (textScanner.empty()) {
            return null;
        }
        return new FontVariationEntry(strNextQuotedString, Float.valueOf(textScanner.nextFloat()));
    }

    static CSSFontVariationSettings parseFontVariationSettings(String str) {
        CSSFontVariationSettings cSSFontVariationSettings = new CSSFontVariationSettings();
        TextScanner textScanner = new TextScanner(str);
        textScanner.skipWhitespace();
        if (textScanner.consume("normal")) {
            return null;
        }
        while (!textScanner.empty()) {
            FontVariationEntry fontVariationEntryNextFeatureEntry = nextFeatureEntry(textScanner);
            if (fontVariationEntryNextFeatureEntry == null) {
                return null;
            }
            cSSFontVariationSettings.settings.put(fontVariationEntryNextFeatureEntry.name, fontVariationEntryNextFeatureEntry.val);
            textScanner.skipCommaWhitespace();
        }
        return cSSFontVariationSettings;
    }

    public void addSetting(String str, float f10) {
        this.settings.put(str, Float.valueOf(f10));
    }

    public void applySettings(CSSFontVariationSettings cSSFontVariationSettings) {
        if (cSSFontVariationSettings == null) {
            return;
        }
        this.settings.putAll(cSSFontVariationSettings.settings);
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        for (Map.Entry<String, Float> entry : this.settings.entrySet()) {
            if (sb2.length() > 0) {
                sb2.append(',');
            }
            sb2.append("'");
            sb2.append(entry.getKey());
            sb2.append("' ");
            sb2.append(new DecimalFormat("#.##").format(entry.getValue()));
        }
        return sb2.toString();
    }

    private CSSFontVariationSettings(HashMap<String, Float> map) {
        this.settings = map;
    }

    public CSSFontVariationSettings(CSSFontVariationSettings cSSFontVariationSettings) {
        this.settings = new HashMap<>(cSSFontVariationSettings.settings);
    }
}
