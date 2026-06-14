package yads;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class yj1 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f118244a;

    public /* synthetic */ yj1() {
        this(new xm3());
    }

    @Override // yads.wm3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, cn cnVar) {
        return a(xmlPullParser);
    }

    public final wj1 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        vj1 vj1Var;
        Integer intOrNull;
        Integer intOrNull2;
        Integer intOrNull3;
        this.f118244a.getClass();
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66021n);
        this.f118244a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "delivery");
        this.f118244a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "type");
        this.f118244a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "height");
        this.f118244a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "width");
        this.f118244a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, com.taurusx.tax.f.a.f65992s);
        this.f118244a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f118244a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "id");
        this.f118244a.getClass();
        String attributeValue8 = xmlPullParser.getAttributeValue(null, "codec");
        this.f118244a.getClass();
        String attributeValue9 = xmlPullParser.getAttributeValue(null, "vmaf");
        this.f118244a.getClass();
        String strA = xm3.a(xmlPullParser);
        vj1[] vj1VarArrValues = vj1.values();
        int length = vj1VarArrValues.length;
        int i10 = 0;
        while (true) {
            if (i10 >= length) {
                vj1Var = null;
                break;
            }
            vj1Var = vj1VarArrValues[i10];
            if (Intrinsics.areEqual(vj1Var.f117020b, attributeValue)) {
                break;
            }
            i10++;
        }
        return new wj1(strA, attributeValue7, vj1Var, attributeValue2, attributeValue8, attributeValue9 != null ? StringsKt.u(attributeValue9) : null, (attributeValue3 == null || (intOrNull3 = StringsKt.toIntOrNull(attributeValue3)) == null) ? 0 : intOrNull3.intValue(), (attributeValue4 == null || (intOrNull2 = StringsKt.toIntOrNull(attributeValue4)) == null) ? 0 : intOrNull2.intValue(), (attributeValue5 == null || (intOrNull = StringsKt.toIntOrNull(attributeValue5)) == null) ? 0 : intOrNull.intValue(), attributeValue6);
    }

    public yj1(xm3 xm3Var) {
        this.f118244a = xm3Var;
    }
}
