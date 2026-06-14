package yads;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class vm3 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final wm3 f117121a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f117122b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f117123c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xm3 f117124d;

    public /* synthetic */ vm3(wm3 wm3Var, String str, String str2) {
        this(wm3Var, str, str2, new xm3());
    }

    @Override // yads.wm3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, cn cnVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        xm3 xm3Var = this.f117124d;
        String str = this.f117122b;
        xm3Var.getClass();
        xmlPullParser.require(2, null, str);
        while (true) {
            this.f117124d.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f117124d.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual(this.f117123c, xmlPullParser.getName())) {
                    Object objA = this.f117121a.a(xmlPullParser, cnVar);
                    if (objA != null) {
                        arrayList.add(objA);
                    }
                } else {
                    this.f117124d.getClass();
                    xm3.b(xmlPullParser);
                }
            }
        }
    }

    public vm3(wm3 wm3Var, String str, String str2, xm3 xm3Var) {
        this.f117121a = wm3Var;
        this.f117122b = str;
        this.f117123c = str2;
        this.f117124d = xm3Var;
    }
}
