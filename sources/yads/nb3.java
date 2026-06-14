package yads;

import android.content.Context;
import com.taurusx.tax.vast.VastExtensionParentXmlManager;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class nb3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f113780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final vm3 f113781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final vm3 f113782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final vi3 f113783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final sb3 f113784e;

    public /* synthetic */ nb3(Context context, dm2 dm2Var) {
        this(new xm3(), new vm3(new t10(context, dm2Var), com.taurusx.tax.f.y.f66054o, com.taurusx.tax.f.y.f66055s), new vm3(new ya3(), com.taurusx.tax.f.z.f66069w, com.taurusx.tax.f.z.f66070y), new vi3(), new sb3());
    }

    public final void a(XmlPullParser xmlPullParser, hb3 hb3Var, cn cnVar) throws XmlPullParserException, IOException {
        String name = xmlPullParser.getName();
        if (Intrinsics.areEqual(com.taurusx.tax.f.y.f66057w, name)) {
            this.f113780a.getClass();
            String strA = xm3.a(xmlPullParser);
            LinkedHashMap linkedHashMap = hb3Var.f111550n;
            Object arrayList = linkedHashMap.get("impression");
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put("impression", arrayList);
            }
            ((List) arrayList).add(strA);
            return;
        }
        if (Intrinsics.areEqual("ViewableImpression", name)) {
            hb3Var.f111545i = this.f113783d.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual("Error", name)) {
            this.f113780a.getClass();
            String strA2 = xm3.a(xmlPullParser);
            LinkedHashMap linkedHashMap2 = hb3Var.f111550n;
            Object arrayList2 = linkedHashMap2.get("error");
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap2.put("error", arrayList2);
            }
            ((List) arrayList2).add(strA2);
            return;
        }
        if (Intrinsics.areEqual("Survey", name)) {
            this.f113780a.getClass();
            hb3Var.f111543g = xm3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual("Description", name)) {
            this.f113780a.getClass();
            hb3Var.f111542f = xm3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual("AdTitle", name)) {
            this.f113780a.getClass();
            hb3Var.f111541e = xm3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual("AdSystem", name)) {
            this.f113780a.getClass();
            hb3Var.f111540d = xm3.a(xmlPullParser);
            return;
        }
        if (Intrinsics.areEqual(com.taurusx.tax.f.y.f66054o, name)) {
            hb3Var.f111548l.addAll(this.f113781b.a(xmlPullParser, cnVar));
            return;
        }
        if (Intrinsics.areEqual(com.taurusx.tax.f.z.f66069w, name)) {
            hb3Var.f111549m.addAll(this.f113782c.a(xmlPullParser, cnVar));
            return;
        }
        if (!Intrinsics.areEqual(com.taurusx.tax.f.y.f66056t, name)) {
            this.f113780a.getClass();
            xm3.b(xmlPullParser);
            return;
        }
        sb3 sb3Var = this.f113784e;
        sb3Var.f115744a.getClass();
        xmlPullParser.require(2, null, com.taurusx.tax.f.y.f66056t);
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        while (true) {
            sb3Var.f115744a.getClass();
            if (xmlPullParser.next() == 3) {
                hb3Var.f111551o = new rb3(CollectionsKt.toList(arrayList4), CollectionsKt.toList(arrayList3));
                return;
            }
            sb3Var.f115744a.getClass();
            if (xmlPullParser.getEventType() == 2) {
                if (Intrinsics.areEqual(VastExtensionParentXmlManager.f66980w, xmlPullParser.getName())) {
                    String attributeValue = xmlPullParser.getAttributeValue(null, "type");
                    if (sb3.f115743e.contains(attributeValue)) {
                        so0 so0VarA = sb3Var.f115745b.a(xmlPullParser);
                        if (so0VarA != null) {
                            arrayList4.add(so0VarA);
                        }
                    } else if (Intrinsics.areEqual(sb3.f115742d, attributeValue)) {
                        arrayList3.addAll(sb3Var.f115746c.a(xmlPullParser, cnVar));
                    } else {
                        sb3Var.f115744a.getClass();
                        xm3.b(xmlPullParser);
                    }
                } else {
                    sb3Var.f115744a.getClass();
                    xm3.b(xmlPullParser);
                }
            }
        }
    }

    public nb3(xm3 xm3Var, vm3 vm3Var, vm3 vm3Var2, vi3 vi3Var, sb3 sb3Var) {
        this.f113780a = xm3Var;
        this.f113781b = vm3Var;
        this.f113782c = vm3Var2;
        this.f113783d = vi3Var;
        this.f113784e = sb3Var;
    }
}
