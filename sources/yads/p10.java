package yads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class p10 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm3 f114520a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xm3 f114521b;

    public p10(up0 up0Var, xm3 xm3Var) {
        this.f114520a = up0Var;
        this.f114521b = xm3Var;
    }

    @Override // yads.wm3
    public final Object a(XmlPullParser xmlPullParser, cn cnVar) throws XmlPullParserException, IOException {
        this.f114521b.getClass();
        Object objA = null;
        xmlPullParser.require(2, null, "CreativeExtension");
        while (true) {
            this.f114521b.getClass();
            if (xmlPullParser.next() == 3) {
                return objA;
            }
            this.f114521b.getClass();
            if (xmlPullParser.getEventType() == 2) {
                objA = this.f114520a.a(xmlPullParser, cnVar);
            }
        }
    }
}
