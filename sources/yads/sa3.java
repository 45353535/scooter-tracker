package yads;

import android.content.Context;
import android.util.Xml;
import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class sa3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f115734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r93 f115735b;

    public /* synthetic */ sa3(Context context, dm2 dm2Var) {
        this(new xm3(), new r93(context, dm2Var));
    }

    public final n93 a(String str, cn cnVar) throws XmlPullParserException, IOException {
        ib3 ib3VarA;
        XmlPullParser xmlPullParserNewPullParser = Xml.newPullParser();
        boolean z10 = false;
        xmlPullParserNewPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
        xmlPullParserNewPullParser.setInput(new StringReader(str));
        xmlPullParserNewPullParser.nextTag();
        this.f115734a.getClass();
        xmlPullParserNewPullParser.require(2, null, "VAST");
        r93 r93Var = this.f115735b;
        r93Var.f115377a.getClass();
        String attributeValue = xmlPullParserNewPullParser.getAttributeValue(null, "version");
        ArrayList arrayList = new ArrayList();
        while (true) {
            r93Var.f115377a.getClass();
            int i10 = 3;
            if (xmlPullParserNewPullParser.next() == 3) {
                break;
            }
            r93Var.f115377a.getClass();
            if (xmlPullParserNewPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual(com.taurusx.tax.f.t.f66040o, xmlPullParserNewPullParser.getName())) {
                    lc3 lc3Var = r93Var.f115378b;
                    lc3Var.f113043e.f117277a.getClass();
                    xmlPullParserNewPullParser.require(2, null, com.taurusx.tax.f.t.f66040o);
                    String attributeValue2 = xmlPullParserNewPullParser.getAttributeValue(null, "id");
                    if (attributeValue2 == null || attributeValue2.length() == 0) {
                        attributeValue2 = null;
                    }
                    lc3Var.f113042d.f109615a.getClass();
                    xmlPullParserNewPullParser.require(2, null, com.taurusx.tax.f.t.f66040o);
                    Integer numB = le3.b(xmlPullParserNewPullParser.getAttributeValue(null, com.taurusx.tax.f.w.f66047c));
                    if (numB != null && numB.intValue() < 0) {
                        numB = null;
                    }
                    lc3Var.f113039a.getClass();
                    xmlPullParserNewPullParser.require(2, null, com.taurusx.tax.f.t.f66040o);
                    while (true) {
                        ib3VarA = null;
                        while (true) {
                            lc3Var.f113039a.getClass();
                            if (xmlPullParserNewPullParser.next() == i10) {
                                break;
                            }
                            lc3Var.f113039a.getClass();
                            if (xmlPullParserNewPullParser.getEventType() == 2) {
                                String name = xmlPullParserNewPullParser.getName();
                                if (Intrinsics.areEqual(com.taurusx.tax.f.w.f66048w, name)) {
                                    hb3 hb3Var = new hb3(z10, new yd3(lc3Var.f113044f));
                                    hb3Var.f111547k = attributeValue2;
                                    hb3Var.f111546j = numB;
                                    q41 q41Var = lc3Var.f113040b;
                                    q41Var.f114873b.getClass();
                                    xmlPullParserNewPullParser.require(2, null, com.taurusx.tax.f.w.f66048w);
                                    while (true) {
                                        q41Var.f114873b.getClass();
                                        if (xmlPullParserNewPullParser.next() == 3) {
                                            break;
                                        }
                                        q41Var.f114873b.getClass();
                                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                                            q41Var.f114872a.a(xmlPullParserNewPullParser, hb3Var, cnVar);
                                        }
                                    }
                                    ib3VarA = hb3Var.a();
                                    if (ib3VarA.f111941b.isEmpty()) {
                                        break;
                                    }
                                    i10 = 3;
                                } else if (Intrinsics.areEqual(com.taurusx.tax.f.w.f66049y, name)) {
                                    hb3 hb3Var2 = new hb3(true, new yd3(lc3Var.f113044f));
                                    hb3Var2.f111547k = attributeValue2;
                                    hb3Var2.f111546j = numB;
                                    rm3 rm3Var = lc3Var.f113041c;
                                    rm3Var.f115502a.getClass();
                                    xmlPullParserNewPullParser.require(2, null, com.taurusx.tax.f.w.f66049y);
                                    rm3Var.f115504c.getClass();
                                    hb3Var2.f111539c = new om3(pm3.a(xmlPullParserNewPullParser, "allowMultipleAds", z10), pm3.a(xmlPullParserNewPullParser, "followAdditionalWrappers", true));
                                    while (true) {
                                        rm3Var.f115502a.getClass();
                                        i10 = 3;
                                        if (xmlPullParserNewPullParser.next() == 3) {
                                            break;
                                        }
                                        rm3Var.f115502a.getClass();
                                        if (xmlPullParserNewPullParser.getEventType() == 2) {
                                            if (Intrinsics.areEqual(com.taurusx.tax.f.n.f66007g, xmlPullParserNewPullParser.getName())) {
                                                rm3Var.f115502a.getClass();
                                                hb3Var2.f111544h = xm3.a(xmlPullParserNewPullParser);
                                            } else {
                                                rm3Var.f115503b.a(xmlPullParserNewPullParser, hb3Var2, cnVar);
                                            }
                                        }
                                    }
                                    ib3VarA = hb3Var2.a();
                                } else {
                                    i10 = 3;
                                    lc3Var.f113039a.getClass();
                                    xm3.b(xmlPullParserNewPullParser);
                                }
                            }
                            z10 = false;
                        }
                        i10 = 3;
                    }
                    if (ib3VarA != null) {
                        arrayList.add(ib3VarA);
                    }
                } else {
                    r93Var.f115377a.getClass();
                    xm3.b(xmlPullParserNewPullParser);
                }
                z10 = false;
            }
        }
        if (attributeValue == null || attributeValue.length() == 0) {
            return null;
        }
        return new n93(attributeValue, arrayList);
    }

    public sa3(xm3 xm3Var, r93 r93Var) {
        this.f115734a = xm3Var;
        this.f115735b = r93Var;
    }
}
