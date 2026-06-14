package net.pubnative.lite.sdk.views.shape.path.parser;

import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.ironsource.C4240b4;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: loaded from: classes3.dex */
class ParseUtil {
    ParseUtil() {
    }

    static final Float convertUnits(String str, XmlPullParser xmlPullParser, float f10, float f11, float f12) {
        String stringAttr = getStringAttr(str, xmlPullParser);
        if (stringAttr == null) {
            return null;
        }
        if (stringAttr.endsWith("px")) {
            return Float.valueOf(Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)));
        }
        if (stringAttr.endsWith("pt")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f10) / 72.0f);
        }
        if (stringAttr.endsWith(ApsMetricsDataMap.APSMETRICS_FIELD_PLATFORMCATEGORY)) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f10) / 6.0f);
        }
        if (stringAttr.endsWith("cm")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f10) / 2.54f);
        }
        if (stringAttr.endsWith("mm")) {
            return Float.valueOf((Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f10) / 254.0f);
        }
        if (stringAttr.endsWith(ScarConstants.IN_SIGNAL_KEY)) {
            return Float.valueOf(Float.parseFloat(stringAttr.substring(0, stringAttr.length() - 2)) * f10);
        }
        if (!stringAttr.endsWith("%")) {
            return Float.valueOf(stringAttr);
        }
        return Float.valueOf(Float.valueOf(stringAttr.substring(0, stringAttr.length() - 1)).floatValue() * ((str.contains("x") || str.equals("width")) ? f11 / 100.0f : (str.contains("y") || str.equals("height")) ? f12 / 100.0f : (f12 + f11) / 2.0f));
    }

    static final String escape(String str) {
        return str.replaceAll("\"", "&quot;").replaceAll("'", "&apos").replaceAll("<", "&lt;").replaceAll(">", "&gt;").replaceAll(C4240b4.j.f42670c, "&amp;");
    }

    static final String getStringAttr(String str, XmlPullParser xmlPullParser) {
        int attributeCount = xmlPullParser.getAttributeCount();
        for (int i10 = 0; i10 < attributeCount; i10++) {
            if (xmlPullParser.getAttributeName(i10).equals(str)) {
                return xmlPullParser.getAttributeValue(i10);
            }
        }
        return null;
    }
}
