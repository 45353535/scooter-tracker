package yads;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class re3 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f115433a;

    public /* synthetic */ re3() {
        this(new xm3());
    }

    @Override // yads.wm3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, cn cnVar) {
        return a(xmlPullParser);
    }

    public final qe3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f115433a.getClass();
        String str = null;
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66032y);
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f115433a.getClass();
            if (xmlPullParser.next() == 3) {
                return new qe3(str, arrayList);
            }
            this.f115433a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (Intrinsics.areEqual(com.taurusx.tax.f.s.f66022o, name)) {
                    this.f115433a.getClass();
                    String strA = xm3.a(xmlPullParser);
                    if (strA.length() > 0) {
                        str = strA;
                    }
                } else if (Intrinsics.areEqual(com.taurusx.tax.f.s.f66026s, name)) {
                    this.f115433a.getClass();
                    String strA2 = xm3.a(xmlPullParser);
                    if (strA2.length() > 0) {
                        arrayList.add(strA2);
                    }
                } else {
                    this.f115433a.getClass();
                    xm3.b(xmlPullParser);
                }
            }
        }
    }

    public re3(xm3 xm3Var) {
        this.f115433a = xm3Var;
    }
}
