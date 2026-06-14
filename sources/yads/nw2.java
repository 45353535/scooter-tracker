package yads;

import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class nw2 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f114065a;

    public nw2(xm3 xm3Var) {
        this.f114065a = xm3Var;
    }

    @Override // yads.wm3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, cn cnVar) {
        return a(xmlPullParser);
    }

    public final so0 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f114065a.getClass();
        xmlPullParser.require(2, null, VastExtensionParentXmlManager.f66980w);
        String attributeValue = xmlPullParser.getAttributeValue(null, "type");
        this.f114065a.getClass();
        String strA = xm3.a(xmlPullParser);
        if (attributeValue == null || attributeValue.length() == 0 || strA.length() <= 0) {
            return null;
        }
        return new so0(attributeValue, strA);
    }
}
