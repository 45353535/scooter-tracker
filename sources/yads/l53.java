package yads;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import kotlin.collections.CollectionsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class l53 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f112975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u33 f112976b;

    public /* synthetic */ l53() {
        xm3 xm3Var = new xm3();
        s33[] s33VarArrValues = s33.values();
        this(xm3Var, new u33(new HashSet(CollectionsKt.listOf(Arrays.copyOf(s33VarArrValues, s33VarArrValues.length)))));
    }

    @Override // yads.wm3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, cn cnVar) {
        return a(xmlPullParser);
    }

    public final k53 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f112975a.getClass();
        xmlPullParser.require(2, null, "Tracking");
        String attributeValue = xmlPullParser.getAttributeValue(null, "event");
        String attributeValue2 = xmlPullParser.getAttributeValue(null, "offset");
        this.f112975a.getClass();
        String strA = xm3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new k53(attributeValue, strA, attributeValue2 != null ? this.f112976b.a(attributeValue2) : null);
    }

    public l53(xm3 xm3Var, u33 u33Var) {
        this.f112975a = xm3Var;
        this.f112976b = u33Var;
    }
}
