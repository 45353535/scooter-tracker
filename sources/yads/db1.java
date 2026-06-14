package yads;

import android.util.Base64;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class db1 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f109873a;

    public /* synthetic */ db1() {
        this(new xm3());
    }

    @Override // yads.wm3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, cn cnVar) {
        return a(xmlPullParser);
    }

    public final cb1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        Integer intOrNull;
        Integer intOrNull2;
        this.f109873a.getClass();
        xmlPullParser.require(2, null, "InteractiveCreativeFile");
        this.f109873a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        if (attributeValue == null) {
            return null;
        }
        this.f109873a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        if (attributeValue2 != null && (intOrNull = StringsKt.toIntOrNull(attributeValue2)) != null) {
            int iIntValue = intOrNull.intValue();
            this.f109873a.getClass();
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
            if (attributeValue3 != null && (intOrNull2 = StringsKt.toIntOrNull(attributeValue3)) != null) {
                int iIntValue2 = intOrNull2.intValue();
                this.f109873a.getClass();
                String strA = xm3.a(xmlPullParser);
                if (StringsKt.g0(attributeValue, "html", false, 2, null) != (strA.length() > 0)) {
                    strA = null;
                }
                String str = strA != null ? new String(Base64.decode(strA, 0), StandardCharsets.UTF_8) : null;
                if (str == null) {
                    return null;
                }
                return new cb1(iIntValue, iIntValue2, str, attributeValue);
            }
        }
        return null;
    }

    public db1(xm3 xm3Var) {
        this.f109873a = xm3Var;
    }
}
