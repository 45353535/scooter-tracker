package yads;

import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class v01 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f116821a;

    public /* synthetic */ v01() {
        this(new xm3());
    }

    @Override // yads.wm3
    public final Object a(XmlPullParser xmlPullParser, cn cnVar) throws XmlPullParserException, IOException {
        int i10;
        q01 q01Var;
        this.f116821a.getClass();
        int i11 = 2;
        t01 t01Var = null;
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66014g);
        this.f116821a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "program");
        this.f116821a.getClass();
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "height");
        this.f116821a.getClass();
        String attributeValue3 = xmlPullParser.getAttributeValue(null, "width");
        this.f116821a.getClass();
        String attributeValue4 = xmlPullParser.getAttributeValue(null, "xPosition");
        this.f116821a.getClass();
        String attributeValue5 = xmlPullParser.getAttributeValue(null, "yPosition");
        this.f116821a.getClass();
        xmlPullParser.getAttributeValue(null, "apiFramework");
        this.f116821a.getClass();
        String attributeValue6 = xmlPullParser.getAttributeValue(null, "offset");
        this.f116821a.getClass();
        String attributeValue7 = xmlPullParser.getAttributeValue(null, "duration");
        while (true) {
            this.f116821a.getClass();
            i10 = 0;
            if (xmlPullParser.next() == 3) {
                break;
            }
            this.f116821a.getClass();
            if (xmlPullParser.getEventType() == i11) {
                String name = xmlPullParser.getName();
                s01.f115658c.getClass();
                s01[] s01VarArrValues = s01.values();
                int length = s01VarArrValues.length;
                int i12 = 0;
                while (true) {
                    if (i12 >= length) {
                        this.f116821a.getClass();
                        xm3.b(xmlPullParser);
                        break;
                    }
                    if (Intrinsics.areEqual(s01VarArrValues[i12].f115660b, name)) {
                        this.f116821a.getClass();
                        xm3.a(xmlPullParser);
                        s01[] s01VarArrValues2 = s01.values();
                        int length2 = s01VarArrValues2.length;
                        while (i10 < length2 && !Intrinsics.areEqual(s01VarArrValues2[i10].f115660b, name)) {
                            i10++;
                        }
                    } else {
                        i12++;
                    }
                }
                i11 = 2;
            }
        }
        le3.b(attributeValue2);
        le3.b(attributeValue3);
        q01[] q01VarArrValues = q01.values();
        int length3 = q01VarArrValues.length;
        int i13 = 0;
        while (true) {
            if (i13 >= length3) {
                q01Var = null;
                break;
            }
            q01Var = q01VarArrValues[i13];
            if (Intrinsics.areEqual(q01Var.f114839b, attributeValue4)) {
                break;
            }
            i13++;
        }
        if (q01Var == null) {
            q01Var = q01.f114837c;
        }
        if (q01Var == q01.f114837c) {
            le3.b(attributeValue4);
        }
        t01[] t01VarArrValues = t01.values();
        int length4 = t01VarArrValues.length;
        while (true) {
            if (i10 >= length4) {
                break;
            }
            t01 t01Var2 = t01VarArrValues[i10];
            if (Intrinsics.areEqual(t01Var2.f116007b, attributeValue5)) {
                t01Var = t01Var2;
                break;
            }
            i10++;
        }
        if (t01Var == null) {
            t01Var = t01.f116005c;
        }
        if (t01Var == t01.f116005c) {
            le3.b(attributeValue5);
        }
        le3.a(attributeValue6);
        le3.a(attributeValue7);
        return new u01(attributeValue);
    }

    public v01(xm3 xm3Var) {
        this.f116821a = xm3Var;
    }
}
