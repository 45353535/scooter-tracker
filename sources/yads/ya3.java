package yads;

import java.io.IOException;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class ya3 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f118126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final mc1 f118127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xa3 f118128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m53 f118129d;

    public /* synthetic */ ya3() {
        this(new xm3(), new mc1(), new xa3(), new m53());
    }

    @Override // yads.wm3
    public final Object a(XmlPullParser xmlPullParser, cn cnVar) throws XmlPullParserException, IOException {
        this.f118126a.getClass();
        xmlPullParser.require(2, null, com.taurusx.tax.f.z.f66070y);
        this.f118126a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, com.taurusx.tax.f.z.f66061c);
        HashMap map = new HashMap();
        lc1 lc1Var = null;
        String strA = null;
        while (true) {
            this.f118126a.getClass();
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f118126a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (Intrinsics.areEqual(com.taurusx.tax.f.z.f66066o, name)) {
                    mc1 mc1Var = this.f118127b;
                    mc1Var.f113425a.getClass();
                    xmlPullParser.require(2, null, com.taurusx.tax.f.z.f66066o);
                    mc1Var.f113425a.getClass();
                    String attributeValue2 = xmlPullParser.getAttributeValue(null, "apiFramework");
                    mc1Var.f113425a.getClass();
                    String attributeValue3 = xmlPullParser.getAttributeValue(null, "browserOptional");
                    Boolean boolValueOf = attributeValue3 != null ? Boolean.valueOf(Boolean.parseBoolean(attributeValue3)) : null;
                    mc1Var.f113425a.getClass();
                    String strA2 = xm3.a(xmlPullParser);
                    lc1Var = (attributeValue2 == null || attributeValue2.length() == 0 || boolValueOf == null || strA2.length() <= 0) ? null : new lc1(attributeValue2, strA2, boolValueOf.booleanValue());
                } else if (Intrinsics.areEqual(com.taurusx.tax.f.z.f66065n, name)) {
                    xa3 xa3Var = this.f118128c;
                    xa3Var.f117767a.getClass();
                    xmlPullParser.require(2, null, com.taurusx.tax.f.z.f66065n);
                    xa3Var.f117767a.getClass();
                    strA = xm3.a(xmlPullParser);
                    if (strA.length() == 0) {
                        strA = null;
                    }
                } else if (Intrinsics.areEqual("TrackingEvents", name)) {
                    map = this.f118129d.a(xmlPullParser);
                } else {
                    this.f118126a.getClass();
                    xm3.b(xmlPullParser);
                }
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new ua3(attributeValue, lc1Var, strA, map);
    }

    public ya3(xm3 xm3Var, mc1 mc1Var, xa3 xa3Var, m53 m53Var) {
        this.f118126a = xm3Var;
        this.f118127b = mc1Var;
        this.f118128c = xa3Var;
        this.f118129d = m53Var;
    }
}
