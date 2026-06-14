package yads;

import java.io.IOException;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class up0 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f116734a;

    public up0(xm3 xm3Var) {
        this.f116734a = xm3Var;
    }

    @Override // yads.wm3
    public final Object a(XmlPullParser xmlPullParser, cn cnVar) throws XmlPullParserException, IOException {
        this.f116734a.getClass();
        xmlPullParser.require(2, null, "FalseClick");
        this.f116734a.getClass();
        String attributeValue = xmlPullParser.getAttributeValue(null, "interval");
        Long lX = attributeValue != null ? StringsKt.x(attributeValue) : null;
        this.f116734a.getClass();
        String strA = xm3.a(xmlPullParser);
        if (strA.length() <= 0 || lX == null) {
            return null;
        }
        return new op0(strA, lX.longValue());
    }
}
