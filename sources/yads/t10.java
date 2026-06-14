package yads;

import android.content.Context;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes4.dex */
public final class t10 implements wm3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xm3 f116019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qd1 f116020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final r10 f116021c;

    public /* synthetic */ t10(Context context, dm2 dm2Var) {
        this(new xm3(), new qd1(), new r10(context, dm2Var));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // yads.wm3
    public final Object a(XmlPullParser xmlPullParser, cn cnVar) throws XmlPullParserException, JSONException, IOException {
        ArrayList arrayList;
        boolean z10;
        boolean z11;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        this.f116019a.getClass();
        int i10 = 2;
        String str = null;
        xmlPullParser2.require(2, null, com.taurusx.tax.f.y.f66055s);
        this.f116019a.getClass();
        String attributeValue = xmlPullParser2.getAttributeValue(null, "id");
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        q10 q10Var = null;
        String str2 = null;
        zx2 zx2Var = 0;
        String strA = null;
        boolean z12 = false;
        int iLongValue = 0;
        while (true) {
            this.f116019a.getClass();
            if (xmlPullParser2.next() == 3) {
                ArrayList arrayList5 = arrayList2;
                if (!z12) {
                    return null;
                }
                ArrayList arrayList6 = new ArrayList();
                for (Object obj : arrayList5) {
                    if (obj instanceof wj1) {
                        arrayList6.add(obj);
                    }
                }
                ArrayList arrayList7 = new ArrayList();
                for (Object obj2 : arrayList5) {
                    if (obj2 instanceof cb1) {
                        arrayList7.add(obj2);
                    }
                }
                return new n10(arrayList6, arrayList7, arrayList3, arrayList4, q10Var, str2, zx2Var, attributeValue, iLongValue, strA);
            }
            this.f116019a.getClass();
            if (xmlPullParser2.getEventType() == i10) {
                String name = xmlPullParser2.getName();
                if (Intrinsics.areEqual(com.taurusx.tax.f.y.f66052c, name)) {
                    qd1 qd1Var = this.f116020b;
                    qd1Var.f114950a.getClass();
                    xmlPullParser2.require(i10, str, com.taurusx.tax.f.y.f66052c);
                    qd1Var.f114953d.getClass();
                    String attributeValue2 = xmlPullParser2.getAttributeValue(str, com.taurusx.tax.f.s.f66023p);
                    if (attributeValue2 == null) {
                        attributeValue2 = "";
                    }
                    Object zx2Var2 = attributeValue2.length() > 0 ? new zx2(attributeValue2) : str;
                    while (true) {
                        qd1Var.f114950a.getClass();
                        if (xmlPullParser2.next() != 3) {
                            qd1Var.f114950a.getClass();
                            if (xmlPullParser2.getEventType() == i10) {
                                String name2 = xmlPullParser2.getName();
                                if (name2 != null) {
                                    switch (name2.hashCode()) {
                                        case -2049897434:
                                            if (name2.equals(com.taurusx.tax.f.s.f66032y)) {
                                                qe3 qe3VarA = qd1Var.f114951b.a(xmlPullParser2);
                                                str2 = qe3VarA.f114979b;
                                                for (Iterator it = qe3VarA.f114978a.iterator(); it.hasNext(); it = it) {
                                                    arrayList4.add(new k53("clickTracking", (String) it.next(), null));
                                                }
                                                break;
                                            }
                                            break;
                                        case -1927368268:
                                            if (name2.equals("Duration")) {
                                                zj0 zj0Var = qd1Var.f114952c;
                                                zj0Var.f118718a.getClass();
                                                xmlPullParser2.require(i10, str, "Duration");
                                                zj0Var.f118718a.getClass();
                                                Long lA = le3.a(xm3.a(xmlPullParser2));
                                                if (lA != null) {
                                                    iLongValue = (int) lA.longValue();
                                                } else {
                                                    iLongValue = 0;
                                                }
                                            }
                                            break;
                                        case -1348833651:
                                            if (name2.equals("AdParameters")) {
                                                qd1Var.f114950a.getClass();
                                                strA = xm3.a(xmlPullParser2);
                                            }
                                            break;
                                        case -385055469:
                                            if (name2.equals(com.taurusx.tax.f.s.f66008a)) {
                                                arrayList2.addAll(qd1Var.f114954e.a(xmlPullParser2, cnVar));
                                                break;
                                            }
                                            break;
                                        case 70476538:
                                            if (name2.equals(com.taurusx.tax.f.s.f66027t)) {
                                                arrayList3.addAll(qd1Var.f114955f.a(xmlPullParser2, cnVar));
                                                break;
                                            }
                                            break;
                                        case 611554000:
                                            if (name2.equals("TrackingEvents")) {
                                                Iterator it2 = qd1Var.f114956g.a(xmlPullParser2, cnVar).iterator();
                                                while (it2.hasNext()) {
                                                    arrayList4.add((k53) it2.next());
                                                }
                                                break;
                                            }
                                            break;
                                    }
                                }
                                qd1Var.f114950a.getClass();
                                xm3.b(xmlPullParser2);
                            }
                            i10 = 2;
                            str = null;
                        } else {
                            z12 = true;
                            zx2Var = zx2Var2;
                            i10 = 2;
                            str = null;
                        }
                    }
                } else if (Intrinsics.areEqual("CreativeExtensions", name)) {
                    r10 r10Var = this.f116021c;
                    r10Var.f115264a.getClass();
                    xmlPullParser2.require(2, null, "CreativeExtensions");
                    op0 op0Var = null;
                    ArrayList arrayListA = null;
                    od1 od1Var = null;
                    while (true) {
                        r10Var.f115264a.getClass();
                        ArrayList arrayList8 = arrayList2;
                        if (xmlPullParser2.next() != 3) {
                            r10Var.f115264a.getClass();
                            if (xmlPullParser2.getEventType() != 2) {
                                z11 = z12;
                            } else if (Intrinsics.areEqual("CreativeExtension", xmlPullParser2.getName())) {
                                String attributeValue3 = xmlPullParser2.getAttributeValue(null, "type");
                                if (Intrinsics.areEqual("false_click", attributeValue3)) {
                                    op0Var = (op0) r10Var.f115266c.a(xmlPullParser2, cnVar);
                                } else if (Intrinsics.areEqual(r10.f115262e, attributeValue3)) {
                                    arrayListA = r10Var.f115267d.a(xmlPullParser2, cnVar);
                                } else if (Intrinsics.areEqual(r10.f115263f, attributeValue3)) {
                                    pd1 pd1Var = r10Var.f115265b;
                                    pd1Var.getClass();
                                    try {
                                        pd1Var.f114632b.getClass();
                                        JSONObject jSONObject = new JSONObject(xm3.a(xmlPullParser2));
                                        Iterator<String> itKeys = jSONObject.keys();
                                        List listEmptyList = CollectionsKt.emptyList();
                                        while (itKeys.hasNext()) {
                                            Iterator<String> it3 = itKeys;
                                            String next = itKeys.next();
                                            boolean z13 = z12;
                                            if (Intrinsics.areEqual(POBCoreNativeConstants.NATIVE_ASSETS, next)) {
                                                listEmptyList = pd1Var.f114631a.a(jSONObject, cnVar);
                                            } else if (Intrinsics.areEqual(POBCoreNativeConstants.NATIVE_LINK, next)) {
                                                pd1Var.f114633c.a(jSONObject.getJSONObject(next), cnVar);
                                            }
                                            z12 = z13;
                                            itKeys = it3;
                                        }
                                        z11 = z12;
                                        od1Var = new od1(listEmptyList);
                                    } catch (Exception e10) {
                                        throw new JSONException(e10.getMessage());
                                    }
                                } else {
                                    z11 = z12;
                                    r10Var.f115264a.getClass();
                                    xm3.b(xmlPullParser);
                                }
                                arrayList2 = arrayList8;
                            } else {
                                z11 = z12;
                                r10Var.f115264a.getClass();
                                xm3.b(xmlPullParser);
                            }
                            xmlPullParser2 = xmlPullParser;
                            arrayList2 = arrayList8;
                            z12 = z11;
                        } else {
                            q10Var = new q10(op0Var, arrayListA, od1Var);
                            arrayList2 = arrayList8;
                            i10 = 2;
                            str = null;
                            xmlPullParser2 = xmlPullParser;
                        }
                    }
                } else {
                    arrayList = arrayList2;
                    z10 = z12;
                    this.f116019a.getClass();
                    xm3.b(xmlPullParser);
                }
            } else {
                arrayList = arrayList2;
                z10 = z12;
            }
            xmlPullParser2 = xmlPullParser;
            arrayList2 = arrayList;
            z12 = z10;
            zx2Var = zx2Var;
            i10 = 2;
            str = null;
        }
    }

    public t10(xm3 xm3Var, qd1 qd1Var, r10 r10Var) {
        this.f116019a = xm3Var;
        this.f116020b = qd1Var;
        this.f116021c = r10Var;
    }
}
