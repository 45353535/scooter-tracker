package yads;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class vi3 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f117013a;

    public /* synthetic */ vi3() {
        this(new xm3());
    }

    @Override // yads.wm3
    public final /* bridge */ /* synthetic */ Object a(XmlPullParser xmlPullParser, cn cnVar) {
        return a(xmlPullParser);
    }

    public final ui3 a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f117013a.getClass();
        xmlPullParser.require(2, null, "ViewableImpression");
        ArrayList arrayList = new ArrayList();
        while (true) {
            this.f117013a.getClass();
            if (xmlPullParser.next() == 3) {
                return new ui3(arrayList);
            }
            this.f117013a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual("Viewable", xmlPullParser.getName())) {
                    this.f117013a.getClass();
                    arrayList.add(xm3.a(xmlPullParser));
                } else {
                    this.f117013a.getClass();
                    xm3.b(xmlPullParser);
                }
            }
        }
    }

    public vi3(xm3 xm3Var) {
        this.f117013a = xm3Var;
    }
}
