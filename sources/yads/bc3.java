package yads;

import android.content.Context;
import com.ironsource.C4424m2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public final class bc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final be3 f108969a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final qa3 f108970b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final zb3 f108971c;

    public /* synthetic */ bc3(Context context, rc3 rc3Var) {
        this(new be3(), new qa3(context), new zb3(rc3Var));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final ArrayList a(List list, rg3 rg3Var) {
        List listSortedWith;
        int i10;
        pa3 pa3Var;
        wj1 wj1VarA;
        ak1 ak1Var;
        Object next;
        Object next2;
        pa3 pa3Var2;
        this.f108969a.getClass();
        if ((list instanceof Collection) && list.isEmpty()) {
            listSortedWith = CollectionsKt.toList(list);
        } else {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((ib3) it.next()).f111950k != null) {
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list) {
                        if (((ib3) obj).f111950k != null) {
                            arrayList.add(obj);
                        }
                    }
                    listSortedWith = CollectionsKt.sortedWith(arrayList, new ae3());
                }
            }
            listSortedWith = CollectionsKt.toList(list);
        }
        qa3 qa3Var = this.f108970b;
        qa3Var.getClass();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = listSortedWith.iterator();
        while (true) {
            i10 = 0;
            if (!it2.hasNext()) {
                break;
            }
            ib3 ib3Var = (ib3) it2.next();
            n10 n10Var = (n10) CollectionsKt.firstOrNull(ib3Var.f111941b);
            if (n10Var == null) {
                pa3Var = null;
            } else {
                if (n10Var.f113679b.isEmpty()) {
                    hr2 hr2Var = qa3Var.f114907e;
                    if (hr2Var != null && hr2Var.A0 && ib3Var.f111940a) {
                        String str = ib3Var.f111948i;
                        if (str == null) {
                            str = "";
                        }
                        pa3Var2 = new pa3(ib3Var, n10Var, new wj1(str, null, null, null, null, null, 0, 0, 0, null), null, null, null, null, null);
                    } else {
                        zj1 zj1Var = qa3Var.f114903a;
                        byte b10 = rg3Var != null && rg3Var.f115443c;
                        zj1Var.getClass();
                        wj1 wj1VarA2 = zj1Var.a(n10Var.f113678a);
                        if (wj1VarA2 == null) {
                            ak1Var = null;
                        } else {
                            if (b10 == true) {
                                List list2 = n10Var.f113678a;
                                ArrayList arrayList3 = new ArrayList();
                                for (Object obj2 : list2) {
                                    if (!Intrinsics.areEqual(((wj1) obj2).f117486d, wj1VarA2.f117486d)) {
                                        arrayList3.add(obj2);
                                    }
                                }
                                wj1VarA = zj1Var.a(arrayList3);
                            } else {
                                wj1VarA = null;
                            }
                            ak1Var = new ak1(wj1VarA2, wj1VarA);
                        }
                        if (ak1Var != null) {
                            rb3 rb3Var = ib3Var.f111943d;
                            qa3Var.f114904b.getClass();
                            Iterator it3 = rb3Var.f115396a.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it3.next();
                                so0 so0Var = (so0) next;
                                if (Intrinsics.areEqual(so0Var.f115886a, "social_ad_info") && so0Var.f115887b.length() > 0) {
                                    break;
                                }
                            }
                            so0 so0Var2 = (so0) next;
                            String str2 = so0Var2 != null ? so0Var2.f115887b : null;
                            mz2 mz2Var = str2 != null ? new mz2(str2) : null;
                            qa3Var.f114905c.getClass();
                            String strA = m5.a(rb3Var);
                            qa3Var.f114905c.getClass();
                            String strA2 = m5.a(rb3Var);
                            JSONObject jSONObjectA = strA2 != null ? rc1.a(strA2) : null;
                            qa3Var.f114906d.getClass();
                            Iterator it4 = rb3Var.f115396a.iterator();
                            while (true) {
                                if (!it4.hasNext()) {
                                    next2 = null;
                                    break;
                                }
                                next2 = it4.next();
                                if (Intrinsics.areEqual(((so0) next2).f115886a, "AdTune")) {
                                    break;
                                }
                            }
                            so0 so0Var3 = (so0) next2;
                            String str3 = so0Var3 != null ? so0Var3.f115887b : null;
                            JSONObject jSONObjectA2 = str3 != null ? rc1.a(str3) : null;
                            pa3Var2 = new pa3(ib3Var, n10Var, ak1Var.f108705a, ak1Var.f108706b, mz2Var, strA, jSONObjectA, jSONObjectA2 != null ? new ya(jSONObjectA2.optString("token"), jSONObjectA2.optString("advertiserInfo"), jSONObjectA2.optInt(C4424m2.f43623v, 0) == 1) : null);
                        }
                        pa3Var = null;
                    }
                } else {
                    pa3Var2 = new pa3(ib3Var, n10Var, new wj1("", null, null, null, null, null, 0, 0, 0, null), null, null, null, null, null);
                }
                pa3Var = pa3Var2;
            }
            if (pa3Var != null) {
                arrayList2.add(pa3Var);
            }
        }
        int size = arrayList2.size();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Object obj3 : arrayList2) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            pa3 pa3Var3 = (pa3) obj3;
            zb3 zb3Var = this.f108971c;
            zb3Var.getClass();
            ib3 ib3Var2 = pa3Var3.f114590a;
            n10 n10Var2 = pa3Var3.f114591b;
            wj1 wj1Var = pa3Var3.f114592c;
            mz2 mz2Var2 = pa3Var3.f114594e;
            String str4 = pa3Var3.f114595f;
            JSONObject jSONObject = pa3Var3.f114596g;
            zc3 zc3Var = new zc3(size, i11);
            ya yaVar = pa3Var3.f114597h;
            String strA3 = yaVar != null ? za.a(yaVar) : null;
            Object objA = zb3Var.f118607a.a(ib3Var2, n10Var2, wj1Var, zc3Var, str4, strA3, jSONObject);
            String strValueOf = String.valueOf(j11.f112217a.getAndIncrement());
            wj1 wj1Var2 = pa3Var3.f114593d;
            arrayList4.add(new xb3(n10Var2, ib3Var2, wj1Var, objA, wj1Var2 != null ? zb3Var.f118607a.a(ib3Var2, n10Var2, wj1Var2, zc3Var, str4, strA3, jSONObject) : null, mz2Var2, strValueOf, yaVar));
            i10 = i11;
        }
        return arrayList4;
    }

    public bc3(be3 be3Var, qa3 qa3Var, zb3 zb3Var) {
        this.f108969a = be3Var;
        this.f108970b = qa3Var;
        this.f108971c = zb3Var;
    }
}
