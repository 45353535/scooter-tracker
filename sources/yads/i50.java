package yads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class i50 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final op1 f111861a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zp1 f111862b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w40 f111863c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final wp1 f111864d;

    public i50(op1 op1Var, zp1 zp1Var, w40 w40Var, wp1 wp1Var) {
        this.f111861a = op1Var;
        this.f111862b = zp1Var;
        this.f111863c = w40Var;
        this.f111864d = wp1Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6, types: [java.util.ArrayList] */
    public final h50 a(o70 o70Var, w70 w70Var) {
        List listEmptyList;
        List listEmptyList2;
        ?? EmptyList;
        u40 u40Var;
        Object next;
        n40 l40Var;
        boolean z10 = true;
        if (w70Var == null || (listEmptyList = w70Var.f117335g) == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        z40 z40Var = o70Var.f114211a;
        g80 g80Var = o70Var.f114212b;
        o30 o30Var = new o30(w70Var != null ? w70Var.f117329a : null, w70Var != null ? w70Var.f117332d : null, w70Var != null ? w70Var.f117331c : null);
        List<np1> list = o70Var.f114213c;
        ArrayList arrayListA = this.f111862b.a(listEmptyList);
        if (!arrayListA.isEmpty()) {
            list = arrayListA;
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        for (np1 np1Var : list) {
            Iterator it = listEmptyList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (Intrinsics.areEqual(((t70) next).f116096b, np1Var.f113994a)) {
                    break;
                }
            }
            t70 t70Var = (t70) next;
            this.f111861a.getClass();
            boolean zA = op1.a(np1Var);
            this.f111864d.getClass();
            List list2 = np1Var.f113997d;
            if ((list2 instanceof Collection) && list2.isEmpty()) {
                l40Var = k40.f112582a;
            } else {
                Iterator it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (((mp1) it2.next()).f113581c != z10) {
                        List list3 = np1Var.f113997d;
                        if ((list3 instanceof Collection) && list3.isEmpty()) {
                            l40Var = m40.f113316a;
                        } else {
                            Iterator it3 = list3.iterator();
                            while (it3.hasNext()) {
                                if (((mp1) it3.next()).f113581c) {
                                    pp1 pp1Var = pp1.f114740b;
                                    l40Var = new l40();
                                    break;
                                }
                            }
                            l40Var = m40.f113316a;
                        }
                    }
                }
                l40Var = k40.f112582a;
            }
            n40 n40Var = l40Var;
            String str = np1Var.f113994a;
            String str2 = t70Var != null ? t70Var.f116097c : null;
            mp1 mp1Var = (mp1) CollectionsKt.firstOrNull(np1Var.f113997d);
            String str3 = mp1Var != null ? mp1Var.f113580b : null;
            String str4 = t70Var != null ? t70Var.f116100f : null;
            String str5 = np1Var.f113996c;
            List list4 = np1Var.f113997d;
            boolean z11 = z10;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list4, 10));
            Iterator it4 = list4.iterator();
            while (it4.hasNext()) {
                arrayList2.add(((mp1) it4.next()).f113579a);
            }
            arrayList.add(new o40(str, str2, zA, str3, str4, str5, n40Var, arrayList2));
            z10 = z11;
        }
        q40 q40Var = new q40(arrayList);
        g50 g50Var = o70Var.f114214d;
        h70 h70Var = o70Var.f114215e;
        if (w70Var == null || (listEmptyList2 = w70Var.f117334f) == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        List list5 = listEmptyList2;
        w40 w40Var = this.f111863c;
        List list6 = w70Var != null ? w70Var.f117333e : null;
        w40Var.getClass();
        if (list6 != null) {
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : list6) {
                t40 t40Var = (t40) obj;
                if (t40Var.f116045a != null || t40Var.f116046b != null) {
                    arrayList3.add(obj);
                }
            }
            EmptyList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
            Iterator it5 = arrayList3.iterator();
            while (it5.hasNext()) {
                t40 t40Var2 = (t40) it5.next();
                String str6 = t40Var2.f116045a;
                String str7 = t40Var2.f116046b;
                u40[] u40VarArrValues = u40.values();
                int length = u40VarArrValues.length;
                Iterator it6 = it5;
                int i10 = 0;
                while (true) {
                    if (i10 >= length) {
                        u40Var = null;
                        break;
                    }
                    int i11 = length;
                    u40Var = u40VarArrValues[i10];
                    int i12 = i10;
                    t40 t40Var3 = t40Var2;
                    if (Intrinsics.areEqual(t40Var2.f116047c, u40Var.f116484b)) {
                        break;
                    }
                    i10 = i12 + 1;
                    t40Var2 = t40Var3;
                    length = i11;
                }
                if (u40Var == null) {
                    u40Var = u40.f116482c;
                }
                EmptyList.add(new v40(str6, str7, u40Var));
                it5 = it6;
            }
        } else {
            EmptyList = CollectionsKt.emptyList();
        }
        return new h50(z40Var, g80Var, o30Var, q40Var, g50Var, h70Var, list5, EmptyList);
    }
}
