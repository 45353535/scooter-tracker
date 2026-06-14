package yads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class m53 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f113324a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final l53 f113325b;

    public /* synthetic */ m53() {
        this(new xm3(), new l53());
    }

    public final HashMap a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        this.f113324a.getClass();
        xmlPullParser.require(2, null, "TrackingEvents");
        HashMap map = new HashMap();
        while (true) {
            this.f113324a.getClass();
            if (xmlPullParser.next() == 3) {
                return map;
            }
            this.f113324a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual("Tracking", xmlPullParser.getName())) {
                    k53 k53VarA = this.f113325b.a(xmlPullParser);
                    if (k53VarA != null) {
                        String str = k53VarA.f112597a;
                        String str2 = k53VarA.f112598b;
                        if (!map.containsKey(str)) {
                            map.put(str, new ArrayList());
                        }
                        List list = (List) map.get(str);
                        if (list != null) {
                            list.add(str2);
                        }
                    }
                } else {
                    this.f113324a.getClass();
                    xm3.b(xmlPullParser);
                }
            }
        }
    }

    public m53(xm3 xm3Var, l53 l53Var) {
        this.f113324a = xm3Var;
        this.f113325b = l53Var;
    }
}
