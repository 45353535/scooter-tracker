package yads;

import java.io.IOException;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class bk1 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f109030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final db1 f109031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yj1 f109032c;

    public /* synthetic */ bk1() {
        this(new xm3(), new db1(), new yj1());
    }

    @Override // yads.wm3
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final ArrayList a(XmlPullParser xmlPullParser, cn cnVar) throws XmlPullParserException, IOException {
        ArrayList arrayList = new ArrayList();
        this.f109030a.getClass();
        xmlPullParser.require(2, null, com.taurusx.tax.f.s.f66008a);
        while (true) {
            this.f109030a.getClass();
            if (xmlPullParser.next() == 3) {
                return arrayList;
            }
            this.f109030a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (Intrinsics.areEqual(name, com.taurusx.tax.f.s.f66021n)) {
                    arrayList.add(this.f109032c.a(xmlPullParser));
                } else if (Intrinsics.areEqual(name, "InteractiveCreativeFile")) {
                    cb1 cb1VarA = this.f109031b.a(xmlPullParser);
                    if (cb1VarA != null) {
                        arrayList.add(cb1VarA);
                    }
                } else {
                    this.f109030a.getClass();
                    xm3.b(xmlPullParser);
                }
            }
        }
    }

    public bk1(xm3 xm3Var, db1 db1Var, yj1 yj1Var) {
        this.f109030a = xm3Var;
        this.f109031b = db1Var;
        this.f109032c = yj1Var;
    }
}
